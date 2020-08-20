package it.ttf.invernizzi.petclinic.services.map;

import it.ttf.invernizzi.petclinic.model.Pet;
import it.ttf.invernizzi.petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findall() {
        return super.findAll();
    }

    @Override
    public void delete(Pet obj) {
        super.delete(obj);
    }

    @Override
    public Pet save(Pet obj) {
       return super.save(obj.getId(), obj);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteByID(aLong);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
