<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.json.simple.*" %>
<%@ page import="todo.TodoDao" %>

<%
	// 인코딩은 데이터 가져올 때 쓰는 것이기에 지워도 된다.
	// 드라이버 , 접속
	TodoDao todoDao = new TodoDao();
	
	// 할일 목록 가져오기 todoDao.todoList() 가져오기
	JSONArray list = todoDao.todoList(); // 빨간줄 나오는 경우 위에 임포트 해줘야한다.  <%@ page import="org.json.simple.*" %\>
	out.println(list); // js =>  ajax로 응답 Response 
	
	
%>