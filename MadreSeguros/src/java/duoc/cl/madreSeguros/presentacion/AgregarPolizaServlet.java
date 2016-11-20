/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.PolizaDTO;
import duoc.cl.madreSeguros.persistencia.PolizaSessionBean;
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
@WebServlet(name = "AgregarPolizaServlet", urlPatterns = {"/agregarPolizaServlet","/agregarPoliza"})
public class AgregarPolizaServlet extends HttpServlet {
    
    @EJB
    private PolizaSessionBean polizaSessionBean;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
        int numeroPoliza=Integer.parseInt(request.getParameter("txtNumeroPoliza"));
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/mm/yyyy");
        Date fechaEmision=null;
        Date fechaVencimiento=null;
        try {
            fechaEmision=formatoFecha.parse(request.getParameter("txtFechaEmision"));
            fechaVencimiento=formatoFecha.parse(request.getParameter("txtFechaVencimiento"));
        } catch (Exception e) {
            sesion.setAttribute("msgError", "Error en la conversión de fecha");
        }
        
        int idAseguradora=Integer.parseInt(request.getParameter("txtIdAseguradora"));
        int idClaseSeguro=Integer.parseInt(request.getParameter("txtIdClaseSeguro"));
        
        PolizaDTO infoPolizaDTO=new PolizaDTO(numeroPoliza, fechaEmision, fechaVencimiento, idAseguradora, idClaseSeguro);
        
        try {
            this.polizaSessionBean.agregarPoliza(infoPolizaDTO);
            response.sendRedirect("Home.jsp");
        } catch (Exception e) {
            sesion.setAttribute("msgError", "Error al ingresar la póliza");
            response.sendRedirect("ingresoPoliza.jsp");
        }
    }


}
