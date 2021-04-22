package com.dolbunmark.converter;

import com.dolbunmark.domain.Ticket;
import com.dolbunmark.dto.TicketDto;
import com.dolbunmark.exeception.InvalidArgumentException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TicketConverter {

    public TicketConverter() {
    }

    public TicketDto toDto(Ticket ticket) {
        if (ticket == null) {
            throw new InvalidArgumentException("Не может быть пустым");
        }
        TicketDto ticketDto = new TicketDto();
        ticketDto.setId(ticket.getId()); // id
        ticketDto.setName(ticket.getName()); // Имя
        ticketDto.setDescription(ticket.getDescription()); // Описание
        ticketDto.setCreated_on(ticket.getCreated_on()); // Дата создания
        ticketDto.setDesired_resolution_date(ticket.getDesired_resolution_date()); // Желаемая дата разрешения проблемы
//        ticketDto.setAssignee(ticket.getAssignee()); // Правопреемник
//        ticketDto.setOwner(ticket.getOwner()); // Владелец
        ticketDto.setState(ticket.getState()); // Состояние
        ticketDto.setCategory(ticket.getCategory()); // Категория
        ticketDto.setUrgency(ticket.getUrgency()); // Срочность
//        ticketDto.setApprover(ticket.getApprover()); // Утверждающий
        return ticketDto;
    }


    public List<TicketDto> toDtoList(List<Ticket> tickets) {
        List<TicketDto> productsDto = new ArrayList<>();
        for (Ticket ticket : tickets) {
            productsDto.add(toDto(ticket));
        }
        return productsDto;
    }
}
