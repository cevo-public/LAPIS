/*
 * This file is generated by jOOQ.
 */
package org.jooq.lapis.tables.records;


import java.time.LocalDate;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.lapis.tables.YMainMetadata;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class YMainMetadataRecord extends UpdatableRecordImpl<YMainMetadataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>y_main_metadata.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>y_main_metadata.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>y_main_metadata.source</code>.
     */
    public void setSource(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>y_main_metadata.source</code>.
     */
    public String getSource() {
        return (String) get(1);
    }

    /**
     * Setter for <code>y_main_metadata.source_primary_key</code>.
     */
    public void setSourcePrimaryKey(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>y_main_metadata.source_primary_key</code>.
     */
    public String getSourcePrimaryKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>y_main_metadata.accession</code>.
     */
    public void setAccession(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>y_main_metadata.accession</code>.
     */
    public String getAccession() {
        return (String) get(3);
    }

    /**
     * Setter for <code>y_main_metadata.strain</code>.
     */
    public void setStrain(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>y_main_metadata.strain</code>.
     */
    public String getStrain() {
        return (String) get(4);
    }

    /**
     * Setter for <code>y_main_metadata.sra_accession</code>.
     */
    public void setSraAccession(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>y_main_metadata.sra_accession</code>.
     */
    public String getSraAccession() {
        return (String) get(5);
    }

    /**
     * Setter for <code>y_main_metadata.date</code>.
     */
    public void setDate(LocalDate value) {
        set(6, value);
    }

    /**
     * Getter for <code>y_main_metadata.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(6);
    }

    /**
     * Setter for <code>y_main_metadata.year</code>.
     */
    public void setYear(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>y_main_metadata.year</code>.
     */
    public Integer getYear() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>y_main_metadata.month</code>.
     */
    public void setMonth(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>y_main_metadata.month</code>.
     */
    public Integer getMonth() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>y_main_metadata.day</code>.
     */
    public void setDay(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>y_main_metadata.day</code>.
     */
    public Integer getDay() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>y_main_metadata.date_submitted</code>.
     */
    public void setDateSubmitted(LocalDate value) {
        set(10, value);
    }

    /**
     * Getter for <code>y_main_metadata.date_submitted</code>.
     */
    public LocalDate getDateSubmitted() {
        return (LocalDate) get(10);
    }

    /**
     * Setter for <code>y_main_metadata.region</code>.
     */
    public void setRegion(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>y_main_metadata.region</code>.
     */
    public String getRegion() {
        return (String) get(11);
    }

    /**
     * Setter for <code>y_main_metadata.country</code>.
     */
    public void setCountry(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>y_main_metadata.country</code>.
     */
    public String getCountry() {
        return (String) get(12);
    }

    /**
     * Setter for <code>y_main_metadata.division</code>.
     */
    public void setDivision(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>y_main_metadata.division</code>.
     */
    public String getDivision() {
        return (String) get(13);
    }

    /**
     * Setter for <code>y_main_metadata.location</code>.
     */
    public void setLocation(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>y_main_metadata.location</code>.
     */
    public String getLocation() {
        return (String) get(14);
    }

    /**
     * Setter for <code>y_main_metadata.region_exposure</code>.
     */
    public void setRegionExposure(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>y_main_metadata.region_exposure</code>.
     */
    public String getRegionExposure() {
        return (String) get(15);
    }

    /**
     * Setter for <code>y_main_metadata.country_exposure</code>.
     */
    public void setCountryExposure(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>y_main_metadata.country_exposure</code>.
     */
    public String getCountryExposure() {
        return (String) get(16);
    }

    /**
     * Setter for <code>y_main_metadata.division_exposure</code>.
     */
    public void setDivisionExposure(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>y_main_metadata.division_exposure</code>.
     */
    public String getDivisionExposure() {
        return (String) get(17);
    }

    /**
     * Setter for <code>y_main_metadata.host</code>.
     */
    public void setHost(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>y_main_metadata.host</code>.
     */
    public String getHost() {
        return (String) get(18);
    }

    /**
     * Setter for <code>y_main_metadata.age</code>.
     */
    public void setAge(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>y_main_metadata.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>y_main_metadata.sex</code>.
     */
    public void setSex(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>y_main_metadata.sex</code>.
     */
    public String getSex() {
        return (String) get(20);
    }

    /**
     * Setter for <code>y_main_metadata.hospitalized</code>.
     */
    public void setHospitalized(Boolean value) {
        set(21, value);
    }

    /**
     * Getter for <code>y_main_metadata.hospitalized</code>.
     */
    public Boolean getHospitalized() {
        return (Boolean) get(21);
    }

    /**
     * Setter for <code>y_main_metadata.died</code>.
     */
    public void setDied(Boolean value) {
        set(22, value);
    }

    /**
     * Getter for <code>y_main_metadata.died</code>.
     */
    public Boolean getDied() {
        return (Boolean) get(22);
    }

    /**
     * Setter for <code>y_main_metadata.fully_vaccinated</code>.
     */
    public void setFullyVaccinated(Boolean value) {
        set(23, value);
    }

    /**
     * Getter for <code>y_main_metadata.fully_vaccinated</code>.
     */
    public Boolean getFullyVaccinated() {
        return (Boolean) get(23);
    }

    /**
     * Setter for <code>y_main_metadata.sampling_strategy</code>.
     */
    public void setSamplingStrategy(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>y_main_metadata.sampling_strategy</code>.
     */
    public String getSamplingStrategy() {
        return (String) get(24);
    }

    /**
     * Setter for <code>y_main_metadata.clade</code>.
     */
    public void setClade(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>y_main_metadata.clade</code>.
     */
    public String getClade() {
        return (String) get(25);
    }

    /**
     * Setter for <code>y_main_metadata.authors</code>.
     */
    public void setAuthors(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>y_main_metadata.authors</code>.
     */
    public String getAuthors() {
        return (String) get(26);
    }

    /**
     * Setter for <code>y_main_metadata.institution</code>.
     */
    public void setInstitution(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>y_main_metadata.institution</code>.
     */
    public String getInstitution() {
        return (String) get(27);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_qc_overall_score</code>.
     */
    public void setNextcladeQcOverallScore(Double value) {
        set(28, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_qc_overall_score</code>.
     */
    public Double getNextcladeQcOverallScore() {
        return (Double) get(28);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_qc_missing_data_score</code>.
     */
    public void setNextcladeQcMissingDataScore(Double value) {
        set(29, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_qc_missing_data_score</code>.
     */
    public Double getNextcladeQcMissingDataScore() {
        return (Double) get(29);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_qc_mixed_sites_score</code>.
     */
    public void setNextcladeQcMixedSitesScore(Double value) {
        set(30, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_qc_mixed_sites_score</code>.
     */
    public Double getNextcladeQcMixedSitesScore() {
        return (Double) get(30);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_qc_private_mutations_score</code>.
     */
    public void setNextcladeQcPrivateMutationsScore(Double value) {
        set(31, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_qc_private_mutations_score</code>.
     */
    public Double getNextcladeQcPrivateMutationsScore() {
        return (Double) get(31);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_qc_snp_clusters_score</code>.
     */
    public void setNextcladeQcSnpClustersScore(Double value) {
        set(32, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_qc_snp_clusters_score</code>.
     */
    public Double getNextcladeQcSnpClustersScore() {
        return (Double) get(32);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_qc_frame_shifts_score</code>.
     */
    public void setNextcladeQcFrameShiftsScore(Double value) {
        set(33, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_qc_frame_shifts_score</code>.
     */
    public Double getNextcladeQcFrameShiftsScore() {
        return (Double) get(33);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_qc_stop_codons_score</code>.
     */
    public void setNextcladeQcStopCodonsScore(Double value) {
        set(34, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_qc_stop_codons_score</code>.
     */
    public Double getNextcladeQcStopCodonsScore() {
        return (Double) get(34);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_alignment_score</code>.
     */
    public void setNextcladeAlignmentScore(Double value) {
        set(35, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_alignment_score</code>.
     */
    public Double getNextcladeAlignmentScore() {
        return (Double) get(35);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_alignment_start</code>.
     */
    public void setNextcladeAlignmentStart(Integer value) {
        set(36, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_alignment_start</code>.
     */
    public Integer getNextcladeAlignmentStart() {
        return (Integer) get(36);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_alignment_end</code>.
     */
    public void setNextcladeAlignmentEnd(Integer value) {
        set(37, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_alignment_end</code>.
     */
    public Integer getNextcladeAlignmentEnd() {
        return (Integer) get(37);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_total_substitutions</code>.
     */
    public void setNextcladeTotalSubstitutions(Integer value) {
        set(38, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_total_substitutions</code>.
     */
    public Integer getNextcladeTotalSubstitutions() {
        return (Integer) get(38);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_total_deletions</code>.
     */
    public void setNextcladeTotalDeletions(Integer value) {
        set(39, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_total_deletions</code>.
     */
    public Integer getNextcladeTotalDeletions() {
        return (Integer) get(39);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_total_insertions</code>.
     */
    public void setNextcladeTotalInsertions(Integer value) {
        set(40, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_total_insertions</code>.
     */
    public Integer getNextcladeTotalInsertions() {
        return (Integer) get(40);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_total_frame_shifts</code>.
     */
    public void setNextcladeTotalFrameShifts(Integer value) {
        set(41, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_total_frame_shifts</code>.
     */
    public Integer getNextcladeTotalFrameShifts() {
        return (Integer) get(41);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_total_aminoacid_substitutions</code>.
     */
    public void setNextcladeTotalAminoacidSubstitutions(Integer value) {
        set(42, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_total_aminoacid_substitutions</code>.
     */
    public Integer getNextcladeTotalAminoacidSubstitutions() {
        return (Integer) get(42);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_total_aminoacid_deletions</code>.
     */
    public void setNextcladeTotalAminoacidDeletions(Integer value) {
        set(43, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_total_aminoacid_deletions</code>.
     */
    public Integer getNextcladeTotalAminoacidDeletions() {
        return (Integer) get(43);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_total_aminoacid_insertions</code>.
     */
    public void setNextcladeTotalAminoacidInsertions(Integer value) {
        set(44, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_total_aminoacid_insertions</code>.
     */
    public Integer getNextcladeTotalAminoacidInsertions() {
        return (Integer) get(44);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_total_missing</code>.
     */
    public void setNextcladeTotalMissing(Integer value) {
        set(45, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_total_missing</code>.
     */
    public Integer getNextcladeTotalMissing() {
        return (Integer) get(45);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_total_non_acgtns</code>.
     */
    public void setNextcladeTotalNonAcgtns(Integer value) {
        set(46, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_total_non_acgtns</code>.
     */
    public Integer getNextcladeTotalNonAcgtns() {
        return (Integer) get(46);
    }

    /**
     * Setter for <code>y_main_metadata.nextclade_total_pcr_primer_changes</code>.
     */
    public void setNextcladeTotalPcrPrimerChanges(Integer value) {
        set(47, value);
    }

    /**
     * Getter for <code>y_main_metadata.nextclade_total_pcr_primer_changes</code>.
     */
    public Integer getNextcladeTotalPcrPrimerChanges() {
        return (Integer) get(47);
    }

    /**
     * Setter for <code>y_main_metadata.lineage</code>.
     */
    public void setLineage(String value) {
        set(48, value);
    }

    /**
     * Getter for <code>y_main_metadata.lineage</code>.
     */
    public String getLineage() {
        return (String) get(48);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached YMainMetadataRecord
     */
    public YMainMetadataRecord() {
        super(YMainMetadata.Y_MAIN_METADATA);
    }

    /**
     * Create a detached, initialised YMainMetadataRecord
     */
    public YMainMetadataRecord(Integer id, String source, String sourcePrimaryKey, String accession, String strain, String sraAccession, LocalDate date, Integer year, Integer month, Integer day, LocalDate dateSubmitted, String region, String country, String division, String location, String regionExposure, String countryExposure, String divisionExposure, String host, Integer age, String sex, Boolean hospitalized, Boolean died, Boolean fullyVaccinated, String samplingStrategy, String clade, String authors, String institution, Double nextcladeQcOverallScore, Double nextcladeQcMissingDataScore, Double nextcladeQcMixedSitesScore, Double nextcladeQcPrivateMutationsScore, Double nextcladeQcSnpClustersScore, Double nextcladeQcFrameShiftsScore, Double nextcladeQcStopCodonsScore, Double nextcladeAlignmentScore, Integer nextcladeAlignmentStart, Integer nextcladeAlignmentEnd, Integer nextcladeTotalSubstitutions, Integer nextcladeTotalDeletions, Integer nextcladeTotalInsertions, Integer nextcladeTotalFrameShifts, Integer nextcladeTotalAminoacidSubstitutions, Integer nextcladeTotalAminoacidDeletions, Integer nextcladeTotalAminoacidInsertions, Integer nextcladeTotalMissing, Integer nextcladeTotalNonAcgtns, Integer nextcladeTotalPcrPrimerChanges, String lineage) {
        super(YMainMetadata.Y_MAIN_METADATA);

        setId(id);
        setSource(source);
        setSourcePrimaryKey(sourcePrimaryKey);
        setAccession(accession);
        setStrain(strain);
        setSraAccession(sraAccession);
        setDate(date);
        setYear(year);
        setMonth(month);
        setDay(day);
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
        setHospitalized(hospitalized);
        setDied(died);
        setFullyVaccinated(fullyVaccinated);
        setSamplingStrategy(samplingStrategy);
        setClade(clade);
        setAuthors(authors);
        setInstitution(institution);
        setNextcladeQcOverallScore(nextcladeQcOverallScore);
        setNextcladeQcMissingDataScore(nextcladeQcMissingDataScore);
        setNextcladeQcMixedSitesScore(nextcladeQcMixedSitesScore);
        setNextcladeQcPrivateMutationsScore(nextcladeQcPrivateMutationsScore);
        setNextcladeQcSnpClustersScore(nextcladeQcSnpClustersScore);
        setNextcladeQcFrameShiftsScore(nextcladeQcFrameShiftsScore);
        setNextcladeQcStopCodonsScore(nextcladeQcStopCodonsScore);
        setNextcladeAlignmentScore(nextcladeAlignmentScore);
        setNextcladeAlignmentStart(nextcladeAlignmentStart);
        setNextcladeAlignmentEnd(nextcladeAlignmentEnd);
        setNextcladeTotalSubstitutions(nextcladeTotalSubstitutions);
        setNextcladeTotalDeletions(nextcladeTotalDeletions);
        setNextcladeTotalInsertions(nextcladeTotalInsertions);
        setNextcladeTotalFrameShifts(nextcladeTotalFrameShifts);
        setNextcladeTotalAminoacidSubstitutions(nextcladeTotalAminoacidSubstitutions);
        setNextcladeTotalAminoacidDeletions(nextcladeTotalAminoacidDeletions);
        setNextcladeTotalAminoacidInsertions(nextcladeTotalAminoacidInsertions);
        setNextcladeTotalMissing(nextcladeTotalMissing);
        setNextcladeTotalNonAcgtns(nextcladeTotalNonAcgtns);
        setNextcladeTotalPcrPrimerChanges(nextcladeTotalPcrPrimerChanges);
        setLineage(lineage);
    }
}
