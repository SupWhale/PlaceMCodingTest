package com.web;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.service.posts.InfoService;
import com.web.dto.InfoResponseDto;

@RequiredArgsConstructor
@RestController
public class InfoApiController {

    private final InfoService postsService;


    @GetMapping("/orderno/{orderno}")
    public InfoResponseDto findById (@PathVariable Long orderno){
        return InfoService.findById(orderno);
    }

}
