/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.dto;

/**
 *
 * @author NicolasValenciaY
 */
public class DistribuidorDTO {
    private int idDistribuidor;
    private String rut;
    private String nombre;
    private String numeroContacto;
    private String correo;

    public DistribuidorDTO() {
    }

    public DistribuidorDTO(int idDistribuidor, String rut, String nombre, String numeroContacto, String correo) {
        this.idDistribuidor = idDistribuidor;
        this.rut = rut;
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
        this.correo = correo;
    }
    
    public DistribuidorDTO(String rut, String nombre, String numeroContacto, String correo) {
        this.rut = rut;
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
        this.correo = correo;
    }

    public int getIdDistribuidor() {
        return idDistribuidor;
    }

    public void setIdDistribuidor(int idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    
}
