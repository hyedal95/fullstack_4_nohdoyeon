<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% request.setCharacterEncoding("utf-8");  %>
<%@ page import="signup.user.UserDto" %>
<% 
	UserDto userDto = new UserDto();
%>

<% 
	// $.ajax() => 폼전송 받기 = 리퀘스트.겟파라미터()
	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	String userName = request.getParameter("userName");
	String userEmail = request.getParameter("userEmail");
	String userHp = request.getParameter("userHp");
	String userGender = request.getParameter("userGender");
	String userAddress = request.getParameter("userAddress");
	//폼 전송 받은 데이터 값 => DTO 세터메서드(함수) 저장
	userDto.setUserId(userId);
	userDto.setUserPw(userPw);
	userDto.setUserName(userName);
	userDto.setUserEmail(userEmail);
	userDto.setUserHp(userHp);
	userDto.setUserGender(userGender);
	userDto.setUserAddress(userAddress);
	
	// 자바 DTO에 저장된 데이터 = AJAX에 JSON 형식으로  응답하기
			
	//System.out.println("{\"아이디\" :\"" + userDto.getUserId() + "\"}" ); // JAVA코딩 확인
	//out.println("{\"아이디\" :\"" + userDto.getUserId() + "\"}"); // AJAX응답값
	
			
%>
{
	"아이디":"<%=userDto.getUserId() %>",
	"비밀번호":"<%=userDto.getUserPw() %>",
	"이름":"<%=userDto.getUserName() %>",
	"이메일":"<%=userDto.getUserEmail() %>",
	"전화번호":"<%=userDto.getUserHp() %>",
	"성별":"<%=userDto.getUserGender() %>",
	"주소":"<%=userDto.getUserAddress() %>"

}










