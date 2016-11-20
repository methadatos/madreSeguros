/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import duoc.cl.madreSeguros.dto.LiquidadorDTO;
import duoc.cl.madreSeguros.entitys.Liquidador;
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
public class LiquidadorSessionBean {

    @ PersistenceContext(unitName = "MadreSegurosPU")
    private EntityManager em;
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    public void agregarLiquidador(LiquidadorDTO liquidadorIngresado)throws ExcepcionesVarias{
       Liquidador infoLiquidador=new Liquidador();
            infoLiquidador.setNombre(liquidadorIngresado.getNombre());
            infoLiquidador.setRut(liquidadorIngresado.getRut());
            em.persist(infoLiquidador);
    }
    
    public List<Liquidador>listadoLiquidador(){
        return em.createNamedQuery("Liquidador.findAll",Liquidador.class)
                .getResultList();
    }
    
    public Liquidador buscarLiquidadorXId(int id){
        for(Liquidador liquidador:listadoLiquidador()){
            if(liquidador.getIdliquidador()==id){
                return liquidador;
            }
        }
        return null;
    }
    
    public boolean eliminarLiquidador(LiquidadorDTO liquidadorEliminar)throws ExcepcionesVarias{
        try {
            if(buscarLiquidadorXId(liquidadorEliminar.getIdLiquidador())!=null){
                Liquidador infoLiquidador=buscarLiquidadorXId(liquidadorEliminar.getIdLiquidador());
                em.remove(infoLiquidador);
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean updateLiquidador(LiquidadorDTO liquidadorUpdate)throws ExcepcionesVarias{
        try {
            Liquidador infoLiquidador=new Liquidador();
            infoLiquidador.setIdliquidador(liquidadorUpdate.getIdLiquidador());
            infoLiquidador.setRut(liquidadorUpdate.getRut());
            infoLiquidador.setNombre(liquidadorUpdate.getNombre());
            em.refresh(infoLiquidador);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
