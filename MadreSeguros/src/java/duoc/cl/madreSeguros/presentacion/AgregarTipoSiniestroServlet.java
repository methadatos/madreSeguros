/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.TipoSiniestroDTO;
import duoc.cl.madreSeguros.persistencia.TipoSiniestroSessionBean;
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
@WebServlet(name = "AgregarTipoSiniestroServlet", urlPatterns = {"/agregarTipoSiniestroServlet","/agregarTipoSiniestro"})
public class AgregarTipoSiniestroServlet extends HttpServlet {

    @EJB
    private TipoSiniestroSessionBean tipoSiniestroSessionBean;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        String nombreCategoria=request.getParameter("textNombreCategoria");
        TipoSiniestroDTO infoCategoriaDTO=new TipoSiniestroDTO(nombreCategoria);
        try {
            tipoSiniestroSessionBean.agregarTipoSiniestro(infoCategoriaDTO);
            response.sendRedirect("Home.jsp");
        } catch (Exception e) {
            sesion.setAttribute("msgError", "Error en el ingreso del tipo de siniestro");
            response.sendRedirect("ingresoTipoSiniestro.jsp");
        }
    }

}
