package it.ttf.invernizzi.petclinic.services.map;

import it.ttf.invernizzi.petclinic.model.Speciality;
import it.ttf.invernizzi.petclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {
    @Override
    public Set<Speciality> findall() {
        return super.findAll();
    }

    @Override
    public void delete(Speciality obj) {
        super.delete(obj);
    }

    @Override
    public Speciality save(Speciality obj) {
        return super.save(obj);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteByID(aLong);
    }
}
