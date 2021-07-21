package com.web.dto;

import com.domain.posts.Info;
import lombok.Getter;

@Getter
public class InfoResponseDto {
    private Long orderno;
    private String name;
    private String mobile;
    private String city;

    public InfoResponseDto(Info entity){
        this.orderno = entity.getOrderno();
        this.name = entity.getName();
        this.mobile = entity.getMobile();
        this.city = entity.getCity();
    }
}
