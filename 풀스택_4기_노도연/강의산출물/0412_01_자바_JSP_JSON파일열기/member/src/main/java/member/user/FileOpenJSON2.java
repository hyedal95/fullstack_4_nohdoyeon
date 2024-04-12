package member.user;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FileOpenJSON2 {
	
	// # 파일처리는 반드시 예외처리를 해야한다. try catch 없이 메인메소드에서 예외처리 가능

	public static void main(String[] args) throws IOException, ParseException {
		// JSON 외부 파일 읽기(열기)
		// 
		
		// 예외처리
		
			// 1. 파일읽기
			Reader r = new FileReader("E:\\풀스택_4기_노도연\\강의산출물\\04월\\0412_01_자바_JSP_JSON파일열기\\data\\member2.json");
			// 2. JSONParser 파서 객체 생성
			JSONParser p = new JSONParser();
			// 3. JSONObject 형식으로 변경 파서.실행 
			
			JSONObject obj =(JSONObject)p.parse(r);
			
			System.out.println(obj);
			System.out.println(obj.get("번호"));
			System.out.println(obj.get("이름"));
			System.out.println(obj.get("주소"));
			System.out.println(obj.get("휴대폰"));
			System.out.println(obj.get("MBTI"));
			
		
		
	}

}
