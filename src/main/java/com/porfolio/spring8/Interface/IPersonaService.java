package com.porfolio.spring8.Interface;

import com.porfolio.spring8.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista de persona
    public List<Persona> getPersona();
    
    //guardar un obkjeto del tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un usuario
    public void deletePersona(Long id);
    
    //buscar una pesona
    public Persona findPersona(Long id);
    
}
