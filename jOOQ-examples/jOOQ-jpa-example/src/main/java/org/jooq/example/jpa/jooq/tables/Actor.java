/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.jpa.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.jpa.jooq.Indexes;
import org.jooq.example.jpa.jooq.Keys;
import org.jooq.example.jpa.jooq.Public;
import org.jooq.example.jpa.jooq.tables.records.ActorRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Actor extends TableImpl<ActorRecord> {

    private static final long serialVersionUID = 1550952639;

    /**
     * The reference instance of <code>PUBLIC.ACTOR</code>
     */
    public static final Actor ACTOR = new Actor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActorRecord> getRecordType() {
        return ActorRecord.class;
    }

    /**
     * The column <code>PUBLIC.ACTOR.ACTORID</code>.
     */
    public final TableField<ActorRecord, Integer> ACTORID = createField("ACTORID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.ACTOR.FIRSTNAME</code>.
     */
    public final TableField<ActorRecord, String> FIRSTNAME = createField("FIRSTNAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.ACTOR.LASTNAME</code>.
     */
    public final TableField<ActorRecord, String> LASTNAME = createField("LASTNAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>PUBLIC.ACTOR</code> table reference
     */
    public Actor() {
        this(DSL.name("ACTOR"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.ACTOR</code> table reference
     */
    public Actor(String alias) {
        this(DSL.name(alias), ACTOR);
    }

    /**
     * Create an aliased <code>PUBLIC.ACTOR</code> table reference
     */
    public Actor(Name alias) {
        this(alias, ACTOR);
    }

    private Actor(Name alias, Table<ActorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Actor(Name alias, Table<ActorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Actor(Table<O> child, ForeignKey<O, ActorRecord> key) {
        super(child, key, ACTOR);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ActorRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ACTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActorRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActorRecord>> getKeys() {
        return Arrays.<UniqueKey<ActorRecord>>asList(Keys.CONSTRAINT_3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Actor as(String alias) {
        return new Actor(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Actor as(Name alias) {
        return new Actor(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Actor rename(String name) {
        return new Actor(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Actor rename(Name name) {
        return new Actor(name, null);
    }
}
