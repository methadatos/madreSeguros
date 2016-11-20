<%-- 
    Document   : reporteSiniestros
    Created on : 20-nov-2016, 12:56:42
    Author     : Nicolas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte siniestro</title>
    </head>
    <body>
        <jsp:include page="/cargarSiniestro" flush="true"/>
        <jsp:useBean id="siniestro" class="duoc.cl.madreSeguros.entitys.Siniestro"/>
        <table border="1">
            <thead>
                <tr>
                    <th>Numero siniestro</th>
                    <th>Póliza</th>
                    <th>Numero file</th>
                    <th>Monto</th>
                    <th>Fecha siniestro</th>
                    <th>Fecha reclamacion</th>
                    <th>Liquidador</th>
                    <th>Usuario</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${sessionScope.listadoSiniestro}" var="siniestro">
                <tr>
                    <td><c:out value="${siniestro.montoSiniestro}"/></td>
                    <td><c:out value="${siniestro.polizanumeropoliza.claseSeguroIdclaseSeguro.nombreClase}"/></td>
                    <td><c:out value="${siniestro.fileNumeroFile.distribuidorIddistribuidor}"/></td>
                    <td><c:out value="${siniestro.montoSiniestro}"/></td>
                    <td><c:out value="${siniestro.fechaSiniestro}"/></td>
                    <td><c:out value="${siniestro.fechaReclamacion}"/></td>
                    <td><c:out value="${siniestro.liquidadorIdliquidador.nombre}"/></td>
                    <td><c:out value="${siniestro.usuarioidUsuario.nombre}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table><br/>
        <button name="btnAtras" onclick="window.location.href='Home.jsp'">Atrás</button>

    </body>
</html>
