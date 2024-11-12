package com.example.fistproject2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString

@Entity
public class Article {
    @Id // 프라이머리 key
    @GeneratedValue  // 1,2,3, ,,, 자동생성 어노테이션!!
    private Long id;

    @Column
    private String title;
    @Column
    private String content;


}
