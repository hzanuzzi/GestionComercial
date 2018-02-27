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
public class FacturaDetalle {
    private Integer id;     
    private Integer cantidad;     
    private Double precioUnitarioVenta;     
    private Producto producto;     
    private Factura factura; 

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitarioVenta() {
        return precioUnitarioVenta;
    }

    public void setPrecioUnitarioVenta(Double precioUnitarioVenta) {
        this.precioUnitarioVenta = precioUnitarioVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    
    
}
