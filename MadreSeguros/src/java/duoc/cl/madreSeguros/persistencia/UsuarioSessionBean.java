/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import duoc.cl.madreSeguros.dto.AgregarUsuarioDTO;
import duoc.cl.madreSeguros.dto.UsuarioDTO;
import duoc.cl.madreSeguros.entitys.Perfil;
import duoc.cl.madreSeguros.entitys.Usuario;
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
public class UsuarioSessionBean {
    
    @PersistenceContext(unitName = "MadreSegurosPU")
    private EntityManager em;
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    
    public UsuarioDTO validaUsuario(String user,String pass){
        UsuarioDTO infoUsuarioDTO=null;
        try {
            infoUsuarioDTO=em.createNamedQuery("Usuario.validarUsuario",UsuarioDTO.class)
                    .setParameter("username", user)
                    .setParameter("password", pass)
                    .getSingleResult();
        } catch (NoResultException e) {
            return infoUsuarioDTO;
        }catch(NonUniqueResultException ex){
            throw ex;
        }
        return infoUsuarioDTO;
    }
    
    public void agregarUsuario(AgregarUsuarioDTO usuarioDTO)throws ExcepcionesVarias{
        Usuario infoUsuario=new Usuario();
        infoUsuario.setNombre(usuarioDTO.getNombre());
        infoUsuario.setUsername(usuarioDTO.getUsername());
        infoUsuario.setPassword(usuarioDTO.getPassword());
        Perfil perfil=em.find(Perfil.class, usuarioDTO.getIdPerfil());
        infoUsuario.setPerfilIdperfil(perfil);
        em.persist(infoUsuario);
    }
}
