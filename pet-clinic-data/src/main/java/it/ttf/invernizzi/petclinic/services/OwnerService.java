package it.ttf.invernizzi.petclinic.services;

import it.ttf.invernizzi.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}