package com.eventmanager.controllers;

import com.eventmanager.models.Event;
import com.eventmanager.repository.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class EventController {

    private EventRepository eventRepository;



    @GetMapping("/events")
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
