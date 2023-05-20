package com.portfolio.jv8spring27.Interface;

import com.portfolio.jv8spring27.Entity.Persona;
import java.util.List;



public interface IPersonaService {
//trae una lista de personas

    public List<Persona> getPersona();

//guardar un objeto de tipo persona
    public void savePersona(Persona persona);

//eliminar una persona
    public void deletePersona(Long id);

//buscar una persona
    public Persona findPersona(Long id);
}
