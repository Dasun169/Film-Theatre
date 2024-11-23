package com.example.FilmTheatre.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "BookingSeat")

public class BookingSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bookingId", nullable = false)
    private String bookingId;

    @Column(name = "MovieDate", nullable = false)
    private String movieDate;
    
    @Column(name = "timeSlot", nullable = false)
    private String timeSlot;

    @Column(name = "seatNo", nullable = false)
    private String seatNo;
}
