<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="shop.SignupDao" %>
<%@ page import="shop.SignupDto" %>
<%
	request.setCharacterEncoding("utf-8");

	String userId =request.getParameter("userId");

	
	// 수정할 아이디를 DAO 전송 목록을 가져오기
	// 입력상자에 바인딩 하면된다. 
	SignupDao signupDao = new SignupDao();
	// 반환 타입 DTO
	SignupDto res = signupDao.idFindList(userId);

	System.out.println( "DAO의 res정보 : " + res);
	
	
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>회원 정보 수정 페이지</title>
	<link rel="icon" href="#">
	<link rel="stylesheet" href="./css/style.css">
	
	<script src="./script/lib/jquery-1.9.0.min.js"></script>
	<script src="./script/signup.js" defer></script>
	
</head>
<body>
	<div id="wrap">
		<h1> 회원가입폼 Servlet 구현</h1>
		<form name="updateAction" id="updateAction" action="signupUpdateAction.do" method="POST">
			<div>
				<ul>
					
					<li>
						<!-- disabled 폼 데이터 전송 안됨 -->
						<input type='text' name='userId' id='userId' maxlength="16" value="<%= res.getUserId() %>"  disabled/>
						<!-- 화면에는 숨김처리 but 폼 데이터 전송 가능 -->
						<input type='hidden' name='userId' id='userId' maxlength="16" value="<%= res.getUserId() %>" />
					</li>
					

					<li>
						<input type='text' name='userPw' id='userPw' maxlength="16" value="<%= res.getUserPw() %>" />
					</li>
					<li>
						<input type='text' name='userName' id='userName' maxlength="30" value="<%= res.getUserName() %>" />
					</li>
					<li>
						<input type='text' name='userEmail' id='userEmail'   maxlength="250" value="<%= res.getUserEmail() %>" />
					</li>
					<li>
						<input type='text' name='userHp' id='userHp' maxlength="13" value="<%= res.getUserHp() %>" />
					</li>
				</ul>
				<div>
					<button type='submit'  class="update-action-btn">저장하기</button>
	
				</div>
			</div>
		</form>
	</div>
</body>
</html>