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
import shop.SignupDto;


@WebServlet(name = "signup", urlPatterns = { "/signup.do" })
public class Signup extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String userName = request.getParameter("userName");
		String userEmail = request.getParameter("userEmail");
		String userHp = request.getParameter("userHp");
		// DTO 완성후 저장하기
		SignupDto signupDto = new SignupDto();
		
		signupDto.setUserId(userId);
		signupDto.setUserPw(userPw);
		signupDto.setUserName(userName);
		signupDto.setUserEmail(userEmail);
		signupDto.setUserHp(userHp);
		// DTO 가입 정보 => DAO 가입 저장
		SignupDao signupDao = new SignupDao();
		
		int res = signupDao.signupInsert(signupDto);
		

		
		if(res==1) {
			System.out.println("회원가입 축하합니다..");
			// DAO에게 목록(signupList) 요청 
			JSONArray list = signupDao.signupList();

			// 가입 데이터 목록을 AJAX 에게 JSON 반환
			PrintWriter w = response.getWriter();
			w.println(list.toJSONString()); //JSON으로 반환이 된다. JSON String 반환 => .totoJSONString()
			w.close();
			
		}else {
			System.out.println("회원가입 다시 확인하고 시도해주세요.");
			
		}
		
		
		
	} 

}
