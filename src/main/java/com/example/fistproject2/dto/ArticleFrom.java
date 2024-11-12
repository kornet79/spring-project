package com.example.fistproject2.dto;

import com.example.fistproject2.entity.Article;

public class ArticleFrom {

    private String title;
    private String content;

    public ArticleFrom(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleFrom{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    // ntt 를 변환 해주는 메소드가 되는거임
    public Article toEntity() {
        return new Article(null, title, content);
    }
}
