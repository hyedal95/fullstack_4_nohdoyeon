package shop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import shop.SignupDao;

@WebServlet(name = "signupList", urlPatterns = { "/signupList.do" })
public class SignupList extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		System.out.println("서블릿 회원가입 목록 출력");

		SignupDao signupDao = new SignupDao();			
		JSONArray res = signupDao.signupList();
		response.getWriter().println(res.toJSONString());	
		
	}

}
