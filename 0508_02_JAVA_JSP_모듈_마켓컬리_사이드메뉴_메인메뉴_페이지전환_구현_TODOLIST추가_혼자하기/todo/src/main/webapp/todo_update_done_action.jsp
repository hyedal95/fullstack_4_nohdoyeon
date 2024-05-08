<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="todo.TodoDao" %>
<%@ page import="org.json.simple.*" %>
<%
	request.setCharacterEncoding("utf-8");
	
	int idx = Integer.parseInt(request.getParameter("idx"));
	int done = Integer.parseInt(request.getParameter("done"));

	// 체크박스 구현 = done의 값 => 1과 0으로 바꿔주는 것 
	// 연결 DAO - todoDoneUpdate()
	TodoDao todoDao = new TodoDao();
	int res = todoDao.todoDoneUpdate(idx,done);
	if(res==1){
		// 할일 목록 가져오기 DAO - todoList () 가져오기
		JSONArray list = todoDao.todoList();
		out.println(list);
	}
%>