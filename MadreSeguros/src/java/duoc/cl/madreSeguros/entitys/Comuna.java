/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.entitys;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Nicolas
 */
@Entity
@Table(name = "comuna", catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comuna.findAll", query = "SELECT c FROM Comuna c"),
    @NamedQuery(name = "Comuna.findByIdcomuna", query = "SELECT c FROM Comuna c WHERE c.idcomuna = :idcomuna"),
    @NamedQuery(name = "Comuna.findByNombre", query = "SELECT c FROM Comuna c WHERE c.nombre = :nombre")})
public class Comuna implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcomuna", nullable = false)
    private Integer idcomuna;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comuna")
    private List<Ciudad> ciudadList;
    @JoinColumn(name = "region_idregion", referencedColumnName = "idregion", nullable = false)
    @ManyToOne(optional = false)
    private Region regionIdregion;

    public Comuna() {
    }

    public Comuna(Integer idcomuna) {
        this.idcomuna = idcomuna;
    }

    public Comuna(Integer idcomuna, String nombre) {
        this.idcomuna = idcomuna;
        this.nombre = nombre;
    }

    public Integer getIdcomuna() {
        return idcomuna;
    }

    public void setIdcomuna(Integer idcomuna) {
        this.idcomuna = idcomuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Ciudad> getCiudadList() {
        return ciudadList;
    }

    public void setCiudadList(List<Ciudad> ciudadList) {
        this.ciudadList = ciudadList;
    }

    public Region getRegionIdregion() {
        return regionIdregion;
    }

    public void setRegionIdregion(Region regionIdregion) {
        this.regionIdregion = regionIdregion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcomuna != null ? idcomuna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comuna)) {
            return false;
        }
        Comuna other = (Comuna) object;
        if ((this.idcomuna == null && other.idcomuna != null) || (this.idcomuna != null && !this.idcomuna.equals(other.idcomuna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.madreSeguros.entitys.Comuna[ idcomuna=" + idcomuna + " ]";
    }
    
}
