<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="todo.TodoDao" %> 
<%@ page import="org.json.simple.*" %>
<%@ page import="org.json.simple.JSONArray" %>
<%@ page import="org.json.simple.JSONObject" %>
<%
	request.setCharacterEncoding("utf-8");

	TodoDao todoDao = new TodoDao();
	JSONArray res = todoDao.todoListSelect(); // 목록 출력하는 것.
	
	System.out.println( res );
	out.println( res );
%>