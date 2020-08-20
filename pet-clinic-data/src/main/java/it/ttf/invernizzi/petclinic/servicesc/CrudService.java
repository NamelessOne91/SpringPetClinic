package it.ttf.invernizzi.petclinic.servicesc;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findall();

    T findById(ID id);

    T save(T obj);

    void delete(T obj);

    void deleteById(ID id);
}
