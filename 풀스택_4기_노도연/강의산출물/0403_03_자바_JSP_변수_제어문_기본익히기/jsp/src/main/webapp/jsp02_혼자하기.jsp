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
		<% // java변수만 선언 =지역변수
			String name ="뇨됴됵";
			int age = 30;
		%>
		
		<%! // java변수와 메서드 선언 =전역변수
			String name2 ="뇨됴됵";
			public String getName(){
				return name2;
			}
			int age2 = 30;
			public int getAge(){
				return age2;
			}
		%>
		
		<%
			out.println("<h1>JSP 내용 출력 테스트 </h1>");
			out.println("<h2>이름:" + name + " </h2>");
			out.println("<h2>나이:" + age + " </h2>");
			out.println("<h2>이름:" + name2 + " </h2>");
			out.println("<h2>나이:" + age2 + " </h2>");
			
		%>
		
		<h1>JAVA변수만 선언 =지역변수</h1>
		<h2>이름 : <%=name %></h2>
		<h2>나이 : <%=age %></h2>
		
		<h1>JAVA 변수와 메서드 선언 =전역변수</h1>
		<h2>이름 : <%=getName() %></h2>
		<h2>나이 : <%=getAge() %></h2>
		
		
		
	</div>
	<style>
	
	#wrap{
		text-align:center;
	}
	</style>
	
</body>
</html>