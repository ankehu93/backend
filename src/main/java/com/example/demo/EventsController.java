package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventsController {

    private final EventRepository.NameRepository repository;

    EventsController(EventRepository.NameRepository repository){
        this.repository = repository;
    }

    @GetMapping("/events")
    List<Event> all(){
        return repository.findAll();
    }
}
