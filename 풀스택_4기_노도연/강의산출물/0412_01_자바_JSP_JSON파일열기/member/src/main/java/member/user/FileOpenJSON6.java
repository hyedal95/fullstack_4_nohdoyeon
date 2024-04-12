package member.user;

import java.io.FileReader;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FileOpenJSON6 {

	public static void main(String[] args) {
		
		try {
			Reader r = new FileReader("E:\\풀스택_4기_노도연\\강의산출물\\04월\\0412_01_자바_JSP_JSON파일열기\\member\\src\\main\\java\\member\\user\\data\\경기도_용인시_노인복지시설 현황_20220721.json");
			JSONParser p = new JSONParser();
			
			JSONArray arr = (JSONArray)p.parse(r);
			
			for(int i=0; i<arr.size(); i++) {
				
				JSONObject obj = (JSONObject)arr.get(i);
				//if(obj.get("정원").equals("29")) {
					
					System.out.printf("%3d. 시설명: %s, 주소: %s, 전화번호: %s, 정원: %s , 업데이트날짜: %s \n", i+1, obj.get("시설명"), obj.get("주소"), obj.get("전화번호"), obj.get("정원"), obj.get("데이터기준일자"));
				//}
				
			}
		}
		catch(Exception e) {
			System.out.println("에러메시지 : "+ e.getMessage());
		}

	}

}
