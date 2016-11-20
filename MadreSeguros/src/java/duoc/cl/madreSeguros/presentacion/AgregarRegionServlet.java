/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.RegionDTO;
import duoc.cl.madreSeguros.persistencia.RegionSessionBean;
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
@WebServlet(name = "AgregarRegionServlet", urlPatterns = {"/agregarRegionServlet","/agregarRegion"})
public class AgregarRegionServlet extends HttpServlet {

    @EJB
    private RegionSessionBean regionSessionBean;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        String nombre=request.getParameter("txtNombre");
        RegionDTO infoRegionDTO=new RegionDTO(nombre);
        try {
            regionSessionBean.agregarRegion(infoRegionDTO);
            response.sendRedirect("Home.jsp");
        } catch (Exception e) {
            sesion.setAttribute("msgError", "Error en el ingreso de la region");
            response.sendRedirect("ingresoRegion.jsp");
        }
    }


}
