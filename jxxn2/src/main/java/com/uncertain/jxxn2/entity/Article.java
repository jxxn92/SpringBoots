package com.uncertain.jxxn2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Entity // DB가 해당 객체를 인식 가능하다.
public class Article {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    private String content;

}
