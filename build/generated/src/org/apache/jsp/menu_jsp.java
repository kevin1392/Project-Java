package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Menu</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            * {\n");
      out.write("                padding:0px;\n");
      out.write("                margin:Opx;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            #header{\n");
      out.write("                margin:auto;\n");
      out.write("                width:800px;\n");
      out.write("                font-family: Arial, Helvetica,sans-serif;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            ");
      out.write("\n");
      out.write("            ul, ol{\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("            ");
      out.write("\n");
      out.write("            .nav li a {\n");
      out.write("                background-color: #3f5384;\n");
      out.write("                color: #0000FF;\n");
      out.write("                text-decoration: none;\n");
      out.write("                padding: 10px 30px;\n");
      out.write("                display: block;\n");
      out.write("                fontsize:60;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("             body{\n");
      out.write("                font-family:Verdana, Arial, sans-serif;\n");
      out.write("                font-size:smaller; \n");
      out.write("                padding: 2px;\n");
      out.write("                color: #808000;\n");
      out.write("                background-image:url(\"viaja.jpeg\");\n");
      out.write("                background-repeat:repeat;\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            .nav > li{\n");
      out.write("                float: left;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            ");
      out.write("\n");
      out.write("            .nav li a:hover{\n");
      out.write("                background-color: #FFFF00;\n");
      out.write("            }\n");
      out.write("            ");
      out.write("\n");
      out.write("            .nav li ul {\n");
      out.write("                display:none;\n");
      out.write("                position: absolute;\n");
      out.write("                min-width: 140px;\n");
      out.write("            }\n");
      out.write("            ");
      out.write("\n");
      out.write("            .nav li:hover > ul {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("            ");
      out.write("\n");
      out.write("            .nav li ul li {\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            ");
      out.write("\n");
      out.write("            .nav li ul li ul {\n");
      out.write("                right:-140px;\n");
      out.write("                top:0px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("    <center><h1>SISTEMA DE INFORMACION</h1></center>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("                <li><a href=\"\"><h4>Archivo</h4></a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\">Abrir</a></li>\n");
      out.write("                        <li><a href=\"\">Guardar</a></li>\n");
      out.write("                        <li><a href=\"\">Guardar_Como</a></li>\n");
      out.write("                        <li><a href=\"login.jsp\">Salir</a>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                <li><a href=\"\"><h4>Procesamiento</h4></a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\">Presupuesto</a></li>\n");
      out.write("                        <li><a href=\"costo.jsp\">Tesoreria</a></li>\n");
      out.write("                        <li><a href=\"\">Patrimonio</a></li>\n");
      out.write("                        <li><a href=\"\">Estadistica</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"\">Morbilidad</a></li>\n");
      out.write("                                <li><a href=\"\">Mortalidad</a></li>\n");
      out.write("                                <li><a href=\"\">Incidencia</a></li>\n");
      out.write("                                <li><a href=\"\">Prevalencia</a>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"\">Sarampion</a></li>\n");
      out.write("                                        <li><a href=\"\">Brucelosis</a></li>\n");
      out.write("                                        <li><a href=\"\">Tuberculosis</a></li>\n");
      out.write("                                        <li><a href=\"\">Malaria</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"\"><h4>Reporte</h4></a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\">Estadistica</a></li>\n");
      out.write("                        <li><a href=\"\">Logistica</a></li>\n");
      out.write("                        <li><a href=\"\">Economia</a></li>\n");
      out.write("                        <li><a href=\"\">Presupuesto</a></li>\n");
      out.write("                        <form action=\"datos.jsp\" method=\"Post\"></form>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                <li><a href=\"\"><h4>Herramientas</h4></a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\">Sps</a></li>\n");
      out.write("                        <li><a href=\"\">Hoja_Calculo</a></li>\n");
      out.write("                        <li><a href=\"\">EpiInfo</a></li>\n");
      out.write("                        <li><a href=\"\">Graficadores</a>\n");
      out.write("                    </ul>\n");
      out.write("                <li><a href=\"\"><h4>Mantenimiento</h4></a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\">Mensual</a></li>\n");
      out.write("                        <li><a href=\"\">Trimestral</a></li>\n");
      out.write("                        <li><a href=\"\">Semestral</a></li>\n");
      out.write("                        <li><a href=\"\">Anual</a>\n");
      out.write("                    </ul>\n");
      out.write("                <li><a href=\"agencia/indice.jsp\"><h4>Viaja</h4></a>\n");
      out.write("                   \n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
