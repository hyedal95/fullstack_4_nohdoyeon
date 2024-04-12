package member.user;

import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FileOpenJSON {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String area; 
		
		
		 
		try { 
			
			Reader r = new FileReader("E:\\풀스택_4기_노도연\\강의산출물\\04월\\JSP_전국무료급식소_JSON_SIMPLE_파일열기\\data\\전국무료급식소표준데이터.json");
			
			JSONParser p = new JSONParser(); 
			
			
			JSONArray arr = (JSONArray)p.parse(r);
			
			System.out.println("경상북도 성주군,대전광역시 중구,충청북도 청주시,서울특별시 노원구,서울특별시 강남구,서울특별시 마포구,서울특별시 성북구,강원특별자치도 동해시,서울특별시 금천구,대구광역시 中");
			System.out.println("지역을 입력해주세요.");
			area = sc.nextLine();
			
			for(int i = 0; i<arr.size(); i++) {
				
				JSONObject obj = (JSONObject)arr.get(i);
				
				if(obj.get("제공기관명").equals(area)) {
					System.out.printf("%4d. 시설명: %s , 급식요일: %s, 급식시간: %s \n", i+1, obj.get("시설명"), obj.get("급식요일"), obj.get("급식시간"));
				}
				
			}
			
			
			
			
		}
		catch(Exception e) { 
			System.out.println("오류메시지 = > " + e.getMessage());
		}

	}

}
