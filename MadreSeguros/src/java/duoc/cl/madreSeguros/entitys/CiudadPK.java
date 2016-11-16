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
public class CiudadPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idciudad", nullable = false)
    private int idciudad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "comuna_idcomuna", nullable = false)
    private int comunaIdcomuna;

    public CiudadPK() {
    }

    public CiudadPK(int idciudad, int comunaIdcomuna) {
        this.idciudad = idciudad;
        this.comunaIdcomuna = comunaIdcomuna;
    }

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
    }

    public int getComunaIdcomuna() {
        return comunaIdcomuna;
    }

    public void setComunaIdcomuna(int comunaIdcomuna) {
        this.comunaIdcomuna = comunaIdcomuna;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idciudad;
        hash += (int) comunaIdcomuna;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CiudadPK)) {
            return false;
        }
        CiudadPK other = (CiudadPK) object;
        if (this.idciudad != other.idciudad) {
            return false;
        }
        if (this.comunaIdcomuna != other.comunaIdcomuna) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.madreSeguros.entitys.CiudadPK[ idciudad=" + idciudad + ", comunaIdcomuna=" + comunaIdcomuna + " ]";
    }
    
}
