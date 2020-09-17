package com.ponomarenko.controller;

import com.ponomarenko.model.Movie;
import com.ponomarenko.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    //User mapping
    @GetMapping("movie/all")
    public List<Movie> findAll(){
        return movieService.findAll();
    }

    @GetMapping("movie/{id}")
    public Movie findById(@PathVariable("id") Movie movie){
        return movie;
    }


    //Admin mapping
    @PostMapping("admin/movie")
    public Movie save(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

    @DeleteMapping("admin/movie/{id}")
    public void delete(@PathVariable("id") Movie movie) {
        movieService.delete(movie);
    }
}
