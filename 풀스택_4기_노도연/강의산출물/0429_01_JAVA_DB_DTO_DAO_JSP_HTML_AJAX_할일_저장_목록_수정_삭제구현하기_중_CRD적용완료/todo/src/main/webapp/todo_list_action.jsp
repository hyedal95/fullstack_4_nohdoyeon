<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="todo.TodoDto" %>
<%@ page import="todo.TodoDao" %>
<%@ page import="org.json.simple.*" %>

<%
	request.setCharacterEncoding("utf-8");

	TodoDao todoDao = new TodoDao();
	JSONArray result = todoDao.todoList();
	out.println( result );
			
%>