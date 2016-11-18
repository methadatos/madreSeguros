/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import duoc.cl.madreSeguros.dto.DistribuidorDTO;
import duoc.cl.madreSeguros.entitys.Distribuidor;
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
public class DistribuidorSessionBean {

    @PersistenceContext
    private EntityManager em;
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    private boolean agregarDistribuidor(DistribuidorDTO distribuidorIngresado){
        Distribuidor infoDistribuidor=new Distribuidor();
        
        try {
            infoDistribuidor.setRut(distribuidorIngresado.getRut());
            infoDistribuidor.setNombre(distribuidorIngresado.getNombre());
            infoDistribuidor.setNumeroContacto(distribuidorIngresado.getNumeroContacto());
            infoDistribuidor.setCorreo(distribuidorIngresado.getCorreo());
            em.persist(infoDistribuidor);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public List<Distribuidor>listadoDistribuidor(){
        return em.createNamedQuery("Distribuidor.findAll",Distribuidor.class)
                .getResultList();
    }
    
    public Distribuidor buscarDistribuidorXId(int idBuscado){
        for(Distribuidor distribuidor:listadoDistribuidor()){
            if(distribuidor.getIddistribuidor()==idBuscado){
                return distribuidor;
            }
        }
        return null;
    }
    
    public boolean eliminarDistribuidor(int idDistribudiorEliminado){
        for(Distribuidor distribuidor:listadoDistribuidor()){
            if(distribuidor.getIddistribuidor()==idDistribudiorEliminado){
                em.remove(distribuidor);
            }
        }
        return false;
    }
    
    public boolean updateDistribuidor(DistribuidorDTO distribuidorActualizado){
        Distribuidor infoDistribuidor=new Distribuidor();
        infoDistribuidor.setIddistribuidor(distribuidorActualizado.getIdDistribiudor());
        infoDistribuidor.setRut(distribuidorActualizado.getRut());
        infoDistribuidor.setNombre(distribuidorActualizado.getNombre());
        infoDistribuidor.setNumeroContacto(distribuidorActualizado.getNumeroContacto());
        infoDistribuidor.setCorreo(distribuidorActualizado.getCorreo());
        for(Distribuidor distribuidor:listadoDistribuidor()){
            if(distribuidor.equals(infoDistribuidor)){
                em.createNamedQuery("");
                return true;
            }
        }
        return false;
    }
    
    
}
