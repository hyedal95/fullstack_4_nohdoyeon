<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="todo.TodoDto" %>
<%@ page import="todo.TodoDao" %>
<%@ page import="org.json.simple.*" %>

<%
	request.setCharacterEncoding("utf-8");
	
	String idx = request.getParameter("idx");
	
	
	TodoDao todoDao = new TodoDao();
	int res = todoDao.todoDelect(idx);

	
	if(res==1){
		// 목록 함수(json파일) 호출 
		JSONArray result = todoDao.todoList();
		out.println( result ); //ajax 응답 json 파일

	}
	
%>