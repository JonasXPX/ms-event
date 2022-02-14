package uniamerica.br.eventservicems.adapters.persistence.event;

import org.springframework.stereotype.Component;
import uniamerica.br.eventservicems.application.domain.event.repository.EventRepository;
import uniamerica.br.eventservicems.application.model.Event;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SpringDataEventRepository implements EventRepository {

    private final JpaEventRepository repository;

    public SpringDataEventRepository(JpaEventRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Event> findAllEvents() {
        return repository.findAll()
                .stream()
                .map(eventEntity -> {
                    final Event eventDto = new Event();
                    eventDto.setId(eventEntity.getId());
                    eventDto.setName(eventEntity.getName());
                    return eventDto;
                }).collect(Collectors.toList());
    }
}
