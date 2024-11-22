package com.example.FilmTheatre.repository;

import com.example.FilmTheatre.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
    
}
