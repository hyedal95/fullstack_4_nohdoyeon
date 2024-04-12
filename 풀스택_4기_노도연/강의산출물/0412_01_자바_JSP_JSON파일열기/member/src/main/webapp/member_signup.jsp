<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "java.io.FileReader" %>    
<%@ page import = "java.io.FileWriter" %>    
<%@ page import = "java.io.Reader" %>    
<%@ page import = "org.json.simple.JSONArray" %>    
<%@ page import = "org.json.simple.JSONObject" %>    
<%@ page import = "org.json.simple.parser.JSONParser" %>    
    
<% 
	request.setCharacterEncoding("UTF-8"); 
	

	try {
		// 1. 경로와 파일명=> 회원 JSON 배열 객체 가져오기 
		String path = "E:\\풀스택_4기_노도연\\강의산출물\\04월\\0412_01_자바_JSP_JSON파일열기\\member\\src\\main\\java\\member\\user\\data\\list.json";
		// list.json 가져오기 => 회원 
		Reader reader = new FileReader(path);
		JSONParser p = new JSONParser();
		
		JSONObject obj = (JSONObject)p.parse(reader);
		JSONArray arr = (JSONArray)obj.get("회원"); // 데이터 추가 [] 
		System.out.println(arr);
		// 2. 저장 데이터 (폼데이터)
		String userName= request.getParameter("userName");
		int userAge= Integer.parseInt(request.getParameter("userAge")) ;
		
		JSONObject obj2 = new JSONObject();
		obj2.put("이름",userName);
		obj2.put("나이",userAge);
		arr.add(obj2); // 데이터 추가 [{"이름":"조지현","나이":35}] 예상
		
		// 3. 회원 키 속성 만들기 
		JSONObject obj3 = new JSONObject();
		obj3.put("회원", arr);// {"회원":[{"이름":"조지현","나이":35}]}
		// 파일쓰기 FileWriter
		// 파일 이름 => list.json
		try {
			FileWriter file = new FileWriter(path); // 파일쓰기 객체 생성
			file.write(obj3.toJSONString()); //파일쓰기
			file.close();//파일닫기
			out.println("저장완료");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	catch(Exception e) {
		System.out.println("에러 메세지 :" + e.getMessage());
	}
%>


