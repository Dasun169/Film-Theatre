package com.example.FilmTheatre.service.impl;

import com.example.FilmTheatre.model.Booking;
import com.example.FilmTheatre.repository.BookingRepository;
import com.example.FilmTheatre.service.BookingService;
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
        saveBookingIfNotExists(new Booking(null,"VENOM THE LAST DANCE", "10:30 AM", LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 28)));
        saveBookingIfNotExists(new Booking(null,"VETTAIYAN", "4:00 PM", LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 28)));
        saveBookingIfNotExists(new Booking(null,"BLACK", "6:30 PM", LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 28)));
        saveBookingIfNotExists(new Booking(null,"CONCLAVE", "1:30 PM", LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 28)));
        saveBookingIfNotExists(new Booking(null,"JIGRA", "4:00 PM", LocalDate.of(2024, 11, 28), LocalDate.of(2024, 12, 24)));
        saveBookingIfNotExists(new Booking(null,"THE WILD ROBOT", "10:30 AM", LocalDate.of(2024, 11, 28), LocalDate.of(2024, 12, 24)));
        saveBookingIfNotExists(new Booking(null,"DEVARA(PART-1)", "6:30 PM", LocalDate.of(2024, 11, 28), LocalDate.of(2024, 12, 24)));
        saveBookingIfNotExists(new Booking(null,"SINGHAM AGAIN", "1:30 PM", LocalDate.of(2024, 11, 28), LocalDate.of(2024, 12, 24)));
        saveBookingIfNotExists(new Booking(null,"SMILE 2", "10:30 AM", LocalDate.of(2024, 12, 25), LocalDate.of(2025, 1, 18)));
        saveBookingIfNotExists(new Booking(null,"AMARAN", "4:00 PM", LocalDate.of(2024, 12, 25), LocalDate.of(2025, 1, 18)));
        saveBookingIfNotExists(new Booking(null,"SIHINA NELUM MAL", "1:30 PM", LocalDate.of(2024, 12, 25), LocalDate.of(2025, 1, 18)));
        saveBookingIfNotExists(new Booking(null,"BLOODY BEGGAR", "6:30 PM", LocalDate.of(2024, 12, 25), LocalDate.of(2025, 1, 18)));
        saveBookingIfNotExists(new Booking(null,"MANDARA", "4:00 PM", LocalDate.of(2025, 1, 19), LocalDate.of(2025, 2, 16)));
        saveBookingIfNotExists(new Booking(null,"JOKER FOLIE A DEUX", "6:30 PM", LocalDate.of(2025, 1, 19), LocalDate.of(2025, 2, 16)));
        saveBookingIfNotExists(new Booking(null,"TRANSFORMERS ONE", "10:30 AM", LocalDate.of(2025, 1, 19), LocalDate.of(2025, 2, 16)));
        saveBookingIfNotExists(new Booking(null,"THE APPRENTICE", "1:30 PM", LocalDate.of(2025, 1, 19), LocalDate.of(2025, 2, 16)));
        saveBookingIfNotExists(new Booking(null,"BROTHER", "10:30 AM", LocalDate.of(2025, 2, 17), LocalDate.of(2025, 3, 12)));
        saveBookingIfNotExists(new Booking(null,"IT ENDS WITH US", "4:00 PM", LocalDate.of(2025, 2, 17), LocalDate.of(2025, 3, 12)));
        saveBookingIfNotExists(new Booking(null,"KADIRA DIVYARAJA", "1:30 PM", LocalDate.of(2025, 2, 17), LocalDate.of(2025, 3, 12)));
        saveBookingIfNotExists(new Booking(null,"KUNG FU PANDA 4", "6:30 PM", LocalDate.of(2025, 2, 17), LocalDate.of(2025, 3, 12)));
        saveBookingIfNotExists(new Booking(null,"MISSION:IMPOSSIBLE-DEAD", "4:00 PM", LocalDate.of(2025, 3, 13), LocalDate.of(2025, 4, 10)));
        saveBookingIfNotExists(new Booking(null,"TOP GUN", "1:30 PM", LocalDate.of(2025, 3, 13), LocalDate.of(2025, 4, 10)));
        saveBookingIfNotExists(new Booking(null,"ADARANEEYA PRARTHANA", "10:30 AM", LocalDate.of(2025, 3, 13), LocalDate.of(2025, 4, 10)));
        saveBookingIfNotExists(new Booking(null,"MIGRATION", "6:30 PM", LocalDate.of(2025, 3, 13), LocalDate.of(2025, 4, 10)));
        saveBookingIfNotExists(new Booking(null,"FAST X", "1:30 PM", LocalDate.of(2025, 4, 11), LocalDate.of(2025, 5, 7)));
        saveBookingIfNotExists(new Booking(null,"THE SUPER MARIO BROS.MOVIE", "10:30 AM", LocalDate.of(2025, 4, 11), LocalDate.of(2025, 5, 7)));
        saveBookingIfNotExists(new Booking(null,"OPPENHEIMER", "4:00 PM", LocalDate.of(2025, 4, 11), LocalDate.of(2025, 5, 7)));
        saveBookingIfNotExists(new Booking(null,"JURASSIC WORLD:DOMINION", "6:30 PM", LocalDate.of(2025, 4, 11), LocalDate.of(2025, 5, 7)));
        saveBookingIfNotExists(new Booking(null,"PAW PATROL MIGHTY MOVIE", "10:30 AM", LocalDate.of(2025, 5, 8), LocalDate.of(2025, 6, 6)));
        saveBookingIfNotExists(new Booking(null,"PASSPORT", "1:30 PM", LocalDate.of(2025, 5, 8), LocalDate.of(2025, 6, 6)));
    }

    @Override
    public Optional<Booking> getBookingByTitle(String title) {
        return bookingRepository.findByTitle(title);
    }

    @Override
    public List<String> getDistinctTimeSlotsByTitle(String title) {
        return bookingRepository.findDistinctTimeSlotsByTitle(title);
    }

}