/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import duoc.cl.madreSeguros.dto.JefeZonalDTO;
import duoc.cl.madreSeguros.entitys.JefeZonal;
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
public class JefeZonalSessionBean {

    @PersistenceContext(unitName = "MadreSegurosPU")
    private EntityManager em;
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    public void agregarJefeZonal(JefeZonalDTO infoJefeZonalDTO)throws ExcepcionesVarias{
        JefeZonal infoZonal=new JefeZonal();
        infoZonal.setNombre(infoJefeZonalDTO.getNombre());
        infoZonal.setCorreo(infoJefeZonalDTO.getCorreo());
        infoZonal.setTelefono(infoJefeZonalDTO.getTelefono());
        em.persist(infoZonal);
    }
    
    public List<JefeZonal>listadoJefeZonal(){
        return em.createNamedQuery("JefeZonal.findAll",JefeZonal.class)
                .getResultList();
    }
}
