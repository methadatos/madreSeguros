/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import duoc.cl.madreSeguros.dto.PlataformaDTO;
import duoc.cl.madreSeguros.entitys.Plataforma;
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
public class PlataformaSessionBean {
    @PersistenceContext(unitName = "")
    private EntityManager em;
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    public void agregarPlataforma(PlataformaDTO infoPlataformaDTO)throws ExcepcionesVarias{
        Plataforma infoPlataforma=new Plataforma();
        infoPlataforma.setPlataforma(infoPlataformaDTO.getNombre());
        em.persist(infoPlataforma);
    }
    
    public List<Plataforma>listadoPlataforma(){
        return em.createNamedQuery("Plataforma.findAll",Plataforma.class)
                .getResultList();
    }
}
