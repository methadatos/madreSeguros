/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.dto;
import duoc.cl.madreSeguros.entitys.Aseguradora;
import java.io.Serializable;

/**
 *
 * @author Nicolas
 */
public class AseguradoraDTO implements Serializable{
    private int idAseguradora;
    private String rut;
    private String nombre;

    public AseguradoraDTO() {
    }

    public AseguradoraDTO(int idAseguradora, String rut, String nombre) {
        this.idAseguradora = idAseguradora;
        this.rut = rut;
        this.nombre = nombre;
    }
    
    public AseguradoraDTO(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    public int getIdAseguradora() {
        return idAseguradora;
    }

    public void setIdAseguradora(int idAseguradora) {
        this.idAseguradora = idAseguradora;
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
    
}
