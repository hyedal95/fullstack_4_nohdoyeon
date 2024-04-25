<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kurly.UserDao" %>
<%@ page import="kurly.UserDto" %>

<%	
	//1. 인코딩 => utf-8
	request.setCharacterEncoding("utf-8");
	
	
	//2. html post 요청(request)한 데이터 파라미터 getParameter 데이터값 가져오기 get
	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	String userName = request.getParameter("userName");
	String userAddr = request.getParameter("userAddr");
	
	//3. getParameter 데이터값 DTO에 저장하기
	UserDto userDto = new UserDto();
	// 세터함수 구현 => 저장
	userDto.setUserId(userId);
	userDto.setUserPw(userPw);
	userDto.setUserName(userName);
	userDto.setUserAddr(userAddr);

	//4. jdbc 설정 확인 => 객체 생성 => DAO 기본 생성자 실행
	UserDao userDao = new UserDao();
	
	//5. DTO 데이터 값을 DAO insert 함수에 저장
	int res = userDao.userInsert(userDto);
	
	System.out.println( res );
	
%>