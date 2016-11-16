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
@Table(name = "file", catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "File.findAll", query = "SELECT f FROM File f"),
    @NamedQuery(name = "File.findByNumeroFile", query = "SELECT f FROM File f WHERE f.numeroFile = :numeroFile"),
    @NamedQuery(name = "File.findByDireccion", query = "SELECT f FROM File f WHERE f.direccion = :direccion")})
public class File implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_file", nullable = false)
    private Integer numeroFile;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;
    @JoinColumn(name = "distribuidor_iddistribuidor", referencedColumnName = "iddistribuidor", nullable = false)
    @ManyToOne(optional = false)
    private Distribuidor distribuidorIddistribuidor;
    @JoinColumn(name = "jefe_zonal_idjefe_zonal", referencedColumnName = "idjefe_zonal", nullable = false)
    @ManyToOne(optional = false)
    private JefeZonal jefeZonalIdjefeZonal;
    @JoinColumn(name = "plataforma_idplataforma", referencedColumnName = "idplataforma", nullable = false)
    @ManyToOne(optional = false)
    private Plataforma plataformaIdplataforma;
    @JoinColumn(name = "region_idregion", referencedColumnName = "idregion", nullable = false)
    @ManyToOne(optional = false)
    private Region regionIdregion;
    @JoinColumn(name = "subgerente_idsubgerente", referencedColumnName = "idsubgerente", nullable = false)
    @ManyToOne(optional = false)
    private Subgerente subgerenteIdsubgerente;
    @JoinColumn(name = "ubicacion_idubicacion", referencedColumnName = "idubicacion", nullable = false)
    @ManyToOne(optional = false)
    private Ubicacion ubicacionIdubicacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileNumeroFile")
    private List<Siniestro> siniestroList;

    public File() {
    }

    public File(Integer numeroFile) {
        this.numeroFile = numeroFile;
    }

    public File(Integer numeroFile, String direccion) {
        this.numeroFile = numeroFile;
        this.direccion = direccion;
    }

    public Integer getNumeroFile() {
        return numeroFile;
    }

    public void setNumeroFile(Integer numeroFile) {
        this.numeroFile = numeroFile;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Distribuidor getDistribuidorIddistribuidor() {
        return distribuidorIddistribuidor;
    }

    public void setDistribuidorIddistribuidor(Distribuidor distribuidorIddistribuidor) {
        this.distribuidorIddistribuidor = distribuidorIddistribuidor;
    }

    public JefeZonal getJefeZonalIdjefeZonal() {
        return jefeZonalIdjefeZonal;
    }

    public void setJefeZonalIdjefeZonal(JefeZonal jefeZonalIdjefeZonal) {
        this.jefeZonalIdjefeZonal = jefeZonalIdjefeZonal;
    }

    public Plataforma getPlataformaIdplataforma() {
        return plataformaIdplataforma;
    }

    public void setPlataformaIdplataforma(Plataforma plataformaIdplataforma) {
        this.plataformaIdplataforma = plataformaIdplataforma;
    }

    public Region getRegionIdregion() {
        return regionIdregion;
    }

    public void setRegionIdregion(Region regionIdregion) {
        this.regionIdregion = regionIdregion;
    }

    public Subgerente getSubgerenteIdsubgerente() {
        return subgerenteIdsubgerente;
    }

    public void setSubgerenteIdsubgerente(Subgerente subgerenteIdsubgerente) {
        this.subgerenteIdsubgerente = subgerenteIdsubgerente;
    }

    public Ubicacion getUbicacionIdubicacion() {
        return ubicacionIdubicacion;
    }

    public void setUbicacionIdubicacion(Ubicacion ubicacionIdubicacion) {
        this.ubicacionIdubicacion = ubicacionIdubicacion;
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
        hash += (numeroFile != null ? numeroFile.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof File)) {
            return false;
        }
        File other = (File) object;
        if ((this.numeroFile == null && other.numeroFile != null) || (this.numeroFile != null && !this.numeroFile.equals(other.numeroFile))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.madreSeguros.entitys.File[ numeroFile=" + numeroFile + " ]";
    }
    
}
