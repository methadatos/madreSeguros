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
public class ClaseSeguroDTO implements Serializable{
    private int idClaseSeguro;
    private String nombreClaseSeguro;

    public ClaseSeguroDTO() {
    }

    public ClaseSeguroDTO(int idClaseSeguro, String nombreClaseSeguro) {
        this.idClaseSeguro = idClaseSeguro;
        this.nombreClaseSeguro = nombreClaseSeguro;
    }
    
    public ClaseSeguroDTO(String nombreClaseSeguro) {
        this.nombreClaseSeguro = nombreClaseSeguro;
    }

    public int getIdClaseSeguro() {
        return idClaseSeguro;
    }

    public void setIdClaseSeguro(int idClaseSeguro) {
        this.idClaseSeguro = idClaseSeguro;
    }

    public String getNombreClaseSeguro() {
        return nombreClaseSeguro;
    }

    public void setNombreClaseSeguro(String nombreClaseSeguro) {
        this.nombreClaseSeguro = nombreClaseSeguro;
    }
    
    
    
    
}
