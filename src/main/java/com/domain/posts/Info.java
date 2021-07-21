package com.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Info {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderno;

    private String name;
    private String mobile;
    private String city;
    private int age;

    @Builder
    public Info(String name, String mobile, String city, int age){
        this.name = name;
        this.mobile = mobile;
        this.city = city;
        this.age = age;
    }
}
