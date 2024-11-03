package com.example.FilmTheatre.controller;

import com.example.FilmTheatre.model.Booking;
import com.example.FilmTheatre.model.Movie;
import com.example.FilmTheatre.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.Collections;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/booking/")


public class BookingController {

    @Autowired
    private BookingService bookingService;
    @GetMapping("/{title}")
    public ResponseEntity<Booking> getBookingByTitle(@PathVariable("title") String title) {
        Optional<Booking> booking = bookingService.getBookingByTitle(title);
        return booking.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}