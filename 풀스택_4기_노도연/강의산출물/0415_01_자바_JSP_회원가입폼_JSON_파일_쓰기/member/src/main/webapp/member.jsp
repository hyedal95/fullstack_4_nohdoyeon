<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="org.json.simple.*" %>
<%@ page import="java.io.*" %>
<%
	request.setCharacterEncoding("utf-8");

	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	String userName = request.getParameter("userName");

	JSONObject obj = new JSONObject();
	obj.put("아이디", userId);
	obj.put("비밀번호", userPw);
	obj.put("이름", userName);
	
	// FILE 예외 처리 
	//try{} catch(IOException e ){}
	try{
		String file = "E:\\풀스택_4기_노도연\\강의산출물\\04월\\0415_01_자바_JSP_회원가입폼_JSON_파일_읽기_쓰기\\data\\member.json";
		FileWriter filewriter = new FileWriter(file);
		filewriter.write(obj.toJSONString());
		filewriter.close();
		System.out.println("파일 저장 완료 ");
	}
	catch(IOException e){
		System.out.println("에러 메세지 : " +e.getMessage());
	}
%>