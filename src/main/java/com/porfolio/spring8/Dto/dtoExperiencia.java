package com.porfolio.spring8.Dto;

import jakarta.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    //contructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }
    //geter y seter

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
}
