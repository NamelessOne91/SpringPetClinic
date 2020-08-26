package it.ttf.invernizzi.petclinic.repositories;

import it.ttf.invernizzi.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
