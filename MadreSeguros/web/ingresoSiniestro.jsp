<%-- 
    Document   : ingresoSiniestro
    Created on : 15-nov-2016, 23:17:36
    Author     : Nicolas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar siniestro</title>
    </head>
    <body>
        <jsp:include page="/cargarPolizaServlet" flush="true"/>
        <jsp:include page="/cargarTipoSiniestro" flush="true/>"/>
        <jsp:include page="/cargarLiquidador" flush="true"/>
        <jsp:include page="/cargarFile" flush="true"/>
        <jsp:useBean id="poliza" class="duoc.cl.madreSeguros.entitys.Poliza"/>
        <jsp:useBean id="tipoSiniestro" class="duoc.cl.madreSeguros.entitys.TipoSiniestro"/>
        <jsp:useBean id="liquidador" class="duoc.cl.madreSeguros.entitys.Liquidador"/>
        <jsp:useBean id="file" class="duoc.cl.madreSeguros.entitys.File"/>
        <jsp:useBean id="usuario" class="duoc.cl.madreSeguros.entitys.Usuario"/>
        
        <form>
            <table>
                <tr>
                    <td>Numero siniestro</td>
                    <td><input type="text" name="txtNumeroSiniestro" required=""/></td>
                </tr>
                <tr>
                    <td>Monto siniestro</td>
                    <td><input type="text" name="txtMontoSiniestro" required=""/></td>
                </tr>
                <tr>
                    <td>Observación</td>
                    <td><input type="text" name="txtObservacion" required=""/></td>
                </tr>
                <tr>
                    <td>Fecha siniestro</td>
                    <td><input type="date" name="txtFechaSiniestro"/></td>
                </tr>
                <tr>
                    <td>Fecha reclamación</td>
                    <td><input type="date" name="txtFechaReclamacion"/></td>
                </tr>
                <tr>
                    <td>Póliza</td>
                    <td>
                        <select name="txtIdPoliza">
                            <c:forEach items="${sessionScope.listadoPoliza}" var="poliza">
                                <option value="${poliza.numeroPoliza}"><c:out value="${poliza.claseSeguroIdclaseSeguro.nombreClase}"/></option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Tipo siniestro</td>
                    <td>
                        <select name="txtIdTipoSiniestro">
                            <c:forEach items="${sessionScope.listadoTipoSiniestro}" var="poliza">
                                <option value="${tipoSiniestro.idtipoSiniestro}"><c:out value="${tipoSiniestro.categoria}"/></option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Liquidador</td>
                    <td>
                        <select name="txtIdLiquidador">
                            <c:forEach items="${sessionScope.listadoLiquidador}" var="liquidador">
                                <option value="${liquidador.idliquidador}"><c:out value="${liquidador.nombre}"/></option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>File</td>
                    <td>
                        <select name="txtIdFile">
                            <c:forEach items="${sessionScope.listadoFiles}" var="file">
                                <option value="${file.numeroFile}"><c:out value="${file.numeroFile}"/></option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Usuario</td>
                    <td>
                        <select name="txtIdUsuario">
                            <option value="${sessionScope.usuarioConectado}"><c:out value="${usuario.nombre}"/></option>
                        </select>
                    </td>
                </tr>
                
                <tr>
                    <td><input type="submit" name="btnGuardar" value="Guardar"/></td>
                    <td><input type="button" name="btnCancelar" value="Cancelar" onclick="window.location.href='Home.jsp'"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
