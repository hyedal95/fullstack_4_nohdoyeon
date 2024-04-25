<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="doyeon.SignupDTO" %>
<%@ page import="doyeon.UserDAO" %>

<%
	request.setCharacterEncoding("utf-8");

	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	String userNick = request.getParameter("userNick");
	
	SignupDTO signupDTO = new SignupDTO();
	
	signupDTO.setUserId(userId);
	signupDTO.setUserPw(userPw);
	signupDTO.setUserNick(userNick);
	
	UserDAO userDAO = new UserDAO();
	
	int res = userDAO.userInsert(signupDTO);
	
	System.out.println( res ); 
	

%>