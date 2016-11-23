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
public class RegionDTO implements Serializable{
    private int idRegion;
    private String nombreRegion;

    public RegionDTO() {
    }

    public RegionDTO(int idRegion, String nombreRegion) {
        this.idRegion = idRegion;
        this.nombreRegion = nombreRegion;
    }
    
    public RegionDTO(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }
    
    
    
}
