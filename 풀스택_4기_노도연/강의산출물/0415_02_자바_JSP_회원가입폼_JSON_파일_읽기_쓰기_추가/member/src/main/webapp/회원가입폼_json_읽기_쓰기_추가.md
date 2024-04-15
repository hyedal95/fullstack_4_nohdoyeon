# 회원가입폼 json 읽기 쓰기 추가
localhost:8080/member/

1. 폼데이터 전송 확인

2. 폼데이터 JSON member.json 파일 만들기 정장


{
	"회원":[]
}

3. 파일 읽기
   경로 => E:\풀스택_4기_노도연\강의산출물\04월\0415_02_자바_JSP_회원가입폼_JSON_파일_읽기_쓰기_추가\data\member.json  (변수 path 저장)
   => 회원 => 회원 객체 속성 가져오기 => JSON파싱 JSONParser =>  
   JSONArray 회원 배열 객체 가져오기 그리고 폼 데이터 추가하기 =>
   JSONObject 회원가입폼 데이터 객체 생성
   =>JSONObject 회원 속성 안에 배열을 저장하기 

			//파일 읽기 
		String path = "E:\\풀스택_4기_노도연\\강의산출물\\04월\\0415_02_자바_JSP_회원가입폼_JSON_파일_읽기_쓰기_추가\\data\\member.json";
		FileReader r = new FileReader(path);
		//JSON파싱 
		JSONParser p = new JSONParser();
		
		JSONObject obj = (JSONObject)p.parse(r);

		// 회원 배열 객체 가져오기 그리고 폼 데이터 추가하기
		JSONArray arr = (JSONArray)obj.get("회원"); // "회원": 		[{"이름":"d","아이디":"d","비밀번호":"d"},{},{},{}]
		// 회원가입폼 데이터 객체(Object) 생성 
		JSONObject obj2 = new JSONObject();
		obj2.put("아이디", userId);
		obj2.put("비밀번호", userPw);
		obj2.put("이름", userName);
				
		arr.add(obj2);
	
		// 회원 속상 안에 배열을 저장하기
		JSONObject obj3 = new JSONObject();
		obj3.put("회원", arr);



4. 파일 쓰기
    FileWriter fileWriter = new FileWriter(path);
	fileWriter.write(obj3.toJSONString());
	fileWriter.close();
	System.out.println("저장완료");