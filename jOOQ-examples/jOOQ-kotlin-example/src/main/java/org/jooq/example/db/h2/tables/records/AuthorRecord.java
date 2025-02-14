/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.db.h2.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.example.db.h2.tables.Author;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorRecord extends UpdatableRecordImpl<AuthorRecord> implements Record6<Integer, String, String, Date, Integer, String> {

    private static final long serialVersionUID = 701816275;

    /**
     * Setter for <code>PUBLIC.AUTHOR.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.AUTHOR.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>PUBLIC.AUTHOR.FIRST_NAME</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.AUTHOR.FIRST_NAME</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.AUTHOR.LAST_NAME</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.AUTHOR.LAST_NAME</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.AUTHOR.DATE_OF_BIRTH</code>.
     */
    public void setDateOfBirth(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.AUTHOR.DATE_OF_BIRTH</code>.
     */
    public Date getDateOfBirth() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>PUBLIC.AUTHOR.YEAR_OF_BIRTH</code>.
     */
    public void setYearOfBirth(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.AUTHOR.YEAR_OF_BIRTH</code>.
     */
    public Integer getYearOfBirth() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>PUBLIC.AUTHOR.ADDRESS</code>.
     */
    public void setAddress(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.AUTHOR.ADDRESS</code>.
     */
    public String getAddress() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, Date, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, Date, Integer, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Author.AUTHOR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Author.AUTHOR.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Author.AUTHOR.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return Author.AUTHOR.DATE_OF_BIRTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Author.AUTHOR.YEAR_OF_BIRTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Author.AUTHOR.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component4() {
        return getDateOfBirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getYearOfBirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getDateOfBirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getYearOfBirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorRecord value3(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorRecord value4(Date value) {
        setDateOfBirth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorRecord value5(Integer value) {
        setYearOfBirth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorRecord value6(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorRecord values(Integer value1, String value2, String value3, Date value4, Integer value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthorRecord
     */
    public AuthorRecord() {
        super(Author.AUTHOR);
    }

    /**
     * Create a detached, initialised AuthorRecord
     */
    public AuthorRecord(Integer id, String firstName, String lastName, Date dateOfBirth, Integer yearOfBirth, String address) {
        super(Author.AUTHOR);

        set(0, id);
        set(1, firstName);
        set(2, lastName);
        set(3, dateOfBirth);
        set(4, yearOfBirth);
        set(5, address);
    }
}
