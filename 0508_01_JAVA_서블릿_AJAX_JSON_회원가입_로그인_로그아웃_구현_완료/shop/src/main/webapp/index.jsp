<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>회원가입폼 Servlet 구현</title>
	<link rel="icon" href="#">
	<link rel="stylesheet" href="./css/style.css">
	<script src="./script/lib/jquery-1.9.0.min.js"></script>
	<script src="./script/signup.js" defer></script>
	
</head>
<body>
<%
	//1. 로그인 유저 아이디 변수를 설정 = 기본값 널
	String loginId =null;

	//2. 조건 세션 값이 널(빈값)이 아니면 loginId=세션값(userId)을 저장한다.
	if(session.getAttribute("userId") != null){
		loginId = (String) session.getAttribute("userId"); // 문자열 강제형 변환
	}
	System.out.println("loginId = " + loginId);
	
%>		
	


	<div id="wrap">

		<%=loginId !=null ? "<h1>" + loginId + "님!</h1>" : " "%>
		<h1> HOME </h1>
		<form>
			<div>

<%
	if(loginId != null){//로그인 성공시
%>
	<div>
	<button type='submit' class='loginout-btn'><a href="./user_logout_action.jsp" style=" color:#000; ">로그아웃</a></button>
	</div>
	
<% 
	}	
	else{//로그인 실패시
%>

	<ul>
		<li>
			<input type='text' name='userId' id='userId' placeholder='아이디 입력하세요!' />
		</li>
		<li>
			<input type='text' name='userPw' id='userPw' placeholder='비밀번호 입력하세요!' />
		</li>
		<li>
			<input type='text' name='userName' id='userName' placeholder='이름 입력하세요!' />
		</li>
		<li>
			<input type='text' name='userEmail' id='userEmail' placeholder='이메일 입력하세요!' />
		</li>
		<li>
			<input type='text' name='userHp' id='userHp' placeholder='핸드폰번호 입력하세요!' />
		</li>
	</ul>
	<div>
	<button type='submit' class='submit-btn' style=" margin-right:15px;">회원가입</button>
	<button type='submit' class='login-btn'><a href="./login.html" style=" color:#000; ">로그인</a></button>
	</div>
<%
	}
%>

			</div>
		</form>
		<br>
<%
	if (loginId != null){ // 로그인 성공시
%>	
		
		<table>
			<thead>
				<tr> <!-- 줄 -->
					<th>No.</th>
					<th>아이디</th>
					<th>비밀번호</th>
					<th>이름</th>
					<th>이메일</th>
					<th>휴대폰</th>
					<th>버튼</th>
				<tr>
			</thead>
			<tbody class="signup-list">
				
			</tbody>
		</table>
<% 
	};
%>
	</div>
</body>
</html>