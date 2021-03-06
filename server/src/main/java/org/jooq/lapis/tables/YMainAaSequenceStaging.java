/*
 * This file is generated by jOOQ.
 */
package org.jooq.lapis.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.lapis.DefaultSchema;
import org.jooq.lapis.Keys;
import org.jooq.lapis.tables.records.YMainAaSequenceStagingRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class YMainAaSequenceStaging extends TableImpl<YMainAaSequenceStagingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>y_main_aa_sequence_staging</code>
     */
    public static final YMainAaSequenceStaging Y_MAIN_AA_SEQUENCE_STAGING = new YMainAaSequenceStaging();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<YMainAaSequenceStagingRecord> getRecordType() {
        return YMainAaSequenceStagingRecord.class;
    }

    /**
     * The column <code>y_main_aa_sequence_staging.id</code>.
     */
    public final TableField<YMainAaSequenceStagingRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>y_main_aa_sequence_staging.gene</code>.
     */
    public final TableField<YMainAaSequenceStagingRecord, String> GENE = createField(DSL.name("gene"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>y_main_aa_sequence_staging.aa_seq_compressed</code>.
     */
    public final TableField<YMainAaSequenceStagingRecord, byte[]> AA_SEQ_COMPRESSED = createField(DSL.name("aa_seq_compressed"), SQLDataType.BLOB.nullable(false), this, "");

    private YMainAaSequenceStaging(Name alias, Table<YMainAaSequenceStagingRecord> aliased) {
        this(alias, aliased, null);
    }

    private YMainAaSequenceStaging(Name alias, Table<YMainAaSequenceStagingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>y_main_aa_sequence_staging</code> table reference
     */
    public YMainAaSequenceStaging(String alias) {
        this(DSL.name(alias), Y_MAIN_AA_SEQUENCE_STAGING);
    }

    /**
     * Create an aliased <code>y_main_aa_sequence_staging</code> table reference
     */
    public YMainAaSequenceStaging(Name alias) {
        this(alias, Y_MAIN_AA_SEQUENCE_STAGING);
    }

    /**
     * Create a <code>y_main_aa_sequence_staging</code> table reference
     */
    public YMainAaSequenceStaging() {
        this(DSL.name("y_main_aa_sequence_staging"), null);
    }

    public <O extends Record> YMainAaSequenceStaging(Table<O> child, ForeignKey<O, YMainAaSequenceStagingRecord> key) {
        super(child, key, Y_MAIN_AA_SEQUENCE_STAGING);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<YMainAaSequenceStagingRecord> getPrimaryKey() {
        return Keys.Y_MAIN_AA_SEQUENCE_STAGING_PKEY;
    }

    @Override
    public List<UniqueKey<YMainAaSequenceStagingRecord>> getKeys() {
        return Arrays.<UniqueKey<YMainAaSequenceStagingRecord>>asList(Keys.Y_MAIN_AA_SEQUENCE_STAGING_PKEY);
    }

    @Override
    public YMainAaSequenceStaging as(String alias) {
        return new YMainAaSequenceStaging(DSL.name(alias), this);
    }

    @Override
    public YMainAaSequenceStaging as(Name alias) {
        return new YMainAaSequenceStaging(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public YMainAaSequenceStaging rename(String name) {
        return new YMainAaSequenceStaging(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public YMainAaSequenceStaging rename(Name name) {
        return new YMainAaSequenceStaging(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, byte[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
