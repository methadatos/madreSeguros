/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.dto;

import java.io.Serializable;

/**
 *
 * @author NicolasValenciaY
 */
public class CiudadDTO implements Serializable{
    private int idCiudad;
    private String nombreCiudad;
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public CiudadDTO() {
    }

    public CiudadDTO(int idCiudad, String nombreCiudad) {
        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;
    }

    public CiudadDTO(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="customers">
    @Override
    public String toString() {
        return "CiudadDTO{" + "idCiudad=" + idCiudad + ", nombreCiudad=" + nombreCiudad + '}';
    }
    
//</editor-fold>

}
