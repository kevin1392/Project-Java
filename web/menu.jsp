<%-- 
    Document   : menu
    Created on : 16/05/2016, 03:39:42 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
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
                background-color: #3f5384;
                color: #0000FF;
                text-decoration: none;
                padding: 10px 30px;
                display: block;
                fontsize:60;
                
            }
             body{
                font-family:Verdana, Arial, sans-serif;
                font-size:smaller; 
                padding: 2px;
                color: #808000;
                background-image:url("viaja.jpeg");
                background-repeat:repeat;
              
            }

            <%-- DAR FORMA AL MENU  --%>
            .nav > li{
                float: left;

            }
            <%-- MAS ESTILO  --%>
            .nav li a:hover{
                background-color: #FFFF00;
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
    <center><h1>SISTEMA DE INFORMACION</h1></center>
        <div id="header">
            <ul class="nav">
                <li><a href=""><h4>Archivo</h4></a>
                    <ul>
                        <li><a href="">Abrir</a></li>
                        <li><a href="">Guardar</a></li>
                        <li><a href="">Guardar_Como</a></li>
                        <li><a href="login.jsp">Salir</a>
                        
                    </ul>
                <li><a href=""><h4>Procesamiento</h4></a>
                    <ul>
                        <li><a href="">Presupuesto</a></li>
                        <li><a href="costo.jsp">Tesoreria</a></li>
                        <li><a href="">Patrimonio</a></li>
                        <li><a href="">Estadistica</a>
                            <ul>
                                <li><a href="">Morbilidad</a></li>
                                <li><a href="">Mortalidad</a></li>
                                <li><a href="">Incidencia</a></li>
                                <li><a href="">Prevalencia</a>
                                    <ul>
                                        <li><a href="">Sarampion</a></li>
                                        <li><a href="">Brucelosis</a></li>
                                        <li><a href="">Tuberculosis</a></li>
                                        <li><a href="">Malaria</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li><a href=""><h4>Reporte</h4></a>
                    <ul>
                        <li><a href="">Estadistica</a></li>
                        <li><a href="">Logistica</a></li>
                        <li><a href="">Economia</a></li>
                        <li><a href="">Presupuesto</a></li>
                        <form action="datos.jsp" method="Post"></form>
                    </ul>

                <li><a href=""><h4>Herramientas</h4></a>
                    <ul>
                        <li><a href="">Sps</a></li>
                        <li><a href="">Hoja_Calculo</a></li>
                        <li><a href="">EpiInfo</a></li>
                        <li><a href="">Graficadores</a>
                    </ul>
                <li><a href=""><h4>Mantenimiento</h4></a>
                    <ul>
                        <li><a href="">Mensual</a></li>
                        <li><a href="">Trimestral</a></li>
                        <li><a href="">Semestral</a></li>
                        <li><a href="">Anual</a>
                    </ul>
                <li><a href="agencia/indice.jsp"><h4>Viaja</h4></a>
                   

            </ul>
        </div>
    </body>

</html>
