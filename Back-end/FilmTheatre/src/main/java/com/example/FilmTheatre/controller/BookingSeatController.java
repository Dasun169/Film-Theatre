package com.example.FilmTheatre.controller;

import com.example.FilmTheatre.model.BookingSeat;
import com.example.FilmTheatre.service.BookingSeatService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookingSeat")
@CrossOrigin(origins = "*")

public class BookingSeatController {
    
    @Autowired
    private BookingSeatService bookingSeatService;

    @PostMapping
    public ResponseEntity<BookingSeat> saveBookingSeat(@RequestBody BookingSeat bookingSeat){
        return new ResponseEntity<BookingSeat>(bookingSeatService.saveBookingSeat(bookingSeat), HttpStatus.CREATED);
    }

    @GetMapping("{movieDate}/{timeSlot}")
    public ResponseEntity<List<BookingSeat>> getBookingSeatByMovieDateAndTimeSlot(@PathVariable("movieDate") String movieDate, @PathVariable("timeSlot") String timeSlot) {
        List<BookingSeat> bookingSeats = bookingSeatService.getBookingSeatByMovieDateAndTimeSlot(movieDate, timeSlot);
        return new ResponseEntity<>(bookingSeats, HttpStatus.OK);
    }

    @GetMapping("seat/{movieDate}/{timeSlot}")
    public ResponseEntity<List<String>> getSeatNosByMovieDateAndTimeSlot(@PathVariable("movieDate") String movieDate, @PathVariable("timeSlot") String timeSlot) {
        List<String> seatNos = bookingSeatService.getSeatNosByMovieDateAndTimeSlot(movieDate, timeSlot);
        return new ResponseEntity<>(seatNos, HttpStatus.OK);
    }
}
