package it.ttf.invernizzi.petclinic.repositories;

import it.ttf.invernizzi.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
