package com.example.fistproject2.dto;

import com.example.fistproject2.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor

public class ArticleFrom {

    private String title;
    private String content;


    // ntt 를 변환 해주는 메소드가 되는거임
    public Article toEntity() {
        return new Article(null, title, content);
    }
}
