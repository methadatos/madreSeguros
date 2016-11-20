<%-- 
    Document   : ingresoDistribuidor
    Created on : 15-nov-2016, 23:15:24
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar distribuidor</title>
    </head>
    <body>
        <fieldset>
            <form name="formularioIngresoDistribuidor" method="post" action="./agregarDistribuidor">
                <table>
                    <tr>
                        <td>RUT</td>
                        <td><input type="text" name="txtRut" required=""/></td>
                    </tr>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombre" required=""/></td>
                    </tr>
                    <tr>
                        <td>Numero contacto</td>
                        <td><input type="text" name="txtNumeroContacto" required=""/></td>
                    </tr>
                    <tr>
                        <td>Correo</td>
                        <td><input type="text" name="txtCorreo" required=""/></td>
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
