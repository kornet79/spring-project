package com.example.fistproject2.contoller;

import com.example.fistproject2.dto.ArticleFrom;
import com.example.fistproject2.entity.Article;
import com.example.fistproject2.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/article/new")
    public String newArticleForm() {
        return "article/new";
    }

    @PostMapping("/article/create")
    public String createArticle(ArticleFrom form) {
        System.out.println(form.toString());

        //1.  Dto 객체를 변환 -> Entity !!
        Article article  = form.toEntity();
        System.out.println(article.toString());
        //2.  Repository에서 Entiy를 Db에 저장해서 명령
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());


        return "";
    }

}
