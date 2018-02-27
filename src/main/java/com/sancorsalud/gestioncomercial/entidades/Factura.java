/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sancorsalud.gestioncomercial.entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Hernán
 */
public class Factura {
    private Integer id;     
    private Cliente cliente;     
    private Date fecha;     
    private List<FacturaDetalle> detalle;      
    private List<Recibo> pagos; 

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<FacturaDetalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<FacturaDetalle> detalle) {
        this.detalle = detalle;
    }

    public List<Recibo> getPagos() {
        return pagos;
    }

    public void setPagos(List<Recibo> pagos) {
        this.pagos = pagos;
    }
    
    
}
