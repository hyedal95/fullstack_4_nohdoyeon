package kurly;
import java.sql.*;

public class UserDao {
	
	private Connection conn; 
	private PreparedStatement ps;
	private String SQL;
	
	public UserDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
				System.out.println("드라이버 설정 성공!");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/kurly", "root", "1234");
				System.out.println("컨넥션 설정 성공!");
		}
		catch(Exception e) {
			System.out.println("드라이버 OR 컨넥션 설정 실패!");
			System.out.println("에러메세지:" + e.getMessage());
		}
	}
	//저장 메서드 => 공유되어야하니깐 접근제한자는 public 리턴값은 int 자료형으로 ! 
	public int userInsert(UserDto userDto) {
		
		
		try {
			SQL = "INSERT INTO user_table(userId,userPw,userName,userAddr) VALUES (?,?,?,?)";
			
			ps = conn.prepareStatement(SQL);
			ps.setString(1, userDto.getUserId());
			ps.setString(2, userDto.getUserPw());
			ps.setString(3, userDto.getUserName());
			ps.setString(4, userDto.getUserAddr());
			ps.executeUpdate();
			return 1;
		}
		catch(Exception e) {
			System.out.println("에러 :" + e.getMessage());
			return 2;
		}
		
	}
	
	

}
