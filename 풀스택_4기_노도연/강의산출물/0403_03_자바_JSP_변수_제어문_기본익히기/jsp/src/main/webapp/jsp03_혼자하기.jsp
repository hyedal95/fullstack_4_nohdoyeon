<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="wrap">
		<h1> 2024년도 1학기 수강 과목 배열선언 반복문</h1>
		<ol type="A">
			<%
				String[] subject = { 
						"[무역/3] 글로벌스타트업마케팅",
						"[미디어/3] 1인미디어기획제작",
						"[체육/4] 게임·애니메이션·VR의이해",
						"[컴퓨터/2] HTML5웹프로그래밍",
						"[컴퓨터/4] 컴퓨터그래픽스",
						"[컴퓨터/4] 소프트웨어공학",
						"[컴퓨터/4] 정보통신망"
									};
				
				for(int i=0; i<subject.length; i++){
					out.println("<li>"+ subject[i]+ "</li>");
				}
			%>
		</ol>
	
	</div>
	
	<style>
		#wrap{
		text-align:center;
		}
		ol{
		display:inline-block;
		}
		li{
		font-size:20px;
		font-weight:600;
		}

	</style>
	<!-- http://localhost:8080/jsp/jsp03_혼자하기.jsp -->
</body>
</html>