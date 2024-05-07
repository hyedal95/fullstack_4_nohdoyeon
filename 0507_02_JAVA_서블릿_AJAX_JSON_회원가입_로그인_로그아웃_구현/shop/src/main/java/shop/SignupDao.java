package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SignupDao {

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private String SQL;
	//기본생성자 =>MariaDB 드라이버 및 컨넥션 설정하기 
	public SignupDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/shop","root" , "1234");
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
	
	// 2. 읽기(목록) 메서드 signupList() 회원가입목록
	@SuppressWarnings("unchecked")
	public JSONArray signupList() {
		JSONArray arr = new JSONArray();
		SQL ="SELECT * FROM signup";
		try {
			ps = conn.prepareStatement(SQL);
			rs = ps.executeQuery();
			while(rs.next()) {
				JSONObject obj = new JSONObject();
				obj.put("아이디", rs.getString(1));
				obj.put("비밀번호",  rs.getString(2));
				obj.put("이름",  rs.getString(3));
				obj.put("이메일",  rs.getString(4));
				obj.put("휴대폰",  rs.getString(5));
				
				arr.add(obj);				
			}
		}
		catch(Exception e) {
			e.getMessage();
		}
		return arr;
	}
	

	
	// 3. 수정할 회원 아이디 찾기 반환값 SignupDto 클래스
	// JSONObject와 다른 점은 ...!! DTO 객체 만들어서 DTO로 반환한다.
	// DTO가 조금 더 편리함.
	public SignupDto idFindList(String userId) {
		SQL= "SELECT * FROM signup WHERE userId=?";
		SignupDto signupDto = new SignupDto();
		try{
			ps = conn.prepareStatement(SQL);
			ps.setString(1, userId);
			rs = ps.executeQuery();
			while(rs.next()) {
				signupDto.setUserId(rs.getString(1));
				signupDto.setUserPw(rs.getString(2));
				signupDto.setUserName(rs.getString(3));
				signupDto.setUserEmail(rs.getString(4));
				signupDto.setUserHp(rs.getString(5));
			}
		}
		catch(Exception e) {
			e.getMessage();
		}
		//객체를 리턴해준다.
		return signupDto;
	
	}
	
	//4. 회원정보 수정
	public int userUpdate(SignupDto signupDto) { //DTO 들어옴.
		System.out.println(signupDto.getUserId());
		SQL="UPDATE signup SET userPw=?, userName=? ,userEmail=? , userHp=? WHERE userId=?";
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, signupDto.getUserPw());
			ps.setString(2, signupDto.getUserName());
			ps.setString(3, signupDto.getUserEmail());
			ps.setString(4, signupDto.getUserHp());
			ps.setString(5, signupDto.getUserId());
			ps.executeUpdate();
			return 1;
		}
		catch(Exception e) {
			e.getMessage();
			return 2;
		}
	}
	//5. 회원 정보 삭제(탈퇴) 메서드 userDelete(){}
	public int userDelete(String userId, String userPw){
		System.out.println(userId);
		System.out.println(userPw);
		SQL="DELETE FROM signup WHERE userId=? AND userPw=?";
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, userId);
			ps.setString(2, userPw);
			ps.executeUpdate();
			
			return 1;
		}
		catch(Exception e) {
			e.getMessage();
			return 2;
		}
	}
	
	// 6. userLogin(id,pw)
	public int userLogin(String userId, String userPw) {
		SQL="SELECT userPw FROM signup WHERE userId=?";
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, userId);
			rs =ps.executeQuery();
			if(rs.next()) {
				if(rs.getString(1).equals(userPw)==true) {
					return 1; // 로그인 성공 아이디 찾고 그리고 비밀번호를 비교 일치
				}
				else {
					return 2; // 로그인 실패 비밀번호 불일치
				}
			}
			
		}
		catch(Exception e) {
			e.getMessage();
		}
		return 3; // 로그인 실패 아이디 불일치 또는 그 외 모든 오류 
	}
	
}
