package com.example.FilmTheatre.repository;

import com.example.FilmTheatre.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    // CRUD operations
    Optional<Movie> findByTitle(String title);

    // Find movies with titles that start with the given string (case-insensitive)
    @Query("SELECT m FROM Movie m WHERE LOWER(m.title) LIKE LOWER(CONCAT(:title, '%'))")
    List<Movie> findByTitleStartingWith(String title);
}