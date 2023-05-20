package com.portfolio.jv8spring27.Service;

import com.portfolio.jv8spring27.Entity.Persona;
import com.portfolio.jv8spring27.Interface.IPersonaService;
import com.portfolio.jv8spring27.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = personaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
       Persona persona = personaRepository.findById(id).orElse(null);
       return persona;
    }

}
