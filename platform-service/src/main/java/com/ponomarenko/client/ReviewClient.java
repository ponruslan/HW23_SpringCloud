package com.ponomarenko.client;

import com.ponomarenko.dto.ReviewDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "review-service")
public interface ReviewClient {

    @GetMapping("review/movie/{id}")
    List<ReviewDto> findAllByMovieId(@PathVariable("id") Long movieId);
}
