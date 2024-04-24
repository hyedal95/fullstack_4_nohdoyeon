# 프로젝트 이름 kurly

localhost:8080/kurly
1. index.html
아이디	userId  16
비밀번호	userPw	16
이름		userName	30
휴대폰	userHp	13

2. SignupDTO.java
	- getter() 
	- setter()
```JAVA
	private String userId;
	private String userPw;
	private String userName;
	private String userHp;
	마우스 우측 => 게터 세터 만들기
```
	- useBean <= 자바 빈즈 <= 
	완료!!
```JSP
	<jsp:useBean id="signupDto" class="kurly.SignupDTO" scope="page" />
	<jsp:setProperty property="userId" name="signupDto" />
	<jsp:setProperty property="userPw" name="signupDto" />
	<jsp:setProperty property="userName" name="signupDto" />
	<jsp:setProperty property="userHp" name="signupDto" />
```

3.signupAction.jsp => JDBC 설정 & 컨넥션 (db이름, 사용자아이디, 사용자비밀번호) 설정
DB 이름 :kurly
TABLE 이름 : signup_table

CREATE DATABASE kurly;
USE kurly;

```SQL
-- 테이블 생성
CREATE TABLE `signup_table` (
	`userId` VARCHAR(16) NOT NULL COMMENT '아이디',
	`userPw` VARCHAR(16) NOT NULL COMMENT '비밀번호',
	`userName` VARCHAR(30) NOT NULL COMMENT '이름',
	`userHp` VARCHAR(13) NOT NULL COMMENT '휴대폰번호',
	PRIMARY KEY(`userId`)
)ENGINE=`MYISAM` CHARSET=`UTF8MB4`;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| userId   | varchar(16) | NO   | PRI | NULL    |       |
| userPw   | varchar(16) | NO   |     | NULL    |       |
| userName | varchar(30) | NO   |     | NULL    |       |
| userHp   | varchar(13) | NO   |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+
```

4. 테이블에 저장하기
ps, sql
insert into