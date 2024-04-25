<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 임포트할 때는 패키지경로도 같이 적어줘야함. -->  
<%@ page import="kurly.UserDAO" %>
<%
	request.setCharacterEncoding("utf-8");
%>

	<jsp:useBean id="signupDTO" class="kurly.SignupDTO" scope="page" />
	<jsp:setProperty property="userId" name="signupDTO" /> 
	<jsp:setProperty property="userName" name="signupDTO" /> 
	<jsp:setProperty property="userHp" name="signupDTO" /> 
	
<%
	System.out.println("아이디 : " +signupDTO.getUserId() );
	System.out.println("이름 : " + signupDTO.getUserName());
	System.out.println("전화번호 : " + signupDTO.getUserHp());
	
	// JAVA로 만들어진 DAO 객체를 가져다가 쓴다.
	// JAVA DAO => UserDAO 객체 생성 하면 => 기본 생성자 실행 => JDBC 구현
	// 객체만 생성하면, 기본 생성자는 실행이 된다.
	System.out.println("UserDAO 클래스 객체 생성");
	UserDAO userDAO = new UserDAO();
	
	// kurly.UserDAO.java => 메서드 호출 signupInsert (DTO)
	// DB에 저장
	int result = userDAO.signupInsert(signupDTO); 
	
	// 저장성공 1, 실패는 2 => 이클립스 콘솔창에 출력
	System.out.print( "result 결과 : " + result);
	
%>	