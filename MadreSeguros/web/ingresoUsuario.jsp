<%-- 
    Document   : ingresoUsuario
    Created on : 15-nov-2016, 23:18:31
    Author     : Nicolas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Usuario</title>
    </head>
    <body>
        <jsp:include page="/cargarPerfilUsuario" flush="true"/>
        <jsp:useBean id="perfil" class="duoc.cl.madreSeguros.entitys.Perfil" scope="page"/>
        <fieldset><legend>Registrar usuario</legend>
            <form name="ingresarUsuario" method="post" action="./ingresarUsuario">
                <table>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombre"/></td>
                    </tr>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="txtUsername"/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="txtPassword"/></td>
                    </tr>
                    <tr>
                        <td>Perfil</td>
                        <td>
                            <select name="txtPerfil">
                                <option>----Seleccionar----</option>
                                <c:forEach items="${sessionScope.listadoPerfiles}" var="perfil">
                                    <option value="${perfil.idperfil}"><c:out value="${perfil.nombre}"/></option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    
                    <tr>
                        <td><input type="submit" name="btnGuardar" value="Registrar"></td>
                        <td><input type="reset" name="btnCancelar" value="Cancelar" onclick="window.location.href='Login.jsp'"/></td>
                    </tr>
                    
                </table>
            </form>
        </fieldset>
    </body>
</html>
