<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="todo.TodoDao" %>
<%@ page import="org.json.simple.*" %>
<%
	request.setCharacterEncoding("utf-8");
	
	int idx = Integer.parseInt(request.getParameter("idx"));

	// 연결 DAO - todoDelete() 연결
	TodoDao todoDao = new TodoDao();
	int res = todoDao.todoDelete(idx);
	if(res==1){
		// 할일 목록 가져오기 DAO - todoList () 가져오기
		JSONArray list = todoDao.todoList();
		out.println(list);
	}
%>