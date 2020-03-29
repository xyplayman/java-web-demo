/*
 * This file is generated by jOOQ.
 */
package org.xyplayman.demo.jooq.tables.records;


import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import org.xyplayman.demo.jooq.tables.Article;


/**
 * 文章
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ArticleRecord extends UpdatableRecordImpl<ArticleRecord> implements Record4<ULong, String, String, Timestamp> {

    private static final long serialVersionUID = -759061909;

    /**
     * Setter for <code>demo.article.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>demo.article.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>demo.article.title</code>.
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>demo.article.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>demo.article.content</code>.
     */
    public void setContent(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>demo.article.content</code>.
     */
    public String getContent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>demo.article.post_time</code>.
     */
    public void setPostTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>demo.article.post_time</code>.
     */
    public Timestamp getPostTime() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<ULong, String, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<ULong, String, String, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return Article.ARTICLE.ID;
    }

    @Override
    public Field<String> field2() {
        return Article.ARTICLE.TITLE;
    }

    @Override
    public Field<String> field3() {
        return Article.ARTICLE.CONTENT;
    }

    @Override
    public Field<Timestamp> field4() {
        return Article.ARTICLE.POST_TIME;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getTitle();
    }

    @Override
    public String component3() {
        return getContent();
    }

    @Override
    public Timestamp component4() {
        return getPostTime();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getTitle();
    }

    @Override
    public String value3() {
        return getContent();
    }

    @Override
    public Timestamp value4() {
        return getPostTime();
    }

    @Override
    public ArticleRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public ArticleRecord value2(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public ArticleRecord value3(String value) {
        setContent(value);
        return this;
    }

    @Override
    public ArticleRecord value4(Timestamp value) {
        setPostTime(value);
        return this;
    }

    @Override
    public ArticleRecord values(ULong value1, String value2, String value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ArticleRecord
     */
    public ArticleRecord() {
        super(Article.ARTICLE);
    }

    /**
     * Create a detached, initialised ArticleRecord
     */
    public ArticleRecord(ULong id, String title, String content, Timestamp postTime) {
        super(Article.ARTICLE);

        set(0, id);
        set(1, title);
        set(2, content);
        set(3, postTime);
    }
}
