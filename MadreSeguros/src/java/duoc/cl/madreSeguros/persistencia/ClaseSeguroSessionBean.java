/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import duoc.cl.madreSeguros.dto.ClaseSeguroDTO;
import duoc.cl.madreSeguros.entitys.ClaseSeguro;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nicolas
 */
@Stateless
public class ClaseSeguroSessionBean {

    @PersistenceContext
    private EntityManager em;
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    public boolean agregarClaseSeguro(ClaseSeguroDTO claseSeguroIngresada)throws ExcepcionesVarias{
        try {
            ClaseSeguro infoClaseSeguro=new ClaseSeguro();
            infoClaseSeguro.setNombreClase(claseSeguroIngresada.getNombreClaseSeguro());
            em.persist(infoClaseSeguro);
            return true;
            
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public ClaseSeguroDTO buscarXID(int idClaseSeguro){
        ClaseSeguroDTO infoClaseSeguroDTO=new ClaseSeguroDTO();
        for(ClaseSeguro claseSeguro:listadoClaseSeguro()){
            if(claseSeguro.getIdclaseSeguro()==idClaseSeguro){
                infoClaseSeguroDTO.setIdClaseSeguro(claseSeguro.getIdclaseSeguro());
                infoClaseSeguroDTO.setNombreClaseSeguro(claseSeguro.getNombreClase());
                return infoClaseSeguroDTO;
            }
        }
        return null;
    }
    
    public List<ClaseSeguro>listadoClaseSeguro(){
        return em.createNamedQuery("ClaseSeguro.findAll",ClaseSeguro.class)
                .getResultList();
    }
    
    public boolean eliminarClaseSeguro(int idClaseSeguro){
        ClaseSeguroDTO infoClaseSeguroDTO=buscarXID(idClaseSeguro);
        if(infoClaseSeguroDTO==null){
            return false;
        }else{
            ClaseSeguro claseSeguroDAO=new ClaseSeguro();
            claseSeguroDAO.setIdclaseSeguro(infoClaseSeguroDTO.getIdClaseSeguro());
            claseSeguroDAO.setNombreClase(infoClaseSeguroDTO.getNombreClaseSeguro());
            em.remove(claseSeguroDAO);
        }
        return true;
    }
    
    
}
