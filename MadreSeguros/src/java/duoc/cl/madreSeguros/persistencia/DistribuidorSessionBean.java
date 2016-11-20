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

    @PersistenceContext(unitName = "MadreSegurosPU")
    private EntityManager em;
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    public void agregarDistribuidor(DistribuidorDTO infoDistribuidorDTO)throws ExcepcionesVarias{
        Distribuidor infoDistribuidor=new Distribuidor();
        infoDistribuidor.setRut(infoDistribuidorDTO.getRut());
        infoDistribuidor.setNombre(infoDistribuidorDTO.getNombre());
        infoDistribuidor.setNumeroContacto(infoDistribuidorDTO.getNumeroContacto());
        infoDistribuidor.setCorreo(infoDistribuidorDTO.getCorreo());
        em.persist(infoDistribuidor);
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
    
    
    
}
