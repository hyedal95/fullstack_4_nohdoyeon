<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String userId =request.getParameter("userId");
	String userPw =request.getParameter("userPw");
	String userName =request.getParameter("userName");
	String userEmail =request.getParameter("userEmail");
	String userHp =request.getParameter("userHp");
	
	System.out.println("userId : " + userId);
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
		<form>
			<div>
				<ul>
					<li>
						<input type='text' name='userId' id='userId' value="<%=userId %>" />
					</li>
					<li>
						<input type='text' name='userPw' id='userPw' value="<%=userPw %>" />
					</li>
					<li>
						<input type='text' name='userName' id='userName' value="<%=userName %>" />
					</li>
					<li>
						<input type='text' name='userEmail' id='userEmail' value="<%=userEmail %>" />
					</li>
					<li>
						<input type='text' name='userHp' id='userHp' value="<%=userHp %>" />
					</li>
				</ul>
				<div>
					<button type='submit' class='save-btn'>저장하기</button>
	
				</div>
			</div>
		</form>
	</div>
</body>
</html>