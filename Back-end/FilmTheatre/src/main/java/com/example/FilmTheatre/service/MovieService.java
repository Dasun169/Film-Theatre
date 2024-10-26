package com.example.FilmTheatre.service;

import com.example.FilmTheatre.model.Movie;
import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<Movie> getAllMovies();
    void saveMovieIfNotExists(Movie movie);
    Optional<Movie> getMovieByTitle(String title);
}
