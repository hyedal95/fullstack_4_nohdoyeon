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
			System.out.println("드라이버 설정 성공");
			// 컨넥션 설정
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/todo_list", "root", "1234");
			System.out.println("컨넥션 설정 성공");
		}
		catch(Exception e) {
			System.out.println("드라이버 & 컨넥션 설정 실패!");
			System.out.println("에러메세지 :" + e.getMessage());
		}
	}
	
	// 1. 저장 (입력) 메서드 => SQL DB 저장구현
	// HTML 할 일 입력상자 => AJAX todo => JSP => DTO => DAO.todoInsert(TodoDto todoDto);
	
	public int todoInsert(TodoDto todoDto) {
		SQL= "INSERT INTO todo_list_table (todo) VALUES (?)";
		try {
			
			ps = conn.prepareStatement(SQL);
			ps.setString(1, todoDto.getTodo());
			ps.executeUpdate();
			return 1;
		}
		catch(Exception e) {
			System.out.println("에러메세지 :"+  e.getMessage());
			return -1;
		}
	}
	// 2. 목록 메서드 JSONArray
	public JSONArray todoList() {
		SQL = "SELECT * FROM todo_list_table ORDER BY todoDate DESC";
		JSONArray arr = new JSONArray(); 
		try {
			ps = conn.prepareStatement(SQL);
			rs = ps.executeQuery();
			while(rs.next()) {
				JSONObject obj = new JSONObject();
				obj.put("idx", rs.getString(1));
				obj.put("할일", rs.getString(2));
				obj.put("날짜", rs.getString(3));
				arr.add(obj);	
			}

		}
		catch(Exception e) {
			e.getMessage();
		}
		return arr;
		
		
	}
	// 3. 삭제 메서드 
	public int todoDelect(String idx) {
		SQL = "DELETE FROM todo_list_table WHERE idx = ?"; 
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, idx);
			ps.executeUpdate();
			return 1;
		}
		catch(Exception e) {
			System.out.println("에러메세지 :" + e.getMessage());
			return 2;
		}
	}
}
