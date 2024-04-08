<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
 <% request.setCharacterEncoding("utf-8"); %>
 <%@
 	page import="fanpage.user.UserDto"
 %>
 
 <% UserDto userDto = new UserDto(); %>
 
 <%
 
 	String userNickName = request.getParameter("userNickName");
 	String userText = request.getParameter("userText");
 	
 	userDto.setUserNickName(userNickName);
 	userDto.setUserText(userText);
 
 %>
 
 {
 	"닉네임" : "<%=userDto.getUserNickName() %>",
 	"남긴글" : "<%=userDto.getUserText() %>"
 }