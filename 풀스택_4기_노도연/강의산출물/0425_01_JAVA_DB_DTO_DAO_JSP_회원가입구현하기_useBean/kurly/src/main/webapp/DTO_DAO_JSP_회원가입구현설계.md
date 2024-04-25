# JAVA DAO
- 서버 경로 : localhost:8080/kurly/index.html
- 프로젝트 이름 : kurly
- DB 이름 : kurly
- TABLE 이름 : signup

CREATE TABLE signup(
  userId VARCHAR(16) NOT NULL COMMENT '아이디',
  userName VARCHAR(30) NOT NULL COMMENT '이름',
  userHp VARCHAR(13) NOT NULL COMMENT '휴대폰',
  PRIMARY KEY(userId)
 ) ENGINE=MYISAM CHARSET=UTF8MB4;
 
DESC signup;
--+----------+-------------+------+-----+---------+-------+
--| Field    | Type        | Null | Key | Default | Extra |
--+----------+-------------+------+-----+---------+-------+
--| userId   | varchar(16) | NO   | PRI | NULL    |       |
--| userName | varchar(30) | NO   |     | NULL    |       |
--| userHp   | varchar(13) | NO   |     | NULL    |       |
--+----------+-------------+------+-----+---------+-------+ 


- 마켓컬리 회원가입폼 : index.html
- 액션 파일 : signup_action.jsp 
**만약 로그인 입출력 한다고 하면 로그인 담당 DTO가 따로 또 추가해야함. **
- DTO : kurly.SignupDTO.java => 회원가입 입출력 DTO
**0425_ DAO도 생성예정 => 데이터베이스 접근 관리 담당 예정**
**어제 수업때 했던 JSP 파일에서 코딩하던 내용을 JAVA파일로 생성해서 DAO로 관리해줄 예정**
- DAO : kurly.UserDAO.java => 회원에 관련된 공통 DAO 담당

흐름 파악 = FLOW CHART[플로우차트]
	=> DB 이름  kurly 생성 
	=> TABLE 이름  signup 생성 
	=> HTTP통신
	=> index.html => 회원가입 버튼 클릭 
	=> HTTP통신 입력상자 값들이(GET파라미터) POST방식 전송 
	=> signup_action.jsp DTO useBean으로 값 받기 => HTML에 자바포함 사용
	=> DAO JDBC 설정(데이터베이스랑 자바를 이어주는 환경설정) => DAO DB(SQL)에 저장 
	=> 자바에 코딩하고 HTML도 보낼 수 있음.( 이것을 서블릿 SERVLET 이라고 부른다.)
	* 서블릿: 자바 - HTML 직접 접근 방식 + 속도 빠름.

제작순서
1. DB kurly, TABLE  signup 생성

2. index.html 생성 => 입력폼

3. DTO => java 파일 생성 => kurly.SignupDTO.java클래스 생성
		=> getter(), setter() 생성
		
4. JSP => signup_action.jsp 
			=> 인코딩 "utf-8"
			=> 자바빈즈 액션스크립트 => useBean 사용 class="SignupDTO"  
			<jsp:useBean id="signupDTO" class="SignupDTO" scope="page" />
			
* 관리자용이냐 사용자용이냐 그 2가지만 분류해주면된다.
* 파일명이 UserDAO 인 이유 /// 그럼 관리자는 AdminDAO인가..;; 
5. DAO => kurly.UserDAO.java
		=> Java Resources => [kurly] 패키지 => UserDAO.java CLASS 생성 [ 기본생성자 2번째 버튼 체크 ]
		=> 기본생성자 => UserDAO(){} => JDBC 설정 
* 자바를 고치면 서버를 껏다가 다시 켜야함.	
6. DAO => 회원 가입 저장 메서드 생성 => signupInsert(){}
		=> return 값 확인하기 (성공: 1, 실패:2) ex) 성공 실패는 자료형 문자열로 변경하고 다르게 리턴해도 상관없음.
		=> SQL => INSERT INTO signup (필드1,필드2,필드3) VALUES(?,?,?);
		=> ? 변수 받을 수 있는 ps  쌍Statement