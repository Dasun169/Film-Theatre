package com.example.FilmTheatre.service.impl;

import com.example.FilmTheatre.model.Booking;
import com.example.FilmTheatre.model.Movie;
import com.example.FilmTheatre.repository.BookingRepository;
import com.example.FilmTheatre.repository.MovieRepository;
import com.example.FilmTheatre.service.BookingService;
import com.example.FilmTheatre.service.MovieService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.time.LocalDate;


@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public void saveBookingIfNotExists(Booking booking) {
        Optional<Booking> existingBooking = bookingRepository.findByTitle(booking.getTitle());
        if (existingBooking.isEmpty()) {
            bookingRepository.save(booking);
        }
    }

    @PostConstruct
    public void init() {
        saveBookingIfNotExists(new Booking(null,"VENOM THE LAST DANCE", "10:30 AM", LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 14)));
        saveBookingIfNotExists(new Booking(null,"VENOM THE LAST DANCE", "1:30 PM", LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 14)));
        saveBookingIfNotExists(new Booking(null,"VETTAIYAN", "4:00 PM", LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 14)));
        saveBookingIfNotExists(new Booking(null,"BLACK", "6:30 PM", LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 14)));
        saveBookingIfNotExists(new Booking(null,"BLACK", "9:30 PM", LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 14)));
        saveBookingIfNotExists(new Booking(null,"CONCLAVE", "10:30 AM", LocalDate.of(2024, 11, 8), LocalDate.of(2024, 11, 14)));
        saveBookingIfNotExists(new Booking(null,"CONCLAVE", "1:30 PM", LocalDate.of(2024, 11, 8), LocalDate.of(2024, 11, 14)));
        saveBookingIfNotExists(new Booking(null,"JIGRA", "4:00 PM", LocalDate.of(2024, 11, 8), LocalDate.of(2024, 11, 14)));
        saveBookingIfNotExists(new Booking(null,"JIGRA", "6:30 PM", LocalDate.of(2024, 11, 8), LocalDate.of(2024, 11, 14)));
        saveBookingIfNotExists(new Booking(null,"JIGRA", "9:30 PM", LocalDate.of(2024, 11, 8), LocalDate.of(2024, 11, 14)));
        saveBookingIfNotExists(new Booking(null,"THE WILD ROBOT", "10:30 AM", LocalDate.of(2024, 11, 15), LocalDate.of(2024, 11, 21)));
        saveBookingIfNotExists(new Booking(null,"THE WILD ROBOT", "1:30 PM", LocalDate.of(2024, 11, 15), LocalDate.of(2024, 11, 21)));
        saveBookingIfNotExists(new Booking(null,"DEVARA (PART-1)", "4:00 PM", LocalDate.of(2024, 11, 15), LocalDate.of(2024, 11, 21)));
        saveBookingIfNotExists(new Booking(null,"DEVARA (PART-1)", "6:30 PM", LocalDate.of(2024, 11, 15), LocalDate.of(2024, 11, 21)));
        saveBookingIfNotExists(new Booking(null,"SINGHAM AGAIN", "9:30 PM", LocalDate.of(2024, 11, 15), LocalDate.of(2024, 11, 21)));
        saveBookingIfNotExists(new Booking(null,"SMILE 2", "10:30 AM", LocalDate.of(2024, 11, 22), LocalDate.of(2024, 11, 28)));
        saveBookingIfNotExists(new Booking(null,"SMILE 2", "1:30 PM", LocalDate.of(2024, 11, 22), LocalDate.of(2024, 11, 28)));
        saveBookingIfNotExists(new Booking(null,"AMARAN", "4:00 PM", LocalDate.of(2024, 11, 22), LocalDate.of(2024, 11, 28)));
        saveBookingIfNotExists(new Booking(null,"AMARAN", "6:30 PM", LocalDate.of(2024, 11, 22), LocalDate.of(2024, 11, 28)));
        saveBookingIfNotExists(new Booking(null,"SIHINA NELUM MAL", "9:30 PM", LocalDate.of(2024, 11, 22), LocalDate.of(2024, 11, 28)));
        saveBookingIfNotExists(new Booking(null,"BLOODY BEGGAR", "10:30 AM", LocalDate.of(2024, 11, 29), LocalDate.of(2024, 12, 5)));
        saveBookingIfNotExists(new Booking(null,"BLOODY BEGGAR", "1:30 PM", LocalDate.of(2024, 11, 29), LocalDate.of(2024, 12, 5)));
        saveBookingIfNotExists(new Booking(null,"MANDARA", "4:00 PM", LocalDate.of(2024, 11, 29), LocalDate.of(2024, 12, 5)));
        saveBookingIfNotExists(new Booking(null,"JOKER FOLIE A DEUX", "6:30 PM", LocalDate.of(2024, 11, 29), LocalDate.of(2024, 12, 5)));
        saveBookingIfNotExists(new Booking(null,"JOKER FOLIE A DEUX", "9:30 PM", LocalDate.of(2024, 11, 29), LocalDate.of(2024, 12, 5)));
        saveBookingIfNotExists(new Booking(null,"TRANSFORMERS ONE", "10:30 AM", LocalDate.of(2024, 12, 6), LocalDate.of(2024, 12, 12)));
        saveBookingIfNotExists(new Booking(null,"TRANSFORMERS ONE", "1:30 PM", LocalDate.of(2024, 12, 6), LocalDate.of(2024, 12, 12)));
        saveBookingIfNotExists(new Booking(null,"THE APPRENTICE", "4:00 PM", LocalDate.of(2024, 12, 6), LocalDate.of(2024, 12, 12)));
        saveBookingIfNotExists(new Booking(null,"THE APPRENTICE", "6:30 PM", LocalDate.of(2024, 12, 6), LocalDate.of(2024, 12, 12)));
        saveBookingIfNotExists(new Booking(null,"THE APPRENTICE", "9:30 PM", LocalDate.of(2024, 12, 6), LocalDate.of(2024, 12, 12)));
        saveBookingIfNotExists(new Booking(null,"BROTHER", "10:30 AM", LocalDate.of(2024, 12, 13), LocalDate.of(2024, 12, 19)));
        saveBookingIfNotExists(new Booking(null,"BROTHER", "1:30 PM", LocalDate.of(2024, 12, 13), LocalDate.of(2024, 12, 19)));
        saveBookingIfNotExists(new Booking(null,"IT ENDS WITH US", "4:00 PM", LocalDate.of(2024, 12, 13), LocalDate.of(2024, 12, 19)));
        saveBookingIfNotExists(new Booking(null,"IT ENDS WITH US", "6:30 PM", LocalDate.of(2024, 12, 13), LocalDate.of(2024, 12, 19)));
        saveBookingIfNotExists(new Booking(null,"KADIRA DIVYARAJA", "9:30 PM", LocalDate.of(2024, 12, 13), LocalDate.of(2024, 12, 19)));
        saveBookingIfNotExists(new Booking(null,"KUNG FU PANDA 4", "10:30 AM", LocalDate.of(2024, 12, 20), LocalDate.of(2024, 12, 26)));
        saveBookingIfNotExists(new Booking(null,"KUNG FU PANDA 4", "1:30 PM", LocalDate.of(2024, 12, 20), LocalDate.of(2024, 12, 26)));
        saveBookingIfNotExists(new Booking(null,"MISSION", "4:00 PM", LocalDate.of(2024, 12, 20), LocalDate.of(2024, 12, 26)));
        saveBookingIfNotExists(new Booking(null,"MISSION", "6:30 PM", LocalDate.of(2024, 12, 20), LocalDate.of(2024, 12, 26)));
        saveBookingIfNotExists(new Booking(null,"TOP GUN", "9:30 PM", LocalDate.of(2024, 12, 20), LocalDate.of(2024, 12, 26)));
        saveBookingIfNotExists(new Booking(null,"ADARANEEYA PRARTHANA", "10:30 AM", LocalDate.of(2024, 12, 27), LocalDate.of(2025, 1, 2)));
        saveBookingIfNotExists(new Booking(null,"ADARANEEYA PRARTHANA", "1:30 PM", LocalDate.of(2024, 12, 27), LocalDate.of(2025, 1, 2)));
        saveBookingIfNotExists(new Booking(null,"MIGRATION", "4:00 PM", LocalDate.of(2024, 12, 27), LocalDate.of(2025, 1, 2)));
        saveBookingIfNotExists(new Booking(null,"MIGRATION", "6:30 PM", LocalDate.of(2024, 12, 27), LocalDate.of(2025, 1, 2)));
        saveBookingIfNotExists(new Booking(null,"FAST X", "9:30 PM", LocalDate.of(2024, 12, 27), LocalDate.of(2025, 1, 2)));
        saveBookingIfNotExists(new Booking(null,"THE SUPER MARIO BROS. MOVIE", "10:30 AM", LocalDate.of(2025, 1, 3), LocalDate.of(2025, 1, 9)));
        saveBookingIfNotExists(new Booking(null,"THE SUPER MARIO BROS. MOVIE", "1:30 PM", LocalDate.of(2025, 1, 3), LocalDate.of(2025, 1, 9)));
        saveBookingIfNotExists(new Booking(null,"OPPENHEIMER", "4:00 PM", LocalDate.of(2025, 1, 3), LocalDate.of(2025, 1, 9)));
        saveBookingIfNotExists(new Booking(null,"OPPENHEIMER", "6:30 PM", LocalDate.of(2025, 1, 3), LocalDate.of(2025, 1, 9)));
        saveBookingIfNotExists(new Booking(null,"JURASSIC WORLD", "9:30 PM", LocalDate.of(2025, 1, 3), LocalDate.of(2025, 1, 9)));
        saveBookingIfNotExists(new Booking(null,"PAW PATROL MIGHTY MOVIE", "10:30 AM", LocalDate.of(2025, 1, 10), LocalDate.of(2025, 1, 16)));
        saveBookingIfNotExists(new Booking(null,"PAW PATROL MIGHTY MOVIE", "1:30 PM", LocalDate.of(2025, 1, 10), LocalDate.of(2025, 1, 16)));
        saveBookingIfNotExists(new Booking(null,"MANDARA", "4:00 PM", LocalDate.of(2025, 1, 10), LocalDate.of(2025, 1, 16)));
        saveBookingIfNotExists(new Booking(null,"MANDARA", "6:30 PM", LocalDate.of(2025, 1, 10), LocalDate.of(2025, 1, 16)));
    }

    @Override
    public Optional<Booking> getBookingByTitle(String title) {
        return bookingRepository.findByTitle(title);
    }

}