package com.example.FilmTheatre.service;

import java.util.List;

import com.example.FilmTheatre.model.BookingSeat;

public interface BookingSeatService {
    BookingSeat saveBookingSeat(BookingSeat bookingSeat);
    List<BookingSeat> saveAllBookingSeats(List<BookingSeat> bookingSeats);
    List<BookingSeat> getBookingSeatByMovieDateAndTimeSlot(String movieDate, String timeSlot);
    List<String> getSeatNosByMovieDateAndTimeSlot(String movieDate, String timeSlot);
}
