package com.portfolio.jv8spring27.Controller;

import com.portfolio.jv8spring27.Entity.Persona;
import com.portfolio.jv8spring27.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    private @Autowired
    IPersonaService ipersonaService;

    @CrossOrigin(origins = {"https://front-portfolio-carlos.web.app"})
    @GetMapping("/personas/traer")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }
    @PreAuthorize("has_role('ADMIN')")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
        return "la persona se creo con exito";
    }
    @PreAuthorize("has_role('ADMIN')")
    @DeleteMapping("personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
        return "la persona se elimino con exito";
    }
    //url:puerto/personas/editar/4?nombre=carlos&apellido=gabrovich&img=url.img
    @PreAuthorize("has_role('ADMIN')")
    @PutMapping("personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id, @RequestParam("nombre") String nuevoNombre,
        @RequestParam("apellido") String nuevoApellido,
        @RequestParam("img") String nuevoImg,
        @RequestParam("fechanac") String nuevoFechanac,
        @RequestParam("email") String nuevoEmail,
        @RequestParam("acercademi") String nuevoAcercademi)
    {
        Persona persona = ipersonaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        persona.setFechanac(nuevoFechanac);
        persona.setEmail(nuevoEmail);
        persona.setAcercademi(nuevoAcercademi);

        ipersonaService.savePersona(persona);
        return persona;
    }
    @CrossOrigin(origins = {"https://front-portfolio-carlos.web.app"})
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona((long) 1);
    }
}
