<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="shop.SignupDao" %>
<%@ page import="java.io.PrintWriter" %>
<%
	request.setCharacterEncoding("UTF-8");
	
	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	
	System.out.println(userId);
	System.out.println(userPw);
	
	SignupDao signupDao =new SignupDao();
	int res = signupDao.userDelete(userId, userPw);
	
	if(res==1){
		System.out.println("삭제성공");
		response.sendRedirect("index.jsp");
		
		
	}
	else{
		System.out.println("삭제실패");
		PrintWriter w = response.getWriter();
		w.println("<script> history.go(-1) </script>");
	}
%>