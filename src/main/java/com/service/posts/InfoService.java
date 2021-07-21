package com.service.posts;


import com.domain.posts.Info;
import com.domain.posts.InfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.web.dto.InfoResponseDto;
import com.web.dto.InfoSaveRequestDto;

@RequiredArgsConstructor
@Service
public class InfoService {
    private final InfoRepository infoRepository;

    @Transactional
    public Long save(InfoSaveRequestDto requestDto){

        return infoRepository.save(requestDto.toEntity()).getOrderno();
    }

    public InfoResponseDto findById(Long orderno){
        Info entity = infoRepository.findById(orderno).orElseThrow(
                () -> new IllegalArgumentException("null"));

                return new InfoResponseDto(entity);
    }
}
