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
import org.jooq.lapis.tables.records.YMainAaSequenceColumnarStagingRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class YMainAaSequenceColumnarStaging extends TableImpl<YMainAaSequenceColumnarStagingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>y_main_aa_sequence_columnar_staging</code>
     */
    public static final YMainAaSequenceColumnarStaging Y_MAIN_AA_SEQUENCE_COLUMNAR_STAGING = new YMainAaSequenceColumnarStaging();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<YMainAaSequenceColumnarStagingRecord> getRecordType() {
        return YMainAaSequenceColumnarStagingRecord.class;
    }

    /**
     * The column <code>y_main_aa_sequence_columnar_staging.gene</code>.
     */
    public final TableField<YMainAaSequenceColumnarStagingRecord, String> GENE = createField(DSL.name("gene"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>y_main_aa_sequence_columnar_staging.position</code>.
     */
    public final TableField<YMainAaSequenceColumnarStagingRecord, Integer> POSITION = createField(DSL.name("position"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>y_main_aa_sequence_columnar_staging.data_compressed</code>.
     */
    public final TableField<YMainAaSequenceColumnarStagingRecord, byte[]> DATA_COMPRESSED = createField(DSL.name("data_compressed"), SQLDataType.BLOB.nullable(false), this, "");

    private YMainAaSequenceColumnarStaging(Name alias, Table<YMainAaSequenceColumnarStagingRecord> aliased) {
        this(alias, aliased, null);
    }

    private YMainAaSequenceColumnarStaging(Name alias, Table<YMainAaSequenceColumnarStagingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>y_main_aa_sequence_columnar_staging</code> table reference
     */
    public YMainAaSequenceColumnarStaging(String alias) {
        this(DSL.name(alias), Y_MAIN_AA_SEQUENCE_COLUMNAR_STAGING);
    }

    /**
     * Create an aliased <code>y_main_aa_sequence_columnar_staging</code> table reference
     */
    public YMainAaSequenceColumnarStaging(Name alias) {
        this(alias, Y_MAIN_AA_SEQUENCE_COLUMNAR_STAGING);
    }

    /**
     * Create a <code>y_main_aa_sequence_columnar_staging</code> table reference
     */
    public YMainAaSequenceColumnarStaging() {
        this(DSL.name("y_main_aa_sequence_columnar_staging"), null);
    }

    public <O extends Record> YMainAaSequenceColumnarStaging(Table<O> child, ForeignKey<O, YMainAaSequenceColumnarStagingRecord> key) {
        super(child, key, Y_MAIN_AA_SEQUENCE_COLUMNAR_STAGING);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<YMainAaSequenceColumnarStagingRecord> getPrimaryKey() {
        return Keys.Y_MAIN_AA_SEQUENCE_COLUMNAR_STAGING_PKEY;
    }

    @Override
    public List<UniqueKey<YMainAaSequenceColumnarStagingRecord>> getKeys() {
        return Arrays.<UniqueKey<YMainAaSequenceColumnarStagingRecord>>asList(Keys.Y_MAIN_AA_SEQUENCE_COLUMNAR_STAGING_PKEY);
    }

    @Override
    public YMainAaSequenceColumnarStaging as(String alias) {
        return new YMainAaSequenceColumnarStaging(DSL.name(alias), this);
    }

    @Override
    public YMainAaSequenceColumnarStaging as(Name alias) {
        return new YMainAaSequenceColumnarStaging(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public YMainAaSequenceColumnarStaging rename(String name) {
        return new YMainAaSequenceColumnarStaging(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public YMainAaSequenceColumnarStaging rename(Name name) {
        return new YMainAaSequenceColumnarStaging(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Integer, byte[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
