/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import duoc.cl.madreSeguros.dto.SubgerenteDTO;
import duoc.cl.madreSeguros.entitys.Subgerente;
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
public class SubgerenteSessionBean {

    @PersistenceContext(unitName = "MadreSegurosPU")
    private EntityManager em;
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    public void agregarSubgerente(SubgerenteDTO infoSubgerenteDTO)throws ExcepcionesVarias{
        Subgerente infoSubgerente=new Subgerente();
        infoSubgerente.setNombre(infoSubgerenteDTO.getNombreSubgerente());
        infoSubgerente.setZona(infoSubgerenteDTO.getZona());
        em.persist(infoSubgerente);
    }
    
    public List<Subgerente>listadoSubgerentes(){
        return em.createNamedQuery("Subgerente.findAll",Subgerente.class)
                .getResultList();
    }
}
