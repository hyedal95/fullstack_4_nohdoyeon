<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
	// 인코딩 utf-8
	request.setCharacterEncoding("utf-8");
%>
<%
/* [자료형] [변수] = request.getParameter("html에서 name에 적은 내용"); */
// request => 리퀘스트 '요청 데이터' 가져오기'
// 각 자료형 변수에 넣어주기 
	String userName = request.getParameter("userName");
	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	String gender = request.getParameter("gender");
	
%>    

<%
	//데이터 출력하기 
	//스타일은 직접 태그 내부에 작성해야하는 불편함이 있다.
	
	out.println("<div id='wrap'>");
		out.println("<ul>");
			out.println("<ll><span>이름: </span><span>"+ userName+ "</span></il>");
			out.println("<ll><span>아이디: </span><span>"+ userId+ "</span></il>");
			out.println("<ll><span>비밀번호: </span><span>"+ userPw+ "</span></il>");
			out.println("<ll><span>성별: </span><span>"+ gender+ "</span></il>");
		out.println("</ul>");
	out.println("</div>");

%>
