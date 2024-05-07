package shop.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.SignupDao;


@WebServlet(name = "signupDelete", urlPatterns = { "/signupDelete.do" })
public class SignupDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		
		System.out.println(userId);
		System.out.println(userPw);
		
		SignupDao signupDao =new SignupDao();
		int res = signupDao.userDelete(userId, userPw);
		
		if(res==1){
			System.out.println("삭제성공");
			
			
		}
		else{
			System.out.println("삭제실패");
		}
	}

}
