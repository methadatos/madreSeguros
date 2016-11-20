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
public class JefeZonalDTO {
    private int idJefeZonal;
    private String nombre;
    private String correo;
    private String telefono;

    public JefeZonalDTO() {
    }

    public JefeZonalDTO(int idJefeZonal, String nombre, String correo, String telefono) {
        this.idJefeZonal = idJefeZonal;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public JefeZonalDTO(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getIdJefeZonal() {
        return idJefeZonal;
    }

    public void setIdJefeZonal(int idJefeZonal) {
        this.idJefeZonal = idJefeZonal;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
