<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="todo.TodoDto" %>
<%@ page import="todo.TodoDao" %>
    
<% 
	request.setCharacterEncoding("utf-8");
	
	//AJAX 보내온 데이터 받기 => getParameter 데이터 받기
	String todo = request.getParameter("todo");
	

	//DTO 객체 => 세터함수 => 저장  : TodoDto 객체 생성
	TodoDto todoDto = new TodoDto();
	todoDto.setTodo(todo);
	
	
	//JDBC 드라이버설정 컨넥션 연결확인
	TodoDao todoDao = new TodoDao();
	// 리턴 값 문자열
	int res = todoDao.todoInsert(todoDto);
	System.out.println( res );
	// DAO DB에 저장 결과를  AJAX 에게 응답한다.
	out.println( res );
%>
