<%-- 
    Document   : ingresoPoliza
    Created on : 15-nov-2016, 23:16:54
    Author     : Nicolas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso Poliza</title>
    </head>
    <body>
        
        <jsp:include page="/cargarAseguradora" flush="true"/>
        <jsp:include page="/cargarClaseSeguro" flush="true"/>
        <jsp:useBean id="aseguradora" class="duoc.cl.madreSeguros.entitys.Aseguradora"/>
        <jsp:useBean id="claseSeguro" class="duoc.cl.madreSeguros.entitys.ClaseSeguro"/>
        
        <fieldset>
            <form name="formularioIngresoPoliza" method="post" action="/agregarPoliza">
                <table>
                    <tr>
                        <td>Número póliza</td>
                        <td><input type="text" name="txtNumeroPoliza" required=""/></td>
                    </tr>
                    <tr>
                        <td>Fecha Emisión</td>
                        <td><input type="date" name="txtFechaEmision" required=""/></td>
                    </tr>
                    <tr>
                        <td>Fecha Vencimiento</td>
                        <td><input type="date" name="txtFechaVencimiento" required=""/></td>
                    </tr>
                    <tr>
                        <td>Aseguradora</td>
                        <td>
                            <select name="txtIdAseguradora">
                                <c:forEach items="${sessionScope.listadoAseguradora}" var="aseguradora">
                                    <option value="${aseguradora.idAseguradora}"><c:out value="${aseguradora.nombre}"/></option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Clase seguro</td>
                        <td>
                            <select name="txtIdClaseSeguro">
                                <c:forEach items="${sessionScope.listadoClaseSeguro}" var="claseSeguro">
                                    <option value="${claseSeguro.idclaseSeguro}"><c:out value="${claseSeguro.nombreClase}"/></option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                </table>
            </form>
        </fieldset>
    </body>
</html>
