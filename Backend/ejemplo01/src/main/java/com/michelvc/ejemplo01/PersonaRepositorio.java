package com.michelvc.ejemplo01;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Michel Velázquez Carrillo
 */
public interface PersonaRepositorio extends Repository<Persona, Integer> {

    List<Persona> findAll();

    Persona findById(int id);//findOne

    Persona save(Persona p);

    void delete(Persona p);

}
