/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import duoc.cl.madreSeguros.dto.AseguradoraDTO;
import duoc.cl.madreSeguros.entitys.Aseguradora;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Nicolas
 */
@Stateless
public class AseguradoraSessionBean {
    @PersistenceContext(unitName = "MadreSegurosPU")
    private EntityManager em;
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    public void agregarAseguradora(AseguradoraDTO aseguradoraIngresada){
        Aseguradora infoAseguradora=new Aseguradora();
        infoAseguradora.setIdAseguradora(aseguradoraIngresada.getIdAseguradora());
        infoAseguradora.setNombre(aseguradoraIngresada.getNombre());
        infoAseguradora.setRut(aseguradoraIngresada.getRut());
        em.merge(infoAseguradora);
    }
    
    public void eliminarAseguradora(AseguradoraDTO infoAseguradora){
        em.remove(buscarAseguradora(infoAseguradora.getIdAseguradora()).getIdAseguradora());
    }
    
    public Aseguradora buscarAseguradora(int idAseguradora) {
        Aseguradora infoAseguradora = null;
        try {
            infoAseguradora = em.createNamedQuery("Aseguradora.findByIdAseguradora", Aseguradora.class)
                    .setParameter("idAseguradora", idAseguradora)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }catch(NonUniqueResultException ex){
            throw ex;
        }

        return infoAseguradora;
    }
    
    
}
