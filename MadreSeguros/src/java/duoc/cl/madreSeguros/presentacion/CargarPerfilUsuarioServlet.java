/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.entitys.Perfil;
import duoc.cl.madreSeguros.persistencia.PerfilSessionBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nicolas
 */
@WebServlet(name = "CargarPerfilUsuarioServlet", urlPatterns = {"/cargarPerfilUsuarioServlet","/cargarPerfilUsuario"})
public class CargarPerfilUsuarioServlet extends HttpServlet {
    
    @EJB
    private PerfilSessionBean perfilSessionBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        List<Perfil>listadoPerfiles=perfilSessionBean.listadoPerfil();
        sesion.setAttribute("listadoPerfiles", listadoPerfiles);
        
    }

}
