package ch.ethz.lapis.source.s3c;

public class S3CAdditionalMetadataEntry {

    private String gisaidEpiIsl;
    private String enaId;
    private Integer age;
    private String sex;
    private Boolean hospitalized;
    private Boolean died;
    private Boolean fullyVaccinated;

    public S3CAdditionalMetadataEntry() {
    }

    public S3CAdditionalMetadataEntry(
        String gisaidEpiIsl,
        String enaId,
        Integer age,
        String sex,
        Boolean hospitalized,
        Boolean died,
        Boolean fullyVaccinated
    ) {
        this.gisaidEpiIsl = gisaidEpiIsl;
        this.enaId = enaId;
        this.age = age;
        this.sex = sex;
        this.hospitalized = hospitalized;
        this.died = died;
        this.fullyVaccinated = fullyVaccinated;
    }

    public String getGisaidEpiIsl() {
        return gisaidEpiIsl;
    }

    public S3CAdditionalMetadataEntry setGisaidEpiIsl(String gisaidEpiIsl) {
        this.gisaidEpiIsl = gisaidEpiIsl;
        return this;
    }

    public String getEnaId() {
        return enaId;
    }

    public S3CAdditionalMetadataEntry setEnaId(String enaId) {
        this.enaId = enaId;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public S3CAdditionalMetadataEntry setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public S3CAdditionalMetadataEntry setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public Boolean getHospitalized() {
        return hospitalized;
    }

    public S3CAdditionalMetadataEntry setHospitalized(Boolean hospitalized) {
        this.hospitalized = hospitalized;
        return this;
    }

    public Boolean getDied() {
        return died;
    }

    public S3CAdditionalMetadataEntry setDied(Boolean died) {
        this.died = died;
        return this;
    }

    public Boolean getFullyVaccinated() {
        return fullyVaccinated;
    }

    public S3CAdditionalMetadataEntry setFullyVaccinated(Boolean fullyVaccinated) {
        this.fullyVaccinated = fullyVaccinated;
        return this;
    }
}
