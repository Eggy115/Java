/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.db.h2.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row1;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.db.h2.Indexes;
import org.jooq.example.db.h2.Keys;
import org.jooq.example.db.h2.Public;
import org.jooq.example.db.h2.tables.records.BookStoreRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookStore extends TableImpl<BookStoreRecord> {

    private static final long serialVersionUID = 873069360;

    /**
     * The reference instance of <code>PUBLIC.BOOK_STORE</code>
     */
    public static final BookStore BOOK_STORE = new BookStore();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BookStoreRecord> getRecordType() {
        return BookStoreRecord.class;
    }

    /**
     * The column <code>PUBLIC.BOOK_STORE.NAME</code>.
     */
    public final TableField<BookStoreRecord, String> NAME = createField(DSL.name("NAME"), org.jooq.impl.SQLDataType.VARCHAR(400).nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.BOOK_STORE</code> table reference
     */
    public BookStore() {
        this(DSL.name("BOOK_STORE"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.BOOK_STORE</code> table reference
     */
    public BookStore(String alias) {
        this(DSL.name(alias), BOOK_STORE);
    }

    /**
     * Create an aliased <code>PUBLIC.BOOK_STORE</code> table reference
     */
    public BookStore(Name alias) {
        this(alias, BOOK_STORE);
    }

    private BookStore(Name alias, Table<BookStoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private BookStore(Name alias, Table<BookStoreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> BookStore(Table<O> child, ForeignKey<O, BookStoreRecord> key) {
        super(child, key, BOOK_STORE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_F);
    }

    @Override
    public UniqueKey<BookStoreRecord> getPrimaryKey() {
        return Keys.UK_T_BOOK_STORE_NAME;
    }

    @Override
    public List<UniqueKey<BookStoreRecord>> getKeys() {
        return Arrays.<UniqueKey<BookStoreRecord>>asList(Keys.UK_T_BOOK_STORE_NAME);
    }

    @Override
    public BookStore as(String alias) {
        return new BookStore(DSL.name(alias), this);
    }

    @Override
    public BookStore as(Name alias) {
        return new BookStore(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BookStore rename(String name) {
        return new BookStore(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BookStore rename(Name name) {
        return new BookStore(name, null);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }
}
