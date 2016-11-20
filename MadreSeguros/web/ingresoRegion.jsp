<%-- 
    Document   : ingresoRegion
    Created on : 15-nov-2016, 23:17:22
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar region</title>
    </head>
    <body>
        <fieldset>
            <form name="formularioIngresoRegion" method="post" action="./agregarRegion">
                <table>
                    <tr>
                        <td>Nombre región</td>
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
