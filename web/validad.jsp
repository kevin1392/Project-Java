<%-- 
    Document   : validad
    Created on : 17/05/2016, 02:08:36 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            String s_nombre;
            String s_clave;
            
        %>
    </head>
    <body>
        
        <%
            s_nombre=request.getParameter("f_nombre");
            s_clave=request.getParameter("f_clave");
            if(s_nombre.equals("san") && s_clave.equals("123")){
                response.sendRedirect("menu.jsp");
            
            }
            else
            {
                response.sendRedirect("ingresar.jsp");
           
            }
        %>    
            
    </body>
</html>
