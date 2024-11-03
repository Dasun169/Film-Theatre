package com.example.FilmTheatre.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tickets")

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title",nullable = false)
    private String title;
    @Column(name = "Movie_Date",nullable = false)
    private String movie_date;
    @Column(name = "Time_Slot",nullable = false)
    private String time_slot;
    @Column(name = "Number_Of_Seats",nullable = false)
    private String num_of_sets;
}
