<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@ page import="member.user.UserDto" %>
<%@ page import="org.json.simple.JSONArray" %>   
<%@ page import="org.json.simple.JSONObject" %>


<%  
	//1. 한글 인코딩
	request.setCharacterEncoding("utf-8");
	//2. HTML 폼 입력상자 => 아이디, 이름 받기
	String userId = request.getParameter("userId");
	String userName = request.getParameter("userName");
	
	//3. 폼에서 받은 데이터 자바콘솔창으로 확인
	System.out.println(userId);
	System.out.println(userName);
	
	//4. 폼에서 받은 데이터 => UserDto.java 저장하기	
	//member.user => UserDto.java
	
	//5. UserDto 객체 생성 자바에서 CTRL +SHIFT +O 자동임포트
	//	 JSP 직접 임포트
	UserDto userDto = new UserDto();
	
	//6. userDto 생성된 객체를 이용 폼데이터 저장하기 
	userDto.setUserId(userId);
	userDto.setUserName(userName);
	
	//7. userDto 생성된 객체를 이용 UserDto.java에 저장된 데이터
	// 	 게터 메서드 이용 가져오기 => JSON 객체 형식으로 만들기 
	// 	 json-simple = 라이브러리 => 다운로드해서 이용
	//	 JSONArray() 	=> ArrayList 유사 개념 => add(객체)
	//	 JSONObject() 	=> HashMap 유사 개념 => .put("아이디", userDto.getUserId())
	
	//8. json-simple = > 빌드 패스에 등록하고 build path 
 	//   라이브러리 파일(json-simple-1.1.1.jar)을 복사해서   
 	//	 webapp => [WEB-INF] =>[lib] 폴더에 붙여넣기
 	
 	//9. webapp => [WEB-INF] =>[lib] 폴더 => json-simple-1.1.1.jar 
 	//   =>마우스 선택 우측버튼 => Build Path => Add to Build Path 클릭
 	
 	//10. JSONObject() 선언 => 임포트 
 	JSONObject obj = new JSONObject();
	obj.put("아이디", userDto.getUserId());
	obj.put("이름", userDto.getUserName());
	//11. JSONArray() 선언 => JSON객체를 추가 3번 
	JSONArray arr =new JSONArray();
	arr.add(obj); //[ {1명}]
	arr.add(obj); //[{1명},{2명}]
	arr.add(obj); //[{1명},{2명},{3명}] 
			
			
	//out.println(obj); // ajax에 응답을 한다. => JSON  문자열로 응답 
	//System.out.println(obj); //자바 이클립스 콘솔창 확인 =>  JSON  문자열로 응답 
	//{"이름":"노도연","아이디":"hyedal95"}
	
	out.println(arr);// ajax에 응답을 한다. => JSON 배열
	System.out.println(arr); //자바 이클립스 콘솔창 확인 
	//[{"이름":"노도연","아이디":"hyedal95"},{"이름":"노도연","아이디":"hyedal95"},{"이름":"노도연","아이디":"hyedal95"}]
	
	
	

%>
