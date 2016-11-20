<%-- 
    Document   : Home
    Created on : 15-nov-2016, 23:13:48
    Author     : Nicolas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
    <c:choose>
        <c:when test="${sessionScope.usuarioConectado==null}">
            <jsp:forward page="Login.jsp"/>
        </c:when>
        
        <c:otherwise>
            <jsp:useBean id="usuarioConectado" class="duoc.cl.madreSeguros.dto.UsuarioDTO" scope="session"/>
            Hola: <c:out value="${usuarioConectado.usuario.nombre}"/><br/>
            <a href="ingresoAseguradora.jsp">Ingresar aseguradora</a><br/>
            <a href="ingresoClaseSeguro.jsp">Ingresar clase seguro</a><br/>
            
            
        </c:otherwise>
    </c:choose>
    </body>
</html>
