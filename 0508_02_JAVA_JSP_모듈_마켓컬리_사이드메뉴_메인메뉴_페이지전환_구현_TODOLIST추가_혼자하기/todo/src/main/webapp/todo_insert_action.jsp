<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="todo.TodoDao" %>
<%@ page import="org.json.simple.*" %>
<%
	request.setCharacterEncoding("utf-8");

	String todo = request.getParameter("todo");
	
	TodoDao todoDao = new TodoDao();
	int res = todoDao.todoInsert(todo);
	
	if(res==1){
		JSONArray list = todoDao.todoList();
		out.println(list);
	}
%>