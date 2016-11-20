/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import duoc.cl.madreSeguros.dto.SiniestroDTO;
import duoc.cl.madreSeguros.entitys.File;
import duoc.cl.madreSeguros.entitys.Liquidador;
import duoc.cl.madreSeguros.entitys.Poliza;
import duoc.cl.madreSeguros.entitys.Siniestro;
import duoc.cl.madreSeguros.entitys.TipoSiniestro;
import duoc.cl.madreSeguros.entitys.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nicolas
 */
@Stateless
public class SIniestroSessionBean {

    @PersistenceContext(unitName = "MadreSegurosPU")
    private EntityManager em;
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    public void agregarSiniestro(SiniestroDTO inforSiniestroDTO)throws ExcepcionesVarias{
        Siniestro infoSiniestro=new Siniestro();
        infoSiniestro.setNumeroSiniestro(inforSiniestroDTO.getNumeroSiniestro());
        infoSiniestro.setMontoSiniestro(inforSiniestroDTO.getMontoSiniestro());
        infoSiniestro.setObservacion(inforSiniestroDTO.getObservacion());
        infoSiniestro.setFechaSiniestro(inforSiniestroDTO.getFechaSiniestro());
        infoSiniestro.setFechaReclamacion(inforSiniestroDTO.getFechaReclamacion());
        Poliza poliza=em.find(Poliza.class, inforSiniestroDTO.getIdPoliza());
        infoSiniestro.setPolizanumeropoliza(poliza);
        TipoSiniestro tipoSiniestro=em.find(TipoSiniestro.class, inforSiniestroDTO.getIdTipoSiniestro());
        infoSiniestro.setTipoSiniestroIdtipoSiniestro(tipoSiniestro);
        Liquidador liquidador=em.find(Liquidador.class, inforSiniestroDTO.getIdLiquidador());
        infoSiniestro.setLiquidadorIdliquidador(liquidador);
        File file=em.find(File.class, inforSiniestroDTO.getIdFile());
        infoSiniestro.setFileNumeroFile(file);
        Usuario usuario=em.find(Usuario.class, inforSiniestroDTO.getIdUsuario());
        
        em.persist(infoSiniestro);
        
    }
    
    public List<Siniestro>listadoSiniestro(){
        return em.createNamedQuery("Siniestro.findAll",Siniestro.class)
                .getResultList();
    }
}
