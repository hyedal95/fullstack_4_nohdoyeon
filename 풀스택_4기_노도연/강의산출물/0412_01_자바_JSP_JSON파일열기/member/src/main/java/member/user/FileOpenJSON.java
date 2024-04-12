package member.user;

import java.io.FileReader;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FileOpenJSON {

	public static void main(String[] args) {
		// 외부 파일 열기 => 임포트 필요 => FileReader 와 Reader (파일처리 담당) 가 필요합니다.
		// 파일처리는 반드시 예외처리가 필요합니다. try{} catch(예외 익셉션 Exception e){}
		// 매개 변수 사용해야한다.
		
		// JSON 외부파일 열기(읽기 Reader) 
		// Reader reader = new FileReader("파일경로");
		// JSONObject, JSONArray, JSONParser
		// 경로: E:\풀스택_4기_노도연\강의산출물\04월\0412_01_자바_JSP_JSON파일열기\data\member.json
		// 문자로 인식해주세요. 역슬래쉬 2개가 찍혀야 역슬래쉬 1개가 찍힘 이스케이프 형식
		// 파일처리는 반드시 try catch문에 넣어야한다. 그렇지 않으면 오류가 난다.
		

		try { //정상실행
			// 1. 외부 파일 읽기  (Reader)
			
			Reader reader = new FileReader("E:\\풀스택_4기_노도연\\강의산출물\\04월\\0412_01_자바_JSP_JSON파일열기\\data\\member.json");
			System.out.println(reader);
			// 결과문 
			// => java.io.FileReader@19e0bfd 
			// JSON 형식으로 변경해야 사용할 수 있다.
			// 2. JSON 파서 Parser => JSONParser  <=  문자열을 JSON 형식으로 변경 
			JSONParser parser = new JSONParser(); // JSON 파서
			
			// 3. 파서실행과 JSONObject 형식으로 변환  
			JSONObject result =(JSONObject)parser.parse(reader); //JSONObject  
			System.out.println(result);
			System.out.println(result.get("이름"));
			System.out.println(result.get("이메일"));
			System.out.println(result.get("아이디"));
			System.out.println(result.get("취미"));
			
			// 4. 취미는 배열 데이터
			// 	  그러므로 JSONArray 형식으로 변환해야 한다.  => 배열 반복처리 사용가능 
			// 	  배열은 .get(인덱스값)을 사용 할 수 있다.
			/*
			"이름":"이순신",
			"이메일":"leesoonshin@gmail.com",
			"아이디":"leesoonshin",
			"취미":["수영","등산","스케이트"]
			 */
 			
			JSONArray arr = (JSONArray)result.get("취미");
			System.out.println(arr);
			System.out.println(arr.get(0));
			System.out.println(arr.get(1));
			System.out.println(arr.get(2));
			
			System.out.println("<<반복문 사용>>");
			for(int i=0; i<arr.size(); i++) {
				System.out.println(arr.get(i));
			}
			
		
		}
		catch(Exception e) { //오류발생시 오류메시지 출력
			System.out.println("오류메시지 = > " + e.getMessage());
		}
	}

}
