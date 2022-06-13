package ch.ethz.lapis.api;

import ch.ethz.lapis.LapisMain;
import ch.ethz.lapis.api.entity.SequenceType;
import ch.ethz.lapis.api.entity.Versioned;
import ch.ethz.lapis.api.entity.req.OrderAndLimitConfig;
import ch.ethz.lapis.api.entity.req.SampleAggregatedRequest;
import ch.ethz.lapis.api.entity.req.SampleDetailRequest;
import ch.ethz.lapis.api.entity.res.Contributor;
import ch.ethz.lapis.api.entity.res.SampleAggregated;
import ch.ethz.lapis.api.entity.res.SampleDetail;
import ch.ethz.lapis.api.entity.res.SampleMutationsResponse;
import ch.ethz.lapis.api.exception.UnsupportedOrdering;
import ch.ethz.lapis.api.query.Database;
import ch.ethz.lapis.api.query.MutationStore;
import ch.ethz.lapis.api.query.QueryEngine;
import ch.ethz.lapis.util.ReferenceGenomeData;
import ch.ethz.lapis.util.SeqCompressor;
import ch.ethz.lapis.util.ZstdSeqCompressor;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.lapis.tables.YMainMetadata;
import org.jooq.lapis.tables.YMainSequence;
import org.jooq.lapis.tables.records.YMainSequenceRecord;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class SampleService {

    private static final ComboPooledDataSource dbPool = LapisMain.dbPool;
    private static final SeqCompressor referenceSeqCompressor
        = new ZstdSeqCompressor(ZstdSeqCompressor.DICT.MPOX_REFERENCE);


    private Connection getDatabaseConnection() throws SQLException {
        return dbPool.getConnection();
    }


    public Versioned<List<SampleAggregated>> getAggregatedSamples(
        SampleAggregatedRequest request
    ) throws SQLException {
        Database database = Database.getOrLoadInstance(dbPool);
        return new Versioned<>(database.getDataVersion(), new QueryEngine().aggregate(database, request));
    }


    public List<SampleDetail> getDetailedSamples(
        SampleDetailRequest request,
        OrderAndLimitConfig orderAndLimit
    ) throws SQLException {
        // Filter
        List<Integer> ids = new QueryEngine().filterIds(Database.getOrLoadInstance(dbPool), request);
        if (ids.isEmpty()) {
            return new ArrayList<>();
        }

        // Fetch data
        List<SampleDetail> samples = new ArrayList<>();
        try (Connection conn = getDatabaseConnection()) {
            DSLContext ctx = JooqHelper.getDSLCtx(conn);
            YMainMetadata tbl = YMainMetadata.Y_MAIN_METADATA;

            List<Field<?>> selectFields = new ArrayList<>() {{
                add(tbl.ACCESSION);
                add(tbl.SRA_ACCESSION);
                add(tbl.STRAIN);
                add(tbl.DATE);
                add(tbl.YEAR);
                add(tbl.MONTH);
                add(tbl.DATE_SUBMITTED);
                add(tbl.REGION);
                add(tbl.COUNTRY);
                add(tbl.DIVISION);
                add(tbl.LOCATION);
                add(tbl.REGION_EXPOSURE);
                add(tbl.COUNTRY_EXPOSURE);
                add(tbl.DIVISION_EXPOSURE);
                add(tbl.AGE);
                add(tbl.SEX);
                add(tbl.HOSPITALIZED);
                add(tbl.DIED);
                add(tbl.FULLY_VACCINATED);
                add(tbl.HOST);
                add(tbl.SAMPLING_STRATEGY);
                add(tbl.CLADE);
                add(tbl.INSTITUTION);
            }};

            Table<Record1<Integer>> idsTbl = getIdsTable(ids, ctx);
            SelectJoinStep<Record> statement = ctx
                .select(selectFields)
                .from(idsTbl.join(tbl).on(idsTbl.field("id", Integer.class).eq(tbl.ID)));
            Select<Record> statement2 = applyOrderAndLimit(statement, orderAndLimit);
            Result<Record> records = statement2.fetch();
            for (var r : records) {
                SampleDetail sample = new SampleDetail()
                    .setAccession(r.get(tbl.ACCESSION))
                    .setSraAccession(r.get(tbl.SRA_ACCESSION))
                    .setStrain(r.get(tbl.STRAIN))
                    .setDate(r.get(tbl.DATE))
                    .setYear(r.get(tbl.YEAR))
                    .setMonth(r.get(tbl.MONTH))
                    .setDateSubmitted(r.get(tbl.DATE_SUBMITTED))
                    .setRegion(r.get(tbl.REGION))
                    .setCountry(r.get(tbl.COUNTRY))
                    .setDivision(r.get(tbl.DIVISION))
                    .setLocation(r.get(tbl.LOCATION))
                    .setRegionExposure(r.get(tbl.REGION_EXPOSURE))
                    .setCountryExposure(r.get(tbl.COUNTRY_EXPOSURE))
                    .setDivisionExposure(r.get(tbl.DIVISION_EXPOSURE))
                    .setAge(r.get(tbl.AGE))
                    .setSex(r.get(tbl.SEX))
                    .setHospitalized(r.get(tbl.HOSPITALIZED))
                    .setDied(r.get(tbl.DIED))
                    .setFullyVaccinated(r.get(tbl.FULLY_VACCINATED))
                    .setHost(r.get(tbl.HOST))
                    .setSamplingStrategy(r.get(tbl.SAMPLING_STRATEGY))
                    .setClade(r.get(tbl.CLADE))
                    .setInstitution(r.get(tbl.INSTITUTION));
                samples.add(sample);
            }
        }
        return samples;
    }


    public List<Contributor> getContributors(
        SampleDetailRequest request,
        OrderAndLimitConfig orderAndLimit
    ) throws SQLException {
        // Filter
        List<Integer> ids = new QueryEngine().filterIds(Database.getOrLoadInstance(dbPool), request);
        if (ids.isEmpty()) {
            return new ArrayList<>();
        }

        // Fetch data
        List<Contributor> contributors = new ArrayList<>();
        try (Connection conn = getDatabaseConnection()) {
            DSLContext ctx = JooqHelper.getDSLCtx(conn);
            YMainMetadata tbl = YMainMetadata.Y_MAIN_METADATA;

            List<Field<?>> selectFields = new ArrayList<>() {{
                add(tbl.ACCESSION);
                add(tbl.SRA_ACCESSION);
                add(tbl.STRAIN);
                add(tbl.INSTITUTION);
                add(tbl.AUTHORS);
            }};

            Table<Record1<Integer>> idsTbl = getIdsTable(ids, ctx);
            SelectJoinStep<Record> statement = ctx
                .select(selectFields)
                .from(idsTbl.join(tbl).on(idsTbl.field("id", Integer.class).eq(tbl.ID)));
            Select<Record> statement2 = applyOrderAndLimit(statement, orderAndLimit);
            Result<Record> records = statement2.fetch();
            for (var r : records) {
                Contributor contributor = new Contributor()
                    .setGenbankAccession(r.get(tbl.ACCESSION))
                    .setSraAccession(r.get(tbl.SRA_ACCESSION))
                    .setStrain(r.get(tbl.STRAIN))
                    .setInstitution(r.get(tbl.INSTITUTION))
                    .setAuthors(r.get(tbl.AUTHORS));
                contributors.add(contributor);
            }
        }
        return contributors;
    }


    public List<String> getStrainNames(
        SampleDetailRequest request,
        OrderAndLimitConfig orderAndLimit
    ) {
        Database database = Database.getOrLoadInstance(dbPool);
        // Filter
        List<Integer> ids = new QueryEngine().filterIds(database, request);
        if (ids.isEmpty()) {
            return new ArrayList<>();
        }
        // Order and limit
        ids = applyOrderAndLimit(ids, orderAndLimit);
        // Fetch data
        String[] strainColumn = database.getStringColumn(Database.Columns.STRAIN);
        return ids.stream().map(id -> strainColumn[id]).collect(Collectors.toList());
    }


    public SampleMutationsResponse getMutations(
        SampleDetailRequest request,
        SequenceType sequenceType,
        float minProportion
    ) throws SQLException {
        Database database = Database.getOrLoadInstance(dbPool);
        ReferenceGenomeData reference = ReferenceGenomeData.getInstance();
        // Filter
        List<Integer> ids = new QueryEngine().filterIds(database, request);
        if (ids.isEmpty()) {
            return new SampleMutationsResponse();
        }
        // Count mutations
        SampleMutationsResponse response = new SampleMutationsResponse();
        if (sequenceType == SequenceType.NUCLEOTIDE) {
            List<MutationStore.MutationCount> mutationCounts = database.getNucMutationStore().countMutations(ids);
            for (MutationStore.MutationCount mutationCount : mutationCounts) {
                if (mutationCount.getProportion() < minProportion) {
                    continue;
                }
                MutationStore.Mutation mutation = mutationCount.getMutation();
                String mutString = "%s%s%s".formatted(
                    reference.getNucleotideBase(mutation.position),
                    mutation.position,
                    mutation.mutationTo
                );
                response.add(new SampleMutationsResponse.MutationEntry(mutString,
                    mutationCount.getProportion(), mutationCount.getCount()));
            }
        } else {
            database.getAaMutationStores().forEach((gene, mutationStore) -> {
                List<MutationStore.MutationCount> mutationCounts = mutationStore.countMutations(ids);
                for (MutationStore.MutationCount mutationCount : mutationCounts) {
                    if (mutationCount.getProportion() < minProportion) {
                        continue;
                    }
                    MutationStore.Mutation mutation = mutationCount.getMutation();
                    String mutString = "%s:%s%s%s".formatted(
                        gene,
                        reference.getGeneAABase(gene, mutation.position),
                        mutation.position,
                        mutation.mutationTo
                    );
                    response.add(new SampleMutationsResponse.MutationEntry(mutString,
                        mutationCount.getProportion(), mutationCount.getCount()));
                }
            });
        }
        return response;
    }


    public void getFasta(
        SampleDetailRequest request,
        boolean aligned,
        OrderAndLimitConfig orderAndLimit,
        OutputStream outputStream
    ) {
        // Filter
        List<Integer> ids = new QueryEngine().filterIds(Database.getOrLoadInstance(dbPool), request);
        if (ids.isEmpty()) {
            return;
        }

        // Filter further by the other metadata and prepare the response
        Connection conn = null;
        try {
            conn = getDatabaseConnection();
            conn.setAutoCommit(false);
            DSLContext ctx = JooqHelper.getDSLCtx(conn);
            YMainMetadata metaTbl = YMainMetadata.Y_MAIN_METADATA;
            YMainSequence seqTbl = YMainSequence.Y_MAIN_SEQUENCE;

            TableField<YMainSequenceRecord, byte[]> seqColumn = aligned ?
                seqTbl.SEQ_ALIGNED_COMPRESSED : seqTbl.SEQ_ORIGINAL_COMPRESSED;

            Table<Record1<Integer>> idsTbl = getIdsTable(ids, ctx);
            SelectJoinStep<Record2<String, byte[]>> statement = ctx
                .select(metaTbl.STRAIN, seqColumn)
                .from(
                    idsTbl
                        .join(metaTbl).on(idsTbl.field("id", Integer.class).eq(metaTbl.ID))
                        .join(seqTbl).on(metaTbl.ID.eq(seqTbl.ID))
                );
            if (orderAndLimit.getLimit() == null) {
                orderAndLimit.setLimit(100000);
            }
            Select<Record2<String, byte[]>> statement2 = applyOrderAndLimit(statement, orderAndLimit);
            Cursor<Record2<String, byte[]>> cursor = statement2.fetchSize(1000).fetchLazy();
            for (Record2<String, byte[]> r : cursor) {
                byte[] seqCompressed = r.get(seqColumn);
                if (seqCompressed == null) {
                    continue;
                }
                outputStream.write(">".getBytes(StandardCharsets.UTF_8));
                outputStream.write(r.get(metaTbl.STRAIN).getBytes(StandardCharsets.UTF_8));
                outputStream.write("\n".getBytes(StandardCharsets.UTF_8));
                outputStream.write(referenceSeqCompressor.decompress(seqCompressed)
                    .getBytes(StandardCharsets.UTF_8));
                outputStream.write("\n\n".getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(true);
                    conn.close();
                } catch (SQLException ignored) {}
            }
        }
    }


    private Table<Record1<Integer>> getIdsTable(Collection<Integer> ids, DSLContext ctx) {
        String idsStr = ids.stream().map(String::valueOf).collect(Collectors.joining(","));
        return ctx
            .select(DSL.field("i.id::integer", Integer.class).as("id"))
            // We are concatenating SQL here!
            // This is safe because the IDs are read from the database and were generated and then written
            // by this program into the database. Further, the IDs are guaranteed to be integers.
            .from("unnest(string_to_array('" + idsStr + "', ',')) i(id)")
            .asTable("ids");
    }


    private <T extends Record> Select<T> applyOrderAndLimit(
        SelectOrderByStep<T> statement,
        OrderAndLimitConfig orderAndLimitConfig
    ) {
        // orderBy
        SelectLimitStep<T> statement2 = statement;
        String orderBy = orderAndLimitConfig.getOrderBy();
        if (orderBy != null && !orderBy.isBlank() && !orderBy.equals(OrderAndLimitConfig.SpecialOrdering.ARBITRARY)) {
            if (orderBy.equals(OrderAndLimitConfig.SpecialOrdering.RANDOM)) {
                SelectSeekStep1<T, BigDecimal> x;
                statement2 = statement.orderBy(DSL.rand());
            } else {
                throw new UnsupportedOrdering(orderBy);
            }
        }

        // limit
        Select<T> statement3 = statement2;
        if (orderAndLimitConfig.getLimit() != null) {
            statement3 = statement2.limit(orderAndLimitConfig.getLimit());
        }

        return statement3;
    }


    private <T> List<T> applyOrderAndLimit(List<T> data, OrderAndLimitConfig orderAndLimitConfig) {
        List<T> copy = new ArrayList<>(data);
        // orderBy
        String orderBy = orderAndLimitConfig.getOrderBy();
        if (orderBy != null && !orderBy.isBlank() && !orderBy.equals(OrderAndLimitConfig.SpecialOrdering.ARBITRARY)) {
            if (orderBy.equals(OrderAndLimitConfig.SpecialOrdering.RANDOM)) {
                Collections.shuffle(copy);
            } else {
                throw new UnsupportedOrdering(orderBy);
            }
        }
        // limit
        if (orderAndLimitConfig.getLimit() != null) {
            copy = copy.subList(0, Math.min(orderAndLimitConfig.getLimit(), copy.size()));
        }
        return copy;
    }
}
