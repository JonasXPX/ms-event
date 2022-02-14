package uniamerica.br.eventservicems.adapters.controller;

import org.springframework.http.ResponseEntity;
import uniamerica.br.eventservicems.application.model.Event;

import java.util.List;

public interface EventControllerAPI {

    ResponseEntity<List<Event>> get();

}
