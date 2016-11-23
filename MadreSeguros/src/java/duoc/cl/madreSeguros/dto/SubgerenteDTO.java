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
public class SubgerenteDTO implements Serializable{
    private int idSubgerente;
    private String nombreSubgerente;
    private String zona;

    public SubgerenteDTO() {
    }

    public SubgerenteDTO(int idSubgerente, String nombreSubgerente, String zona) {
        this.idSubgerente = idSubgerente;
        this.nombreSubgerente = nombreSubgerente;
        this.zona = zona;
    }
    
    public SubgerenteDTO(String nombreSubgerente, String zona) {
        this.nombreSubgerente = nombreSubgerente;
        this.zona = zona;
    }

    public int getIdSubgerente() {
        return idSubgerente;
    }

    public void setIdSubgerente(int idSubgerente) {
        this.idSubgerente = idSubgerente;
    }

    public String getNombreSubgerente() {
        return nombreSubgerente;
    }

    public void setNombreSubgerente(String nombreSubgerente) {
        this.nombreSubgerente = nombreSubgerente;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    
}
