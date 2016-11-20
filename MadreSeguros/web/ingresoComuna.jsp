<%-- 
    Document   : ingresoComuna
    Created on : 15-nov-2016, 23:15:08
    Author     : Nicolas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso comuna</title>
    </head>
    <body>
        <jsp:include page="/cargarRegion" flush="true"/>
        <jsp:useBean id="region" class="duoc.cl.madreSeguros.entitys.Region" scope="session"/>
        
        <fieldset>
            <form name="FormularioIngresoComuna" method="post" action="./agregarComuna">
                <table>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombreRegion" required=""/></td>
                    </tr>
                    <tr>
                        <td>Región</td>
                        <td>
                            <select name="txtIdRegion">
                                <c:forEach items="${sessionScope.listadoRegiones}" var="region">
                                    <option value="${region.idregion}"><c:out value="${region.nombreRegion}"/></option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                </table>
            </form>
        </fieldset>
</html>
