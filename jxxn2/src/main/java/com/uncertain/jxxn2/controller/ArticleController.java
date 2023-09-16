package com.uncertain.jxxn2.controller;

import com.uncertain.jxxn2.dto.ArticleForm;
import com.uncertain.jxxn2.entity.Article;
import com.uncertain.jxxn2.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j // 로그를 위한 어노테이션
public class ArticleController {

    @Autowired // 스프링 부트가 미리 생성해 놓은 객체를 가져다가 자동으로 연결
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleFrom() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
//        System.out.println(form.toString()); -> 로깅으로 대체
        log.info(form.toString());

        // 1. DTO를 변환해야한다 Entity로 변환 시켜야 한다.
        Article article =  form.toEntity();
//        System.out.println(article.toString());
        log.info(article.toString());

        // 2. Repositoty에게 Entity를 DB안에 저장하게 시킨다.
        Article saved = articleRepository.save(article);
//        System.out.println(saved.toString());
        log.info(saved.toString());
        return "";
    }

}
