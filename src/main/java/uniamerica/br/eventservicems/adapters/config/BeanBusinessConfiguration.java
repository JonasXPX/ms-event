package uniamerica.br.eventservicems.adapters.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import uniamerica.br.eventservicems.EventServiceMsApplication;
import uniamerica.br.eventservicems.application.domain.event.repository.EventRepository;
import uniamerica.br.eventservicems.application.domain.event.service.EventServiceImpl;

@Configuration
@ComponentScan(basePackageClasses = EventServiceMsApplication.class)
public class BeanBusinessConfiguration {

    @Bean
    public EventServiceImpl eventServiceImpl(EventRepository repository) {
        return new EventServiceImpl(repository);
    }
}
