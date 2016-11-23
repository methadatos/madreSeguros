/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.dto;

import duoc.cl.madreSeguros.entitys.Perfil;
import duoc.cl.madreSeguros.entitys.Usuario;
import java.io.Serializable;

/**
 *
 * @author Nicolas
 */
public class UsuarioDTO implements Serializable{
    private Usuario usuario;
    private Perfil perfil;

    public UsuarioDTO(Usuario usuario, Perfil perfil) {
        this.usuario = usuario;
        this.perfil = perfil;
    }

    public UsuarioDTO() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    
    
    
}
