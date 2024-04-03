<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 뷰 탬플릿 표현식 & 변수</title>
</head>
<body>
	
	
	<%	// 자바 코딩 => 마무리 ; 필수!! 
		/* 자바스크립트 서버 페이지 작성 */
		String str1 = "자바(JAVA)";
		String str2 = "웹서버페이지(Web Server Page)";
		
	%>
	<div class="title">
		<h1>JSP 선언문 예제 변수 선언</h1>
		<h2>자바 뷰 탬플릿 표현식</h2>
		<h3><%= str1 %></h3>    <%-- 변수를 가져올 때, <%= %> 구조를 사용한다. --%>
		<h3><%= str2 %></h3>    <%-- 변수를 가져올 때, <%= %> 구조를 사용한다. --%>
	</div>
	
	<style>

		.title{
			text-align:center;
		}
		h1{
			color:#00f;
		}
		h3{
			color:#09c;
		}
	</style>
	
	<!-- http://localhost:8080/jsp/jsp01_표현식_뷰탬플릿_변수.jsp -->
	
</body>
</html>