package it.ttf.invernizzi.petclinic.services.map;

import it.ttf.invernizzi.petclinic.model.Vet;
import it.ttf.invernizzi.petclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findall() {
        return super.findAll();
    }

    @Override
    public void delete(Vet obj) {
        super.delete(obj);
    }

    @Override
    public Vet save(Vet obj) {
        return super.save(obj.getId(), obj);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteByID(aLong);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
