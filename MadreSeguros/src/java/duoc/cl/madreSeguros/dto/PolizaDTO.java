/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.dto;

import java.util.Date;

/**
 *
 * @author Nicolas
 */
public class PolizaDTO {
    private int numeroPoliza;
    private Date fechaEmision;
    private Date fechaVencimiento;
    private int idAseguradora;
    private int idClaseSeguro;

    public PolizaDTO() {
    }

    public PolizaDTO(int numeroPoliza, Date fechaEmision, Date fechaVencimiento, int idAseguradora, int idClaseSeguro) {
        this.numeroPoliza = numeroPoliza;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.idAseguradora = idAseguradora;
        this.idClaseSeguro = idClaseSeguro;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getIdAseguradora() {
        return idAseguradora;
    }

    public void setIdAseguradora(int idAseguradora) {
        this.idAseguradora = idAseguradora;
    }

    public int getIdClaseSeguro() {
        return idClaseSeguro;
    }

    public void setIdClaseSeguro(int idClaseSeguro) {
        this.idClaseSeguro = idClaseSeguro;
    }
    
    
    
}
