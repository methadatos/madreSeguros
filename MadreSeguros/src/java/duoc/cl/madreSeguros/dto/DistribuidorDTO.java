/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.dto;

/**
 *
 * @author Nicolas
 */
public class DistribuidorDTO {
    private int idDistribiudor;
    private String nombre;
    private String rut;
    private String numeroContacto;
    private String correo;

    public DistribuidorDTO(int idDistribiudor, String nombre, String rut, String numeroContacto, String correo) {
        this.idDistribiudor = idDistribiudor;
        this.nombre = nombre;
        this.rut = rut;
        this.numeroContacto = numeroContacto;
        this.correo = correo;
    }

    public DistribuidorDTO() {
    }

    public DistribuidorDTO(String nombre, String rut, String numeroContacto, String correo) {
        this.nombre = nombre;
        this.rut = rut;
        this.numeroContacto = numeroContacto;
        this.correo = correo;
    }

    public int getIdDistribiudor() {
        return idDistribiudor;
    }

    public void setIdDistribiudor(int idDistribiudor) {
        this.idDistribiudor = idDistribiudor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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

    @Override
    public String toString() {
        return "DistribuidorDTO{" + "idDistribiudor=" + idDistribiudor + ", nombre=" + nombre + ", rut=" + rut + ", numeroContacto=" + numeroContacto + ", correo=" + correo + '}';
    }
    
    
}
