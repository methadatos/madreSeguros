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
public class FileDTO {
    private int numeroFile;
    private int region;
    private String direccion;
    private int idUbicacion;
    private int idPlataforma;
    private int idDistribuidor;
    private int idSubgerente;
    private int idJefeZonal;

    public FileDTO() {
    }

    public FileDTO(int numeroFile, int region, String direccion, int idUbicacion, int idPlataforma, int idDistribuidor, int idSubgerente, int idJefeZonal) {
        this.numeroFile = numeroFile;
        this.region = region;
        this.direccion = direccion;
        this.idUbicacion = idUbicacion;
        this.idPlataforma = idPlataforma;
        this.idDistribuidor = idDistribuidor;
        this.idSubgerente = idSubgerente;
        this.idJefeZonal = idJefeZonal;
    }

    public int getNumeroFile() {
        return numeroFile;
    }

    public void setNumeroFile(int numeroFile) {
        this.numeroFile = numeroFile;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public int getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(int idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public int getIdDistribuidor() {
        return idDistribuidor;
    }

    public void setIdDistribuidor(int idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    public int getIdSubgerente() {
        return idSubgerente;
    }

    public void setIdSubgerente(int idSubgerente) {
        this.idSubgerente = idSubgerente;
    }

    public int getIdJefeZonal() {
        return idJefeZonal;
    }

    public void setIdJefeZonal(int idJefeZonal) {
        this.idJefeZonal = idJefeZonal;
    }
    
    
}
