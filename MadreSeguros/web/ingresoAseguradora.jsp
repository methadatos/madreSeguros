<%-- 
    Document   : ingresoAseguradora
    Created on : 15-nov-2016, 23:14:05
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso aseguradora</title>
    </head>
    <body>
        <fieldset>
            <form name="formularioIngresoAseguradora" method="post" action="./agregarAseguradora">
                <table>
                    <tr>
                        <td>RUT</td>
                        <td><input type="text" name="txtRut"/></td>
                    </tr>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombre"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="btnGuardar" value="Guardar"/></td>
                        <td><input type="reset" name="btnCancelar" value="Cancelar" onclick="window.location.href='Home.jsp'"/></td>
                    </tr>
                </table>
            </form>
        </fieldset>
    </body>
</html>
