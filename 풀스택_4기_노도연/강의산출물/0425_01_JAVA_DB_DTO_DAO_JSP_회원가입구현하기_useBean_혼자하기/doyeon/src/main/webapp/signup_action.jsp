<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="doyeon.UserDAO" %>
<%
	request.setCharacterEncoding("utf-8");

%>

	<jsp:useBean id="signupDTO" class="doyeon.SignupDTO" scope="page" />
	<jsp:setProperty property="userId" name="signupDTO"/>
	<jsp:setProperty property="userPw" name="signupDTO"/>
	<jsp:setProperty property="userNick" name="signupDTO"/>

	
<%
	System.out.println(" 아이디 : " + signupDTO.getUserId());
	System.out.println(" 비밀번호 : " + signupDTO.getUserPw());
	System.out.println(" 닉네임 : " + signupDTO.getUserNick());
	
	System.out.println("DAO 객체 생성");
	UserDAO userDAO = new UserDAO(); 
	
	int result = userDAO.signupInsert(signupDTO);
%>

	