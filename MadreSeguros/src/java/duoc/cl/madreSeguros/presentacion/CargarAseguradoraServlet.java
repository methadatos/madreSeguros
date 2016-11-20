/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.entitys.Aseguradora;
import duoc.cl.madreSeguros.persistencia.AseguradoraSessionBean;
import java.io.IOException;
import java.util.List;
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
@WebServlet(name = "CargarAseguradoraServlet", urlPatterns = {"/cargarAseguradoraServlet","/cargarAseguradora"})
public class CargarAseguradoraServlet extends HttpServlet {
    
    @EJB
    private AseguradoraSessionBean aseguradoraSessionBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        List<Aseguradora>listadoAseguradora=this.aseguradoraSessionBean.listadoAseguradora();
        sesion.setAttribute("listadoAseguradora", listadoAseguradora);
    }

}
