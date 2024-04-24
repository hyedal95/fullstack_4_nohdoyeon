<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 자바 내부에서 모든 SQL를 사용하겠다. -->
<%@ page import="java.sql.*" %>

<%
	request.setCharacterEncoding("utf-8");
%>

	<jsp:useBean id="signupDto" class="kurly.SignupDTO" scope="page" />
	<jsp:setProperty property="userId" name="signupDto" />
	<jsp:setProperty property="userPw" name="signupDto" />
	<jsp:setProperty property="userName" name="signupDto" />
	<jsp:setProperty property="userHp" name="signupDto" />
	
	
<%
	//JDBC 설정
	Connection conn= null;
	PreparedStatement ps = null;
	String sql = null;
	
	try{
		//드라이버
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("mariadb jdbc Driver 설정 성공!");
		//컨넥션
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/kurly", "root" , "1234");
		System.out.println("mariadb jdbc Connection 설정 성공!");
	}
	catch(Exception e){
		System.out.println("mariadb jdbc Driver 설정 or mariadb jdbc Connection 설정 실패!");
		System.out.println("에러메세지 :" + e.getMessage());
	}
	
	try{
		sql ="INSERT INTO signup_table (userId,userPw,userName,userHp) VALUES (?,?,?,?)";
		ps =conn.prepareStatement(sql);
		ps.setString(1, signupDto.getUserId());
		ps.setString(2, signupDto.getUserPw());
		ps.setString(3, signupDto.getUserName());
		ps.setString(4, signupDto.getUserHp());
		ps.executeUpdate();
		System.out.println("테이블 저장 완료!");
	}
	catch(Exception e){
		System.out.println("테이블 저장 실패!");
		e.getMessage();
		e.getStackTrace();
	}
%>
	