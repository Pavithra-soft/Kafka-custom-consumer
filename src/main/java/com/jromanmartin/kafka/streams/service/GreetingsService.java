package com.jromanmartin.kafka.streams.service;

import com.jromanmartin.kafka.streams.model.BookingEventsResponses;
import com.jromanmartin.kafka.streams.model.BookingEventsResponsesall;
import com.jromanmartin.kafka.streams.model.Currency;
import com.jromanmartin.kafka.streams.stream.GreetingsStreams;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
@Slf4j
public class GreetingsService {

    @Autowired
    private GreetingsStreams greetingsStreams;

    public void sendGreeting(BookingEventsResponsesall json) {
            MessageChannel messageChannel = greetingsStreams.outboundGreetings();
        boolean sent = messageChannel.send(MessageBuilder
                .withPayload(json.getBookingEventsResponses())
                .setHeader("AwbMessageId", json.getRecordHeaders().getAwbMessageId()).setHeader("customer", json.getRecordHeaders().getCustomer())
                .build());

        System.out.println("Sent {} greetings {}"+ sent +  json);
    }

}
