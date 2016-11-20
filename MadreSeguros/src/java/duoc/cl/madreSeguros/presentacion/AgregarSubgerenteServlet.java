/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.SubgerenteDTO;
import duoc.cl.madreSeguros.persistencia.SubgerenteSessionBean;
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
@WebServlet(name = "AgregarSubgerenteServlet", urlPatterns = {"/agregarSubgerenteServlet","/agregarSubgerente"})
public class AgregarSubgerenteServlet extends HttpServlet {

    @EJB
    private SubgerenteSessionBean subgerenteSessionBean;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        String nombreSubgerente=request.getParameter("txtNombreSubgerente");
        String zona=request.getParameter("txtZona");
        SubgerenteDTO infoSubgerenteDTO=new SubgerenteDTO(nombreSubgerente, zona);
        try {
            this.subgerenteSessionBean.agregarSubgerente(infoSubgerenteDTO);
            response.sendRedirect("Home.jsp");
        } catch (Exception e) {
            sesion.setAttribute("msgError", "Error al ingresar al subgerente");
            response.sendRedirect("ingresoSubgerente.jsp");
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
