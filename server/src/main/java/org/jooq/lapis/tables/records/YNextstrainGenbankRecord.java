/*
 * This file is generated by jOOQ.
 */
package org.jooq.lapis.tables.records;


import java.time.LocalDate;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.lapis.tables.YNextstrainGenbank;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class YNextstrainGenbankRecord extends UpdatableRecordImpl<YNextstrainGenbankRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>y_nextstrain_genbank.metadata_hash</code>.
     */
    public void setMetadataHash(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.metadata_hash</code>.
     */
    public String getMetadataHash() {
        return (String) get(0);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.seq_original_hash</code>.
     */
    public void setSeqOriginalHash(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.seq_original_hash</code>.
     */
    public String getSeqOriginalHash() {
        return (String) get(1);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.seq_aligned_hash</code>.
     */
    public void setSeqAlignedHash(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.seq_aligned_hash</code>.
     */
    public String getSeqAlignedHash() {
        return (String) get(2);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.genbank_accession</code>.
     */
    public void setGenbankAccession(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.genbank_accession</code>.
     */
    public String getGenbankAccession() {
        return (String) get(3);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.sra_accession</code>.
     */
    public void setSraAccession(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.sra_accession</code>.
     */
    public String getSraAccession() {
        return (String) get(4);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.gisaid_epi_isl</code>.
     */
    public void setGisaidEpiIsl(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.gisaid_epi_isl</code>.
     */
    public String getGisaidEpiIsl() {
        return (String) get(5);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.strain</code>.
     */
    public void setStrain(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.strain</code>.
     */
    public String getStrain() {
        return (String) get(6);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.date</code>.
     */
    public void setDate(LocalDate value) {
        set(7, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(7);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.date_original</code>.
     */
    public void setDateOriginal(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.date_original</code>.
     */
    public String getDateOriginal() {
        return (String) get(8);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.date_submitted</code>.
     */
    public void setDateSubmitted(LocalDate value) {
        set(9, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.date_submitted</code>.
     */
    public LocalDate getDateSubmitted() {
        return (LocalDate) get(9);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.region</code>.
     */
    public void setRegion(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.region</code>.
     */
    public String getRegion() {
        return (String) get(10);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.country</code>.
     */
    public void setCountry(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.country</code>.
     */
    public String getCountry() {
        return (String) get(11);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.division</code>.
     */
    public void setDivision(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.division</code>.
     */
    public String getDivision() {
        return (String) get(12);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.location</code>.
     */
    public void setLocation(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.location</code>.
     */
    public String getLocation() {
        return (String) get(13);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.region_exposure</code>.
     */
    public void setRegionExposure(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.region_exposure</code>.
     */
    public String getRegionExposure() {
        return (String) get(14);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.country_exposure</code>.
     */
    public void setCountryExposure(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.country_exposure</code>.
     */
    public String getCountryExposure() {
        return (String) get(15);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.division_exposure</code>.
     */
    public void setDivisionExposure(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.division_exposure</code>.
     */
    public String getDivisionExposure() {
        return (String) get(16);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.host</code>.
     */
    public void setHost(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.host</code>.
     */
    public String getHost() {
        return (String) get(17);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.age</code>.
     */
    public void setAge(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.sex</code>.
     */
    public void setSex(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.sex</code>.
     */
    public String getSex() {
        return (String) get(19);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.sampling_strategy</code>.
     */
    public void setSamplingStrategy(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.sampling_strategy</code>.
     */
    public String getSamplingStrategy() {
        return (String) get(20);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.pango_lineage</code>.
     */
    public void setPangoLineage(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.pango_lineage</code>.
     */
    public String getPangoLineage() {
        return (String) get(21);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.nextstrain_clade</code>.
     */
    public void setNextstrainClade(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.nextstrain_clade</code>.
     */
    public String getNextstrainClade() {
        return (String) get(22);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.gisaid_clade</code>.
     */
    public void setGisaidClade(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.gisaid_clade</code>.
     */
    public String getGisaidClade() {
        return (String) get(23);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.originating_lab</code>.
     */
    public void setOriginatingLab(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.originating_lab</code>.
     */
    public String getOriginatingLab() {
        return (String) get(24);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.submitting_lab</code>.
     */
    public void setSubmittingLab(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.submitting_lab</code>.
     */
    public String getSubmittingLab() {
        return (String) get(25);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.authors</code>.
     */
    public void setAuthors(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.authors</code>.
     */
    public String getAuthors() {
        return (String) get(26);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.seq_original_compressed</code>.
     */
    public void setSeqOriginalCompressed(byte[] value) {
        set(27, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.seq_original_compressed</code>.
     */
    public byte[] getSeqOriginalCompressed() {
        return (byte[]) get(27);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.seq_aligned_compressed</code>.
     */
    public void setSeqAlignedCompressed(byte[] value) {
        set(28, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.seq_aligned_compressed</code>.
     */
    public byte[] getSeqAlignedCompressed() {
        return (byte[]) get(28);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.aa_seqs_compressed</code>.
     */
    public void setAaSeqsCompressed(byte[] value) {
        set(29, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.aa_seqs_compressed</code>.
     */
    public byte[] getAaSeqsCompressed() {
        return (byte[]) get(29);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.aa_mutations</code>.
     */
    public void setAaMutations(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.aa_mutations</code>.
     */
    public String getAaMutations() {
        return (String) get(30);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.aa_unknowns</code>.
     */
    public void setAaUnknowns(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.aa_unknowns</code>.
     */
    public String getAaUnknowns() {
        return (String) get(31);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.nuc_substitutions</code>.
     */
    public void setNucSubstitutions(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.nuc_substitutions</code>.
     */
    public String getNucSubstitutions() {
        return (String) get(32);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.nuc_deletions</code>.
     */
    public void setNucDeletions(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.nuc_deletions</code>.
     */
    public String getNucDeletions() {
        return (String) get(33);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.nuc_insertions</code>.
     */
    public void setNucInsertions(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.nuc_insertions</code>.
     */
    public String getNucInsertions() {
        return (String) get(34);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.nuc_unknowns</code>.
     */
    public void setNucUnknowns(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.nuc_unknowns</code>.
     */
    public String getNucUnknowns() {
        return (String) get(35);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.year</code>.
     */
    public void setYear(Integer value) {
        set(36, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.year</code>.
     */
    public Integer getYear() {
        return (Integer) get(36);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.month</code>.
     */
    public void setMonth(Integer value) {
        set(37, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.month</code>.
     */
    public Integer getMonth() {
        return (Integer) get(37);
    }

    /**
     * Setter for <code>y_nextstrain_genbank.day</code>.
     */
    public void setDay(Integer value) {
        set(38, value);
    }

    /**
     * Getter for <code>y_nextstrain_genbank.day</code>.
     */
    public Integer getDay() {
        return (Integer) get(38);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached YNextstrainGenbankRecord
     */
    public YNextstrainGenbankRecord() {
        super(YNextstrainGenbank.Y_NEXTSTRAIN_GENBANK);
    }

    /**
     * Create a detached, initialised YNextstrainGenbankRecord
     */
    public YNextstrainGenbankRecord(String metadataHash, String seqOriginalHash, String seqAlignedHash, String genbankAccession, String sraAccession, String gisaidEpiIsl, String strain, LocalDate date, String dateOriginal, LocalDate dateSubmitted, String region, String country, String division, String location, String regionExposure, String countryExposure, String divisionExposure, String host, Integer age, String sex, String samplingStrategy, String pangoLineage, String nextstrainClade, String gisaidClade, String originatingLab, String submittingLab, String authors, byte[] seqOriginalCompressed, byte[] seqAlignedCompressed, byte[] aaSeqsCompressed, String aaMutations, String aaUnknowns, String nucSubstitutions, String nucDeletions, String nucInsertions, String nucUnknowns, Integer year, Integer month, Integer day) {
        super(YNextstrainGenbank.Y_NEXTSTRAIN_GENBANK);

        setMetadataHash(metadataHash);
        setSeqOriginalHash(seqOriginalHash);
        setSeqAlignedHash(seqAlignedHash);
        setGenbankAccession(genbankAccession);
        setSraAccession(sraAccession);
        setGisaidEpiIsl(gisaidEpiIsl);
        setStrain(strain);
        setDate(date);
        setDateOriginal(dateOriginal);
        setDateSubmitted(dateSubmitted);
        setRegion(region);
        setCountry(country);
        setDivision(division);
        setLocation(location);
        setRegionExposure(regionExposure);
        setCountryExposure(countryExposure);
        setDivisionExposure(divisionExposure);
        setHost(host);
        setAge(age);
        setSex(sex);
        setSamplingStrategy(samplingStrategy);
        setPangoLineage(pangoLineage);
        setNextstrainClade(nextstrainClade);
        setGisaidClade(gisaidClade);
        setOriginatingLab(originatingLab);
        setSubmittingLab(submittingLab);
        setAuthors(authors);
        setSeqOriginalCompressed(seqOriginalCompressed);
        setSeqAlignedCompressed(seqAlignedCompressed);
        setAaSeqsCompressed(aaSeqsCompressed);
        setAaMutations(aaMutations);
        setAaUnknowns(aaUnknowns);
        setNucSubstitutions(nucSubstitutions);
        setNucDeletions(nucDeletions);
        setNucInsertions(nucInsertions);
        setNucUnknowns(nucUnknowns);
        setYear(year);
        setMonth(month);
        setDay(day);
    }
}
