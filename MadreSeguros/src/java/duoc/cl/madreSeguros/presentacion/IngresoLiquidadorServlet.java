/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.LiquidadorDTO;
import duoc.cl.madreSeguros.persistencia.LiquidadorSessionBean;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author cetecom
 */
@WebServlet(name = "IngresoLiquidadorServlet", urlPatterns = {"/ingresoLiquidadorServlet","/ingresoLiquidador"})
public class IngresoLiquidadorServlet extends HttpServlet {

    @EJB     
    private LiquidadorSessionBean liquidadorDAO;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        String rut=request.getParameter("txtRut");
        String nombre=request.getParameter("txtNombre");
        LiquidadorDTO infoLiquidadorDTO=new LiquidadorDTO(rut, nombre);
        
        try {
            if (liquidadorDAO.agregarLiquidador(infoLiquidadorDTO)) {
                response.sendRedirect("ingresoLiquidador.jsp");
            } else {
                
            }
        } catch (Exception e) {
                sesion.setAttribute("msgError", "Error en el ingreso del liquidador");
                response.sendRedirect("ingresoLiquidador.jsp");
        }
    }

}
