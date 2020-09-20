package com.ponomarenko.controller;

import com.netflix.client.ClientException;
import com.ponomarenko.client.MovieClient;
import com.ponomarenko.client.ReviewClient;
import com.ponomarenko.dto.MovieDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController {
    private final MovieClient movieClient;
    private final ReviewClient reviewClient;

    //User mapping
    @GetMapping("movie/all")
    public List<MovieDto> findAll() {
        List<MovieDto> movies = movieClient.findAll();
        try {
            movies.forEach(
                    movie -> movie.setReviews(
                            reviewClient.findAllByMovieId(movie.getId())
                    ));
        } catch (Exception ignored) {}
        return movies;
    }

    @GetMapping("movie/{id}")
    public MovieDto findById(@PathVariable("id") Long id) {
        MovieDto movie = movieClient.findById(id);
        movie.setReviews(reviewClient.findAllByMovieId(movie.getId()));
        return movie;
    }

    //Admin mapping
    @PostMapping("admin/movie")
    public MovieDto save(@RequestBody MovieDto movieDto) {
        return movieClient.save(movieDto);
    }

    @DeleteMapping("admin/movie/{id}")
    public void delete(@PathVariable("id") Long id) {
        movieClient.delete(id);
    }
}
