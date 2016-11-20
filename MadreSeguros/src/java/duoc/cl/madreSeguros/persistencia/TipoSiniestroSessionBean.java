/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import duoc.cl.madreSeguros.dto.TipoSiniestroDTO;
import duoc.cl.madreSeguros.entitys.TipoSiniestro;
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
public class TipoSiniestroSessionBean {

    @PersistenceContext(unitName = "MadreSegurosPU")
    private EntityManager em;
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    public void agregarTipoSiniestro(TipoSiniestroDTO infoTipoSiniestroDTO)throws ExcepcionesVarias{
        TipoSiniestro infoSiniestro=new TipoSiniestro();
        infoSiniestro.setCategoria(infoTipoSiniestroDTO.getNombreCategoria());
        em.persist(infoSiniestro);
    }
    
    public List<TipoSiniestro>listadoTipoSiniestro(){
        return em.createNamedQuery("TipoSiniestro.findAll",TipoSiniestro.class)
                .getResultList();
    }
}
