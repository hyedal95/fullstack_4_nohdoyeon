<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<% 	
	request.setCharacterEncoding("UTF-8"); 
%>


<jsp:useBean id="signupDto" class="shop.SignupDTO" scope="page" /> 
<jsp:setProperty property="userId" name="signupDto" />
<jsp:setProperty property="userPw" name="signupDto" />
<jsp:setProperty property="userName" name="signupDto" />
<jsp:setProperty property="userHp" name="signupDto" />
<jsp:setProperty property="userEmail" name="signupDto" />
<jsp:setProperty property="userAddr" name="signupDto" />


아이디 : <%=signupDto.getUserId() %>
비밀번호 : <%=signupDto.getUserPw() %>
이름 : <%=signupDto.getUserName() %>
휴대폰 : <%=signupDto.getUserHp() %>
이메일 : <%=signupDto.getUserEmail() %>
주소 : <%=signupDto.getUserAddr() %>


<%
	// 이클립스=> 콘솔창 확인
	System.out.println("아이디 : " + signupDto.getUserId() );
	System.out.println("비밀번호 : " + signupDto.getUserPw() );
	System.out.println("이름 : " + signupDto.getUserName() );
	System.out.println("휴대폰 : " + signupDto.getUserHp() );
	System.out.println("이메일 : " + signupDto.getUserEmail() );
	System.out.println("주소 : " + signupDto.getUserAddr() );
%>

<%
	try{
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("mariadb jdbc Driver 마리아디비 드라이버 설정 성공!");
	}
	catch(Exception e){
		System.out.println("mariadb jdbc Driver 마리아디비 드라이버 설정 실패!");
		System.out.println("에러 메세지 :" + e.getMessage());
	}
	
%>