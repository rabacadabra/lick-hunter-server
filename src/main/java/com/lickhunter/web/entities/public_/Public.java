/*
 * This file is generated by jOOQ.
 */
package com.lickhunter.web.entities.public_;


import com.lickhunter.web.entities.DefaultCatalog;
import com.lickhunter.web.entities.public_.tables.*;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1042151213;

    /**
     * The reference instance of <code>PUBLIC</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>PUBLIC.ACCOUNT</code>.
     */
    public final Account ACCOUNT = com.lickhunter.web.entities.public_.tables.Account.ACCOUNT;

    /**
     * The table <code>PUBLIC.ASSET</code>.
     */
    public final Asset ASSET = com.lickhunter.web.entities.public_.tables.Asset.ASSET;

    /**
     * The table <code>PUBLIC.CANDLESTICK</code>.
     */
    public final Candlestick CANDLESTICK = com.lickhunter.web.entities.public_.tables.Candlestick.CANDLESTICK;

    /**
     * The table <code>PUBLIC.COINS</code>.
     */
    public final Coins COINS = com.lickhunter.web.entities.public_.tables.Coins.COINS;

    /**
     * The table <code>PUBLIC.POSITION</code>.
     */
    public final Position POSITION = com.lickhunter.web.entities.public_.tables.Position.POSITION;

    /**
     * The table <code>PUBLIC.SYMBOL</code>.
     */
    public final Symbol SYMBOL = com.lickhunter.web.entities.public_.tables.Symbol.SYMBOL;

    /**
     * No further instances allowed
     */
    private Public() {
        super("PUBLIC", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Account.ACCOUNT,
            Asset.ASSET,
            Candlestick.CANDLESTICK,
            Coins.COINS,
            Position.POSITION,
            Symbol.SYMBOL);
    }
}
