# 2024-04-24 수업내용
# 회원가입 JAVA(DTO DAO) DB JDBC JSP 웹개발
# 배포 시작하면 리눅스도 사용해야 하기 때문에 영문사용 익숙해질 것
# 프로젝트명 = DB의 데이터베이스명 같게 설정하는 경우 많음. 
* 각 테이블마다 DTO가 존재할 수 있다. 테이블명을 그대로써서 Dto 붙이기
- 프로젝트 이름 => shop
- 회원가입폼 설계 => [signup_table 테이블의 필드 조건들]
  - 아이디		userId VARCHAR(16) NOT NULL	PK	
  - 비밀번호		userPw VARCHAR(16) NOT NULL		
  - 이름			userName VARCHAR(30) NOT NULL		
  - 휴대폰		userHp VARCHAR(13) NOT NULL	 	
  - 이메일		userEmail VARCHAR(250) NULL  	
  - 주소			userAddr VARCHAR(250) NOT NULL	
  - 가입일		userGaib TIMESTAMP DEFAULT CURRENT_STAMP NOT NULL	
	
1. index.html 
	=> 회원가입폼 UIUX 디자인 입력상자 전송버튼 
	=> 톰켓[WAS] 서버 실행 
	=> 회원가입폼 띄우기
	=> http://localhost:8080/shop/index.html
	=> localhost:8080/shop/index.html
	=> localhost:8080/shop/
	=> localhost:8080/shop

2. DTO => JAVA => shop.signupDto.java=> 입출력 설계 => getter() ,setter()

3. DB 설계 = > 데이터베이스 생성 : shop => 테이블 생성 : signup_table

```SQL
CREATE TABLE  `signup_table` (
    `userId` VARCHAR(16) NOT NULL COMMENT '아이디',
    `userPw` VARCHAR(16) NOT NULL COMMENT '비밀번호',	
    `userName` VARCHAR(30) NOT NULL COMMENT '이름',	
    `userHp` VARCHAR(13) NOT NULL COMMENT '휴대폰', 	
    `userEmail` VARCHAR(250) NULL COMMENT '이메일',  	
    `userAddr` VARCHAR(250) NOT NULL COMMENT '주소',
    `userGaib` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '가입일',
    PRIMARY KEY(`userId`)
) ENGINE= `MyISAM` CHARSET=`UTF8MB4`;
+-----------+--------------+------+-----+---------------------+-------+
| Field     | Type         | Null | Key | Default             | Extra |
+-----------+--------------+------+-----+---------------------+-------+
| userId    | varchar(16)  | NO   | PRI | NULL                |       |
| userPw    | varchar(16)  | NO   |     | NULL                |       |
| userName  | varchar(30)  | NO   |     | NULL                |       |
| userHp    | varchar(13)  | NO   |     | NULL                |       |
| userEmail | varchar(250) | YES  |     | NULL                |       |
| userAddr  | varchar(250) | NO   |     | NULL                |       |
| userGaib  | timestamp    | NO   |     | current_timestamp() |       |
+-----------+--------------+------+-----+---------------------+-------+


```


<jsp:useBean id="signupDto" class="shop.SignupDTO" scope="page" /> 
<jsp:setProperty property="userId" name="signupDto" />
<jsp:setProperty property="userPw" name="signupDto" />
<jsp:setProperty property="userName" name="signupDto" />
<jsp:setProperty property="userHp" name="signupDto" />
<jsp:setProperty property="userEmail" name="signupDto" />
<jsp:setProperty property="userAddr" name="signupDto" />


4. JSP => 파일명: signup_action.jsp => (JAVA영역내) => JDBC 환경설정 => 자바 + DB
  - 인코딩 => utf8 <% request.setCharacterEncoding("utf-8"); %>
  - DTO 자바빈즈를 사용하기 
  <jsp:useBean id="signupDto[인스턴스명; 객체명]" class="shop.SignupDto[DTO경로]" scope="page" />
  * 클래스 가져와서  signupDto 인스턴스(객체) 생성한 것.
  <jsp:setProperty property="클래스의 사용할 변수명" name="객체이름" />
  * 클래스 내부에 있는 변수들의 속성을 만들어라 .  
  - 입력데이터 확인 => 콘솔창으로
  * 요기서 오류 !! 
  => MariaDB JDBC 드라이버 추가 
  => [webapp] =>[WEB-INF] => 붙여넣기 => 마우스 우측 클릭 => Build Path => Add...
  => [lib] => mariadb-java-client-2.4.0.jar
  - JDBC 설정 
  => 예외처리 =>Class.forName("org.mariadb.jdbc.Driver"); => 콘솔창으로 드라이버 접속 성공여부 확인
  - 데이터베이스 컨넥션(CONNECTION) 접속

====================5~8번 단계를 통해 CRUD구현 이루어진다.=====================================
5. 입력폼 입력 => DTO 전달 (입력) => DB에 저장 =>  CREATE[C]구현

6. 회원 정보 목록 조회 SELECT=> DB 데이터 가져오기 => JSON 데이터로 변경 => 목록 출력 Read[R](Select)

7. 회원 정보 수정 UPDATE[U]

8. 회원 정보 삭제 DELETE[D]

=========================================================================================




<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="shop.SignupDTO" %>

<% 	
	request.setCharacterEncoding("UTF-8"); 

	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	String userName = request.getParameter("userName");
	String userHp = request.getParameter("userHp");
	String userEmail = request.getParameter("userEmail");
	String userAddr = request.getParameter("userAddr");

	SignupDTO signupDto = new SignupDTO();
	
	signupDto.setUserId(userId);
	signupDto.setUserPw(userPw);
	signupDto.setUserName(userName);
	signupDto.setUserHp(userHp);
	signupDto.setUserEmail(userEmail);
	signupDto.setUserAddr(userAddr);
	
	
%>





아이디 : <%=signupDto.getUserId() %>
비밀번호 : <%=signupDto.getUserPw() %>
이름 : <%=signupDto.getUserName() %>
휴대폰 : <%=signupDto.getUserHp() %>
이메일 : <%=signupDto.getUserEmail() %>
주소 : <%=signupDto.getUserAddr() %>


<%
	// 이클립스=> 콘솔창 확인
	System.out.println("아이디 : " + signupDto.getUserId() );
	System.out.println("비밀번호 : " + signupDto.getUserPw() );
	System.out.println("이름 : " + signupDto.getUserName() );
	System.out.println("휴대폰 : " + signupDto.getUserHp() );
	System.out.println("이메일 : " + signupDto.getUserEmail() );
	System.out.println("주소 : " + signupDto.getUserAddr() );
%>

<%
	try{
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("mariadb jdbc Driver 마리아디비 드라이버 설정 성공!");
	}
	catch(Exception e){
		System.out.println("mariadb jdbc Driver 마리아디비 드라이버 설정 실패!");
		System.out.println("에러 메세지 :" + e.getMessage());
	}
	
%>