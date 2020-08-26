package it.ttf.invernizzi.petclinic.repositories;

import it.ttf.invernizzi.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository  extends CrudRepository<Pet, Long> {
}
