<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<header id="header">
	<a href="http://localhost:8080/kurly/index.jsp?Page=main.jsp">HOME</a>
	<a href="?Page=sub1.jsp">서브1</a>
	<a href="?Page=sub2.jsp">서브2</a>
	<a href="?Page=sub3.jsp">서브3</a>
	<a href="?Page=sub4.jsp">서브4</a>
	<a href="?Page=signup.jsp">회원가입</a>
	<a href="?Page=signin.jsp">로그인</a>
	<a href="?Page=notice_list.jsp">공지사항</a>
	<!-- 쿼리스트링은 ? 안 쓰고 서블릿 url 패턴 입력해주면된다. -->
	<a href="cartActionServlet.do">장바구니</a>

</header>