/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.JefeZonalDTO;
import duoc.cl.madreSeguros.persistencia.JefeZonalSessionBean;
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
@WebServlet(name = "AgregarJefeZonalServlet", urlPatterns = {"/agregarJefeZonalServlet","/agregarJefeZonal"})
public class AgregarJefeZonalServlet extends HttpServlet {
    
    @EJB
    private JefeZonalSessionBean jefeZonalSessionBean;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        String nombre=request.getParameter("txtNombre");
        String correo=request.getParameter("txtCorreo");
        String telefono=request.getParameter("txtTelefono");
        JefeZonalDTO infoJefeZonalDTO=new JefeZonalDTO(nombre, correo, telefono);
        try {
            this.jefeZonalSessionBean.agregarJefeZonal(infoJefeZonalDTO);
            response.sendRedirect("Home.jsp");
        } catch (Exception e) {
            sesion.setAttribute("msgError", "Error al ingresal al jefe zonal");
            response.sendRedirect("ingresoJefeZonal.jsp");
        }
    }

 

}
