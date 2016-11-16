/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.entitys;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Nicolas
 */
@Embeddable
public class UsuarioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idUsuario", nullable = false)
    private int idUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "perfil_idperfil", nullable = false)
    private int perfilIdperfil;

    public UsuarioPK() {
    }

    public UsuarioPK(int idUsuario, int perfilIdperfil) {
        this.idUsuario = idUsuario;
        this.perfilIdperfil = perfilIdperfil;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getPerfilIdperfil() {
        return perfilIdperfil;
    }

    public void setPerfilIdperfil(int perfilIdperfil) {
        this.perfilIdperfil = perfilIdperfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idUsuario;
        hash += (int) perfilIdperfil;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPK)) {
            return false;
        }
        UsuarioPK other = (UsuarioPK) object;
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        if (this.perfilIdperfil != other.perfilIdperfil) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.madreSeguros.entitys.UsuarioPK[ idUsuario=" + idUsuario + ", perfilIdperfil=" + perfilIdperfil + " ]";
    }
    
}
