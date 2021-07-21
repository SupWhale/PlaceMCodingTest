package com.web;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.service.posts.InfoService;
import com.web.dto.InfoResponseDto;

@RequiredArgsConstructor
@RestController
public class InfoApiController {

    private final InfoService infoService;


    @GetMapping("/orderno/{orderno}")
    public InfoResponseDto findByOrderno (@PathVariable Long orderno){
        return infoService.findById(orderno);
    }

}
