package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JOptionPane;

public final class promedio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>REGISTRO DEL ALUMNO</h1>\n");
      out.write("        ");

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
