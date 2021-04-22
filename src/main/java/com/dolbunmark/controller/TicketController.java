package com.dolbunmark.controller;

import com.dolbunmark.dto.TicketDto;
import com.dolbunmark.dto.UserDto;
//import com.google.gson.Gson;
//import com.google.gson.JsonElement;
import com.dolbunmark.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@Transactional
@RequestMapping(value = "/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;


    @GetMapping()
    public List<TicketDto> getAllProducts() {
        return ticketService.getAllTickets();
    }


}













//    private List<UserDto> Ticket = Stream.of(
//            new UserDto(1,"Mark", "Dolbun"),
//            new UserDto(2,"Kirill", "Dolbun"),
//            new UserDto(3,"Andrey", "Dolbun")
//    ).collect(Collectors.toList());
//
//    @Autowired
//    public List<UserDto> ticket() {
//        return Ticket;
//    }

//    @GetMapping("/ticket")
//    public String getById() {
////        Gson json = new Gson();
////        return json.toJson(Ticket);
//        return null;
//    }

//    @PostMapping("/person")
//    public String newTicketDto(@RequestBody String jsonTicketDto) {
//        System.out.println("*** " + jsonTicketDto); // jsonTicketDto - строка
//
////        Gson gsonObj = new Gson();
////        TicketDto newTicketDto = gsonObj.fromJson(jsonTicketDto, TicketDto.class);
////        System.out.println(newTicketDto.getFirstname()); // newTicketDto - объект
//
//        return "success, YEA!!!";
//    }
