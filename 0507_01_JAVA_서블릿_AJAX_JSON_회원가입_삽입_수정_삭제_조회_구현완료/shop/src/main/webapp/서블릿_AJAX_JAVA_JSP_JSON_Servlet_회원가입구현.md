# Servlet 구현하기

<구현방법 1단계> 
: 회원가입폼 (전송버튼클릭)=> AJAX 전송=> 서블릿(전송받음) => DTO(전달받음) => 응답 JSON => AJAX
<구현방법 2단계> : DB까지 저장함.
: 회원가입폼 (전송버튼클릭)=> AJAX 전송=> 서블릿(전송받음) => DTO(전달받음) => DAO(전달) => DB => AJAX

AJAX 안 쓸 때는 화면 전환이 되었으나,
AJAX 쓸 때는 화면 전환 없이 일부분 데이터만 새로고침되는 비동기식 통신이다.


1. index.html
   : 회원가입폼
   : 아이디, 비밀번호, 이름, 이메일, 휴대폰

   
2. signup.js
   : AJAX
   
3. Signup.java
   : 서블릿 Servlet
   : name: signup
   : url : /signup.do

JSONObject 객체 생성 
JSONObject obj = new JSONObject();
obj.put("아이디", userId);
obj.put("비밀번호", userPw);
obj.put("이름", userName);
obj.put("이메일", userEmail);
obj.put("휴대폰", userHp);
		
response 응답 => JSON

	1. JSON 객체
	PrintWriter w = response.getWriter();
	w.println(obj); // 전송되는 JSON은 반드시 문자열로 전송해라. <= obj.toString()이 생략된것이다. json 문자열로 바뀐다. 검정색
	
	
	2. JSON 문자열
	response.setContentType("text/html; charset=utf-8; "); => HTML 코딩할 때 
	PrintWriter w = response.getWriter();
	w.println(obj.toString());
	
	
	3. JSON 문자열
	response.setContentType("text/html; charset=utf-8; "); => HTML 코딩할 때 
	PrintWriter w = response.getWriter();
	w.println(obj);


4. SignupDto.java
   : 클래스 Class DTO
	private String userId;
	private String userPw;
	private String userName;
	private String userEmail;
	private String userHp;
	
   
5. DB
   : 데이터베이스 생성 => shop
   : 테이블 생성 => signup
   
   	userId VARCHER(16) NOT NULL,
	userPw VARCHER(16) NOT NULL,
	userName VARCHER(30) NOT NULL,
	userEmail VARCHER(250) NULL,
	userHp VARCHER(13) NOT NULL,
	PRIMARY KEY(userId)

6. SignupDao.java
   : 클래스 Class DAO

   : JDBC 설정 => 기본생성자() => 서블릿에서 실행
   : JDVC 컨넥션

   
7. DAO SQL 메서드
   : 입력 (저장) 메서드 => signupInsert()
   : 읽기 (조회) 메서드 => signupList()
   : 수정 메서드 => signupUpdate()
   : 삭제 메서드 => signupDelete()