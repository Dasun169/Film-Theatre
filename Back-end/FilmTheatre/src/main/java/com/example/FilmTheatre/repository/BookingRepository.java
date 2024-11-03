package com.example.FilmTheatre.repository;

import com.example.FilmTheatre.model.Booking;
import com.example.FilmTheatre.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;


public interface BookingRepository extends JpaRepository<Booking,Long>{
    Optional<Booking> findByTitle(String title);
}
