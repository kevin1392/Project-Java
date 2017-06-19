<%-- 
    Document   : informacion
    Created on : 10-may-2017, 4:23:31
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

         <link href="css/agency.min.css" rel="stylesheet">
         <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body id="page-top" class="index">
        <!--<h1>Datos del  Viajero</h1>
        <%
            out.print("Nombre      : "+request.getParameter("nombre")+"<p>");
            out.print("Correo      : "+request.getParameter("correo")+"<p>");
            out.print("Telefono  : "+request.getParameter("telefono")+"<p>");
            out.print("Origen      : "+request.getParameter("origen")+"<p>");
            out.print("Destino    : "+request.getParameter("destino")+"<p>");
            
           
          
            %>
            <h2> <% out.print("Nombre      : "+request.getParameter("nombre")+"<p>");  %></h2>-->
    
    
    <header>
        <div class="container">
            <div class="intro-text">
                <div class="intro-lead-in">
                    <h1 >Datos</h1>
                    <h2 style=" font-family:Arial; font-size:18px;"><% out.print("Nombre      : "+request.getParameter("nombre")+"<p>");  %></h2>
                      <h2 style=" font-family:Arial; font-size:18px;">  <% out.print("Correo      : "+request.getParameter("correo")+"<p>");  %></h2>
                         <h2 style=" font-family:Arial; font-size:18px;">   <% out.print("Telefono      : "+request.getParameter("telefono")+"<p>");  %></h2>
                           <h2 style=" font-family:Arial; font-size:18px;">     <% out.print("Origen      : "+request.getParameter("origen")+"<p>");  %>
                    </h2>
                    <h2 style=" font-family:Arial; font-size:18px;"><% out.print("Destino      : "+request.getParameter("destino")+"<p>");  %></h2>
                </div>
                <div class="intro-heading"></div>
                
            </div>
        </div>
    </header>
    </body>
</html>
