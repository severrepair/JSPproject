/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2022-12-02 06:38:50 UTC
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

public final class product_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("<title>상품 목록</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<P align=center>\r\n");
      out.write("<FONT color=#0000ff face=굴림 size=+1>\r\n");
      out.write("<STRONG>상품 목록</STRONG>\r\n");
      out.write("</FONT>\r\n");
      out.write("</P>\r\n");
      out.write("\r\n");
      out.write("<FORM method=post name=search action=\"/Shop/product_list.jsp\">\r\n");
      out.write("<TABLE border=0 width=95%>\r\n");
      out.write("	<TR>\r\n");
      out.write("		<TD align=right>\r\n");
      out.write("			<FONT size=-1>상품명으로 찾기</FONT>\r\n");
      out.write("			<INPUT type=text name=pname>\r\n");
      out.write("			<INPUT type=submit value=\"검색\">\r\n");
      out.write("		</TD>\r\n");
      out.write("	</TR>\r\n");
      out.write("	<TR>\r\n");
      out.write("		<TH>\r\n");
      out.write("			<FONT size=-1>\r\n");
      out.write("				[<A href=\"/Shop/main.html\">메인으로</A>]\r\n");
      out.write("				<A href=\"product_list.jsp?cat=11\">가구</A>-\r\n");
      out.write("				<A href=\"product_list.jsp?cat=22\">전기/전자</A>-\r\n");
      out.write("				<A href=\"product_list.jsp?cat=33\">부엌용품</A>-\r\n");
      out.write("				<A href=\"product_list.jsp?cat=44\">의류</A>-\r\n");
      out.write("				<A href=\"product_list.jsp?cat=55\">보석 및 악세사리</A>-\r\n");
      out.write("				<A href=\"product_list.jsp?cat=66\">헬스 기구</A>-\r\n");
      out.write("				<A href=\"product_list.jsp?cat=77\">컴퓨터 관련</A>-\r\n");
      out.write("				<A href=\"product_list.jsp?cat=88\">기타</A>\r\n");
      out.write("			</FONT>\r\n");
      out.write("		</TH>\r\n");
      out.write("	</TR>	\r\n");
      out.write("</TABLE>\r\n");
      out.write("</FORM>\r\n");
      out.write("\r\n");
      out.write("<CENTER>\r\n");
      out.write("<TABLE border=0 width=95% cellpadding=4 cellspacing=4 style=\" font-size:10pt\">\r\n");
      out.write("	<TR>\r\n");
      out.write("		<TH width=5% bgcolor=#DFEDFF>\r\n");
      out.write("			<FONT color=black face=굴림>\r\n");
      out.write("				<NOBR>번호</NOBR>\r\n");
      out.write("			</FONT>\r\n");
      out.write("		</TH>\r\n");
      out.write("		<TH width=25% bgcolor=#DFEDFF>\r\n");
      out.write("			<FONT color=black face=굴림>\r\n");
      out.write("				<NOBR>상품명</NOBR>\r\n");
      out.write("			</FONT>\r\n");
      out.write("		</TH>\r\n");
      out.write("		<TH width=10% bgcolor=#DFEDFF>\r\n");
      out.write("			<FONT color=black face=굴림>\r\n");
      out.write("				<NOBR>코드번호</NOBR>\r\n");
      out.write("			</FONT>\r\n");
      out.write("		</TH>\r\n");
      out.write("		<TH width=15% bgcolor=#DFEDFF>\r\n");
      out.write("			<FONT color=black face=굴림>\r\n");
      out.write("				<NOBR>제조원</NOBR>\r\n");
      out.write("			</FONT>\r\n");
      out.write("		</TH>\r\n");
      out.write("		<TH width=10% bgcolor=#DFEDFF>\r\n");
      out.write("			<FONT color=black face=굴림>\r\n");
      out.write("				<NOBR>판매시작일</NOBR>\r\n");
      out.write("			</FONT>\r\n");
      out.write("		</TH>\r\n");
      out.write("		<TH width=10% bgcolor=#DFEDFF>\r\n");
      out.write("			<FONT color=black face=굴림>\r\n");
      out.write("				<NOBR>판매가(원)</NOBR>\r\n");
      out.write("			</FONT>\r\n");
      out.write("		</TH>\r\n");
      out.write("		<TH width=10% bgcolor=#DFEDFF>\r\n");
      out.write("			<FONT color=black face=굴림>\r\n");
      out.write("				<NOBR>재고량</NOBR>\r\n");
      out.write("			</FONT>\r\n");
      out.write("		</TH>\r\n");
      out.write("		<TH width=15% bgcolor=#DFEDFF>\r\n");
      out.write("			<FONT color=black face=굴림>\r\n");
      out.write("				<NOBR>분류</NOBR>\r\n");
      out.write("			</FONT>\r\n");
      out.write("		</TH>\r\n");
      out.write("	</TR>\r\n");

	String cond = "";
	String ca = "";
	String pn = "";
	
	if (request.getParameter("cat") !=null ) {
		if(!(request.getParameter("cat").equals(""))){
			ca=request.getParameter("cat");
			cond=" where category = '" + ca + "'";
		}
	}
	
	if (request.getParameter("pname") !=null){
		if(!(request.getParameter("pname").equals("")) ){
			pn=request.getParameter("pname");
			cond=" where pname like '%" + pn + "%'";
		}
	}
	
	Vector pname = new Vector();
	Vector sname = new Vector();
	Vector keyid = new Vector();
	Vector cat = new Vector();
	Vector dprice = new Vector();
	Vector inputdate = new Vector();
	Vector stock = new Vector();
	String category = null;
	
	long id=0;
	
	NumberFormat nf = NumberFormat.getInstance();
	String downprice = null;
	
	int where = 1;
	int totalgroup = 0;
	int maxpages = 2;
	int startpage = 1;
	int endpage=startpage+maxpages-1;
	int wheregroup = 1;
	if (request.getParameter("go") !=null) {
		where = Integer.parseInt(request.getParameter("go"));
		wheregroup = (where-1)/maxpages + 1;
		startpage=(wheregroup-1) * maxpages + 1;
		endpage=startpage + maxpages-1;
	} else if (request.getParameter("gogroup") !=null){
		wheregroup = Integer.parseInt(request.getParameter("gogroup"));
		startpage = (wheregroup-1) * maxpages + 1;
		where = startpage ;
		endpage=startpage+maxpages-1;
	}
	int nextgroup=wheregroup+1;
	int priorgroup=wheregroup-1;
	
	int startrow=0;
	int endrow=0;
	int maxrows=5;
	int totalrows=0;
	int totalpages=0;
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e){
		out.println(e);
	}
	/* DB연결부분 */
	try{
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC","root","1234");
	} catch (SQLException e) {
		out.println(e);
	}
	
	try {
		st = con.createStatement();
		String sql = "select * from product ";
		sql += cond + "order by id ";
		rs = st.executeQuery(sql);
		if (!(rs.next())) {
			out.println("상품이 없습니다");
		}else{
			do{
				keyid.addElement(new Long(rs.getLong("id")));
				cat.addElement(rs.getString("category"));
				pname.addElement(rs.getString("pname"));
				sname.addElement(rs.getString("sname"));
				dprice.addElement(new Integer(rs.getInt("downprice")));
				String idate = rs.getString("inputdate");
				idate = idate.substring(0,8);
				inputdate.addElement(idate);
				stock.addElement(new Integer(rs.getInt("stock")));
			} while(rs.next());
			totalrows = pname.size();
			totalpages = (totalrows-1)/maxrows +1;
			startrow = (where-1) * maxrows;
			endrow = startrow + maxrows-1;
			if(endrow>=totalrows)
				endrow = totalrows-1;
			totalgroup = (totalpages-1)/maxpages +1;
			if(endpage > totalpages)
				endpage=totalpages;
			for(int j=startrow;j<=endrow;j++){
				id= ( (Long)keyid.elementAt(j) ).longValue();
				downprice = nf.format( ((Integer)dprice.elementAt(j)).intValue() );
				switch ( Integer.parseInt((String)cat.elementAt(j)) ){
				case 11:
					category="가구";
					break;
				case 22:
					category="전기/전자";
					break;
				case 33:
					category="부엌용품";
					break;
				case 44:
					category="의류";
					break;
				case 55:
					category="보석 및 악세사리";
					break;
				case 66:
					category="헬스기구";
					break;
				case 77:
					category="컴퓨터관련";
					break;
				case 88:
					category="기타";
					break;
					default:
					break;
				}
				out.println("<TR>");
				out.println("<TH width=5% bgcolor=#eeeeee>");
				out.println(j+1+"</TH>");
				out.println("<TD width=25% bgcolor=#eeeeee>");
				out.println("<A href=\"product_read.jsp?id=" + id + "&go="+ where );
				out.println("&cat=" + ca + "&pname=" + pn + "\">"+pname.elementAt(j));
				out.println("</A></TD>");
				out.println("<TD width=10% bgcolor=#eeeeee>");
				out.println(id + "</TD>");
				out.println("<TD width=15% bgcolor=#eeeeee>");
				out.println(sname.elementAt(j) + "</TD>");
				out.println("<TD width=10% bgcolor=#eeeeee>");
				out.println(inputdate.elementAt(j) + "</TD>");
				out.println("<TD width=10% bgcolor=#eeeeee align=right>");
				out.println(downprice + "</TD>");
				out.println("<TD width=10% bgcolor=#eeeeee align=right>");
				out.println(stock.elementAt(j)+ "</TD>");
				out.println("<TD width=15% bgcolor=#eeeeee>");
				out.println(category + "</TD>");
				out.println("</TR>");
			}
			rs.close();
		}
		out.println("</TABLE>");
		st.close();
		con.close();
	}catch (SQLException e){
		out.println(e);
	}
	if(wheregroup > 1){
		out.print("[<A href=\"product_list.jsp?gogroup=1]");
		out.print("&cat=" + ca + "&pname=" + pn + "\">처음</A>]");
		out.print("[<A href=\"product_list.jsp?gogroip=" + priorgroup);
		out.print("&cat=" + ca + "&pname=" + pn + "\">이전</A>]");
	}else{
		out.println("[처음]") ;
		out.println("[이전]") ;
	}
	
	if(totalrows !=0){
		for(int jj=startpage; jj<=endpage; jj++){
			if(jj==where)
				out.println("[" + jj + "]");
			else{
				out.print("[<A href=\"product_list.jsp?go="+jj) ;
				out.print("&cat=" + ca +" &pname=" + pn + "\">" + jj + "</A>]");
			}
		}
	}
	
	if(wheregroup < totalgroup){
		out.print("[<A href=\"product_read.jsp?gogroup=" + nextgroup);
		out.print("&cat=" + ca +" &pname=" + pn +"\">다음</A>]");
		out.print("[<A href=\"product_list.jsp?gogroup=" + totalgroup);
		out.print("&cat=" + ca +"&pname=" + pn + "\">마지막</A>]");
	}else{
		out.println("[다음]");
		out.println("[마지막]");
	}
	out.println("전체상품수:" + totalrows);

      out.write("\r\n");
      out.write("\r\n");
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