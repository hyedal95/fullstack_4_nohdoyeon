<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="todo.TodoDto" %>
<%@ page import="todo.TodoDao" %>
<%@ page import="org.json.simple.*" %>

<%
	request.setCharacterEncoding("UTF-8");

	String todo = request.getParameter("todo");
	
	// ajax 전송 => 콘솔창 확인
	// System.out.println(todo);
	
	TodoDto todoDto = new TodoDto();
	
	// ajax 전송 => TodoDto.java 에 저장 setTodo(todo)
	todoDto.setTodo(todo);
	// ajax 전송 => TodoDto.java  가져오기 확인 getTodo()
	// System.out.println(todoDto.getTodo());
	
	// DTO => DAO TodoDao 객체 생성 => 드라이버, 컨넥션 접속 확인 가능
	TodoDao todoDao = new TodoDao();
	int res = todoDao.todoInsert(todoDto);
	//System.out.println(res);
	
	if(res==1){
		// 목록 함수(json파일) 호출 
		JSONArray result = todoDao.todoList();
		out.println( result ); //ajax 응답 json 파일

	}
	
	
%>