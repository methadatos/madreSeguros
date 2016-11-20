/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.presentacion;

import duoc.cl.madreSeguros.dto.FileDTO;
import duoc.cl.madreSeguros.dto.JefeZonalDTO;
import duoc.cl.madreSeguros.persistencia.FileSessionBean;
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
@WebServlet(name = "AgregarFileServlet", urlPatterns = {"/agregarFileServlet","/agregarFile"})
public class AgregarFileServlet extends HttpServlet {

    @EJB
    private FileSessionBean fileSessionBean;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion=request.getSession();
            int numeroFile=Integer.parseInt(request.getParameter("txtNumeroFile"));
            int region=Integer.parseInt(request.getParameter("txtIdRegion"));
            String direccion=request.getParameter("txtDireccion");
            int idUbicacion=Integer.parseInt(request.getParameter("txtIdUbicacion"));
            int idPlataforma=Integer.parseInt(request.getParameter("txtIdPlataforma"));
            int idDistribuidor=Integer.parseInt(request.getParameter("txtIdDistribuidor"));
            int idSubgerente=Integer.parseInt(request.getParameter("txtIdSubgerente"));
            int idJefeZonal=Integer.parseInt(request.getParameter("txtIdJefeZonal"));
            FileDTO infoFileDTO=new FileDTO(numeroFile, region, direccion, idUbicacion, idPlataforma, idDistribuidor, idSubgerente, idJefeZonal);
            try {
                this.fileSessionBean.agregarFile(infoFileDTO);
                response.sendRedirect("Home.jsp");
        } catch (Exception e) {
            sesion.setAttribute("msgError", "Error en el ingreso del file");
            response.sendRedirect("ingresoFile.jsp");
        }
    }


}
