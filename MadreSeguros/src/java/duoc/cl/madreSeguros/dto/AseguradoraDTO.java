/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.dto;
import duoc.cl.madreSeguros.entitys.Aseguradora;

/**
 *
 * @author Nicolas
 */
public class AseguradoraDTO {
    private Aseguradora aseguradora;

    public AseguradoraDTO() {
    }

    public AseguradoraDTO(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }
    
    
}
