/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import duoc.cl.madreSeguros.dto.UbicacionDTO;
import duoc.cl.madreSeguros.entitys.Ubicacion;
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
public class UbicacionSessionBean {
    @PersistenceContext(unitName = "MadreSegurosPU")
    private EntityManager em;
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    public void agregarUbicacion(UbicacionDTO ubicacionIngresada)throws ExcepcionesVarias{
        Ubicacion infoUbicacion=new Ubicacion();
        infoUbicacion.setUbicacion(ubicacionIngresada.getUbicacion());
        em.persist(infoUbicacion);
    }
    
    public List<Ubicacion>listadoUbicacion(){
        return em.createNamedQuery("Ubicacion.findAll",Ubicacion.class)
                .getResultList();
    }
    
    
    public UbicacionDTO buscarUbicacion(int idUbicacion){
        for(Ubicacion ubicacion:listadoUbicacion()){
            if(ubicacion.getIdubicacion()==idUbicacion){
                UbicacionDTO infoUbicacionDTO=new UbicacionDTO();
                infoUbicacionDTO.setIdUbicacion(ubicacion.getIdubicacion());
                infoUbicacionDTO.setUbicacion(ubicacion.getUbicacion());
                return infoUbicacionDTO;
            }
        }
        return null;
    }
    
    public boolean eliminarUbicacion(UbicacionDTO ubicacionDTO){
        Ubicacion infoUbicacion=new Ubicacion();
        infoUbicacion.setIdubicacion(ubicacionDTO.getIdUbicacion());
        infoUbicacion.setUbicacion(ubicacionDTO.getUbicacion());
                
        for(Ubicacion ubicacion:listadoUbicacion()){
            if(ubicacion.equals(infoUbicacion)){
                try {
                    em.remove(infoUbicacion);
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return false;
    }
}
