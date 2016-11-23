/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.dto;

import java.io.Serializable;

/**
 *
 * @author Nicolas
 */
public class ComunaDTO implements Serializable{
    private int idComuna;
    private String nombreComuna;
    private int idRegion;

    public ComunaDTO() {
    }

    public ComunaDTO(int idComuna, String nombreComuna, int idRegion) {
        this.idComuna = idComuna;
        this.nombreComuna = nombreComuna;
        this.idRegion = idRegion;
    }
    
    public ComunaDTO(String nombreComuna, int idRegion) {
        this.nombreComuna = nombreComuna;
        this.idRegion = idRegion;
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public String getNombreComuna() {
        return nombreComuna;
    }

    public void setNombreComuna(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }
    
    
}
