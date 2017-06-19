<%-- 
    Document   : login
    Created on : 17/05/2016, 02:08:18 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <%-- CREAR ESTILOS     --%>
        <style type="text/css">
            * {
                padding:0px;
                margin:Opx;
            }
           

            <%-- CREAR ETIQUETAS  --%>
            #header{
                margin:auto;
                width:800px;
                font-family: Arial, Helvetica,sans-serif;

            }
            
            <%-- REGLAS, QUE NO TENGA ESTILO  --%>
            ul, ol{
                list-style: none;
            }
            <%-- CREAR ESTILOS PARA EL MENU  --%>
            .nav li a {
                background-color: #00FFFF;
                color: #0000FF;
                text-decoration: none;
                padding: 10px 30px;
                display: block;
              
                
            }
             body{
                font-family:Verdana, Arial, sans-serif;
                font-size:smaller; 
                padding: 2px;
                color: #808000;
                background-image:url("hoja.jpg");
                background-repeat:repeat;
              
            }

            <%-- DAR FORMA AL MENU  --%>
            .nav > li{
                float: left;

            }
            <%-- MAS ESTILO  --%>
            .nav li a:hover{
                background-color: #FF0000;
            }
            <%-- PARA DESAPARECER LOS SUB MENUS  --%>
            .nav li ul {
                display:none;
                position: absolute;
                min-width: 140px;
            }
            <%-- REGLAS, PARA Q APARESCA CADA Q EL MOUSE PASE  --%>
            .nav li:hover > ul {
                display: block;
            }
            <%-- PARA CAMBIAR POSICION DEL SUB MENU  --%>
            .nav li ul li {
                position: relative;
            }
            <%-- PROPIEDAD CAMBIO DE POSICION DEL SUB MENU  --%>
            .nav li ul li ul {
                right:-140px;
                top:0px;
            }

        </style>
    </head>
    <body>
        <h1>Hello World!</h1>
         <center>
            <form action="validad.jsp" method="Post">
                <table border="1">
                    
                    <tbody>
                        <tr>
                            <td>Nombre</td>
                            <td><input class="username-text" type="text" name="f_nombre" value="" placeholder="ingrese usuario" /></td>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><input class="password-text" type="password" name="f_clave" value="" placeholder="ingrese clave" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Enviar" /></td>
                            
                        </tr>
                    </tbody>
                </table>

               
            </form>
        </center>
    </body>
</html>
