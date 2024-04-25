package doyeon;

import java.sql.*;

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
	
	
	public int signupInsert(SignupDTO signupDTO) {
		
		sql = "INSERT INTO signup (userId,userPw,userNick) VALUES(?,?,?)";
		try {
			ps =conn.prepareStatement(sql);
			
			ps.setString(1, signupDTO.getUserId());
			ps.setString(2, signupDTO.getUserPw());
			ps.setString(3, signupDTO.getUserNick());
			ps.executeUpdate();
			return 1;
		}
		catch(Exception e) {
			
			System.out.println("에러 메세지 : " + e.getMessage());
			return 2;
		}
		
	}

}
