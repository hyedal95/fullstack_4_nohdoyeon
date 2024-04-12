package member.user;

import java.io.FileReader;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FileOpenJSON4 {

	public static void main(String[] args) {
		// 성적JSON 파일 열기 응용 grade.json

		// 1. 파일열기(읽기)
		// 2. 파서 객체 생성
		// 3. JSONObject  파서 객체.pares(); "키" : "값"  => 키를 사용 가능하게 만든다. 
		//		=> .get("성적표")
		// 4. JSONArray 성적표 배열을 변환 .get(인덱스값) 사용
		// 5. 행단위 리스트 출력 => 키:값 또 분류해야해서 JSONObject 객체 변환 필요 .get(i) 반복문 사용 가능
		// 6. 열단위 출력 가능 .get(키) 이름과 점수 키를 사용해서 값을 출력 하기 위해 사용
		try {
			//1 2 3
			Reader r = new FileReader("E:\\풀스택_4기_노도연\\강의산출물\\04월\\0412_01_자바_JSP_JSON파일열기\\member\\src\\main\\java\\member\\user\\data\\grade.json");
			JSONParser p = new JSONParser();
			JSONObject obj = (JSONObject)p.parse(r);
			System.out.println("3번까지 출력확인 obj.get(\"성적표\") ");
			System.out.println(obj.get("성적표")); //성적표 가져오기
			System.out.println();
			//3번까지 출력확인 obj.get("성적표") 
			//[{"점수":100,"이름":"이순신"},{"점수":95,"이름":"차분희"},{"점수":55,"이름":"이소라"},{"점수":67,"이름":"정지연"},{"점수":54,"이름":"홍우현"},{"점수":75,"이름":"조지현"}]
			JSONArray arr = (JSONArray)obj.get("성적표");
			// 4 5 6
			System.out.println("4~6번까지 출력확인");
			for(int i=0; i<arr.size(); i++) {
//				System.out.println(arr.get(i));
				JSONObject obj2 =(JSONObject)arr.get(i);
				System.out.printf("이름 : %s , 점수 : %d\n", obj2.get("이름"),obj2.get("점수"));
			}
			//4~6번까지 출력확인
			//이름 : 이순신 , 점수 : 100
			//이름 : 차분희 , 점수 : 95
			//이름 : 이소라 , 점수 : 55
			//이름 : 정지연 , 점수 : 67
			//이름 : 홍우현 , 점수 : 54
			//이름 : 조지현 , 점수 : 75
			
			
		}
		catch(Exception e) {
			System.out.println("오류 메세지 : "+ e.getMessage());
		}
		
	}

}
