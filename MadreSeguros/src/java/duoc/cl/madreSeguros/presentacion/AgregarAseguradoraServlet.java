/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.AseguradoraDTO;
import duoc.cl.madreSeguros.persistencia.AseguradoraSessionBean;
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
@WebServlet(name = "AgregarAseguradoraServlet", urlPatterns = {"/agregarAseguradoraServlet","agregarAseguradora"})
public class AgregarAseguradoraServlet extends HttpServlet {

    @EJB
    private AseguradoraSessionBean aseguradoraSessionBean;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        String rut=request.getParameter("txtRut");
        String nombre=request.getParameter("txtNombre");
        AseguradoraDTO infoAseguradoraDTO=new AseguradoraDTO(rut, nombre);
        try {
            aseguradoraSessionBean.agregarAseguradora(infoAseguradoraDTO);
            response.sendRedirect("Home.jsp");
        } catch (Exception e) {
            sesion.setAttribute("msgError", "Error con el ingreso de la aseguradora");
            response.sendRedirect("ingresoAseguradora.jsp");
        }
    }


}
