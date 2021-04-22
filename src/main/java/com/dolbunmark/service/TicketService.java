package com.dolbunmark.service;

import com.dolbunmark.converter.TicketConverter;
import com.dolbunmark.domain.Ticket;
import com.dolbunmark.dto.TicketDto;
import com.dolbunmark.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private TicketConverter ticketConverter;

    public List<TicketDto> getAllTickets() {
        List<Ticket> tickets = ticketRepository.getAllTicket();
        return ticketConverter.toDtoList(tickets);
    }

    public TicketDto getById(int id) {
        Ticket ticket = ticketRepository.getTicketById(id);
        return ticketConverter.toDto(ticket);
    }
}
