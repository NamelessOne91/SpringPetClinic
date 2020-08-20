package it.ttf.invernizzi.petclinic.servicesc;

import it.ttf.invernizzi.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
