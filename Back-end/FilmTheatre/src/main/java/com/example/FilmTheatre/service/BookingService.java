package com.example.FilmTheatre.service;
import com.example.FilmTheatre.model.Booking;
import com.example.FilmTheatre.model.Movie;

import java.util.Optional;
import java.util.List;

public interface BookingService {
    void saveBookingIfNotExists(Booking booking);
    Optional<Booking> getBookingByTitle(String title);

    List<String> getDistinctTimeSlotsByTitle(String title);
}