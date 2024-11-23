package com.example.FilmTheatre.service;

import com.example.FilmTheatre.model.Payment;

public interface PaymentService {
    Payment savePayment(Payment payment);
    Payment getPaymentByBookingId(String bookingId);
}
