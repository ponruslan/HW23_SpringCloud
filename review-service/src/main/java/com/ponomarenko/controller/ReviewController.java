package com.ponomarenko.controller;

import com.ponomarenko.model.Review;
import com.ponomarenko.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("review")
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping("create")
    public Review create(@RequestBody Review review) {
        return reviewService.save(review);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") Review review) {
        reviewService.delete(review);
    }

    @GetMapping("movie/{id}")
    public List<Review> findAllByMovieId(@PathVariable("id") Long movieId){
        return reviewService.findAllByMovieId(movieId);
    }
}
