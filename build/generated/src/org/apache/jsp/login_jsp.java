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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/log.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Play\">\r\n");
      out.write("           \r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("        <div class=\"signin\">\r\n");
      out.write("            <form name=\"form\" method=\"post\" action=\"LoginServlet\" onsubmit=\"return validate()\">\r\n");
      out.write("                <h2 style=\"color: #fff;\">Log In</h2>\r\n");
      out.write("                <input type=\"text\" name=\"uname\" placeholder=\"Username\" required><br /><br />\r\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Password\" required><br /><br />\r\n");
      out.write("                \r\n");
      out.write("                  <input type=\"submit\" value=\"Log In\" /><br /><br />\r\n");
      out.write("                <div id=\"container\">\r\n");
      out.write("                    <a href=\"reset.jsp\" style=\"margin-right: 0px; font-size: 13px; font-family: Tahoma, Geneva, sans-serif;\">Reset Password</a>\r\n");
      out.write("                    <a href=\"forget.jsp\" style=\"margin-left: 30px; font-size: 13px; font-family: Tahoma, Geneva, sans-serif;\">Forget Password</a>\r\n");
      out.write("                </div><br /><br /><br /><br /><br /><br />\r\n");
      out.write("                Don't have account?<a href=\"signup.jsp\" style=\"font-family:'Play',sans-serif;\">&nbsp;Sign Up</a>\r\n");
      out.write("            </form>\r\n");
      out.write("                \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function validate(){\r\n");
      out.write("                \r\n");
      out.write("                var uname = document.form.uname.value;\r\n");
      out.write("                var password = document.form.password.value;\r\n");
      out.write("                \r\n");
      out.write("                if(uname == \"\" || uname == null){\r\n");
      out.write("                    alert(\"Username cannot be blank\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                else if(password == \"\" || password == null){\r\n");
      out.write("                    alert(\"Password cannot be blank\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("              \r\n");
      out.write("    \r\n");
      out.write("\r\n");
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
