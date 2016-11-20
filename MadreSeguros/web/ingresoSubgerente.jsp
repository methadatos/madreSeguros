<%-- 
    Document   : ingresoSubgerente
    Created on : 15-nov-2016, 23:17:49
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar subgerente</title>
    </head>
    <body>
        <fieldset>
            <form name="formularioIngresoSubgerente" method="post" action="./agregarSubgerente">
                <table>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombreSubgerente" required=""/></td>
                    </tr>
                    <tr>
                        <td>Zona</td>
                        <td><input type="text" name="txtZona" required=""/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="btnGuardar" value="Guardar"/></td>
                        <td><input type="reset" name="btnCancelar" value="Cancelar" onclick="window.location.href='Home.jsp'"></td>
                    </tr>
                </table>
            </form>
        </fieldset>
    </body>
</html>
