package com.example.FilmTheatre.repository;
import com.example.FilmTheatre.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long>{

}
