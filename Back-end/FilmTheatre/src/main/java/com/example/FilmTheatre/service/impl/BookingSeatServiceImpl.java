package com.example.FilmTheatre.service.impl;

import com.example.FilmTheatre.model.BookingSeat;
import com.example.FilmTheatre.repository.BookingSeatRepository;
import com.example.FilmTheatre.service.BookingSeatService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingSeatServiceImpl implements BookingSeatService{
    
    @Autowired
    private BookingSeatRepository bookingSeatRepository;

    @Override
    public BookingSeat saveBookingSeat(BookingSeat bookingSeat){
        return bookingSeatRepository.save(bookingSeat);
    }

    @Override
    public List<BookingSeat> saveAllBookingSeats(List<BookingSeat> bookingSeats) {
        return bookingSeatRepository.saveAll(bookingSeats);
    }

    @Override
    public List<BookingSeat> getBookingSeatByMovieDateAndTimeSlot(String movieDate, String timeSlot){
        List<BookingSeat> bookingSeat = bookingSeatRepository.findByMovieDateAndTimeSlot(movieDate, timeSlot);

        if(bookingSeat == null){
            throw new RuntimeException("Booking Seats not found for Movie Date: " + movieDate + " and Time slot: " + timeSlot);
        }
        return bookingSeat;
    }

    @Override
    public List<String> getSeatNosByMovieDateAndTimeSlot(String movieDate, String timeSlot) {
        List<String> seatNos = bookingSeatRepository.findSeatNosByMovieDateAndTimeSlot(movieDate, timeSlot);
        if (seatNos == null || seatNos.isEmpty()) {
            throw new RuntimeException("No seats found for Movie Date: " + movieDate + " and Time Slot: " + timeSlot);
        }
        return seatNos;
    }
}
