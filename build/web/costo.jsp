<%-- 
    Document   : costo
    Created on : 24/05/2016, 12:46:56 PM
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
        <h1>Sistema de Costo</h1>
        <form action="calcular.jsp" method="Post">
            NOMBRE
            <input type="text" name="nom" value=""/><p>
                CARGO
            <input type="text" name="car" value=""/><p>
                BONIFIC
            <input type="text" name="bn" value=""/><p>
                Nº DIAS 
            <input type="text" name="d" value=""/><p>
                POR DIA
            <input type="text" name="s" value=""/><p>
            <input type="submit" value="Calcular"/><p>
        </form>
    </body>
</html>
