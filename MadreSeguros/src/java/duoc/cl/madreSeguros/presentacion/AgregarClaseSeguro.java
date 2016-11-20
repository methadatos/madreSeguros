/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.ClaseSeguroDTO;
import duoc.cl.madreSeguros.persistencia.ClaseSeguroSessionBean;
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
 * @author NicolasValenciaY
 */
@WebServlet(name = "AgregarClaseSeguro", urlPatterns = {"/agregarClaseSeguro"})
public class AgregarClaseSeguro extends HttpServlet {

    @EJB
    private ClaseSeguroSessionBean claseSeguroSessionBean;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        String nombre=request.getParameter("txtNombre");
        ClaseSeguroDTO infoClaseSeguroDTO=new ClaseSeguroDTO(nombre);
        try {
            claseSeguroSessionBean.agregarClaseSeguro(infoClaseSeguroDTO);
            response.sendRedirect("Login.jsp");
        } catch (Exception e) {
            sesion.setAttribute("msgError", "Error en el ingreso de la clase");
            response.sendRedirect("Home.jsp");
        }
    }

}
