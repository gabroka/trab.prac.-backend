package com.porfolio.spring8.Entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Size;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.data.annotation.Id;

//@Getter @Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotNull
    @Size(min = 1, max = 255, message = "la longitud debe estar entre 1 y 255")
    private String nombre;
    @NotNull
    @Size(min = 1, max = 255, message = "la longitud debe estar entre 1 y 255")
    private String apellido;

    @Size(min = 1, max = 255, message = "la longitud debe estar entre 1 y 255")
    private String img;
//constructores
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String img) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
    }

    
    //geters y seters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
