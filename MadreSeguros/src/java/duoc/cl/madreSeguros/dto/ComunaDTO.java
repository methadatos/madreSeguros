/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.dto;

/**
 *
 * @author NicolasValenciaY
 */
public class ComunaDTO {
    private int idComuna;
    private String nombreComuna;

    public ComunaDTO() {
    }

    public ComunaDTO(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }

    public ComunaDTO(int idComuna, String nombreComuna) {
        this.idComuna = idComuna;
        this.nombreComuna = nombreComuna;
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

    @Override
    public String toString() {
        return "ComunaDTO{" + "idComuna=" + idComuna + ", nombreComuna=" + nombreComuna + '}';
    }
    
    
}
