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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Nicolas
 */
@Entity
@Table(name = "subgerente", catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subgerente.findAll", query = "SELECT s FROM Subgerente s"),
    @NamedQuery(name = "Subgerente.findByIdsubgerente", query = "SELECT s FROM Subgerente s WHERE s.idsubgerente = :idsubgerente"),
    @NamedQuery(name = "Subgerente.findByNombre", query = "SELECT s FROM Subgerente s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "Subgerente.findByZona", query = "SELECT s FROM Subgerente s WHERE s.zona = :zona")})
public class Subgerente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsubgerente", nullable = false)
    private Integer idsubgerente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "zona", nullable = false, length = 45)
    private String zona;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subgerenteIdsubgerente")
    private List<File> fileList;

    public Subgerente() {
    }

    public Subgerente(Integer idsubgerente) {
        this.idsubgerente = idsubgerente;
    }

    public Subgerente(Integer idsubgerente, String nombre, String zona) {
        this.idsubgerente = idsubgerente;
        this.nombre = nombre;
        this.zona = zona;
    }

    public Integer getIdsubgerente() {
        return idsubgerente;
    }

    public void setIdsubgerente(Integer idsubgerente) {
        this.idsubgerente = idsubgerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @XmlTransient
    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsubgerente != null ? idsubgerente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subgerente)) {
            return false;
        }
        Subgerente other = (Subgerente) object;
        if ((this.idsubgerente == null && other.idsubgerente != null) || (this.idsubgerente != null && !this.idsubgerente.equals(other.idsubgerente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.madreSeguros.entitys.Subgerente[ idsubgerente=" + idsubgerente + " ]";
    }
    
}
