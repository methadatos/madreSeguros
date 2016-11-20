<%-- 
    Document   : ingresoUbicacion
    Created on : 15-nov-2016, 23:18:20
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso ubicaciñon</title>
    </head>
    <body>
        <fieldset><legend>Ingreso de ubicación</legend>
            <form name="formularioIngresoUbicacion" method="post" action="/agregarUbicacion">
                <table>
                    <tr>
                        <td>Ingreso nombre ubicación</td>
                        <td><input type="text" name="txtNombre"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="btnGuardar" value="Agregar"/></td>
                        <td><input type="reset" name="btnCancelar" value="Cancelar" onclick="window.location.href='Home.jsp'"/></td>
                    </tr>
                </table>

            </form>

        </fieldset>
    </body>
</html>
