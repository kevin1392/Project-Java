package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tutoria_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\">\n");
      out.write("            <font face=\"Arial\">CONECTAR UNA TUTORIA</font></h1>\n");
      out.write("        <form action=\"tutorias.java\" method=\"Post\">\n");
      out.write("            <font face=\"Arial\">Alumno:</font><br>\n");
      out.write("            <input type=\"text\" name=\"alumno\" size=\"60\">\n");
      out.write("            <br><br><font face=\"Arial\">Con el Profesor:</font>\n");
      out.write("            <br><select size=\"1\" name=\"profesor\">\n");
      out.write("                <option>Javier Sevallos Sierra</option>\n");
      out.write("                <option>Cesar Valverde Poma</option>\n");
      out.write("                <option>Juan Evaristo Cruz</option>\n");
      out.write("                <option>Felipe Sosa Palermo</option>\n");
      out.write("                <option>German Diaz Pajuelo</option>\n");
      out.write("            </select><br><br><font face=\"Arial\">Dia:</font><br>\n");
      out.write("            <select name=\"dia\">\n");
      out.write("                <option>Lunes<option>Martes<option>Miercoles<option>Jueves<option>Viernes\n");
      out.write("            </select>\n");
      out.write("            <br><br><font face=\"Arial\">Hora:</font>&nbsp;&nbsp;&nbsp;\n");
      out.write("            <font face=\"Arial\">10</font>\n");
      out.write("            <input type=\"radio\" name=\"hora\" value=\"12\" checked>\n");
      out.write("            &nbsp;&nbsp;&nbsp;\n");
      out.write("            <font face=\"Arial\">12</font>\n");
      out.write("            <input type=\"radio\" name=\"hora\" value=\"14\" checked>\n");
      out.write("            &nbsp;&nbsp;&nbsp;\n");
      out.write("            <font face=\"Arial\">16</font>\n");
      out.write("            <input type=\"radio\" name=\"hora\" value=\"16\" checked>\n");
      out.write("            &nbsp;&nbsp;&nbsp;\n");
      out.write("            <font face=\"Arial\">18</font>\n");
      out.write("            <input type=\"radio\" name=\"hora\" value=\"18\" checked>\n");
      out.write("            &nbsp;&nbsp;&nbsp;\n");
      out.write("            <br><br><font face=\"Arial\">Asunto:</font><br>\n");
      out.write("            <textarea name=\"asunto\" rows=\"5\" cols=\"40\" wrap></textarea>\n");
      out.write("            <br><br><input type=\"submit\" value=\"Enviar_Datos\">\n");
      out.write("            &nbsp;&nbsp;<input type=\"reset\">\n");
      out.write("        </form>\n");
      out.write("\n");
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
