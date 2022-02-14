package uniamerica.br.eventservicems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import uniamerica.br.eventservicems.application.domain.event.repository.EventRepository;
import uniamerica.br.eventservicems.application.domain.event.service.EventServiceImpl;
import uniamerica.br.eventservicems.application.model.Event;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EventServiceImplTest {

    @InjectMocks
    EventServiceImpl service;

    @Mock
    EventRepository repository;

    @BeforeEach
    void setupTests() {
        Event event = new Event();
        event.setId(1L);
        event.setName("test");

        when(repository.findAllEvents())
                .thenReturn(List.of(event));
    }


    @Test
    void shouldReturnAListWIthEvents() {
        List<Event> events = service.getEvents();

        assertEquals(1, events.size());
        Event event = events.get(0);

        assertEquals(1L, event.getId());
        assertEquals("test", event.getName());

    }



}
