/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.entitys;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nicolas
 */
@Entity
@Table(name = "ciudad", catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ciudad.findAll", query = "SELECT c FROM Ciudad c"),
    @NamedQuery(name = "Ciudad.findByIdciudad", query = "SELECT c FROM Ciudad c WHERE c.ciudadPK.idciudad = :idciudad"),
    @NamedQuery(name = "Ciudad.findByNombre", query = "SELECT c FROM Ciudad c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Ciudad.findByComunaIdcomuna", query = "SELECT c FROM Ciudad c WHERE c.ciudadPK.comunaIdcomuna = :comunaIdcomuna")})
public class Ciudad implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CiudadPK ciudadPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;
    @JoinColumn(name = "comuna_idcomuna", referencedColumnName = "idcomuna", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Comuna comuna;

    public Ciudad() {
    }

    public Ciudad(CiudadPK ciudadPK) {
        this.ciudadPK = ciudadPK;
    }

    public Ciudad(CiudadPK ciudadPK, String nombre) {
        this.ciudadPK = ciudadPK;
        this.nombre = nombre;
    }

    public Ciudad(int idciudad, int comunaIdcomuna) {
        this.ciudadPK = new CiudadPK(idciudad, comunaIdcomuna);
    }

    public CiudadPK getCiudadPK() {
        return ciudadPK;
    }

    public void setCiudadPK(CiudadPK ciudadPK) {
        this.ciudadPK = ciudadPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ciudadPK != null ? ciudadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ciudad)) {
            return false;
        }
        Ciudad other = (Ciudad) object;
        if ((this.ciudadPK == null && other.ciudadPK != null) || (this.ciudadPK != null && !this.ciudadPK.equals(other.ciudadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.madreSeguros.entitys.Ciudad[ ciudadPK=" + ciudadPK + " ]";
    }
    
}
