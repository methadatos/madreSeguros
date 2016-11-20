<%-- 
    Document   : ingresoClaseSeguro
    Created on : 15-nov-2016, 23:14:48
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar clase seguro</title>
    </head>
    <body>
        <fieldset><legend>Ingresar clase seguro</legend>
            <form name="formularioIngresoClaseSeguro" method="post" action="">
                <table>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombre" required=""/></td>
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
