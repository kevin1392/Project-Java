<%-- 
    Document   : tutoria
    Created on : 24/05/2016, 08:14:16 AM
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
        <h1 align="center">
            <font face="Arial">CONECTAR UNA TUTORIA</font></h1>
        <form action="tutorias" method="Post">
            <font face="Arial">Alumno:</font><br>
            <input type="text" name="alumno" size="60">
            <br><br><font face="Arial">Con el Profesor:</font>
            <br><select size="1" name="profesor">
                <option>Javier Sevallos Sierra</option>
                <option>Cesar Valverde Poma</option>
                <option>Juan Evaristo Cruz</option>
                <option>Felipe Sosa Palermo</option>
                <option>German Diaz Pajuelo</option>
            </select><br><br><font face="Arial">Dia:</font><br>
            <select name="dia">
                <option>Lunes<option>Martes<option>Miercoles<option>Jueves<option>Viernes
            </select>
            <br><br><font face="Arial">Hora:</font>&nbsp;&nbsp;&nbsp;
            <font face="Arial">10</font>
            <input type="radio" name="hora" value="12" checked>
            &nbsp;&nbsp;&nbsp;
            <font face="Arial">12</font>
            <input type="radio" name="hora" value="14" checked>
            &nbsp;&nbsp;&nbsp;
            <font face="Arial">16</font>
            <input type="radio" name="hora" value="16" checked>
            &nbsp;&nbsp;&nbsp;
            <font face="Arial">18</font>
            <input type="radio" name="hora" value="18" checked>
            &nbsp;&nbsp;&nbsp;
            <br><br><font face="Arial">Asunto:</font><br>
            <textarea name="asunto" rows="5" cols="40" wrap></textarea>
            <br><br><input type="submit" value="Enviar_Datos">
            &nbsp;&nbsp;<input type="reset">
        </form>

    </body>
</html>
