/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2022-12-03 07:38:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.text.*;

public final class order_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("java.text");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
 request.setCharacterEncoding("UTF-8"); 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>????????? ??????</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("[<A href=\"shop_list.jsp\">?????? ????????????</A>]\r\n");

	String sql =null;
	Connection con = null;
	Statement st1 = null;
	Statement st2 = null;
	ResultSet rs1 = null;
	ResultSet rs2 = null;
	
	int count=0;
	int price=0;
	int qty=0;
	String cond ="";
	long id=0;
	
	if(request.getParameter("id")!=null){
		id = Long.parseLong(request.getParameter("id"));
		cond = "where id=" + id ;
	}else
		cond="order by id desc " ;
	
	NumberFormat nf = NumberFormat.getNumberInstance();
	String totalstr="";
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		out.println(e);
	}
	/* DB???????????? */
	try {
		con = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC", "root",
		"1234");
	}catch(SQLException e){
		out.println(e);
	}
	
	try{
		st1 = con.createStatement();
		st2 = con.createStatement();
		
		sql = "select * from saleorder " +cond;
		rs1 = st1.executeQuery(sql);
		
		if(!(rs1.next()))
			out.println("?????? ????????? ????????????.");
		else{
			do{
				totalstr = nf.format(rs1.getLong("total"));
				count = rs1.getInt("prodcount");
				id=rs1.getLong("id");
				out.println("<TABLE width=500 border=0");
				out.println("<TR><TH colspan=2 bgcolor=003399>");
				out.println("<FONT color=white>?????? ?????????</FONT></TH></TR>");
				out.println("<TR><TD width=20% bgcolor=eeeeee>");
				out.println("?????? ??????</TD>");
				out.println("<TD bgcolor=eeeeee>" + id+ "</TD></TR>");
				out.println("<TR><TD width=20% bgcolor=eeeeee>");
				out.println("?????? ??????</TD>");
				out.println("<TD bgcolor=eeeeee>"+rs1.getString("orderdate")+"</TD></TR>");
				out.println("<TR><TD bgcolor=eeeeee>?????? ??????</TD>");
				out.println("<TD bgcolor=eeeeee>" + rs1.getString("name")+"</TD></TR>");
				out.println("<TR><TD bgcolor=eeeeee>?????? ??????</TD>");
				out.println("<TD bgcolor=eeeeee>");
				out.println(rs1.getString("pay")+"("+rs1.getString("cardno")+")");
				out.println("</TD></TR>");
				out.println("<TR><TD bgcolor=eeeeee>????????????</TD>");
				out.println("<TD bgcolor=eeeeee>"+rs1.getString("addr")+"</TD></TR>");
				out.println("<TR><TD bgcolor=eeeeee>????????????</TD>");
				out.println("<TD bgcolor=eeeeee>"+rs1.getString("tel"));
				out.println("</TD></TR></TABLE>");
				sql = "select * from item where orderid= " + id+"order by mynum ";
				rs2 = st2.executeQuery(sql);
				
				if(rs2.next()){
					out.println("<TABLE width=500 border=0>");
					out.println("<TR><TH colspan=2 bgcolor=0033cc>");
					out.println("<FONT color=white>?????? ??????</FONT></TH>");
					out.println("<TH bgcolor=0033cc>");
					out.println("<FONT color=white>?????? ??????</FONT></TH>");
					out.println("<TH bgcolor=0033cc>");
					out.println("<FONT color=white>?????? ??????</FONT></TH>");
					out.println("<TH bgcolor=0033cc>");
					out.println("<FONT color=white>????????????</FONT></TH>");
					out.println("<TH bgcolor=0033cc>");
					out.println("<FONT color=white>????????????*??????</FONT></TH></TR>");
					
					do{
						qty=rs2.getInt("quantity");
						price=rs2.getInt("price");
						
						out.println("<TR><TH width=5% bgcolor=0033cc>");
						out.println("<FONT color=white>"+ rs2.getInt("mynum"));
						out.println("</FONT></TH>");
						out.println("<TD width=15% bgcolor=eeeeee");
						out.println(rs2.getLong("prodid")+"</TD>");
						out.println("<TD width=100 bgcolor=eeeeee");
						out.println(rs2.getString("pname")+"</TD>");
						out.println("<TD align=right bgcolor=eeeeee>" + qty + "</TD>");
						out.println("<TD align=right bgcolor=eeeeee>");
						out.println(nf.format(price)+"</TD>");
						out.println("<TD align=right bgcolor=eeeeee>");
						out.println(nf.format(price*qty)+"</TD></TR>");
					} while(rs2.next());
						out.println("<TR><TD align=rigth colspan=6>");
						out.println("?????? ??????:" + count+ "??????&nbsp; ????????????:" + totalstr+"???");
						out.println("</TD></TR></TABLE><BR>");
				}
			}while(rs1.next());
		}
		st1.close();
		st2.close();
		con.close();
	}catch (SQLException e){
		out.println(e);	
	}

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
