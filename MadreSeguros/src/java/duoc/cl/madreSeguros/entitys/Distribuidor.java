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
@Table(name = "distribuidor", catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Distribuidor.findAll", query = "SELECT d FROM Distribuidor d"),
    @NamedQuery(name = "Distribuidor.findByIddistribuidor", query = "SELECT d FROM Distribuidor d WHERE d.iddistribuidor = :iddistribuidor"),
    @NamedQuery(name = "Distribuidor.findByNombre", query = "SELECT d FROM Distribuidor d WHERE d.nombre = :nombre"),
    @NamedQuery(name = "Distribuidor.findByRut", query = "SELECT d FROM Distribuidor d WHERE d.rut = :rut"),
    @NamedQuery(name = "Distribuidor.findByNumeroContacto", query = "SELECT d FROM Distribuidor d WHERE d.numeroContacto = :numeroContacto"),
    @NamedQuery(name = "Distribuidor.findByCorreo", query = "SELECT d FROM Distribuidor d WHERE d.correo = :correo")})
public class Distribuidor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddistribuidor", nullable = false)
    private Integer iddistribuidor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "rut", nullable = false, length = 45)
    private String rut;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "numero_contacto", nullable = false, length = 45)
    private String numeroContacto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "correo", nullable = false, length = 45)
    private String correo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "distribuidorIddistribuidor")
    private List<File> fileList;

    public Distribuidor() {
    }

    public Distribuidor(Integer iddistribuidor) {
        this.iddistribuidor = iddistribuidor;
    }

    public Distribuidor(Integer iddistribuidor, String nombre, String rut, String numeroContacto, String correo) {
        this.iddistribuidor = iddistribuidor;
        this.nombre = nombre;
        this.rut = rut;
        this.numeroContacto = numeroContacto;
        this.correo = correo;
    }

    public Integer getIddistribuidor() {
        return iddistribuidor;
    }

    public void setIddistribuidor(Integer iddistribuidor) {
        this.iddistribuidor = iddistribuidor;
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

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
        hash += (iddistribuidor != null ? iddistribuidor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Distribuidor)) {
            return false;
        }
        Distribuidor other = (Distribuidor) object;
        if ((this.iddistribuidor == null && other.iddistribuidor != null) || (this.iddistribuidor != null && !this.iddistribuidor.equals(other.iddistribuidor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.madreSeguros.entitys.Distribuidor[ iddistribuidor=" + iddistribuidor + " ]";
    }
    
}
