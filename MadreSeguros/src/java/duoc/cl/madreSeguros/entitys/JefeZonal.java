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
@Table(name = "jefe_zonal", catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JefeZonal.findAll", query = "SELECT j FROM JefeZonal j"),
    @NamedQuery(name = "JefeZonal.findByIdjefeZonal", query = "SELECT j FROM JefeZonal j WHERE j.idjefeZonal = :idjefeZonal"),
    @NamedQuery(name = "JefeZonal.findByNombre", query = "SELECT j FROM JefeZonal j WHERE j.nombre = :nombre"),
    @NamedQuery(name = "JefeZonal.findByCorreo", query = "SELECT j FROM JefeZonal j WHERE j.correo = :correo"),
    @NamedQuery(name = "JefeZonal.findByTelefono", query = "SELECT j FROM JefeZonal j WHERE j.telefono = :telefono")})
public class JefeZonal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idjefe_zonal", nullable = false)
    private Integer idjefeZonal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "correo", nullable = false, length = 100)
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "telefono", nullable = false, length = 45)
    private String telefono;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jefeZonalIdjefeZonal")
    private List<File> fileList;

    public JefeZonal() {
    }

    public JefeZonal(Integer idjefeZonal) {
        this.idjefeZonal = idjefeZonal;
    }

    public JefeZonal(Integer idjefeZonal, String nombre, String correo, String telefono) {
        this.idjefeZonal = idjefeZonal;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Integer getIdjefeZonal() {
        return idjefeZonal;
    }

    public void setIdjefeZonal(Integer idjefeZonal) {
        this.idjefeZonal = idjefeZonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        hash += (idjefeZonal != null ? idjefeZonal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JefeZonal)) {
            return false;
        }
        JefeZonal other = (JefeZonal) object;
        if ((this.idjefeZonal == null && other.idjefeZonal != null) || (this.idjefeZonal != null && !this.idjefeZonal.equals(other.idjefeZonal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.madreSeguros.entitys.JefeZonal[ idjefeZonal=" + idjefeZonal + " ]";
    }
    
}
