package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Operacion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<HTML>\n");
      out.write("<HEAD>\n");
      out.write("    <TITLE>Calculadora   con   Servlet</TITLE>\n");
      out.write("</HEAD>\n");
      out.write("\n");
      out.write("<BODY       BGCOLOR   =   \"#E0FFE0\"         TEXT=   \"green\"   LINK=\"blue\"   VLINK=\"brown\">\n");
      out.write("\n");
      out.write("<CENTER>\n");
      out.write("    <HR   style   =   \"color:green;   heigth:6px;   width:500\">\n");
      out.write("    <FONT   size   =   5>   CALCULADORA   </FONT>\n");
      out.write("    <HR   style   =   \"color:green;   heigth:6px;   width:500\">\n");
      out.write("    <BR>\n");
      out.write("    <BR>\n");
      out.write("\n");
      out.write("    <FORM   action=Calcular   method=\"POST\">\n");
      out.write("            <TABLE       border   =   \"3\"    WIDTH   =   \"400\"   >\n");
      out.write("            <TR>\n");
      out.write("                <TD   aling   =   \"rigth\">   <INPUT   name=\"operando1\"   type=\"text\">\n");
      out.write("                </TD>\n");
      out.write("                <TD>   <SELECT   name=\"operacion\">\n");
      out.write("                        <OPTION   value=   \"1\"   selected   >&nbsp;&nbsp;+\n");
      out.write("                            &nbsp;&nbsp;</OPTION>\n");
      out.write("                        <OPTION   value=   \"2\"   >&nbsp;&nbsp;   -\n");
      out.write("                            &nbsp;&nbsp;</OPTION>\n");
      out.write("                        <OPTION   value=   \"3\"   >&nbsp;&nbsp;   *\n");
      out.write("                            &nbsp;&nbsp;</OPTION>\n");
      out.write("                        <OPTION   value=   \"4\"   >&nbsp;&nbsp;   /\n");
      out.write("                            &nbsp;&nbsp;</OPTION>\n");
      out.write("                    </SELECT>\n");
      out.write("                <TD   aling   =   \"rigth\">   <INPUT   name=\"operando2\"             type=   \"text\">\n");
      out.write("                </TD>\n");
      out.write("            </TR>\n");
      out.write("        </TABLE>\n");
      out.write("        <BR>\n");
      out.write("        <BR>\n");
      out.write("        <input   name=\"Calcular\"   value=\"Calcular\"   type=\"submit\">\n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <input   name=\"limpiar\"   value=\"Limpiar\"   type=\"reset\">\n");
      out.write("    </FORM>\n");
      out.write("</CENTER>\n");
      out.write("</BODY>\n");
      out.write("</HTML>\n");
      out.write("\n");
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
