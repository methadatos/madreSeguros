/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.UsuarioDTO;
import duoc.cl.madreSeguros.persistencia.UsuarioSessionBean;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ValidarUsuarioServlet", urlPatterns = {"/validarUsuarioServlet","/validarUsuario"})
public class ValidarUsuarioServlet extends HttpServlet {

    @EJB
    private UsuarioSessionBean usuarioSessionBean;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        String username=request.getParameter("txtUsername");
        String password=request.getParameter("txtPassword");
        UsuarioDTO infoUsuarioDTO=usuarioSessionBean.validaUsuario(username, password);
        if(infoUsuarioDTO!=null){
            sesion.setAttribute("usuarioConectado", infoUsuarioDTO);
            response.sendRedirect("Home.jsp");
        }else{
            sesion.setAttribute("msgError", "Usuario o password incorrectos");
            response.sendRedirect("Login.jsp");
        }
        
    }


}
