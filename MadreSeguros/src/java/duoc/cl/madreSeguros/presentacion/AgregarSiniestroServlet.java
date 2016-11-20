/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.SiniestroDTO;
import duoc.cl.madreSeguros.persistencia.SIniestroSessionBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(name = "AgregarSiniestroServlet", urlPatterns = {"/agregarSiniestroServlet"})
public class AgregarSiniestroServlet extends HttpServlet {
    
    @EJB
    private SIniestroSessionBean sIniestroSessionBean; 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/mm/yyyy");

        int numeroSiniestro=Integer.parseInt(request.getParameter("txtNumeroSiniestro"));
        int montoSiniestro=Integer.parseInt(request.getParameter("txtMontoSiniestro"));
        String observacion=request.getParameter("txtObservacion");
        Date fechaSiniestro=null;
        Date fechaReclamacion=null;
        try {
            fechaSiniestro=formatoFecha.parse(request.getParameter("txtFechaSiniestro"));
            fechaReclamacion=formatoFecha.parse(request.getParameter("txtFechaReclamacion"));
        } catch (Exception e) {
        }
        int idPoliza=Integer.parseInt(request.getParameter("txtIdPoliza"));
        int idTipoSiniestro=Integer.parseInt(request.getParameter("txtIdTipoSiniestro"));
        int idLiquidador=Integer.parseInt(request.getParameter("txtIdLiquidador"));
        int idFile=Integer.parseInt(request.getParameter("txtIdFile"));
        int idUsuario=Integer.parseInt(request.getParameter("txtIdUsuario"));
        
        SiniestroDTO infoSiniestroDTO=new SiniestroDTO(numeroSiniestro, montoSiniestro, observacion, fechaSiniestro, fechaReclamacion, idPoliza, idTipoSiniestro, idLiquidador, idFile, idUsuario);
        
        try {
            sIniestroSessionBean.agregarSiniestro(infoSiniestroDTO);
            response.sendRedirect("Home.jsp");
        } catch (Exception e) {
            sesion.setAttribute("msgError", "Error al ingresar el siniestro");
            response.sendRedirect("ingresoSiniestro.jsp");
        }
    }

}
