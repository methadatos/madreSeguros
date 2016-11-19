<%-- 
    Document   : Login
    Created on : 15-nov-2016, 23:13:40
    Author     : Nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Usuario</title>
    </head>
    <body>
        <fieldset>
            <form name="formularioIngreso" method="post" action="./validarUsuario">
                <table>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="txtUsername"/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="text" name="txtPassword"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="btnIngresar" value="Ingresar"/></td>
                        <td><input type="reset" name="btnLimpiar" value="Limpiar"/></td>
                    </tr>
                </table>
            </form>
            <button name="btnRegistrar" onclick="window.location.href='ingresoUsuario.jsp'">Registrar Usuario</button>
        </fieldset>
    </body>
</html>
