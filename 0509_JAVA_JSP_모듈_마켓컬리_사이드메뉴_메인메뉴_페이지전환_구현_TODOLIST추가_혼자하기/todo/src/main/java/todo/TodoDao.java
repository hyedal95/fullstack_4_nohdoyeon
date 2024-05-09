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
	// 1. JDBC 드라이버,컨넥션 설정 [기본생성자]
	public TodoDao() {
		//기본생성자
		try{
			//JDBC 드라이버 설정
			Class.forName("org.mariadb.jdbc.Driver");
			//JDBC 컨넥션 연결
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/doyeon_todo","root","1234");
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	// 2. todoInsert()
	public int todoInsert(String todo) {
		SQL = "INSERT INTO todo_table (todo) VALUES(?)";
		try {
			ps =conn.prepareStatement(SQL);
			ps.setString(1, todo);
			ps.executeUpdate();
			return 1;
		}
		catch(Exception e) {
			e.getMessage();
			return 2;
		}
	}
	// 3. todoList() => 할일 리스트 출력
	@SuppressWarnings("unchecked")
	public JSONArray todoList() {
		JSONArray arr = new JSONArray();
		SQL = "SELECT * FROM todo_table ORDER BY todoDate DESC ";
		try {
			ps = conn.prepareStatement(SQL);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				JSONObject obj = new JSONObject();
				obj.put("idx", rs.getString(1));
				obj.put("할일", rs.getString(2));
				obj.put("완료", rs.getString(3));
				obj.put("날짜", rs.getString(4));
				
				arr.add(obj);
			}
		}
		catch(Exception e) {
			e.getMessage();
		}
		return arr;
	}
	
	// 4. todoDoneUpdate() => 체크박스구현하기
	public int todoDoneUpdate(int idx, int done) {
		SQL = "UPDATE todo_table SET done=? ,todoDate=now() WHERE idx=?";
		try {
			ps =conn.prepareStatement(SQL);
			ps.setInt(1, done);
			ps.setInt(2, idx);
			ps.executeUpdate();
			return 1;
		}
		catch(Exception e) {
			e.getMessage();
			return 2;
		}
	}
	// 5. todoUpdate()
	public int todoUpdate(int idx,String todo) {
		SQL = "UPDATE todo_table SET todo=? ,todoDate=now() WHERE idx=?";
		try {
			ps =conn.prepareStatement(SQL);
			ps.setString(1, todo);
			ps.setInt(2, idx);
			ps.executeUpdate();
			return 1;
		}
		catch(Exception e) {
			e.getMessage();
			return 2;
		}
	}
	// 6. todoDelete() 
	public int todoDelete(int idx) {
		SQL = "DELETE FROM todo_table WHERE idx=?";
		try {
			ps =conn.prepareStatement(SQL);
			ps.setInt(1, idx);
			ps.executeUpdate();
			return 1;
		}
		catch(Exception e) {
			e.getMessage();
			return 2;
		}
	}
}
