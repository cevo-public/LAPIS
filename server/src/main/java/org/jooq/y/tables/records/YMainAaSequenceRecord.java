/*
 * This file is generated by jOOQ.
 */
package org.jooq.y.tables.records;


import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.y.tables.YMainAaSequence;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class YMainAaSequenceRecord extends UpdatableRecordImpl<YMainAaSequenceRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.y_main_aa_sequence.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.y_main_aa_sequence.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.y_main_aa_sequence.gene</code>.
     */
    public void setGene(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.y_main_aa_sequence.gene</code>.
     */
    public String getGene() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.y_main_aa_sequence.aa_seq</code>.
     */
    public void setAaSeq(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.y_main_aa_sequence.aa_seq</code>.
     */
    public String getAaSeq() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return YMainAaSequence.Y_MAIN_AA_SEQUENCE.ID;
    }

    @Override
    public Field<String> field2() {
        return YMainAaSequence.Y_MAIN_AA_SEQUENCE.GENE;
    }

    @Override
    public Field<String> field3() {
        return YMainAaSequence.Y_MAIN_AA_SEQUENCE.AA_SEQ;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getGene();
    }

    @Override
    public String component3() {
        return getAaSeq();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getGene();
    }

    @Override
    public String value3() {
        return getAaSeq();
    }

    @Override
    public YMainAaSequenceRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public YMainAaSequenceRecord value2(String value) {
        setGene(value);
        return this;
    }

    @Override
    public YMainAaSequenceRecord value3(String value) {
        setAaSeq(value);
        return this;
    }

    @Override
    public YMainAaSequenceRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached YMainAaSequenceRecord
     */
    public YMainAaSequenceRecord() {
        super(YMainAaSequence.Y_MAIN_AA_SEQUENCE);
    }

    /**
     * Create a detached, initialised YMainAaSequenceRecord
     */
    public YMainAaSequenceRecord(Integer id, String gene, String aaSeq) {
        super(YMainAaSequence.Y_MAIN_AA_SEQUENCE);

        setId(id);
        setGene(gene);
        setAaSeq(aaSeq);
    }
}
