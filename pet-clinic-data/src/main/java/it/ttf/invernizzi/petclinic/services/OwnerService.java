package it.ttf.invernizzi.petclinic.services;

import it.ttf.invernizzi.petclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String name);
}
