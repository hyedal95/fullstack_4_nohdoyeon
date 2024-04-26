package todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class TodoDao {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private String SQL;
	
	public TodoDao() {
		try {
			// 드라이버 설정
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("mariadb Driver 설정 완료");
			// 컨넥션 설정 getConnection 접속   
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/todo", "root", "1234");
			System.out.println("mariadb getConnection 설정 완료");
		}
		catch(Exception e) {
			System.out.println("Driver OR getConnection 설정 실패!");
			System.out.println("에러 메세지 : " + e.getMessage());
			
		}
		
	}
	// DB todo => todo_list_table = > INSERT INTO 
	public int todoInsert(TodoDto todoDto){
		SQL = "INSERT INTO todo_list_table(todo) VALUES (?)";
		try {
			
			ps = conn.prepareStatement(SQL);
			ps.setString(1, todoDto.getTodo());
			ps.executeUpdate();
			
			
			return 1; //성공
		}
		catch(Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			return -1; //실패
		}
	} 
	// todo 리스트 목록 select 
	public JSONArray todoListSelect() {
		SQL = "SELECT * FROM todo_list_table ORDER BY todoDate DESC";
		// 오류가 나든 안나든 너는 실행해라! 
		JSONArray arr = new JSONArray();
		
		try {
			ps = conn.prepareStatement(SQL);
			rs = ps.executeQuery();
			
			
			while(rs.next()) {
				JSONObject obj =new JSONObject();
				// 모든 것을 string으로 가져오면 숫자도 문자도 다 겹따옴표로 들어온다. 
				obj.put("idx", rs.getString(1)); // 1번째 칸 값 String ("1") "idx" :"1"
				obj.put("할일", rs.getString(2)); // 2번째 칸 값
				obj.put("일시", rs.getString(3)); // 3번째 칸 값
				arr.add(obj);//1줄 내용 들어감. 반복문으로 인해 누적누적됨.
			}
			
		}
		catch(Exception e) {
			System.out.println("에러 메세지 : " + e.getMessage());
		}
		
		
		return arr;
	}

}
