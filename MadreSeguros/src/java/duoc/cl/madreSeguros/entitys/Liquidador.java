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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Nicolas
 */
@Entity
@Table(name = "liquidador", catalog = "mydb", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"rut"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Liquidador.findAll", query = "SELECT l FROM Liquidador l"),
    @NamedQuery(name = "Liquidador.findByIdliquidador", query = "SELECT l FROM Liquidador l WHERE l.idliquidador = :idliquidador"),
    @NamedQuery(name = "Liquidador.findByNombre", query = "SELECT l FROM Liquidador l WHERE l.nombre = :nombre"),
    @NamedQuery(name = "Liquidador.findByRut", query = "SELECT l FROM Liquidador l WHERE l.rut = :rut")})
public class Liquidador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idliquidador", nullable = false)
    private Integer idliquidador;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "liquidadorIdliquidador")
    private List<Siniestro> siniestroList;

    public Liquidador() {
    }

    public Liquidador(Integer idliquidador) {
        this.idliquidador = idliquidador;
    }

    public Liquidador(Integer idliquidador, String nombre, String rut) {
        this.idliquidador = idliquidador;
        this.nombre = nombre;
        this.rut = rut;
    }

    public Integer getIdliquidador() {
        return idliquidador;
    }

    public void setIdliquidador(Integer idliquidador) {
        this.idliquidador = idliquidador;
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
    public List<Siniestro> getSiniestroList() {
        return siniestroList;
    }

    public void setSiniestroList(List<Siniestro> siniestroList) {
        this.siniestroList = siniestroList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idliquidador != null ? idliquidador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Liquidador)) {
            return false;
        }
        Liquidador other = (Liquidador) object;
        if ((this.idliquidador == null && other.idliquidador != null) || (this.idliquidador != null && !this.idliquidador.equals(other.idliquidador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.madreSeguros.entitys.Liquidador[ idliquidador=" + idliquidador + " ]";
    }
    
}
