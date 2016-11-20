/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.UbicacionDTO;
import duoc.cl.madreSeguros.persistencia.UbicacionSessionBean;
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
@WebServlet(name = "AgregarUbicacionServlet", urlPatterns = {"/agregarUbicacionServlet","/agregarUbicacion"})
public class AgregarUbicacionServlet extends HttpServlet {

    @EJB
    private UbicacionSessionBean ubicacionSessionBean;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        String nombreUbicacion=request.getParameter("txtNombre");
        UbicacionDTO infoUbicacionDTO=new UbicacionDTO(nombreUbicacion);
        try {
            ubicacionSessionBean.agregarUbicacion(infoUbicacionDTO);
            response.sendRedirect("Home.jsp");
        } catch (Exception e) {
            sesion.setAttribute("msgError", "Error en el ingreso de la ubicación");
            response.sendRedirect("ingresoUbicacion.jsp");
        }
    }

}
