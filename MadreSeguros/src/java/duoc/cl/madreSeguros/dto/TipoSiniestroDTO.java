/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.dto;

/**
 *
 * @author Nicolas
 */
public class TipoSiniestroDTO {
    private int idTipoSiniestro;
    private String nombreCategoria;

    public TipoSiniestroDTO() {
    }

    public TipoSiniestroDTO(int idTipoSiniestro, String nombreCategoria) {
        this.idTipoSiniestro = idTipoSiniestro;
        this.nombreCategoria = nombreCategoria;
    }
    
    public TipoSiniestroDTO(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdTipoSiniestro() {
        return idTipoSiniestro;
    }

    public void setIdTipoSiniestro(int idTipoSiniestro) {
        this.idTipoSiniestro = idTipoSiniestro;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    
    
}
