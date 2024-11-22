package com.example.FilmTheatre.service.impl;
import com.example.FilmTheatre.model.Ticket;
import com.example.FilmTheatre.repository.TicketRepository;
import com.example.FilmTheatre.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService{
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Ticket saveTicket(Ticket tickets){
        return ticketRepository.save(tickets);
    }
}
