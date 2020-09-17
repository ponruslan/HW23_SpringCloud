package com.ponomarenko.service;

import com.ponomarenko.model.Review;
import com.ponomarenko.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    public void delete(Review review) {
        reviewRepository.delete(review);
    }

    public List<Review> findAllByMovieId(Long movieId) {
        return reviewRepository.findAllByMovieId(movieId);
    }
}
