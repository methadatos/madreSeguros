/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.entitys.TipoSiniestro;
import duoc.cl.madreSeguros.persistencia.TipoSiniestroSessionBean;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "CargarTipoSiniestroServlet", urlPatterns = {"/cargarTipoSiniestroServlet","/cargarTipoSiniestro"})
public class CargarTipoSiniestroServlet extends HttpServlet {

    @EJB
    private TipoSiniestroSessionBean tipoSiniestroSessionBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        List<TipoSiniestro>listadoSiniestro=tipoSiniestroSessionBean.listadoTipoSiniestro();
        sesion.setAttribute("listadoTipoSiniestro", listadoSiniestro);
    }

    

}
