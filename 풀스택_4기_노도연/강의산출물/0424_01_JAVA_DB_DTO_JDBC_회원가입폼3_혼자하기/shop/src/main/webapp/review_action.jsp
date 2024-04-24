<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
    
<% 	
	request.setCharacterEncoding("UTF-8"); 
%>


<jsp:useBean id="reviewDTO" class="shop.ReviewDTO" scope="page" /> 
<jsp:setProperty property="userName" name="reviewDTO" />
<jsp:setProperty property="userStore" name="reviewDTO" />
<jsp:setProperty property="userMeum" name="reviewDTO" />
<jsp:setProperty property="userText" name="reviewDTO" />

<%
	// import="java.sql.*"
	// 컨넥션 변수 conn, ps, rs(result set), SQL   => 변수 4개 설정 필요하다.
	Connection conn = null; // 컨넥션 => 인가받은 접속 정보
	PreparedStatement ps = null; // 프리페어드스테이트먼트 =>PrepareStatement(sql) 실행 결과 변수 => 매개변수 value => ? : ps 
	ResultSet rs = null;  // 리절트셋 => 쿼리를 실행 executeQuery() 익스큐트 쿼리 실행 결과 변수 테이블 데이터 가져오기 => 사용
	String sql = null;  // sql 문자열 변수
	
	
	try{
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/shop", "root", "1234");
	}
	catch(Exception e){
		System.out.println("에러 메세지 :" + e.getMessage());
	}
	
	// 5단계 - 입력상자 값 signupDto=> DB에 저장하기
	sql = "INSERT INTO review_table (userName,userStore,userMeum,userText) VALUES (?,?,?,?)";
	try{
		ps = conn.prepareStatement(sql);
		ps.setString(1, reviewDTO.getUserName());
		ps.setString(2, reviewDTO.getUserStore());
		ps.setString(3, reviewDTO.getUserMeum());
		ps.setString(4, reviewDTO.getUserText());
		ps.executeUpdate();
		
		System.out.println("5단계 폼데이터 DTO데이터 DB에 저장 완료.");
	}
	catch(Exception e){
		System.out.println("5단계 폼데이터 DTO데이터 DB에 저장 실패.");
		e.getMessage();
		e.printStackTrace(); // 오류 전체
	}
	

%>