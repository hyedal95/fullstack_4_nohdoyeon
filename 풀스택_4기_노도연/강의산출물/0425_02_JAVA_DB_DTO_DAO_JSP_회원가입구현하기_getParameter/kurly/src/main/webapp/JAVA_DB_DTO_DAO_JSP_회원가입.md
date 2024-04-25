# JAVA DB DTO DAO JSP 회원가입
0. 환경설정 mariaDB jdbc Driver 다운 => 라이브러리 추가 빌드 완료

1. 회원가입폼 => index.html
	userId
	userPw
	userName
	userAddr
	
2. DB => DB : kurly, TABLE : user_table => SQL

CREATE TABLE user_table(
	userId VARCHAR(16) NOT NULL COMMENT '아이디',
	userPw VARCHAR(16) NOT NULL COMMENT '비밀번호',
	userName VARCHAR(30) NOT NULL COMMENT '이름',
	userAddr VARCHAR(250) NOT NULL COMMENT '주소',
	PRIMARY KEY(userId)
)ENGINE=MYISAM CHARSET=UTF8MB4;

DESC user_table;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| userId   | varchar(16)  | NO   | PRI | NULL    |       |
| userPw   | varchar(16)  | NO   |     | NULL    |       |
| userName | varchar(30)  | NO   |     | NULL    |       |
| userAddr | varchar(250) | NO   |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+

3. DTO => kurly.UserDto.java
	private String userId;
	private String userPw;
	private String userName;
	private String userAddr;
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


	
