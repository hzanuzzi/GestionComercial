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
public class Recibo {
    private Integer id;     
    private Integer nroRecibo;           
    private Double monto;           
    private Factura factura;           
    private Cliente cliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNroRecibo() {
        return nroRecibo;
    }

    public void setNroRecibo(Integer nroRecibo) {
        this.nroRecibo = nroRecibo;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
