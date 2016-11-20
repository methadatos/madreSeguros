/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import duoc.cl.madreSeguros.dto.PolizaDTO;
import duoc.cl.madreSeguros.entitys.Aseguradora;
import duoc.cl.madreSeguros.entitys.ClaseSeguro;
import duoc.cl.madreSeguros.entitys.Poliza;
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
public class PolizaSessionBean {

    @PersistenceContext(unitName = "MadreSegurosPU")
    private EntityManager em;
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    public void agregarPoliza(PolizaDTO infoPolizaDTO)throws ExcepcionesVarias{
        Poliza infoPoliza=new Poliza();
        infoPoliza.setNumeroPoliza(infoPolizaDTO.getNumeroPoliza());
        infoPoliza.setFechaEmision(infoPolizaDTO.getFechaEmision());
        infoPoliza.setFechaVencimiento(infoPoliza.getFechaVencimiento());
        Aseguradora aseguradora=em.find(Aseguradora.class, infoPolizaDTO.getIdAseguradora());
        infoPoliza.setAseguradoraidAseguradora(aseguradora);
        ClaseSeguro claseSeguro=em.find(ClaseSeguro.class, infoPolizaDTO.getIdClaseSeguro());
        em.persist(infoPoliza);
    }
    
    public List<Poliza>listadoPoliza(){
        return em.createNamedQuery("Poliza.findAll",Poliza.class)
                .getResultList();
    }
}
