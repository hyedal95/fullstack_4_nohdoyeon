

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

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
		// 배열로 한꺼번에 출력한다. signupDto.toString() <= 자바 확인
		System.out.println(signupDto.toString());

		
		//JSONObject 객체 생성 
		JSONObject obj = new JSONObject();
		obj.put("아이디", signupDto.getUserId());
		obj.put("비밀번호", signupDto.getUserPw());
		obj.put("이름", signupDto.getUserName());
		obj.put("이메일", signupDto.getUserEmail());
		obj.put("휴대폰", signupDto.getUserHp());
		
		// DTO=>DAO
		SignupDao signupDao = new SignupDao();		
		int res = signupDao.signupInsert(signupDto);
		
		PrintWriter w = response.getWriter();
		w.println(res); 
		w.close(); // 쓰기 모드 닫기 
		
		// 한줄 코딩할 때는 아래와 같이
		// response.getWriter().println(res);
		
		
		
	} 

}
