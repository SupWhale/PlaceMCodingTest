package com.web.dto;

import com.domain.posts.Info;
import lombok.Getter;

@Getter
public class InfoResponseDto {
    private String name;
    private String mobile;
    private String city;
    private int age;

    public InfoResponseDto(Info entity){
        this.name = entity.getName();
        this.mobile = entity.getMobile();
        this.city = entity.getCity();
        this.age = entity.getAge();
    }
}
