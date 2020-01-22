package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Codigo_Java.Controlador;

public final class Inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://framework-gb.cdn.gob.mx/qa/assets/styles/main.css\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link href=\"Css/mi-slider.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Css/Barramenu.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Css/Inicio.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"JavaScrip/jquery.nivo.slider.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Inicio</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div >\n");
      out.write("            <script src=\"JavaScrip/barramenu1.js\" type=\"text/javascript\"></script>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"slider-wrapper theme-mi-slider\" >\n");
      out.write("            <div id=\"slider\" class=\"nivoSlider\">     \n");
      out.write("                ");
      out.print( Controlador.getVistaInicioBanner());
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"convocatorias\">   \n");
      out.write("\n");
      out.write("            <div class=\"container\" style=\"background: \" >\n");
      out.write("                <section class=\"card-container\"> \n");
      out.write("                    ");
      out.print(Controlador.getVistaInicioConvocatorias());
      out.write("\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <h3>No te lo pierdas</h3>\n");
      out.write("                <hr class=\"red\">\n");
      out.write("\n");
      out.write("                <section class=\"card-container\">\n");
      out.write("                   ");
      out.print(Controlador.getVistaInicioavisos());
      out.write("\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"overlay\" id=\"overlay\">\n");
      out.write("                    <div class=\"popup\" id=\"popup\">\n");
      out.write("                        <a  class=\"btn-cerrar-popup\" onclick=\"cerrar();\"><i class=\"fas fa-times\" id=\"eventoclic\"> X </i></a>\n");
      out.write("                        <form action=\"\">\n");
      out.write("                            <embed  height=\"450\" width=\"100%\" name=\"embed_content\" id=\"pdf12\" src=\"\" type=\"application/pdf\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("        <script src=\"JavaScrip/popup.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://framework-gb.cdn.gob.mx/qa/gobmx.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
