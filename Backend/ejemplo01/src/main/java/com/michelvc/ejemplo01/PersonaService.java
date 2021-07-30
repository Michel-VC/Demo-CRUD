
package com.michelvc.ejemplo01;

import java.util.List;

/**
 *
 * @author Michel Velázquez Carrillo
 */
public interface PersonaService {
    
    List<Persona>listar();
    Persona listarId(int id);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(int id);
    
}
