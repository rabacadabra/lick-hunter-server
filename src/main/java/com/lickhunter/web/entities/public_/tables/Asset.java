/*
 * This file is generated by jOOQ.
 */
package com.lickhunter.web.entities.public_.tables;


import com.lickhunter.web.entities.public_.Indexes;
import com.lickhunter.web.entities.public_.Keys;
import com.lickhunter.web.entities.public_.Public;
import com.lickhunter.web.entities.public_.tables.records.AssetRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Asset extends TableImpl<AssetRecord> {

    private static final long serialVersionUID = 469768274;

    /**
     * The reference instance of <code>PUBLIC.ASSET</code>
     */
    public static final Asset ASSET = new Asset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssetRecord> getRecordType() {
        return AssetRecord.class;
    }

    /**
     * The column <code>PUBLIC.ASSET.ASSET</code>.
     */
    public final TableField<AssetRecord, String> ASSET_ = createField(DSL.name("ASSET"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ASSET.INITIAL_MARGIN</code>.
     */
    public final TableField<AssetRecord, Double> INITIAL_MARGIN = createField(DSL.name("INITIAL_MARGIN"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ASSET.MAINT_MARGIN</code>.
     */
    public final TableField<AssetRecord, Double> MAINT_MARGIN = createField(DSL.name("MAINT_MARGIN"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ASSET.MARGIN_BALANCE</code>.
     */
    public final TableField<AssetRecord, Double> MARGIN_BALANCE = createField(DSL.name("MARGIN_BALANCE"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ASSET.MAX_WITHDRAW_AMOUNT</code>.
     */
    public final TableField<AssetRecord, Double> MAX_WITHDRAW_AMOUNT = createField(DSL.name("MAX_WITHDRAW_AMOUNT"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ASSET.OPEN_ORDER_INITIAL_MARGIN</code>.
     */
    public final TableField<AssetRecord, Double> OPEN_ORDER_INITIAL_MARGIN = createField(DSL.name("OPEN_ORDER_INITIAL_MARGIN"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ASSET.POSITION_INITIAL_MARGIN</code>.
     */
    public final TableField<AssetRecord, Double> POSITION_INITIAL_MARGIN = createField(DSL.name("POSITION_INITIAL_MARGIN"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ASSET.UNREALIZED_PROFIT</code>.
     */
    public final TableField<AssetRecord, Double> UNREALIZED_PROFIT = createField(DSL.name("UNREALIZED_PROFIT"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ASSET.ACCOUNT_ID</code>.
     */
    public final TableField<AssetRecord, String> ACCOUNT_ID = createField(DSL.name("ACCOUNT_ID"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.ASSET</code> table reference
     */
    public Asset() {
        this(DSL.name("ASSET"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.ASSET</code> table reference
     */
    public Asset(String alias) {
        this(DSL.name(alias), ASSET);
    }

    /**
     * Create an aliased <code>PUBLIC.ASSET</code> table reference
     */
    public Asset(Name alias) {
        this(alias, ASSET);
    }

    private Asset(Name alias, Table<AssetRecord> aliased) {
        this(alias, aliased, null);
    }

    private Asset(Name alias, Table<AssetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Asset(Table<O> child, ForeignKey<O, AssetRecord> key) {
        super(child, key, ASSET);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FK_ASSET_ACCOUNT_ID_INDEX_3, Indexes.PRIMARY_KEY_3);
    }

    @Override
    public UniqueKey<AssetRecord> getPrimaryKey() {
        return Keys.PK_ASSET;
    }

    @Override
    public List<UniqueKey<AssetRecord>> getKeys() {
        return Arrays.<UniqueKey<AssetRecord>>asList(Keys.PK_ASSET);
    }

    @Override
    public List<ForeignKey<AssetRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AssetRecord, ?>>asList(Keys.FK_ASSET_ACCOUNT_ID);
    }

    public Account account() {
        return new Account(this, Keys.FK_ASSET_ACCOUNT_ID);
    }

    @Override
    public Asset as(String alias) {
        return new Asset(DSL.name(alias), this);
    }

    @Override
    public Asset as(Name alias) {
        return new Asset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Asset rename(String name) {
        return new Asset(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Asset rename(Name name) {
        return new Asset(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, Double, Double, Double, Double, Double, Double, Double, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
