<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String h1 ="JSP 선언문 예제 변수 선언";
		String h2 ="자바 뷰 탬플릿 표현식";
		String str1 = "JSP";
		String str2 = "자바웹서버톰켓컨테이너";
	%>
	
	<div id="wrap">
		<h1><%=h1 %> </h1>
		<h2><%=h2 %></h2>
		<h3><%= str1 %> </h3>
		<h3><%= str2 %> </h3>
	</div>
	
	<style>
		#wrap{
		text-align:center;
		}
		h1{
		color:#00f;
		}
		
		
	
	</style>
	<!-- http://localhost:8080/jsp/jsp01_혼자하기.jsp -->
</body>
</html>