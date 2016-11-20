/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.DistribuidorDTO;
import duoc.cl.madreSeguros.persistencia.DistribuidorSessionBean;
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
@WebServlet(name = "AgregarDistribuidorServlet", urlPatterns = {"/agregarDistribuidorServlet","/agregarDistribuidor"})
public class AgregarDistribuidorServlet extends HttpServlet {

    @EJB
    private DistribuidorSessionBean distribuidorSessionBean;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        String rut=request.getParameter("");
        String nombre=request.getParameter("");
        String correo=request.getParameter("");
        String telefono=request.getParameter("");
        DistribuidorDTO infoDistribuidorDTO=new DistribuidorDTO(rut, nombre, telefono, correo);
        
        try {
            this.distribuidorSessionBean.agregarDistribuidor(infoDistribuidorDTO);
            response.sendRedirect("Home.jsp");
        } catch (Exception e) {
            sesion.setAttribute("msgError", "Error en el ingreso del distribuidor");
            response.sendRedirect("ingresoDistribuidor.jsp");
        }
    }

}
