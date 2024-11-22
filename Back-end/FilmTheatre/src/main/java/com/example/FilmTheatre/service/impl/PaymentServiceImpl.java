package com.example.FilmTheatre.service.impl;

import com.example.FilmTheatre.model.Payment;
import com.example.FilmTheatre.repository.PaymentRepository;
import com.example.FilmTheatre.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment savePayment(Payment payment){
        return paymentRepository.save(payment);
    }
    
}
