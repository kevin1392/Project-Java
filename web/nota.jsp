<%-- 
    Document   : nota
    Created on : 24/05/2016, 02:51:52 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>REGISTRO DE NOTAS</h1>

        <form action="promedio.jsp" method="Post">
            <table border="1">
                <tbody>
                    <tr>
                        <td>Codigo</td>
                        <td><input type="text" name="cod" value="" /></td>
                    </tr>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="nom" value="" /></td>
                    </tr>
                    <tr>
                        <td>Algorimo de Datos</td>
                        <td><input type="text" name="alg" value="" /></td>
                    </tr>
                    <tr>
                        <td>Introduccion a Ingenieria</td>
                        <td><input type="text" name="ing" value="" /></td>
                    </tr>
                    <tr>
                        <td>Matematicas</td>
                        <td><input type="text" name="mat" value="" /></td>
                    </tr>
                    <tr>
                        <td>Fisica</td>
                        <td><input type="text" name="fi" value="" /></td>
                    </tr>
                    <tr>
                        <td>Investigacion</td>
                        <td><input type="text" name="inv" value="" /></td>
                    </tr>

                    <tr>
                        <td><input type="submit" value="Calcular_Promedio" /></td>

                <tbody>
            </table>
        </form>
    </body>
</html>
