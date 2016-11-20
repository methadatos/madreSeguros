/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import duoc.cl.madreSeguros.dto.ComunaDTO;
import duoc.cl.madreSeguros.entitys.Comuna;
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
public class ComunaSessionBean {
    @PersistenceContext(unitName = "MadreSegurosPU")
    private EntityManager em;
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    public void agregarComuna(ComunaDTO comunaAgregada)throws ExcepcionesVarias{
        Comuna infoComuna=new Comuna();
        infoComuna.setNombre(comunaAgregada.getNombreComuna());
        Region region=em.find(Region.class, comunaAgregada.getIdRegion());
        infoComuna.setRegionIdregion(region);
        em.persist(infoComuna);
    }
    
    public List<Comuna>listadoComunas(){
        return em.createNamedQuery("Comuna.findAll",Comuna.class)
                .getResultList();
    }
    
    public ComunaDTO buscarXID(int idComuna){
        for(Comuna comuna:listadoComunas()){
            if(comuna.getIdcomuna()==idComuna){
                ComunaDTO infoComunaDTO=new ComunaDTO();
                infoComunaDTO.setIdComuna(comuna.getIdcomuna());
                infoComunaDTO.setNombreComuna(comuna.getNombre());
                return infoComunaDTO;
            }
        }
        return null;
    }
    
    public boolean eliminarComuna(int idComuna){
        ComunaDTO infoComunaDTO=buscarXID(idComuna);
        if(infoComunaDTO!=null){
            Comuna comunaEntity=new Comuna();
            comunaEntity.setIdcomuna(infoComunaDTO.getIdComuna());
            comunaEntity.setNombre(infoComunaDTO.getNombreComuna());
            em.remove(comunaEntity);
            return true;
        }
        
        return false;
    }
}
