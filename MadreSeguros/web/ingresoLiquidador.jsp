<%-- 
    Document   : ingresoLiquidador
    Created on : 15-nov-2016, 23:16:04
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso liquidador</title>
    </head>
    <body>
        <fieldset><legend>Ingreso liquidador</legend>
            <form name="formRegistroLiquidador" method="post" action="./ingresoLiquidador">
                <table>
                    <tr>
                        <td>Rut</td>
                        <td><input type="text" name="txtRut" placeholder="Ingrese el rut" required=""/></td>
                    </tr>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombre" placeholder="Ingrese el nombre" required=""/></td>
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
