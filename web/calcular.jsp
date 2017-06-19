<%-- 
    Document   : calcular
    Created on : 24/05/2016, 12:48:38 PM
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
        <h1>DATOS DEL EMPLEADO</h1>
        <%
            out.print("Nombre:"+request.getParameter("nom")+"<p>");
            out.print("Cargo:"+request.getParameter("car")+"<p>");
          
            
            //datos calculados
            double d1, su, r,b;
            d1=0;
            su=0;
            b=0;
            r=0;
            //boni=15;
            d1=Double.parseDouble(request.getParameter("d"));
            su=Double.parseDouble(request.getParameter("s"));
            b=Double.parseDouble(request.getParameter("bn"));
            r=(d1*su)*b/100+(d1*su);
            out.print("Dias Trabajados: "+d1+"<p>");
            out.print("Sueldo por Dia : "+su+"<p>");
            out.print("Sueldo Toral : "+r+"<p>");
           // out.print("BONIFICACION : "+b+"<p>");
            %>
    </body>
</html>
