package uniamerica.br.eventservicems.application.domain.event.repository;

import uniamerica.br.eventservicems.application.model.Event;

import java.util.List;

public interface EventRepository {

    List<Event> findAllEvents();
}
