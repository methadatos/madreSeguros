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
public class SiniestroDTO {
    private int idSiniestro;
    private int numeroSiniestro;
    private int montoSiniestro;
    private String observacion;
    private Date fechaSiniestro;
    private Date fechaReclamacion;
    private int idPoliza;
    private int idTipoSiniestro;
    private int idLiquidador;
    private int idFile;
    private int idUsuario;

    public SiniestroDTO() {
    }

    public SiniestroDTO(int idSiniestro, int numeroSiniestro, int montoSiniestro, String observacion, Date fechaSiniestro, Date fechaReclamacion, int idPoliza, int idTipoSiniestro, int idLiquidador, int idFile, int idUsuario) {
        this.idSiniestro = idSiniestro;
        this.numeroSiniestro = numeroSiniestro;
        this.montoSiniestro = montoSiniestro;
        this.observacion = observacion;
        this.fechaSiniestro = fechaSiniestro;
        this.fechaReclamacion = fechaReclamacion;
        this.idPoliza = idPoliza;
        this.idTipoSiniestro = idTipoSiniestro;
        this.idLiquidador = idLiquidador;
        this.idFile = idFile;
        this.idUsuario = idUsuario;
    }
    
    public SiniestroDTO(int numeroSiniestro, int montoSiniestro, String observacion, Date fechaSiniestro, Date fechaReclamacion, int idPoliza, int idTipoSiniestro, int idLiquidador, int idFile, int idUsuario) {
        this.numeroSiniestro = numeroSiniestro;
        this.montoSiniestro = montoSiniestro;
        this.observacion = observacion;
        this.fechaSiniestro = fechaSiniestro;
        this.fechaReclamacion = fechaReclamacion;
        this.idPoliza = idPoliza;
        this.idTipoSiniestro = idTipoSiniestro;
        this.idLiquidador = idLiquidador;
        this.idFile = idFile;
        this.idUsuario = idUsuario;
    }

    public int getIdSiniestro() {
        return idSiniestro;
    }

    public void setIdSiniestro(int idSiniestro) {
        this.idSiniestro = idSiniestro;
    }

    public int getNumeroSiniestro() {
        return numeroSiniestro;
    }

    public void setNumeroSiniestro(int numeroSiniestro) {
        this.numeroSiniestro = numeroSiniestro;
    }

    public int getMontoSiniestro() {
        return montoSiniestro;
    }

    public void setMontoSiniestro(int montoSiniestro) {
        this.montoSiniestro = montoSiniestro;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaSiniestro() {
        return fechaSiniestro;
    }

    public void setFechaSiniestro(Date fechaSiniestro) {
        this.fechaSiniestro = fechaSiniestro;
    }

    public Date getFechaReclamacion() {
        return fechaReclamacion;
    }

    public void setFechaReclamacion(Date fechaReclamacion) {
        this.fechaReclamacion = fechaReclamacion;
    }

    public int getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(int idPoliza) {
        this.idPoliza = idPoliza;
    }

    public int getIdTipoSiniestro() {
        return idTipoSiniestro;
    }

    public void setIdTipoSiniestro(int idTipoSiniestro) {
        this.idTipoSiniestro = idTipoSiniestro;
    }

    public int getIdLiquidador() {
        return idLiquidador;
    }

    public void setIdLiquidador(int idLiquidador) {
        this.idLiquidador = idLiquidador;
    }

    public int getIdFile() {
        return idFile;
    }

    public void setIdFile(int idFile) {
        this.idFile = idFile;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
}
