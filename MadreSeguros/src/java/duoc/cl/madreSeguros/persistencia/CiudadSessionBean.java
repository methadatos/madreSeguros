/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import duoc.cl.madreSeguros.dto.CiudadDTO;
import duoc.cl.madreSeguros.entitys.Ciudad;
import duoc.cl.madreSeguros.entitys.CiudadPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.persistence.EntityManager;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nicolas
 */
@Stateless
public class CiudadSessionBean {

    @PersistenceContext
    private EntityManager em;
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    public boolean agregarCiudad(CiudadDTO ciudadIngresada){
        for (Ciudad ciudad : listadoCiudades()) {
            if(ciudad.getNombre().compareToIgnoreCase(ciudadIngresada.getNombreCiudad())==0){
                return false;
            }
        }
        
        CiudadPK infoCiudad=new CiudadPK();
                infoCiudad.setIdciudad(ciudadIngresada.getIdCiudad());
                infoCiudad.set(ciudadIngresada.getNombreCiudad());
                em.persist(infoCiudad);
                
        return true;
    }
    
    public List<Ciudad>listadoCiudades(){
        return em.createNamedQuery("Aseguradora.findAll",Ciudad.class)
                .getResultList();
    }
    
    public boolean eliminarCiudad(int idCiudadEliminar){
        
    }
    
    public Ciudad buscarCiudad(int idCiudadBuscada){
        Ciudad infoCiudad=null;
        try {
            infoCiudad=em.createNamedQuery("Ciudad.findByIdciudad",Ciudad.class)
                .getSingleResult();
        } catch (NonUniqueResultException ex) {
            throw ex;
        }catch(noº){
        
        }
        
    }
}
