<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="todo.TodoDao" %>
<%@ page import="org.json.simple.*" %>
<%
	
	TodoDao todoDao = new TodoDao();
	JSONArray list = todoDao.todoList();
	out.println(list);
%>