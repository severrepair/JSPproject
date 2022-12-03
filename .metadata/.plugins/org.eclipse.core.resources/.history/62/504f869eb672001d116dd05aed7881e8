<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page language="java" import="java.sql.*,java.util.*, java.text.* " %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쇼핑하기</title>
</head>
<SCRIPT language="javascript">
	function view(temp){
		if (temp.length>0){
			url = "http://localhost:8080/jsp/chap12/upload/" + temp;
			window.open(url, "win","height=350,width=450,toolbar=0,menubar=0,scrollbars=1,resizable=1,status=0");
		}
	}
</SCRIPT>

<body>
<p align=center>
	<FONT color=#0000ff face=굴림 size=3>
		<STRONG>쇼핑하기</STRONG>
	</FONT>
</p>

<FORM method=post name=search action="shop_list.jsp">
<TABLE border=0 width=95%>
	<TR>
		<TH align=rigth>
			<FONT size=-1>상품명으로 찾기</FONT>
			<INPUT type=text name=pname>
			<INPUT type=submit value="검색">
		</TH>
	</TR>
	<TR>
		<TH>
			<FONT size=-1>
				[<A href="/Shop/main.html">메인으로</A>]
				<A href="shop_list.jsp?cat=11">가구</A>
				<A href="shop_list.jsp?cat=22">전기/전자</A>
				<A href="shop_list.jsp?cat=33">부엌용품</A>
				<A href="shop_list.jsp?cat=44">의류</A>
				<A href="shop_list.jsp?cat=55">보석 및 악세사리</A>
				<A href="shop_list.jsp?cat=66">헬스 기구</A>
				<A href="shop_list.jsp?cat=77">컴퓨터 관련</A>
				<A href="shop_list.jsp?cat=88">기타</A>
			</FONT>
		</TH>
	</TR>
	
</TABLE>
</FORM>

<CENTER>
<TABLE width=95% style="font-size:10pt">
<%
	String cond= "";
	String ca= "";
	String pn= "";
	
	if(request.getParameter("cat") !=null){
		if(!(request.getParameter("cat").equals(""))){
			ca=request.getParameter("cat");
			cond="where category='" + ca + "'";
		}
	}
	
	if(request.getParameter("paname") !=null){
		if(!(request.getParameter("pname").equals(""))){
			pn=request.getParameter("pname");
			cond="where pname like '%" + pn + "%'";
		}
	}
	
	Vector pname=new Vector();
	Vector sname=new Vector();
	Vector keyid=new Vector();
	Vector price=new Vector();
	Vector dprice=new Vector();
	Vector stock=new Vector();
	Vector small=new Vector();
	Vector large=new Vector();
	Vector description=new Vector();

	String url = "http://localhost:8080/jsp/chap12/upload/";
	
	
%>

</CENTER>




</body>
</html>