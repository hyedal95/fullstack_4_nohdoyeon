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
	String userGender = request.getParameter("gender");
	String[] userHobby = request.getParameterValues("hobby"); //체크박스는 취미는 배열처리
	int userAge =Integer.parseInt(request.getParameter("userAge")) ; //홈페이지 입력상자에 입력된 숫자는 문자열로 저장된다. 숫자로 강제 형변환해야한다.
	userAge = userAge-1; //현재 나이를 계산 
	
	String userMovie = request.getParameter("userMovie");
%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>회원가입폼 JSP 서버페이지</title> <!-- index.html에서 작성한 데이터를 받아주는곳 -->
	<style>
	*{
		margin:0; padding:0; box-sizing:border-box; vertical-align:middle;
	}
	ul{list-style:none;}
	
	#wrap{ 
		width:100%;
		max-width:600px; 
		text-align:center;
		margin: 100px auto;

	}
	#wrap ul{
		margin: 0 auto;
		
	}
	#wrap ul li{
		line-height:160%;
	}
	#wrap ul li span{
		font-size: 16px;
		color: #444;
	}
	</style>

</head>
<body>

	<div id="wrap"> 
		<ul>
			<li>
				<span>이름: </span><span><%=userName %></span>
			</li>
			
			<li>
				<span>아이디: </span><span><%=userId %></span>
			</li>
			<li>
				<span>비밀번호: </span><span><%=userPw %></span>						
			</li>
			<li>
				<span>성별: </span><span><%=userGender %></span>						
			</li>
			<li>
				<span>취미: </span>
				<p>
					<%
						for(int i=0; i<userHobby.length; i++){

					 %>
					 	<span><%=i+1 %>. <%=userHobby[i] %> </span>
					 <%
						
						}
					 %>
				</p>					
			</li>
			<li>
				<span>나이: </span><span><%=userAge %></span>						
			</li>
			<li>
				<span>좋아하는 영화: </span><span><%=userMovie %></span>						
			</li>
		</ul>
	</div>
	




</body>
</html>