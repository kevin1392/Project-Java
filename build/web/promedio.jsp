<%-- 
    Document   : promedio
    Created on : 24/05/2016, 02:52:12 PM
    Author     : user
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>REGISTRO DEL ALUMNO</h1>
        <%
            JOptionPane.showMessageDialog(null,"CODIGO  :"+request.getParameter("cod")+"\n"+"NOMBRE  :"+request.getParameter("nom")+"\n"+
                    "ALGORITMO  :"+request.getParameter("alg")+"\n"+"INTRODUCC  :"+request.getParameter("ing")+"\n"+
                    "MATEMATICAS  :"+request.getParameter("mat")+"\n"+"FISICA  :"+request.getParameter("fi")+"\n"+
                    "INVESTIGACION  :"+request.getParameter("inv")+"\n"+"PROMEDIO"+request.getParameter("prom"));
            
            
            out.print("CODIGO DEL ALUMNO :"+request.getParameter("cod")+"<p>");
            out.print("NOMBRE DEL ALUMNO :"+request.getParameter("nom")+"<p>");
            out.print("ALGORITMO DE DATOS:"+request.getParameter("alg")+"<p>");
            out.print("INTROD. INGENIERIA:"+request.getParameter("ing")+"<p>");
            out.print("MATEMATICAS       :"+request.getParameter("mat")+"<p>");
            out.print("FISICO            :"+request.getParameter("fi")+"<p>");
            out.print("INVESTIGACION     :"+request.getParameter("inv")+"<p>");
          
            
            //datos calculados
            double n1,n2,n3,n4,n5, prom;
            n1=0;
            n2=0;
            n3=0;
            n4=0;
            n5=0;
            prom=0;
            //boni=15;
            n1=Double.parseDouble(request.getParameter("alg"));
            n2=Double.parseDouble(request.getParameter("ing"));
            n3=Double.parseDouble(request.getParameter("mat"));
            n4=Double.parseDouble(request.getParameter("fi"));
            n5=Double.parseDouble(request.getParameter("inv"));
            prom=Double.parseDouble(request.getParameter("pro"));
            
            prom=(n1+n2+n3+n4+n5)/5;
            out.print("PROMEDIO: "+prom+"<p>");
            //out.print("SUELDO POR DIA : "+su+"<p>");
            //out.print("SUELDO TOTAL : "+r+"<p>");
           // out.print("BONIFICACION : "+b+"<p>");
            %>
    </body>
</html>
