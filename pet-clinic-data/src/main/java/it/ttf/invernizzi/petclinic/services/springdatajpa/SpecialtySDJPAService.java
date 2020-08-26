package it.ttf.invernizzi.petclinic.services.springdatajpa;

import it.ttf.invernizzi.petclinic.model.Speciality;
import it.ttf.invernizzi.petclinic.repositories.SpecialityRepository;
import it.ttf.invernizzi.petclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialtySDJPAService implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialtySDJPAService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }


    @Override
    public Set<Speciality> findall() {
        Set<Speciality> specs = new HashSet<>();
        specialityRepository.findAll().forEach(specs::add);
        return specs;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality obj) {
        return specialityRepository.save(obj);
    }

    @Override
    public void delete(Speciality obj) {
        specialityRepository.delete(obj);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
