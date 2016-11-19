/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.dto;

/**
 *
 * @author cetecom
 */
public class LiquidadorDTO {
    private int idLiquidador;
    private String rut;
    private String nombre;

    public LiquidadorDTO() {
    }

    public LiquidadorDTO(int idLiquidador, String rut, String nombre) {
        this.idLiquidador = idLiquidador;
        this.rut = rut;
        this.nombre = nombre;
    }

    public LiquidadorDTO(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    public int getIdLiquidador() {
        return idLiquidador;
    }

    public void setIdLiquidador(int idLiquidador) {
        this.idLiquidador = idLiquidador;
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

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
     
    
}
