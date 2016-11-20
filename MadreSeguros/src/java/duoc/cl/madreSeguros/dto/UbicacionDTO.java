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
public class UbicacionDTO implements Serializable{
    private int idUbicacion;
    private String ubicacion;

    public UbicacionDTO(int idUbicacion, String ubicacion) {
        this.idUbicacion = idUbicacion;
        this.ubicacion = ubicacion;
    }

    public UbicacionDTO() {
    }

    public UbicacionDTO(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
}
