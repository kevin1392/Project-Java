package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("         ");
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
      out.write("                background-color: #00FFFF;\n");
      out.write("                color: #0000FF;\n");
      out.write("                text-decoration: none;\n");
      out.write("                padding: 10px 30px;\n");
      out.write("                display: block;\n");
      out.write("              \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("             body{\n");
      out.write("                font-family:Verdana, Arial, sans-serif;\n");
      out.write("                font-size:smaller; \n");
      out.write("                padding: 2px;\n");
      out.write("                color: #808000;\n");
      out.write("                background-image:url(\"hoja.jpg\");\n");
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
      out.write("                background-color: #FF0000;\n");
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
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("         <center>\n");
      out.write("            <form action=\"validad.jsp\" method=\"Post\">\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    \n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Nombre</td>\n");
      out.write("                            <td><input class=\"username-text\" type=\"text\" name=\"f_nombre\" value=\"\" placeholder=\"ingrese usuario\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Password</td>\n");
      out.write("                            <td><input class=\"password-text\" type=\"password\" name=\"f_clave\" value=\"\" placeholder=\"ingrese clave\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" value=\"Enviar\" /></td>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("               \n");
      out.write("            </form>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
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
