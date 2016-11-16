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
import javax.persistence.Id;
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
@Table(name = "clase_seguro", catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClaseSeguro.findAll", query = "SELECT c FROM ClaseSeguro c"),
    @NamedQuery(name = "ClaseSeguro.findByIdclaseSeguro", query = "SELECT c FROM ClaseSeguro c WHERE c.idclaseSeguro = :idclaseSeguro"),
    @NamedQuery(name = "ClaseSeguro.findByNombreClase", query = "SELECT c FROM ClaseSeguro c WHERE c.nombreClase = :nombreClase")})
public class ClaseSeguro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idclase_seguro", nullable = false)
    private Integer idclaseSeguro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_clase", nullable = false, length = 45)
    private String nombreClase;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "claseSeguroIdclaseSeguro")
    private List<Poliza> polizaList;

    public ClaseSeguro() {
    }

    public ClaseSeguro(Integer idclaseSeguro) {
        this.idclaseSeguro = idclaseSeguro;
    }

    public ClaseSeguro(Integer idclaseSeguro, String nombreClase) {
        this.idclaseSeguro = idclaseSeguro;
        this.nombreClase = nombreClase;
    }

    public Integer getIdclaseSeguro() {
        return idclaseSeguro;
    }

    public void setIdclaseSeguro(Integer idclaseSeguro) {
        this.idclaseSeguro = idclaseSeguro;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    @XmlTransient
    public List<Poliza> getPolizaList() {
        return polizaList;
    }

    public void setPolizaList(List<Poliza> polizaList) {
        this.polizaList = polizaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclaseSeguro != null ? idclaseSeguro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClaseSeguro)) {
            return false;
        }
        ClaseSeguro other = (ClaseSeguro) object;
        if ((this.idclaseSeguro == null && other.idclaseSeguro != null) || (this.idclaseSeguro != null && !this.idclaseSeguro.equals(other.idclaseSeguro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.madreSeguros.entitys.ClaseSeguro[ idclaseSeguro=" + idclaseSeguro + " ]";
    }
    
}
