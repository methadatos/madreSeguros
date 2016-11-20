<%-- 
    Document   : ingresoFile
    Created on : 15-nov-2016, 23:15:37
    Author     : Nicolas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso File</title>
    </head>
    <body>
        
        <jsp:include page="/cargarRegion" flush="true"/>
        <jsp:include page="/cargarUbicacion" flush="true"/>
        <jsp:include page="/cargarPlataforma" flush="true"/>
        <jsp:include page="/cargarDistribuidor" flush="true"/>
        <jsp:include page="/cargarSubgerente" flush="true"/>
        <jsp:include page="/cargarJefeZonal" flush="true"/>
        <jsp:useBean id="region" class="duoc.cl.madreSeguros.entitys.Region"/>
        <jsp:useBean id="ubicacion" class="duoc.cl.madreSeguros.entitys.Ubicacion"/>
        <jsp:useBean id="plataforma" class="duoc.cl.madreSeguros.entitys.Plataforma"/>
        <jsp:useBean id="distribuidor" class="duoc.cl.madreSeguros.entitys.Distribuidor"/>
        <jsp:useBean id="subgerente" class="duoc.cl.madreSeguros.entitys.Subgerente"/>
        <jsp:useBean id="jefeZonal" class="duoc.cl.madreSeguros.entitys.JefeZonal"/>
        
        <fieldset>
            <form name="formularioIngresoFile" method="post" action="./agregarFile">
                <table> 
                    <tr>
                        <td>File</td>
                        <td><input type="text" name="txtNumeroFile" required=""></td>
                    </tr>
                    
                    <tr>
                        <td>Dirección</td>
                        <td><input type="text" name="txtDireccion" required=""></td>
                    </tr>
                    <tr>
                        <td>Region</td>
                        <td>
                            <select name="txtIdRegion">
                                <c:forEach items="${sessionScope.listadoRegiones}" var="region">
                                    <option value="${region.idregion}"><c:out value="${region.nombreRegion}"/></option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Ubicación</td>
                        <td>
                            <select name="txtIdUbicacion">
                                <c:forEach items="${sessionScope.listadoUbicaciones}" var="ubicacion">
                                    <option value="${ubicacion.idubicacion}"><c:out value="${ubicacion.ubicacion}"/></option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Plataforma</td>
                        <td>
                            <select name="txtIdPlataforma">
                                <c:forEach items="${sessionScope.listadoPlataforma}" var="plataforma">
                                    <option value="${plataforma.idplataforma}"><c:out value="${plataforma.plataforma}"/></option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Distribuidor</td>
                        <td>
                            <select name="txtIdDistribuidor">
                                <c:forEach items="${sessionScope.listadoDistribuidor}" var="distribuidor">
                                    <option value="${distribuidor.iddistribuidor}"><c:out value="${distribuidor.nombre}"/></option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Subgerente</td>
                        <td>
                            <select name="txtIdSubgerente">
                                <c:forEach items="${sessionScope.listadoSubgerente}" var="subgerente">
                                    <option value="${subgerente.idsubgerente}"><c:out value="${subgerente.nombre}"/></option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Jefe Zonal</td>
                        <td>
                            <select name="txtIdJefeZonal">
                                <c:forEach items="${sessionScope.listadoJefeZonal}" var="jefeZonal">
                                    <option value="${jefeZonal.idjefeZonal}"><c:out value="${jefeZonal.nombre}"/></option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                </table>
            </form>
        </fieldset>
    </body>
</html>
