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
@Table(name = "Aseguradora", catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aseguradora.findAll", query = "SELECT a FROM Aseguradora a"),
    @NamedQuery(name = "Aseguradora.findByIdAseguradora", query = "SELECT a FROM Aseguradora a WHERE a.idAseguradora = :idAseguradora"),
    @NamedQuery(name = "Aseguradora.findByNombre", query = "SELECT a FROM Aseguradora a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Aseguradora.findByRut", query = "SELECT a FROM Aseguradora a WHERE a.rut = :rut")})
public class Aseguradora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAseguradora", nullable = false)
    private Integer idAseguradora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "rut", nullable = false, length = 45)
    private String rut;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aseguradoraidAseguradora")
    private List<Poliza> polizaList;

    public Aseguradora() {
    }

    public Aseguradora(Integer idAseguradora) {
        this.idAseguradora = idAseguradora;
    }

    public Aseguradora(Integer idAseguradora, String nombre, String rut) {
        this.idAseguradora = idAseguradora;
        this.nombre = nombre;
        this.rut = rut;
    }

    public Integer getIdAseguradora() {
        return idAseguradora;
    }

    public void setIdAseguradora(Integer idAseguradora) {
        this.idAseguradora = idAseguradora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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
        hash += (idAseguradora != null ? idAseguradora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aseguradora)) {
            return false;
        }
        Aseguradora other = (Aseguradora) object;
        if ((this.idAseguradora == null && other.idAseguradora != null) || (this.idAseguradora != null && !this.idAseguradora.equals(other.idAseguradora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.madreSeguros.entitys.Aseguradora[ idAseguradora=" + idAseguradora + " ]";
    }
    
}
