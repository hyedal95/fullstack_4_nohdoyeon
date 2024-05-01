<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.json.simple.*" %>
<%@ page import="todo.TodoDao" %>
<%

	request.setCharacterEncoding("UTF-8");
	
	int idx = Integer.parseInt(request.getParameter("idx"))  ;
	String todo = request.getParameter("todo");

	System.out.println(idx);
	System.out.println(todo);
	
	
	
	
	// 할일
	TodoDao todoDao = new TodoDao();
	int res = todoDao.todoUpdate(idx, todo);
	
	if(res==1){
		// 할일 목록 가져오기 todoDao.todoList() 가져오기
		JSONArray list = todoDao.todoList(); // 빨간줄 나오는 경우 위에 임포트 해줘야한다.  <%@ page import="org.json.simple.*" %\>
		out.println(list); // js =>  ajax로 응답 Response 
	}
	
	
%>