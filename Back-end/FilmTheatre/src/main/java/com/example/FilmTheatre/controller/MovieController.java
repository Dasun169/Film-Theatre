package com.example.FilmTheatre.controller;

import com.example.FilmTheatre.model.Movie;
import com.example.FilmTheatre.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/movies/")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("getAll")
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    @GetMapping("/{title}")
    public ResponseEntity<Movie> getMovieByTitle(@PathVariable("title") String title) {
        Optional<Movie> movie = movieService.getMovieByTitle(title);
        return movie.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
//    @GetMapping("{title}")
//    // localhost:8080/api/employees/1
//    public ResponseEntity<Movie> getMovieByTitle(@PathVariable("title") long title){
//        return new ResponseEntity<Movie>(MovieService.getMovieByTitle(title),HttpStatus.OK);
//    }
}