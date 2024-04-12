package member.user;

import java.io.FileReader;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FileOpenJSON5 {

	public static void main(String[] args) {
		
		try {
			//1. 파일열기
			//2. JSON 파서
			//3. JSONObject
			//4. JSONArray
			//5. 그 안에 반복문 그 안에 오브젝트 그리고 실행 
			Reader r = new FileReader("E:\\풀스택_4기_노도연\\강의산출물\\04월\\0412_01_자바_JSP_JSON파일열기\\member\\src\\main\\java\\member\\user\\data\\grade2.json");
			
			JSONParser p = new JSONParser();
			
			JSONObject obj = (JSONObject)p.parse(r);
			
			JSONArray arr = (JSONArray)obj.get("성적표");

			for(int i=0; i< arr.size(); i++) {				
				JSONObject obj2 = (JSONObject)arr.get(i);				
				if(obj2.get("포지션").equals("댄스") ) {

					 System.out.printf("%d. 이름: %s , 포지션: %s , 점수: %s\n", i+1, obj2.get("이름"),obj2.get("포지션"), obj2.get("점수"));					 
				}				
			}
		}
		catch(Exception e) {
			System.out.println("에러 메세지  :" + e.getMessage());
		}

	}

}
