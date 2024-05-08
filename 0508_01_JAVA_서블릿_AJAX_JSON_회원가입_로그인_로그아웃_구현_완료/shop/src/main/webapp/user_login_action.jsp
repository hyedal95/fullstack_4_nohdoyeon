<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="shop.SignupDao" %>

<%
	request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("UTF-8");

    String userId = request.getParameter("userId");
    String userPw = request.getParameter("userPw");
    		
    SignupDao signupDao = new SignupDao();
    int res = signupDao.userLogin(userId, userPw);
    
    
    if(res==1){
    	System.out.println("로그인 성공");
    	session.setAttribute("userId", userId); // 세션 설정 setAttribute("변수", 값);
    	
    	PrintWriter script1 = response.getWriter();
    	script1.println("<script>alert('로그인 되었습니다.')</script>");
    	script1.println("<script>location.href= 'index.jsp'</script>");
    	
    	
    	script1.println("<h2 style='text-align:center;'> 아이디 : "+ userId + "님! 반갑습니다.</h2>");
    	script1.println("<h2 style='text-align:center;'> 로그인을 축하드립니다. </h2>");
    	script1.println("<button style=' display:flex; margin:0 auto; width:90px; height: 30px; font-size:20px; line-height:30px;'><a href='./login.html'>HOME</a></button>");
    	
    }
    else if(res==2){
    	System.out.println("로그인 실패 : 비밀번호 불일치");
    	PrintWriter script2 = response.getWriter();
    	script2.println("<script>alert('로그인 실패: 비밀번호를 다시 입력해주세요.')</script>");
    	script2.println("<script>location.href= 'login.html'</script>");
    }
    else{
    	System.out.println("로그인 실패 : 아이디 & 비밀번호를 확인하고 다시 시도하세요.");
    	PrintWriter script3 = response.getWriter();
    	script3.println("<script>alert('로그인 실패: 아이디 & 비밀번호를 확인하고 다시 시도하세요.')</script>");
    	script3.println("<script>location.href= 'login.html'</script>");
    }
%>