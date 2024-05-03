package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupDao {

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private String SQL;
	//기본생성자 =>MariaDB 드라이버 및 컨넥션 설정하기 
	public SignupDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 설정 성공");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/shop","root" , "1234");
			System.out.println("컨넥션 설정 성공");
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	
	// 1. 입력 (저장) 메서드 signupInsert(SignupDto signupDto)
	public int signupInsert(SignupDto signupDto) {
		SQL ="INSERT INTO signup (userId,userPw,userName,userEmail,userHp) VALUES (?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, signupDto.getUserId());
			ps.setString(2, signupDto.getUserPw());
			ps.setString(3, signupDto.getUserName());
			ps.setString(4, signupDto.getUserEmail());
			ps.setString(5, signupDto.getUserHp());
			ps.executeUpdate();
			return 1;
		}
		catch(Exception e) {
			e.getMessage();
			return 2; 
		}
	}
	
	// 2. 읽기(목록) 메서드 signupList()

}
