package com.example.FilmTheatre.repository;

import com.example.FilmTheatre.model.BookingSeat;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookingSeatRepository extends JpaRepository<BookingSeat,Long>{
    List<BookingSeat> findByMovieDateAndTimeSlot(String movieDate, String timeSlot);

    @Query("SELECT b.seatNo FROM BookingSeat b WHERE b.movieDate = :movieDate AND b.timeSlot = :timeSlot")
    List<String> findSeatNosByMovieDateAndTimeSlot(@Param("movieDate") String movieDate, @Param("timeSlot") String timeSlot);

}
