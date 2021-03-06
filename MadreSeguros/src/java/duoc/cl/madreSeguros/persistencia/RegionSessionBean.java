/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import duoc.cl.madreSeguros.dto.RegionDTO;
import duoc.cl.madreSeguros.entitys.Region;
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
public class RegionSessionBean {
    @PersistenceContext(unitName = "MadreSegurosPU")
    private EntityManager em;
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    public void agregarRegion(RegionDTO infoRegionDTO)throws ExcepcionesVarias{
        Region infoRegion=new Region();
        infoRegion.setNombreRegion(infoRegionDTO.getNombreRegion());
        em.persist(infoRegion);
    }
    
    public List<Region>listadoRegiones(){
        return em.createNamedQuery("Region.findAll",Region.class)
                .getResultList();
    }
    
}
