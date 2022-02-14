package uniamerica.br.eventservicems.application.domain.event.service;

import uniamerica.br.eventservicems.application.domain.event.repository.EventRepository;
import uniamerica.br.eventservicems.application.model.Event;

import java.util.List;

public class EventServiceImpl implements EventService {

    private final EventRepository repository;

    public EventServiceImpl(final EventRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Event> getEvents() {
        return repository.findAllEvents();
    }
}
