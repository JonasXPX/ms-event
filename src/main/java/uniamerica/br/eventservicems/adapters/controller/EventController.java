package uniamerica.br.eventservicems.adapters.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;
import uniamerica.br.eventservicems.application.domain.event.service.EventService;
import uniamerica.br.eventservicems.application.model.Event;

import java.util.List;

@RestController
@RequestScope
public class EventController implements EventControllerAPI {

    private final EventService service;

    @Autowired
    public EventController(final EventService service) {
        this.service = service;
    }

    @GetMapping
    @Override
    public ResponseEntity<List<Event>> get() {
        return ResponseEntity.ok(service.getEvents());
    }
}
