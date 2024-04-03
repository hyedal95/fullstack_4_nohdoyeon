<%-- <%@page import="org.apache.jasper.tagplugins.jstl.core.Out"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%	//<% => JAVA변수만 선언			:지역변수
		String id = "doyeon";
		String pw = "doyeon1234";
	%>
	<%! 
		//<%! => JAVA 변수와 메서드 선언 	: 전역변수
		String id2 = "babo";
		public String getId(){
			return id2;
		}
		
		String pw2 = "babo1234";
		public String getPw(){
			return pw2;
		}
	%>
	
	<%
		out.println("<h1>JSP 내용 출력 테스트</h1>");
		out.println("<h2>아이디:" + id + "</h2>");
		out.println("<h2>아이디:" + id2 + "</h2>");
		out.println("<h2>비밀번호:" + pw + "</h2>");
		out.println("<h2>비밀번호:" + pw2 + "</h2>");
	%>
	
	<h1>JSP 내용 출력 테스트</h1>
	<h2>아이디:<%=id %></h2>
	<h2>비밀번호:<%=pw %></h2>
	
	
	<h1>JSP 메서드 실행</h1>
	<h2>아이디2 : <%= getId()%></h2>
	<h2>비밀번호2 : <%= getPw()%></h2>
	
	<style>

		body{
			text-align:center;
		}
		h2{
			color:#00f;
		}
	</style>
	
	<!-- http://localhost:8080/jsp/jsp02_변수_메서드_표현식.jsp -->
	
</body>
</html>