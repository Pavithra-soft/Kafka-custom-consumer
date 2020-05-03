package com.jromanmartin.kafka.streams.web;

import com.jromanmartin.kafka.streams.model.BookingEventsResponse;
import com.jromanmartin.kafka.streams.model.BookingEventsResponses;
import com.jromanmartin.kafka.streams.model.BookingEventsResponsesall;
import com.jromanmartin.kafka.streams.model.Currency;
import com.jromanmartin.kafka.streams.service.GreetingsService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @Autowired
    private GreetingsService greetingsService;

    @PostMapping("/msgproducer")
    public String greetings(@RequestBody BookingEventsResponsesall json) {
       
        greetingsService.sendGreeting(json);

        return "message uploaded successfully";
    }

}
