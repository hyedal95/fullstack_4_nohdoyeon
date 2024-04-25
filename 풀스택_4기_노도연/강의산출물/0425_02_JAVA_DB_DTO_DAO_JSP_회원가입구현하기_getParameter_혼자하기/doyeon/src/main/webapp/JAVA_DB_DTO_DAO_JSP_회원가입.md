# JAVA DB DTO DAO JSP 회원가입
0. 환경설정 mariaDB jdbc Driver 다운 => 라이브러리 추가 빌드 완료

1. 회원가입폼 => index.html
	userId
	userPw
	userNick
	
2. DB => DB : doyeon, TABLE : user_table => SQL

CREATE TABLE signup2(

userId VARCHAR(50) NOT NULL COMMENT '아이디' CHECK(userId LIKE '%@%'),

userPw VARCHAR(20) NOT NULL COMMENT '비밀번호',

userNick VARCHAR(20) NOT NULL COMMENT '닉네임',

PRIMARY KEY(userId,userNick)

) ENGINE=MYISAM CHARSET=UTF8MB4;

DESC signup2;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| userId   | varchar(50) | NO   | PRI | NULL    |       |
| userPw   | varchar(20) | NO   |     | NULL    |       |
| userNick | varchar(20) | NO   | PRI | NULL    |       |
+----------+-------------+------+-----+---------+-------+

3. DTO => kurly.UserDto.java
	private String userId;
	private String userPw;
	private String userNick;

=> getter(), setter() 생성
4. DAO => kurly.UserDao.java
	- 기본생성자 UserDao(){} JDBC 설정
	- 저장메서드 userInsert(){}

=> 먼저 할 일 ! => import java.sql.*;
=> 드라이버 설정 연결
=> 컨넥션 설정 연결 

5. JSP => user_action.jsp
	- request.getParameter("");
	- dto.setParameter("");

=> 임포트
	=> 	<%@ page import="kurly.UserDao" %>
	=>	<%@ page import="kurly.UserDto" %>
=> 인코딩 => utf-8
=> html post 요청(request)한 데이터 파라미터 getParameter 데이터값 가져오기 get
=> getParameter 데이터값 DTO에 저장하기
=> 세터함수 구현 => 저장
=> jdbc 설정 확인 => 객체 생성 => DAO 기본 생성자 실행


	
