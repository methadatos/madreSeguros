/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.AgregarUsuarioDTO;
import duoc.cl.madreSeguros.persistencia.UsuarioSessionBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "IngresarUsuarioServlet", urlPatterns = {"/ingresarUsuarioServlet","/ingresarUsuario"})
public class IngresarUsuarioServlet extends HttpServlet {
    @EJB
    private UsuarioSessionBean usuarioSessionBean;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        String nombre=request.getParameter("txtNombre");
        String username=request.getParameter("txtUsername");
        String pass=request.getParameter("txtPassword");
        int idPerfil=Integer.parseInt(request.getParameter("txtPerfil"));
        AgregarUsuarioDTO infoAgregarUsuarioDTO=new AgregarUsuarioDTO(nombre, username, pass, idPerfil);
        try {
            usuarioSessionBean.agregarUsuario(infoAgregarUsuarioDTO);
            response.sendRedirect("Login.jsp");
        } catch (Exception ex) {
            sesion.setAttribute("msgError", "Error al ingresar al usuario "+ex);
            response.sendRedirect("ingresoUsuario.jsp");
        }
        
    }



}
