package member.user;

import java.io.FileReader;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FileOpenJSON3 {

	public static void main(String[] args) {

		try {
			
			Reader r = new FileReader("E:\\풀스택_4기_노도연\\강의산출물\\04월\\0412_01_자바_JSP_JSON파일열기\\member\\src\\main\\java\\member\\user\\data\\경기도_안산시_애완동물배변봉투함 현황_20200401.json");
			
			JSONParser parser = new JSONParser();
		
			JSONArray arr = (JSONArray)parser.parse(r);
			
			for(int i=0; i<arr.size(); i++) {
				//System.out.println(arr.get(i));
				JSONObject obj = (JSONObject)arr.get(i);
				
					System.out.printf("%2d. 시설명: %s, 주소 : %s , 주소상세설명 : %s\n", i+1 ,obj.get("시설명"),obj.get("소재지지번주소"),obj.get("주변 상세설명") );
				
				
			}

		}
		catch(Exception e) {
			System.out.println("오류 메시지 : " + e.getMessage());
		}
		

	}

}
