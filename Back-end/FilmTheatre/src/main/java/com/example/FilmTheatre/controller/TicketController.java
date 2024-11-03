package com.example.FilmTheatre.controller;
import com.example.FilmTheatre.model.Ticket;
import com.example.FilmTheatre.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin(origins = "*")

public class TicketController {
    @Autowired
    private TicketService ticketService;

    @PostMapping
    public ResponseEntity<Ticket> saveTicket(@RequestBody Ticket ticket){
        return new ResponseEntity<Ticket>(ticketService.saveTicket(ticket), HttpStatus.CREATED);
    }
}
