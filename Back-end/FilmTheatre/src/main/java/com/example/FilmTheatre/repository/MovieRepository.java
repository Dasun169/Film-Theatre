package com.example.FilmTheatre.repository;

import com.example.FilmTheatre.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    // CRUD operations
    Optional<Movie> findByTitle(String title);
}