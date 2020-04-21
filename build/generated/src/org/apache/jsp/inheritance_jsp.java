package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inheritance_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");

  if(request.getParameter("tx") != null){
      session.setAttribute("tx", request.getParameter("tx"));
  }  
    

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Inheritance</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.css\">\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/b99e675b62.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <style>\r\n");
      out.write("            *{\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            input[type=text], select, textarea{\r\n");
      out.write("                width: 80%;\r\n");
      out.write("                padding: 12px;\r\n");
      out.write("                border: 1px solid #ccc;\r\n");
      out.write("                border-radius: 4px;\r\n");
      out.write("                resize: vertical;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            input[type=submit]{\r\n");
      out.write("                background-color: #4CAF50;\r\n");
      out.write("                color: white;\r\n");
      out.write("                padding: 12px 20px;\r\n");
      out.write("                border: none;\r\n");
      out.write("                border-radius: 4px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                float: right;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <div class=\"sidebar\">\r\n");
      out.write("                <h2>CDE SOLUTIONS</h2>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"fas fa-home\"></i>HOME</a></li>\r\n");
      out.write("                    <li><a href=\"size.jsp\"><i class=\"fas fa-size\"></i>SIZE</a></li>\r\n");
      out.write("                    <li><a href=\"method.jsp\"><i class=\"fas fa-method\"></i>METHOD</a></li>\r\n");
      out.write("                    <li><a href=\"variable.jsp\"><i class=\"fas fa-variable\"></i>VARIABLE</a></li>\r\n");
      out.write("                    <li><a href=\"inheritance.jsp\"><i class=\"fas fa-inheritance\"></i>INHERITANCE</a></li>\r\n");
      out.write("                    <li><a href=\"coupling.jsp\"><i class=\"fas fa-coupling\"></i>COUPLING</a></li>\r\n");
      out.write("                    <li><a href=\"control.jsp\"><i class=\"fas fa-structure\"></i>CONTROL STRUCTURE</a></li>\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"fas fa-total\"></i>TOTAL</a></li>\r\n");
      out.write("                    <li><a href=\"login.jsp\"><i class=\"fas fa-total\"></i>Logout</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div class=\"social_media\">\r\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-fb\"></i></a>\r\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-twit\"></i></a>\r\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-insta\"></i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                    \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"result1\">\r\n");
      out.write("            <div style=\"margin-left: 25%; padding: 1px 16px;height: 1000px;\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <h3>Choose File to upload </h3>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <form action=\"FileUploadHandler\" enctype=\"multipart/form-data\" method=\"post\">\r\n");
      out.write("                            Select<input type=\"file\" name=\"file_name\"/>\r\n");
      out.write("                            <input type=\"submit\" value=\"upload\"/>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <form method=\"post\" action=\"index.jsp\">\r\n");
      out.write("                        <textarea name=\"tx\" placeholder=\"Write Something...\" style=\"height: 200px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope[\"message\"]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("                        \r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <button type=\"save\" onclick=\"alert('successful!')\">SAVE</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>    \r\n");
      out.write("                        <a href=\"resultinheritance.jsp\"><input name=\"btnsum2\" type=\"submit\" value=\"next\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
