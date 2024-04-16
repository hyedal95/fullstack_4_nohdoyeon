<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="org.json.simple.*" %>
<%@ page import="org.json.simple.parser.*" %>
<%@ page import="java.io.*" %>

<%
	request.setCharacterEncoding("utf-8");

	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	String userName = request.getParameter("userName");
	

	try{
		//파일 읽기 
		String path = "E:\\풀스택_4기_노도연\\강의산출물\\04월\\0416_01_자바_JSP_회원가입폼_JSON_파일_읽기_쓰기_추가_아이디중복체크\\data\\member.json";
		File file = new File(path);
		
		
		FileReader r = new FileReader(file); // path = file 
		//JSON파싱 
		JSONParser p = new JSONParser();
		
		JSONObject obj = (JSONObject)p.parse(r);

		// 회원 배열 객체 가져오기 그리고 폼 데이터 추가하기
		JSONArray arr = (JSONArray)obj.get("회원"); // "회원": [{"이름":"d","아이디":"d","비밀번호":"d"},{},{},{}]
		//{"회원":[{},{}...]}
		//[{"이름":"노도연4","아이디":"hyedal92","비밀번호":"1234"},{"이름":"노도연4","아이디":"hyedal92","비밀번호":"1234"}]
		// 아이디
		// 비밀번호
		// 이름
		// 1. 반복문 구현 배열을 JSONObject로 분리
		Boolean t = false;
		int f =0;
		for(int i=0; i<arr.size(); i++){ // 배열 목록
			// 1. 행단위 출력
			//System.out.println((i+1) +"."+ arr.get(i) ); 행 데이터 확인
			
			// 2. 행단위(줄단위) 배열 값을 => JSONObject 분리 
			JSONObject arrobj = (JSONObject)arr.get(i);
			// 3. 아이디 속성만 출력
			System.out.println(arrobj.get("아이디")); // 아이디 속성만 출력 
			// 4. 아이디 찾기 = > 중복된 아이디  
			if(arrobj.get("아이디").equals(userId)==true){
				f =1 ; 	  //중복체크 정수 변수
				t = true; //중복체크 부울변수
				System.out.println(userId + "는 이미 사용중인 아이디입니다.");
				break;
			}
			else{
				
				
			}
			
		}
		
		// 반복문 중복된 아이디입니다. 다른 아이디 사용
		// .equals(userId) 비교
		
				
		if(f==0){ //f==0 or t==false or t!=true or f!=1 일 경우에 저장한다. 
			// 회원가입폼 데이터 객체(Object) 생성 

			JSONObject obj2 = new JSONObject();
			obj2.put("아이디", userId);
			obj2.put("비밀번호", userPw);
			obj2.put("이름", userName);
					
			arr.add(obj2);
		
			// 회원 속상 안에 배열을 저장하기
			JSONObject obj3 = new JSONObject();
			obj3.put("회원", arr);
	
			// 파일쓰기
			FileWriter fileWriter = new FileWriter(path);
			fileWriter.write(obj3.toJSONString());
			fileWriter.close();
			
			System.out.println("저장완료");
						
		}
			
	}
	catch(IOException e){
		System.out.println("에러메세지:" +e.getMessage() );
	}
	

	
%>