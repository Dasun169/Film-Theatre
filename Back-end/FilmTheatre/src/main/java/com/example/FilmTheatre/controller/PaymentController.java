package com.example.FilmTheatre.controller;

import com.example.FilmTheatre.model.Payment;
import com.example.FilmTheatre.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "*")

public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<Payment> savePayment(@RequestBody Payment payment){
        return new ResponseEntity<Payment>(paymentService.savePayment(payment), HttpStatus.CREATED);
    }
}
