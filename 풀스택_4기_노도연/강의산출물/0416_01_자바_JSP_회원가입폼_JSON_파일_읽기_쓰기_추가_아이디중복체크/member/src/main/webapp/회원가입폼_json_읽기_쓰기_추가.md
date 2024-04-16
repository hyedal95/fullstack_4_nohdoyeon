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
	
5. 파일 용량 확인하는 법
		File file = new File(path);
		// 파일 존재 여부=> 이그지스트(exist) 메소드는 -s 붙임 exists() =>  member.json 있다면 true, 없다면 false
		
		// 파일 경로 => 파일.getPath()
		// 파일 크기 => 바이트 Byte => 파일.length();
		// 파일이 존재하면 파일의 크기, 경로 보여줘라.
		if(file.exists() == true){
			System.out.println("파일이 있습니다.");
			System.out.println(path);
			System.out.println(file);
			System.out.printf("파일크기 Byte 단위 : %s  \n", file.length() );
			System.out.printf("파일크기 KB 단위 : %s  \n", (double)file.length()/1024 );
			System.out.printf("파일크기 MB 단위 : %s  \n", (double)file.length()/(1024*1024) );
			System.out.printf("파일경로 : %s  \n", file.getPath() );
			System.out.printf("파일존재여부 : %s  \n", file.exists() );
		}
		else{
			System.out.print("파일이 없습니다.");
			System.out.printf("파일존재여부 : %s  \n", file.exists() );
		}