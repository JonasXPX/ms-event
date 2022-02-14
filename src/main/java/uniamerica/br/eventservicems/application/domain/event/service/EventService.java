package uniamerica.br.eventservicems.application.domain.event.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import uniamerica.br.eventservicems.application.model.Event;

import java.util.List;

@Service
@RequestScope
public interface EventService {
    List<Event> getEvents();
}
