package user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "cartActionServlet", urlPatterns = { "/cartActionServlet.do" })
public class CartActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 장바구니 연산 처리 함.
		System.out.println("서블릿 액션 장바구니 연산 처리 완료.");
		
		//1. 프로젝트 경로 가져오기 결과 => 프로젝트 경로 : /kurly
		String projectPath = request.getContextPath();
		System.out.println("프로젝트 경로 : " +projectPath);
		
		
		//2. 프로젝트 경로 + 파일 경로 가져오기 결과 => 프로젝트 경로 + 파일 경로 : /kurly/cartActionServlet.do
		String projectFilePath = request.getRequestURI();
		System.out.println("프로젝트 경로 + 파일 경로 : " +projectFilePath);
	
		
		//3. 프로젝트 경로 + 파일 경로 가져오기 결과 => 프로젝트 전체 경로 : http://localhost:8080/kurly/cartActionServlet.do
		StringBuffer projectURLPath = request.getRequestURL();
		System.out.println("프로젝트 전체 경로 : " +projectURLPath);

		// cart.jsp 페이지로 보내준다.
		response.sendRedirect("/kurly/index.jsp?Page=cart.jsp");
		
	}

}
