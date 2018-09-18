package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../styles/main.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Management</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <p>User\n");
      out.write("            <a href=\"\">Logout</a>\n");
      out.write("        </p>\n");
      out.write("        <h1>Product</h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <form class=\"productForm\">\n");
      out.write("            <label class=\"productFormLabel\">Code:</label> <input  id=\"productFormTextArea\" class=\"productFormInput\" type=\"text\" name=\"code\"><br>\n");
      out.write("            <label class=\"productFormLabel productFormLabelDescription\">Description:</label> <textarea class=\"productFormInput\" rows=\"2\" cols=\"20\"></textarea><br>\n");
      out.write("            <label class=\"productFormLabel\">Price:</label> <input class=\"productFormInput productFormLabelPrice\" type=\"text\" name=\"code\"><br>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        <button id=\"productUpdateButton\" class=\"productButtons\" type=\"button\">Update Product</button><button class=\"productButtons\" type=\"button\">View Products</button>\n");
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
