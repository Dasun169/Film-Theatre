package com.example.FilmTheatre.repository;

import com.example.FilmTheatre.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.List;


public interface BookingRepository extends JpaRepository<Booking,Long>{
    Optional<Booking> findByTitle(String title);

    @Query("SELECT DISTINCT b.time_slot FROM Booking b WHERE b.title = :title")
    List<String> findDistinctTimeSlotsByTitle(@Param("title") String title);
}
