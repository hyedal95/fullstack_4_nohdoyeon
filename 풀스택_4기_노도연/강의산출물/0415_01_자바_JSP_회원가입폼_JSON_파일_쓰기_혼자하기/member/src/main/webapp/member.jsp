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
	
	String path = "E:\\풀스택_4기_노도연\\강의산출물\\04월\\0415_01_자바_JSP_회원가입폼_JSON_파일_읽기_쓰기_한번 더하기\\data\\member.json";
	try{
		FileWriter fw = new FileWriter(path);
		fw.write(obj.toJSONString());
		fw.close();
		System.out.println("파일저장완료");
	}
	catch(IOException e){
		System.out.println("에러메세지 : "+ e.getMessage());
	}
	


%>