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
public class PlataformaDTO {
    private int idPlataforma;
    private String nombre;

    public PlataformaDTO() {
    }

    public PlataformaDTO(int idPlataforma, String nombre) {
        this.idPlataforma = idPlataforma;
        this.nombre = nombre;
    }
    
    public PlataformaDTO(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(int idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
