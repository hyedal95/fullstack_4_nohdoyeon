package doyeon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDAO {

	private Connection conn;
	private PreparedStatement ps;
	private String sql;
	
	public UserDAO() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 설정 성공!");
			
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/doyeon", "root", "1234");
			System.out.println("커넥션 설정 성공!");
		}
		catch(Exception e) {
			
			System.out.println("에러 메세지 :" + e.getMessage());
		}
		
	}
	

	public int userInsert(SignupDTO signupDTO) {
		try {
			
			sql = "INSERT INTO signup2 (userId,userPw,userNick) VALUES(?,?,?)";
			ps =conn.prepareStatement(sql);
			
			ps.setString(1, signupDTO.getUserId());
			ps.setString(2, signupDTO.getUserPw());
			ps.setString(3, signupDTO.getUserNick());
			ps.executeUpdate();
			
			return 1;
		}
		catch(Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			return 2;
		}
	}

}
