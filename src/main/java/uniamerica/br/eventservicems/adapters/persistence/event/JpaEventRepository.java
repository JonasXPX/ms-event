package uniamerica.br.eventservicems.adapters.persistence.event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uniamerica.br.eventservicems.adapters.persistence.entities.Event;

@Repository
public interface JpaEventRepository extends JpaRepository<Event, Long> {

}
