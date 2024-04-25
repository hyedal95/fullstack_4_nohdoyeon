package kurly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDAO {

	// JAVA 내부에서는  private 
	
	private Connection conn;
	private PreparedStatement ps;
	private String sql;
	
	public UserDAO() { // 기본생성자 (매개변수 x) 내부에 jdbc 설정
		try {
			//1. JDBC 드라이버 설정
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("mariadb jdbc Driver 설정 성공!");
			//2. 컨넥셕 설정 (db 아이디, 비번 등록)
			// DriverManager.getConnection("접속위치 jdbc:mariadb://localhost:포트번호/연결할 DB명", "아이디[기본은 root]","비밀번호");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/kurly", "root", "1234");
			System.out.println("mariadb jdbc 컨넥션 설정 성공!");
		}
		catch(Exception e) {
			System.out.println("mariadb jdbc Driver 설정 OR mariadb jdbc 컨넥션 설정 실패!");
			System.out.println("에러 메시지 :" + e.getMessage());
		}
		
		
	}
	// 입력 폼 데이터 값 저장하기 SQL문 실행 INSERT INTO  SQL문
	// 저장 성공하면 숫자를 보내줄 것이기에 int 
	// 저장 성공 메시지 => 리턴 값 return 1 
	// 저장 실패 메시지 => 리턴 값 return 2
	public int signupInsert(SignupDTO signupDTO) {
		sql = "INSERT INTO signup (userId,userName,userHp) VALUES(?,?,?)";

		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, signupDTO.getUserId());
			ps.setString(2, signupDTO.getUserName());
			ps.setString(3, signupDTO.getUserHp());
			ps.executeUpdate(); // 저장한 내용 업데이트 (새로고침)
			return 1; //저장성공 메시지
		}  
		catch(Exception e) {
			System.out.println("에러 메시지 :" + e.getMessage());
			return 2; //저장실패 메시지
		}
	}

}
