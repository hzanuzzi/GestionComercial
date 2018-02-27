/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sancorsalud.gestioncomercial.entidades;

/**
 *
 * @author Hernán
 */
public class Cliente {
    private Integer id;     
    private String nombre;     
    private String correo;                  
    private Double maximoCuentaCorriente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Double getMaximoCuentaCorriente() {
        return maximoCuentaCorriente;
    }

    public void setMaximoCuentaCorriente(Double maximoCuentaCorriente) {
        this.maximoCuentaCorriente = maximoCuentaCorriente;
    }
    
    
}
