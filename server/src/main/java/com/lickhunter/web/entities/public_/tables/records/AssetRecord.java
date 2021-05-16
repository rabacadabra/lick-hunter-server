/*
 * This file is generated by jOOQ.
 */
package com.lickhunter.web.entities.public_.tables.records;


import com.lickhunter.web.entities.public_.tables.Asset;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AssetRecord extends UpdatableRecordImpl<AssetRecord> implements Record9<String, Double, Double, Double, Double, Double, Double, Double, String> {

    private static final long serialVersionUID = -1004643276;

    /**
     * Setter for <code>PUBLIC.ASSET.ASSET</code>.
     */
    public void setAsset(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.ASSET.ASSET</code>.
     */
    public String getAsset() {
        return (String) get(0);
    }

    /**
     * Setter for <code>PUBLIC.ASSET.INITIAL_MARGIN</code>.
     */
    public void setInitialMargin(Double value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.ASSET.INITIAL_MARGIN</code>.
     */
    public Double getInitialMargin() {
        return (Double) get(1);
    }

    /**
     * Setter for <code>PUBLIC.ASSET.MAINT_MARGIN</code>.
     */
    public void setMaintMargin(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.ASSET.MAINT_MARGIN</code>.
     */
    public Double getMaintMargin() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>PUBLIC.ASSET.MARGIN_BALANCE</code>.
     */
    public void setMarginBalance(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.ASSET.MARGIN_BALANCE</code>.
     */
    public Double getMarginBalance() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>PUBLIC.ASSET.MAX_WITHDRAW_AMOUNT</code>.
     */
    public void setMaxWithdrawAmount(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.ASSET.MAX_WITHDRAW_AMOUNT</code>.
     */
    public Double getMaxWithdrawAmount() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>PUBLIC.ASSET.OPEN_ORDER_INITIAL_MARGIN</code>.
     */
    public void setOpenOrderInitialMargin(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.ASSET.OPEN_ORDER_INITIAL_MARGIN</code>.
     */
    public Double getOpenOrderInitialMargin() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>PUBLIC.ASSET.POSITION_INITIAL_MARGIN</code>.
     */
    public void setPositionInitialMargin(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>PUBLIC.ASSET.POSITION_INITIAL_MARGIN</code>.
     */
    public Double getPositionInitialMargin() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>PUBLIC.ASSET.UNREALIZED_PROFIT</code>.
     */
    public void setUnrealizedProfit(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>PUBLIC.ASSET.UNREALIZED_PROFIT</code>.
     */
    public Double getUnrealizedProfit() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>PUBLIC.ASSET.ACCOUNT_ID</code>.
     */
    public void setAccountId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>PUBLIC.ASSET.ACCOUNT_ID</code>.
     */
    public String getAccountId() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, Double, Double, Double, Double, Double, Double, Double, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<String, Double, Double, Double, Double, Double, Double, Double, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Asset.ASSET.ASSET_;
    }

    @Override
    public Field<Double> field2() {
        return Asset.ASSET.INITIAL_MARGIN;
    }

    @Override
    public Field<Double> field3() {
        return Asset.ASSET.MAINT_MARGIN;
    }

    @Override
    public Field<Double> field4() {
        return Asset.ASSET.MARGIN_BALANCE;
    }

    @Override
    public Field<Double> field5() {
        return Asset.ASSET.MAX_WITHDRAW_AMOUNT;
    }

    @Override
    public Field<Double> field6() {
        return Asset.ASSET.OPEN_ORDER_INITIAL_MARGIN;
    }

    @Override
    public Field<Double> field7() {
        return Asset.ASSET.POSITION_INITIAL_MARGIN;
    }

    @Override
    public Field<Double> field8() {
        return Asset.ASSET.UNREALIZED_PROFIT;
    }

    @Override
    public Field<String> field9() {
        return Asset.ASSET.ACCOUNT_ID;
    }

    @Override
    public String component1() {
        return getAsset();
    }

    @Override
    public Double component2() {
        return getInitialMargin();
    }

    @Override
    public Double component3() {
        return getMaintMargin();
    }

    @Override
    public Double component4() {
        return getMarginBalance();
    }

    @Override
    public Double component5() {
        return getMaxWithdrawAmount();
    }

    @Override
    public Double component6() {
        return getOpenOrderInitialMargin();
    }

    @Override
    public Double component7() {
        return getPositionInitialMargin();
    }

    @Override
    public Double component8() {
        return getUnrealizedProfit();
    }

    @Override
    public String component9() {
        return getAccountId();
    }

    @Override
    public String value1() {
        return getAsset();
    }

    @Override
    public Double value2() {
        return getInitialMargin();
    }

    @Override
    public Double value3() {
        return getMaintMargin();
    }

    @Override
    public Double value4() {
        return getMarginBalance();
    }

    @Override
    public Double value5() {
        return getMaxWithdrawAmount();
    }

    @Override
    public Double value6() {
        return getOpenOrderInitialMargin();
    }

    @Override
    public Double value7() {
        return getPositionInitialMargin();
    }

    @Override
    public Double value8() {
        return getUnrealizedProfit();
    }

    @Override
    public String value9() {
        return getAccountId();
    }

    @Override
    public AssetRecord value1(String value) {
        setAsset(value);
        return this;
    }

    @Override
    public AssetRecord value2(Double value) {
        setInitialMargin(value);
        return this;
    }

    @Override
    public AssetRecord value3(Double value) {
        setMaintMargin(value);
        return this;
    }

    @Override
    public AssetRecord value4(Double value) {
        setMarginBalance(value);
        return this;
    }

    @Override
    public AssetRecord value5(Double value) {
        setMaxWithdrawAmount(value);
        return this;
    }

    @Override
    public AssetRecord value6(Double value) {
        setOpenOrderInitialMargin(value);
        return this;
    }

    @Override
    public AssetRecord value7(Double value) {
        setPositionInitialMargin(value);
        return this;
    }

    @Override
    public AssetRecord value8(Double value) {
        setUnrealizedProfit(value);
        return this;
    }

    @Override
    public AssetRecord value9(String value) {
        setAccountId(value);
        return this;
    }

    @Override
    public AssetRecord values(String value1, Double value2, Double value3, Double value4, Double value5, Double value6, Double value7, Double value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AssetRecord
     */
    public AssetRecord() {
        super(Asset.ASSET);
    }

    /**
     * Create a detached, initialised AssetRecord
     */
    public AssetRecord(String asset, Double initialMargin, Double maintMargin, Double marginBalance, Double maxWithdrawAmount, Double openOrderInitialMargin, Double positionInitialMargin, Double unrealizedProfit, String accountId) {
        super(Asset.ASSET);

        set(0, asset);
        set(1, initialMargin);
        set(2, maintMargin);
        set(3, marginBalance);
        set(4, maxWithdrawAmount);
        set(5, openOrderInitialMargin);
        set(6, positionInitialMargin);
        set(7, unrealizedProfit);
        set(8, accountId);
    }
}
