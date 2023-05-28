package com.portfolio.jv8spring27.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "la longitud debe estar entre 1 y 50")
    String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "la longitud debe estar entre 1 y 50")
    String apellido;
    
    @Size(min = 1, max = 50, message = "la longitud debe estar entre 1 y 50")
    String img;
    
    @NotNull
    @Size(min = 1, max = 11, message = "la longitud debe estar entre 1 y 10")        
    String fechanac;
    
    @NotNull
    @Size(min = 1, max = 50, message = "la longitud debe estar entre 1 y 255")
    String email;
    
    @NotNull
    //@Column(length = 1000, columnDefinition = "VARCHAR(1000)")
    @Size(min = 1, max = 1000, message = "la longitud debe estar entre 1 y 1000")
    String acercademi;
}
