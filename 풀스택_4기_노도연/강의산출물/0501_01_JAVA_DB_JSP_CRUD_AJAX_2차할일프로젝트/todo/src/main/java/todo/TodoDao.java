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
			//드라이버 연결
			Class.forName("org.mariadb.jdbc.Driver");
			//컨넥션 연결
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/mytodo","root","1234");
		}
		catch(Exception e) {
			e.getMessage();
		}
	}

	// 1. 입력(저장)
	public int todoInsert(String todo) {
		SQL = "INSERT INTO todo_table(todo) VALUES(?)";
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, todo);
			ps.executeUpdate();
			return 1;
		}
		catch(Exception e) {
			e.getMessage();
			return 2;
		}
	}
	// 2. 할일 목록 LIST
	// 목록은 JSONArray를 가져와야함 ctrl+ shift + o 자동 임포트
	// JSONArray 임포트해줄것! 
	public JSONArray todoList() {
		// Array 선언
		JSONArray arr = new JSONArray();
		SQL = "SELECT * FROM todo_table ORDER BY todoDate DESC ";
		try {
			ps = conn.prepareStatement(SQL);
			rs = ps.executeQuery(); 
			while(rs.next()){// 다음 줄 데이터 반복 :next가 있으면 실행하는 것.
				// JSON 데이터 형식 만들기 반드시 문자열로 가져온다.
				// 1행(줄) 시작
				JSONObject obj = new JSONObject(); // {"idx" : 1} X => json형태에 어긋남. {"idx" : "1"} O getString으로 가져오는 이유
				//칸(열)번호 데이터 숫자라도 반드시 문자열로 가져온다. 
				obj.put("idx", rs.getString(1)); // 1열 예] {"idx" : "idx"}
				obj.put("할일", rs.getString(2)); // 2열 예] {"할일" : "todo"}
				obj.put("완료", rs.getString(3)); // 3열 예] {"완료" : "done"}
				obj.put("날짜", rs.getString(4)); // 4열 예] {"날짜" : "todoDate"}
				// 행(줄) 끝
				
				arr.add(obj); // 줄 추가
			}
		}
		catch(Exception e) {
			e.getMessage();
		}
		
		return arr; // 데이터 들어간 것이 리턴이 된다.
		
	}
	// 3. 체크박스 구현
	// todoDoneUpdate()
	public int todoDoneUpdate(int idx, int done) { // 매개변수 idx, done 들어옴
		SQL = "UPDATE todo_table SET done=?, todoDate = now() WHERE idx=?";
		try {
			ps = conn.prepareStatement(SQL);
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
	// 4. 할일 수정 - 할일 todo 수정, 업데이트 todoDate 날짜 수정 
	// todoUpdate()
	public int todoUpdate(int idx, String todo) { // 매개변수 idx, todo 들어옴
		SQL = "UPDATE todo_table SET todo=?, todoDate=now() WHERE idx=? ";
		try {
			ps = conn.prepareStatement(SQL);
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
	
	// 5. 삭제 버튼 
	// 	todoDelete()
	public int todoDelete(int idx) { // 매개변수 idx 들어옴
		SQL = "DELETE FROM todo_table WHERE idx=? ";
		try {
			ps = conn.prepareStatement(SQL);
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
