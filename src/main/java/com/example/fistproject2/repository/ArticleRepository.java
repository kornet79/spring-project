package com.example.fistproject2.repository;

import com.example.fistproject2.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {


}
