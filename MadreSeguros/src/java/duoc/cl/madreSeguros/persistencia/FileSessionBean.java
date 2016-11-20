/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import duoc.cl.madreSeguros.dto.FileDTO;
import duoc.cl.madreSeguros.entitys.Distribuidor;
import duoc.cl.madreSeguros.entitys.File;
import duoc.cl.madreSeguros.entitys.JefeZonal;
import duoc.cl.madreSeguros.entitys.Plataforma;
import duoc.cl.madreSeguros.entitys.Region;
import duoc.cl.madreSeguros.entitys.Subgerente;
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
public class FileSessionBean {

    @PersistenceContext(unitName = "MadreSegurosPU")
    private EntityManager em;
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    public void agregarFile(FileDTO infoFileDTO)throws ExcepcionesVarias{
        File infoFile=new File();
        infoFile.setNumeroFile(infoFileDTO.getNumeroFile());
        infoFile.setDireccion(infoFileDTO.getDireccion());
        Region region=em.find(Region.class, infoFileDTO.getRegion());
        infoFile.setRegionIdregion(region);
        Ubicacion ubicacion=em.find(Ubicacion.class, infoFile.getUbicacionIdubicacion());
        infoFile.setUbicacionIdubicacion(ubicacion);
        Plataforma plataforma=em.find(Plataforma.class, infoFileDTO.getIdPlataforma());
        infoFile.setPlataformaIdplataforma(plataforma);
        Distribuidor distribuidor=em.find(Distribuidor.class, infoFileDTO.getIdDistribuidor());
        infoFile.setDistribuidorIddistribuidor(distribuidor);
        Subgerente subgerente=em.find(Subgerente.class, infoFileDTO.getIdSubgerente());
        infoFile.setSubgerenteIdsubgerente(subgerente);
        JefeZonal jefeZonal=em.find(JefeZonal.class, infoFileDTO.getIdJefeZonal());
        infoFile.setJefeZonalIdjefeZonal(jefeZonal);
        em.persist(infoFile);
    }
    
    public List<File>listadoFiles(){
        return em.createNamedQuery("File.findAll",File.class)
                .getResultList();
    }
    
           
}
