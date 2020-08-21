package it.ttf.invernizzi.petclinic.services.map;

import it.ttf.invernizzi.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){return new HashSet<>(map.values()); }

    T findById(ID id) {return map.get(id);}

    T save(T obj) {

        if(obj != null)
        {
            if(obj.getId() == null)
                obj.setId(getNextID());

            map.put(obj.getId(), obj);
        }
        else
        {
            throw new RuntimeException("Object cannot be null");
        }

        return obj;
    }

    void deleteByID(ID id) {
        map.remove(id);
    }

    void delete(T obj) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(obj));
    }

    private Long getNextID() {

        Long nextID = null;
        try {
            nextID = Collections.max(map.keySet()) +1;
        }
        catch (NoSuchElementException e) {
            nextID = 1L;
        }

        return nextID;
    }
}
