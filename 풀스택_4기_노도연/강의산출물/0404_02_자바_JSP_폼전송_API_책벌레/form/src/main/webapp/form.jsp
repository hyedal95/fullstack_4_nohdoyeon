<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");

%>

<%
	String userName = request.getParameter("userName");
	String usertitle = request.getParameter("usertitle");
	String userBookName = request.getParameter("userBookName");
	String userDate1 = request.getParameter("userDate1");
	String userDate2 = request.getParameter("userDate2");
	String userText = request.getParameter("userText");

%>
    
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#wrap{
width:100%;
margin:0 auto;
}
</style>
</head>
<body>

	<div id="wrap"> 
		<ul>
			<li>
				<span>작성자: </span><span><%=userName %></span>
			</li>
			
			<li>
				<span>책이름: </span><span><%=usertitle %></span>
			</li>
			<li>
				<span>지은이: </span><span><%=userBookName %></span>						
			</li>
			<li>
				<span>독서 시작한 날: </span><span><%=userDate1 %></span>						
			</li>
			<li>
				<span>독서 마지막 날: </span><span><%=userDate2 %></span>						
			</li>
			<li>
				<span>느낀점: </span><span><%=userText %></span>						
			</li>
		</ul>
	</div>

</body>
</html>