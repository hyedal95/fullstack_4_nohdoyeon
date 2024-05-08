package shop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.SignupDao;
import shop.SignupDto;


@WebServlet(name = "signupUpdateAction", urlPatterns = { "/signupUpdateAction.do" })
public class SignupUpdateAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		SignupDto signupDto = new SignupDto();
		
		String userId =request.getParameter("userId");
		String userPw =request.getParameter("userPw");
		String userName =request.getParameter("userName");
		String userEmail =request.getParameter("userEmail");
		String userHp =request.getParameter("userHp");
		
		
		signupDto.setUserId(userId);
		signupDto.setUserPw(userPw);
		signupDto.setUserName(userName);
		signupDto.setUserEmail(userEmail);
		signupDto.setUserHp(userHp);
		
		SignupDao signupDao = new SignupDao();
		
		int res = signupDao.userUpdate(signupDto);
		
		if(res==1){
			System.out.println("수정함수 서블릿에서 확인");
			//처음으로 이동 response 응답.sendRedirect ("어디로 갈래? ")
			//1. 자바 서블릿에서 이용하는 방법
			//response.sendRedirect("./index.html");
			PrintWriter w1 = response.getWriter();
			// 수정 실패 뒤로 가라!!! history.go(-1)
			//2.자바 스크립트에서 이용하는 방법
			w1.println("<script>location.href='index.html' </script>");

		}else{
			
			System.out.println("수정 실패 확인하고 다시 시도해주세요. 서블릿에서 확인");
			
			PrintWriter w2 = response.getWriter();
			// 수정 실패 뒤로 가라!!! history.go(-1)
			
			w2.println("<script> history.go(-1) </script>");
			w2.println("<script>alert('확인하고 다시 수정하세요.') </script>");

			
		}
	}

}
