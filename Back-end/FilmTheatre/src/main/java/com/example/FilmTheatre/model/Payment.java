package com.example.FilmTheatre.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Payment")

public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bookingId", nullable = false)
    private String bookingId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "MovieDate", nullable = false)
    private String movieDate;

    @Column(name = "timeSlot", nullable = false)
    private String timeSlot;

    @Column(name = "numOfSeats", nullable = false)
    private String numOfSeats;

    @Column(name = "userId", nullable = false)
    private String userId;

    @Column(name = "cardNo", nullable = false)
    private String cardNo;

}
