package com.example.FilmTheatre.service;
import com.example.FilmTheatre.model.Ticket;
import org.springframework.stereotype.Service;
import java.util.List;

public interface TicketService {
    Ticket saveTicket(Ticket tickets);
}
