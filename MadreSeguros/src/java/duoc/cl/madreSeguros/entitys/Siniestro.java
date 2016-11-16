/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.entitys;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nicolas
 */
@Entity
@Table(name = "Siniestro", catalog = "mydb", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"numero_siniestro"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Siniestro.findAll", query = "SELECT s FROM Siniestro s"),
    @NamedQuery(name = "Siniestro.findByIdSiniestro", query = "SELECT s FROM Siniestro s WHERE s.idSiniestro = :idSiniestro"),
    @NamedQuery(name = "Siniestro.findByNumeroSiniestro", query = "SELECT s FROM Siniestro s WHERE s.numeroSiniestro = :numeroSiniestro"),
    @NamedQuery(name = "Siniestro.findByMontoSiniestro", query = "SELECT s FROM Siniestro s WHERE s.montoSiniestro = :montoSiniestro"),
    @NamedQuery(name = "Siniestro.findByObservacion", query = "SELECT s FROM Siniestro s WHERE s.observacion = :observacion"),
    @NamedQuery(name = "Siniestro.findByFechaSiniestro", query = "SELECT s FROM Siniestro s WHERE s.fechaSiniestro = :fechaSiniestro"),
    @NamedQuery(name = "Siniestro.findByFechaReclamacion", query = "SELECT s FROM Siniestro s WHERE s.fechaReclamacion = :fechaReclamacion"),
    @NamedQuery(name = "Siniestro.findByPolizaidPoliza", query = "SELECT s FROM Siniestro s WHERE s.polizaidPoliza = :polizaidPoliza")})
public class Siniestro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idSiniestro", nullable = false)
    private Integer idSiniestro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_siniestro", nullable = false)
    private int numeroSiniestro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "monto_siniestro", nullable = false)
    private int montoSiniestro;
    @Size(max = 500)
    @Column(name = "observacion", length = 500)
    private String observacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_siniestro", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSiniestro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_reclamacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaReclamacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Poliza_idPoliza", nullable = false)
    private int polizaidPoliza;
    @JoinColumn(name = "Poliza_numero_poliza", referencedColumnName = "numero_poliza", nullable = false)
    @ManyToOne(optional = false)
    private Poliza polizanumeropoliza;
    @JoinColumn(name = "Usuario_idUsuario", referencedColumnName = "idUsuario", nullable = false)
    @ManyToOne(optional = false)
    private Usuario usuarioidUsuario;
    @JoinColumn(name = "file_numero_file", referencedColumnName = "numero_file", nullable = false)
    @ManyToOne(optional = false)
    private File fileNumeroFile;
    @JoinColumn(name = "liquidador_idliquidador", referencedColumnName = "idliquidador", nullable = false)
    @ManyToOne(optional = false)
    private Liquidador liquidadorIdliquidador;
    @JoinColumn(name = "tipo_siniestro_idtipo_siniestro", referencedColumnName = "idtipo_siniestro", nullable = false)
    @ManyToOne(optional = false)
    private TipoSiniestro tipoSiniestroIdtipoSiniestro;

    public Siniestro() {
    }

    public Siniestro(Integer idSiniestro) {
        this.idSiniestro = idSiniestro;
    }

    public Siniestro(Integer idSiniestro, int numeroSiniestro, int montoSiniestro, Date fechaSiniestro, Date fechaReclamacion, int polizaidPoliza) {
        this.idSiniestro = idSiniestro;
        this.numeroSiniestro = numeroSiniestro;
        this.montoSiniestro = montoSiniestro;
        this.fechaSiniestro = fechaSiniestro;
        this.fechaReclamacion = fechaReclamacion;
        this.polizaidPoliza = polizaidPoliza;
    }

    public Integer getIdSiniestro() {
        return idSiniestro;
    }

    public void setIdSiniestro(Integer idSiniestro) {
        this.idSiniestro = idSiniestro;
    }

    public int getNumeroSiniestro() {
        return numeroSiniestro;
    }

    public void setNumeroSiniestro(int numeroSiniestro) {
        this.numeroSiniestro = numeroSiniestro;
    }

    public int getMontoSiniestro() {
        return montoSiniestro;
    }

    public void setMontoSiniestro(int montoSiniestro) {
        this.montoSiniestro = montoSiniestro;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaSiniestro() {
        return fechaSiniestro;
    }

    public void setFechaSiniestro(Date fechaSiniestro) {
        this.fechaSiniestro = fechaSiniestro;
    }

    public Date getFechaReclamacion() {
        return fechaReclamacion;
    }

    public void setFechaReclamacion(Date fechaReclamacion) {
        this.fechaReclamacion = fechaReclamacion;
    }

    public int getPolizaidPoliza() {
        return polizaidPoliza;
    }

    public void setPolizaidPoliza(int polizaidPoliza) {
        this.polizaidPoliza = polizaidPoliza;
    }

    public Poliza getPolizanumeropoliza() {
        return polizanumeropoliza;
    }

    public void setPolizanumeropoliza(Poliza polizanumeropoliza) {
        this.polizanumeropoliza = polizanumeropoliza;
    }

    public Usuario getUsuarioidUsuario() {
        return usuarioidUsuario;
    }

    public void setUsuarioidUsuario(Usuario usuarioidUsuario) {
        this.usuarioidUsuario = usuarioidUsuario;
    }

    public File getFileNumeroFile() {
        return fileNumeroFile;
    }

    public void setFileNumeroFile(File fileNumeroFile) {
        this.fileNumeroFile = fileNumeroFile;
    }

    public Liquidador getLiquidadorIdliquidador() {
        return liquidadorIdliquidador;
    }

    public void setLiquidadorIdliquidador(Liquidador liquidadorIdliquidador) {
        this.liquidadorIdliquidador = liquidadorIdliquidador;
    }

    public TipoSiniestro getTipoSiniestroIdtipoSiniestro() {
        return tipoSiniestroIdtipoSiniestro;
    }

    public void setTipoSiniestroIdtipoSiniestro(TipoSiniestro tipoSiniestroIdtipoSiniestro) {
        this.tipoSiniestroIdtipoSiniestro = tipoSiniestroIdtipoSiniestro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSiniestro != null ? idSiniestro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Siniestro)) {
            return false;
        }
        Siniestro other = (Siniestro) object;
        if ((this.idSiniestro == null && other.idSiniestro != null) || (this.idSiniestro != null && !this.idSiniestro.equals(other.idSiniestro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.cl.madreSeguros.entitys.Siniestro[ idSiniestro=" + idSiniestro + " ]";
    }
    
}
