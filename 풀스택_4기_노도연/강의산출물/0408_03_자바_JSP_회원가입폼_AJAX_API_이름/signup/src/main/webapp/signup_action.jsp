<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--1.인코딩 --> 
<%  request.setCharacterEncoding("utf-8"); %>
<%@ page import="signup.user.UserDto" %>
<%  UserDto userDto =new UserDto(); %>
	<!-- 2. ajax => 이름받기 -->
<%
	String userName = request.getParameter("userName");

	/* 3. 자바 콘솔 확인하기 */
	System.out.println("이름 :" + userName);
	userDto.setUserName(userName);
%>

{
	"이름": "<%=userDto.getUserName() %>"
}
