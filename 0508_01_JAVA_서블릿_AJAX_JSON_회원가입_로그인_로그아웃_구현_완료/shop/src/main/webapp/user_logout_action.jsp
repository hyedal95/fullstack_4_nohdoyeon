<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// 로그아웃
	session.invalidate();
	response.sendRedirect("index.jsp"); //홈으로
%>
<!-- 
<script>
	location.href='index.jsp'; //홈으로 이동
</script>
 -->