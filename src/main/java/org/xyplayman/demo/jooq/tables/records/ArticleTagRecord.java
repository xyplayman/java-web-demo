/*
 * This file is generated by jOOQ.
 */
package org.xyplayman.demo.jooq.tables.records;


import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import org.xyplayman.demo.jooq.tables.ArticleTag;


/**
 * 文章和标签关联
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ArticleTagRecord extends UpdatableRecordImpl<ArticleTagRecord> implements Record2<ULong, ULong> {

    private static final long serialVersionUID = -1967815388;

    /**
     * Setter for <code>demo.article_tag.article_id</code>.
     */
    public void setArticleId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>demo.article_tag.article_id</code>.
     */
    public ULong getArticleId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>demo.article_tag.tag_id</code>.
     */
    public void setTagId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>demo.article_tag.tag_id</code>.
     */
    public ULong getTagId() {
        return (ULong) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<ULong, ULong> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<ULong, ULong> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<ULong, ULong> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return ArticleTag.ARTICLE_TAG.ARTICLE_ID;
    }

    @Override
    public Field<ULong> field2() {
        return ArticleTag.ARTICLE_TAG.TAG_ID;
    }

    @Override
    public ULong component1() {
        return getArticleId();
    }

    @Override
    public ULong component2() {
        return getTagId();
    }

    @Override
    public ULong value1() {
        return getArticleId();
    }

    @Override
    public ULong value2() {
        return getTagId();
    }

    @Override
    public ArticleTagRecord value1(ULong value) {
        setArticleId(value);
        return this;
    }

    @Override
    public ArticleTagRecord value2(ULong value) {
        setTagId(value);
        return this;
    }

    @Override
    public ArticleTagRecord values(ULong value1, ULong value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ArticleTagRecord
     */
    public ArticleTagRecord() {
        super(ArticleTag.ARTICLE_TAG);
    }

    /**
     * Create a detached, initialised ArticleTagRecord
     */
    public ArticleTagRecord(ULong articleId, ULong tagId) {
        super(ArticleTag.ARTICLE_TAG);

        set(0, articleId);
        set(1, tagId);
    }
}
