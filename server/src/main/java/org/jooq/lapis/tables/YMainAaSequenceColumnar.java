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
import org.jooq.lapis.tables.records.YMainAaSequenceColumnarRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class YMainAaSequenceColumnar extends TableImpl<YMainAaSequenceColumnarRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>y_main_aa_sequence_columnar</code>
     */
    public static final YMainAaSequenceColumnar Y_MAIN_AA_SEQUENCE_COLUMNAR = new YMainAaSequenceColumnar();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<YMainAaSequenceColumnarRecord> getRecordType() {
        return YMainAaSequenceColumnarRecord.class;
    }

    /**
     * The column <code>y_main_aa_sequence_columnar.gene</code>.
     */
    public final TableField<YMainAaSequenceColumnarRecord, String> GENE = createField(DSL.name("gene"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>y_main_aa_sequence_columnar.position</code>.
     */
    public final TableField<YMainAaSequenceColumnarRecord, Integer> POSITION = createField(DSL.name("position"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>y_main_aa_sequence_columnar.data_compressed</code>.
     */
    public final TableField<YMainAaSequenceColumnarRecord, byte[]> DATA_COMPRESSED = createField(DSL.name("data_compressed"), SQLDataType.BLOB.nullable(false), this, "");

    private YMainAaSequenceColumnar(Name alias, Table<YMainAaSequenceColumnarRecord> aliased) {
        this(alias, aliased, null);
    }

    private YMainAaSequenceColumnar(Name alias, Table<YMainAaSequenceColumnarRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>y_main_aa_sequence_columnar</code> table reference
     */
    public YMainAaSequenceColumnar(String alias) {
        this(DSL.name(alias), Y_MAIN_AA_SEQUENCE_COLUMNAR);
    }

    /**
     * Create an aliased <code>y_main_aa_sequence_columnar</code> table reference
     */
    public YMainAaSequenceColumnar(Name alias) {
        this(alias, Y_MAIN_AA_SEQUENCE_COLUMNAR);
    }

    /**
     * Create a <code>y_main_aa_sequence_columnar</code> table reference
     */
    public YMainAaSequenceColumnar() {
        this(DSL.name("y_main_aa_sequence_columnar"), null);
    }

    public <O extends Record> YMainAaSequenceColumnar(Table<O> child, ForeignKey<O, YMainAaSequenceColumnarRecord> key) {
        super(child, key, Y_MAIN_AA_SEQUENCE_COLUMNAR);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<YMainAaSequenceColumnarRecord> getPrimaryKey() {
        return Keys.Y_MAIN_AA_SEQUENCE_COLUMNAR_PKEY;
    }

    @Override
    public List<UniqueKey<YMainAaSequenceColumnarRecord>> getKeys() {
        return Arrays.<UniqueKey<YMainAaSequenceColumnarRecord>>asList(Keys.Y_MAIN_AA_SEQUENCE_COLUMNAR_PKEY);
    }

    @Override
    public YMainAaSequenceColumnar as(String alias) {
        return new YMainAaSequenceColumnar(DSL.name(alias), this);
    }

    @Override
    public YMainAaSequenceColumnar as(Name alias) {
        return new YMainAaSequenceColumnar(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public YMainAaSequenceColumnar rename(String name) {
        return new YMainAaSequenceColumnar(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public YMainAaSequenceColumnar rename(Name name) {
        return new YMainAaSequenceColumnar(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Integer, byte[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
