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
@Table(name = "tipo_siniestro", catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoSiniestro.findAll", query = "SELECT t FROM TipoSiniestro t"),
    @NamedQuery(name = "TipoSiniestro.findByIdtipoSiniestro", query = "SELECT t FROM TipoSiniestro t WHERE t.idtipoSiniestro = :idtipoSiniestro"),
    @NamedQuery(name = "TipoSiniestro.findByCategoria", query = "SELECT t FROM TipoSiniestro t WHERE t.categoria = :categoria")})
public class TipoSiniestro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipo_siniestro", nullable = false)
    private Integer idtipoSiniestro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "categoria", nullable = false, length = 45)
    private String categoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoSiniestroIdtipoSiniestro")
    private List<Siniestro> siniestroList;

    public TipoSiniestro() {
    }

    public TipoSiniestro(Integer idtipoSiniestro) {
        this.idtipoSiniestro = idtipoSiniestro;
    }

    public TipoSiniestro(Integer idtipoSiniestro, String categoria) {
        this.idtipoSiniestro = idtipoSiniestro;
        this.categoria = categoria;
    }

    public Integer getIdtipoSiniestro() {
        return idtipoSiniestro;
    }

    public void setIdtipoSiniestro(Integer idtipoSiniestro) {
        this.idtipoSiniestro = idtipoSiniestro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
        hash += (idtipoSiniestro != null ? idtipoSiniestro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoSiniestro)) {
            return false;
        }
        TipoSiniestro other = (TipoSiniestro) object;
        if ((this.idtipoSiniestro == null && other.idtipoSiniestro != null) || (this.idtipoSiniestro != null && !this.idtipoSiniestro.equals(other.idtipoSiniestro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.madreSeguros.entitys.TipoSiniestro[ idtipoSiniestro=" + idtipoSiniestro + " ]";
    }
    
}
