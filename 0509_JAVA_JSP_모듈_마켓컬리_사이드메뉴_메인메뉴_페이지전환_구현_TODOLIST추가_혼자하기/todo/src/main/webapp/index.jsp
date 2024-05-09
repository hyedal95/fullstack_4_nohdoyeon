<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>HOME</title>
	<link rel="stylesheet" href="./css/style.css">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<script src="./script/lib/jquery-1.9.0.min.js"></script>
	<script src="./script/todoscript.js" defer></script>
</head>
<body>
<div id="wrap">
	<%
		request.setCharacterEncoding("utf-8");
		String Page = request.getParameter("Page");
		
		if(Page==null){
			Page = "main.jsp";
		}
		System.out.println( Page );
	%>
	
		<jsp:include page="header.jsp"  flush="false" />
		<jsp:include page="<%=Page %>"  flush="false" />
		<jsp:include page="footer.jsp"  flush="false" />
	
</div>
</body>
</html>