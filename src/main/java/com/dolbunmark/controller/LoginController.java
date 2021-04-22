package com.dolbunmark.controller;


import com.dolbunmark.dto.TicketDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@Transactional
@RequestMapping(value = "/test")
public class LoginController {


    @CrossOrigin(origins = "http://localhost:8098")
    @GetMapping()
    public String getAllProducts() {
        return "123";
    }



}

