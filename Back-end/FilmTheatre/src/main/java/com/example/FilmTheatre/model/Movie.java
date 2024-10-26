package com.example.FilmTheatre.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "thumbnail",nullable = false)
    private String thumbnail;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "category",nullable = false)
    private String category;

    @Column(name = "language",nullable = false)
    private String language;

    @Column(name = "trailer_video", nullable = false)
    private String trailerVideo;
}
