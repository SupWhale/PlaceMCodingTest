package com.web.dto;

import com.domain.posts.Info;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class InfoSaveRequestDto {
    private String name;
    private String mobile;
    private String city;
    private int age;
    @Builder
    public InfoSaveRequestDto(String name, String mobile, String city, int age){
        this.name = name;
        this.mobile = mobile;
        this.city = city;
        this.age = age;
    }

    public Info toEntity(){
        return Info.builder()
                .name(name)
                .mobile(mobile)
                .city(city)
                .age(age)
                .build();
    }
}
