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
@Table(name = "plataforma", catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plataforma.findAll", query = "SELECT p FROM Plataforma p"),
    @NamedQuery(name = "Plataforma.findByIdplataforma", query = "SELECT p FROM Plataforma p WHERE p.idplataforma = :idplataforma"),
    @NamedQuery(name = "Plataforma.findByPlataforma", query = "SELECT p FROM Plataforma p WHERE p.plataforma = :plataforma")})
public class Plataforma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idplataforma", nullable = false)
    private Integer idplataforma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "plataforma", nullable = false, length = 45)
    private String plataforma;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plataformaIdplataforma")
    private List<File> fileList;

    public Plataforma() {
    }

    public Plataforma(Integer idplataforma) {
        this.idplataforma = idplataforma;
    }

    public Plataforma(Integer idplataforma, String plataforma) {
        this.idplataforma = idplataforma;
        this.plataforma = plataforma;
    }

    public Integer getIdplataforma() {
        return idplataforma;
    }

    public void setIdplataforma(Integer idplataforma) {
        this.idplataforma = idplataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
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
        hash += (idplataforma != null ? idplataforma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plataforma)) {
            return false;
        }
        Plataforma other = (Plataforma) object;
        if ((this.idplataforma == null && other.idplataforma != null) || (this.idplataforma != null && !this.idplataforma.equals(other.idplataforma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.madreSeguros.entitys.Plataforma[ idplataforma=" + idplataforma + " ]";
    }
    
}
