<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="org.json.simple.*" %>
<%@ page import="todo.TodoDao" %>
<%
	// 인코딩
	request.setCharacterEncoding("UTF-8");
	// 입력받은 내용을 todo로 받기 => todo 변수로 받기
	String todo = request.getParameter("todo");
	// DTO 만든 것 사용할려면 위에서 임포트하고 사용해야함. 귀찮으니깐 패스==> 
	// 임포트 <%@ page import="todo.TodoDto" %\>
	// TodoDto todoDto = new TodoDto() 객체생성 
	System.out.println(todo);
	
	// 드라이버 , 접속
	TodoDao todoDao = new TodoDao();
	int res = todoDao.todoInsert(todo);
	
	if(res==1){
		// 할일 목록 가져오기 todoDao.todoList() 가져오기
		JSONArray list = todoDao.todoList(); // 빨간줄 나오는 경우 위에 임포트 해줘야한다.  <%@ page import="org.json.simple.*" %\>
		out.println(list); // js =>  ajax로 응답 Response 
	}
	
%>