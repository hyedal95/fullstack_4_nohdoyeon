<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="./css/sub/login.css">
<main id="login" class="main">
	<div class="container">
		<div class="content">
			<div class="title">
				<h2>로그인</h2>
			</div>
			<div class="form-box">
				<form action="">
					<ul>
						<li>
							<input type="text" name="userId" id="userId" placeholder="아이디를 입력하세요.">
						</li>
						<li>
							<input type="password" name="userPw" id="userPw" placeholder="비밀번호를 입력하세요.">
						</li>
						<li><div class="find-box"><a href="#">아이디 찾기</a><span>|</span><a href="#">비밀번호 찾기</a></div></li>
						<li><button type="submit" class="login-btn"><span>로그인</span></button></li>
						<li><button type="submit" class="signup-btn"><span>회원가입</span></button></li>
					</ul>
				</form>
			</div>
			
		</div>
	</div>
</main>