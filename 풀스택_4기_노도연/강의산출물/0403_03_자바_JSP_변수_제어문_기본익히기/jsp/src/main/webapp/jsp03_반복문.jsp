<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div id="wrap">
		<h1> 분식메뉴 배열선언 반복문</h1>
		<ol>
			<%
				String[] menu = {"떡볶이","순대","오뎅","튀김","쫄면"};
				
				for(int i =0; i<menu.length; i++){
					out.println("<li>"+ menu[i] + "</li>");
				}
			
			%>
		</ol>
	</div>
	
	<style>
		#wrap{
			text-align:center;
		}
		ol{ 
			display:inline-block;
		}
	</style>
	
	<!-- http://localhost:8080/jsp/jsp03_반복문.jsp -->
</body>
</html>