package org.xyplayman.demo.repository;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.xyplayman.demo.jooq.tables.records.ArticleRecord;

import static org.xyplayman.demo.jooq.Tables.*;

@Repository
public class ArticleRepository {

    private final DSLContext jooq;

    @Autowired
    public ArticleRepository(DSLContext jooq) {
        this.jooq = jooq;
    }

    public Result<ArticleRecord> findAll() {
        return jooq.selectFrom(ARTICLE).
                orderBy(ARTICLE.POST_TIME.desc()).
                fetch();
    }

}
