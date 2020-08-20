package it.ttf.invernizzi.petclinic.servicesc;

import it.ttf.invernizzi.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
