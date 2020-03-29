package org.xyplayman.demo.controller;

import org.jooq.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.xyplayman.demo.jooq.tables.records.ArticleRecord;
import org.xyplayman.demo.repository.ArticleRepository;

@Controller
public class ArticleController {

    private final ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        Result<ArticleRecord> articles = articleRepository.findAll();
        model.addAttribute("articles", articles);
        return "index";
    }

}
