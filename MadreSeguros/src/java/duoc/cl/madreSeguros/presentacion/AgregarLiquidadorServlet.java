/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.LiquidadorDTO;
import duoc.cl.madreSeguros.persistencia.LiquidadorSessionBean;
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
@WebServlet(name = "AgregarLiquidadorServlet", urlPatterns = {"/agregarLiquidadorServlet","/agregarLiquidador"})
public class AgregarLiquidadorServlet extends HttpServlet {
    
    @EJB
    private LiquidadorSessionBean liquidadorSessionBean;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        String rut=request.getParameter("txtRut");
        String nombre=request.getParameter("txtNombre");
        LiquidadorDTO infoLiquidadorDTO=new LiquidadorDTO(rut, nombre);
        try {
            liquidadorSessionBean.agregarLiquidador(infoLiquidadorDTO);
            response.sendRedirect("Home.jsp");
        } catch (Exception e) {
            sesion.setAttribute("msgError", "Error en el ingreso del liquidador");
            response.sendRedirect("ingresoLiquidador.jsp");
        }
    }


}
