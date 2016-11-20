/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.ComunaDTO;
import duoc.cl.madreSeguros.persistencia.ComunaSessionBean;
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
@WebServlet(name = "AgregarComunaServlet", urlPatterns = {"/agregarComunaServlet","/agregarComuna"})
public class AgregarComunaServlet extends HttpServlet {
    
    @EJB
    private ComunaSessionBean comunaSessionBean;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        String nombreComuna=request.getParameter("txtNombreRegion");
        int idComuna=Integer.parseInt(request.getParameter("txtIdRegion"));
        ComunaDTO infoComunaDTO=new ComunaDTO(nombreComuna, idComuna);
        try {
            this.comunaSessionBean.agregarComuna(infoComunaDTO);
            response.sendRedirect("Home.jsp");
        } catch (Exception e) {
            sesion.setAttribute("msgError", "Error en el ingreso de la comuna");
            response.sendRedirect("ingresoComuna.jsp");
        }
    }

}
