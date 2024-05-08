<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>인덱스 페이지 </title>
	<link rel="stylesheet" href="./css/style.css">
	<style type="text/css">
		*{margin: 0;padding: 0;vertical-align:middle;box-sizing:border-box;}
		#wrap{width:100%;}
		#wrap #topModal{width:100%; height:42px; background:#5f0080;}
		#wrap #header{
		text-align:center;
		width:100%; height:156px; background:#f0f0f0; border-bottom:1px solid #ccc;}
		#wrap .main{
		width:100%;  height:calc(100vh - 398px); background:#fff7f7; 
		display:flex; align-items:center; justify-content: center;
		color: #5f0080; font-size:36px;}
		
		#wrap #footer{width:100%; height:200px; background:#f0f0f0; border-top:1px solid #ccc;}

	</style>
</head>
<body>
<div id="wrap">
	<%
		request.setCharacterEncoding("utf-8");
		String Page = request.getParameter("Page");
		if(Page==null){ // 버튼 클릭 안하면 기본 null
			Page = "main.jsp"; //기본페이지 설정
		}
		
	%>
	
	<jsp:include page="top_modal.jsp" flush="false"/>
	<jsp:include page="header.jsp" flush="false" />
	<jsp:include page="<%=Page %>" flush="false" />
	<jsp:include page="footer.jsp" flush="false" />

</div>
</body>
</html>