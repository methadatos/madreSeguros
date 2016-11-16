/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.entitys;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Nicolas
 */
@Entity
@Table(name = "Poliza", catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Poliza.findAll", query = "SELECT p FROM Poliza p"),
    @NamedQuery(name = "Poliza.findByNumeroPoliza", query = "SELECT p FROM Poliza p WHERE p.numeroPoliza = :numeroPoliza"),
    @NamedQuery(name = "Poliza.findByFechaEmision", query = "SELECT p FROM Poliza p WHERE p.fechaEmision = :fechaEmision"),
    @NamedQuery(name = "Poliza.findByFechaVencimiento", query = "SELECT p FROM Poliza p WHERE p.fechaVencimiento = :fechaVencimiento")})
public class Poliza implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_poliza", nullable = false)
    private Integer numeroPoliza;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_emision", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_vencimiento", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;
    @JoinColumn(name = "Aseguradora_idAseguradora", referencedColumnName = "idAseguradora", nullable = false)
    @ManyToOne(optional = false)
    private Aseguradora aseguradoraidAseguradora;
    @JoinColumn(name = "clase_seguro_idclase_seguro", referencedColumnName = "idclase_seguro", nullable = false)
    @ManyToOne(optional = false)
    private ClaseSeguro claseSeguroIdclaseSeguro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "polizanumeropoliza")
    private List<Siniestro> siniestroList;

    public Poliza() {
    }

    public Poliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Poliza(Integer numeroPoliza, Date fechaEmision, Date fechaVencimiento) {
        this.numeroPoliza = numeroPoliza;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Aseguradora getAseguradoraidAseguradora() {
        return aseguradoraidAseguradora;
    }

    public void setAseguradoraidAseguradora(Aseguradora aseguradoraidAseguradora) {
        this.aseguradoraidAseguradora = aseguradoraidAseguradora;
    }

    public ClaseSeguro getClaseSeguroIdclaseSeguro() {
        return claseSeguroIdclaseSeguro;
    }

    public void setClaseSeguroIdclaseSeguro(ClaseSeguro claseSeguroIdclaseSeguro) {
        this.claseSeguroIdclaseSeguro = claseSeguroIdclaseSeguro;
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
        hash += (numeroPoliza != null ? numeroPoliza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Poliza)) {
            return false;
        }
        Poliza other = (Poliza) object;
        if ((this.numeroPoliza == null && other.numeroPoliza != null) || (this.numeroPoliza != null && !this.numeroPoliza.equals(other.numeroPoliza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.madreSeguros.entitys.Poliza[ numeroPoliza=" + numeroPoliza + " ]";
    }
    
}
