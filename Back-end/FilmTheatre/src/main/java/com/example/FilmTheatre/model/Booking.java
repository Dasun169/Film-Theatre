package com.example.FilmTheatre.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "time_slot",nullable = false)
    private String time_slot;

    @Column(name = "start_date",nullable = false)
    private LocalDate start_date;

    @Column(name = "end_date",nullable = false)
    private LocalDate end_date;
}