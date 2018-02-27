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
public class Producto {
     private Integer id;     
     private String nombre;     
     private Double precio;     
     private Integer stock;     
     private Integer reposicion; 

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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getReposicion() {
        return reposicion;
    }

    public void setReposicion(Integer reposicion) {
        this.reposicion = reposicion;
    }
     
     
}
