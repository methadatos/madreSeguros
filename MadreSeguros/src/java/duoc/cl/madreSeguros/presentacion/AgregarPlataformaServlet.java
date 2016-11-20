/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.PlataformaDTO;
import duoc.cl.madreSeguros.persistencia.PlataformaSessionBean;
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
@WebServlet(name = "AgregarPlataformaServlet", urlPatterns = {"/agregarPlataformaServlet","/agregarPlataforma"})
public class AgregarPlataformaServlet extends HttpServlet {
    
    @EJB
    private PlataformaSessionBean plataformaSessionBean;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        String nombre=request.getParameter("txtNombre");
        PlataformaDTO infoPlataformaDTO=new PlataformaDTO(nombre);
        try {
            plataformaSessionBean.agregarPlataforma(infoPlataformaDTO);
            response.sendRedirect("Home.jsp");
        } catch (Exception e) {
            sesion.setAttribute("msgError", "Error en el ingreso de la plataforma");
            response.sendRedirect("ingresoPlataforma.jsp");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
