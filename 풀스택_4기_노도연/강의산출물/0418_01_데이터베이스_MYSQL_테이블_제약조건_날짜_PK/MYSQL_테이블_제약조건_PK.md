# 쇼핑몰 회원관리 테이블
- 모든 식별자 소문자 사용 
=> 단 폼 화면에서 보내온 name 을 그대로 받는다.
=> 카멜케이스 idx userId userName userPw ...
- 모든 명령어는 대문자 사용 권장
  예] HTML form 요소 input type='text' name ='userId'
      => 입력받은 내용이 서버 JSP request getParameter('userId')로 받았다. 
      => 데이터베이스 userId로 전달한다. 
      => 그래서 폼 화면에서 보내온 네임속성 그대로 받는다.

- DATABASE : shop
- TABLE : 회원 member_table
  - 인코딩 UTF8   CHARSET=UTF8
  - 필드1 idx INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
*BIGINT(64bit까지 지원됨, 예로 은행의 경우 bigint 사용함.)
  - 필드2 아이디 userId VARCHAR(16) NOT NULL PRIMARY KEY,
  - 필드3 비밀번호 userPw VARCHAR(16) NOT NULL ,
  - 필드4 이름 userName VARCHAR(30) NOT NULL, 
  - 필드5 이메일 userEmail VARCHAR(100) NOT NULL ,
  - 필드6 휴대폰 userHp VARCHAR(13) NULL, 
  - 필드7 성별 userGender VARCHAR(4) NULL CHECK (userGender IN('남성','여성','선택안함')),  
*제약조건 =>체크CHECK( 성별 IN('남성','여성','선택안함'))
*userGender에서 남성,여성,선택안함 중 하나만 입력할 수 있다.
  - 필드8 주소 userAddr VARCHAR(250) NOT NULL,
  - 필드9 가입일 userGaib TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

  
  - 필드10 가입일 userGaib TIMESTAMP NOT NULL DEFAULT NOW(),
*가입일(TIMESTAMP)은 기본값 (Default)으로 날짜와 시간 자동 기록
*지금 NOW () => CURRENT_TIMESTAMP 커렌트 타임스탬프

CHECK IN




```SQL
    SHOW DATABASES;
    USE shop;

    SHOW TABLES;
    --회원테이블 생성
    CREATE TABLE member(
    idx INT NOT NULL AUTO_INCREMENT,
    userId VARCHAR(16) NOT NULL,
    userPw VARCHAR(16) NOT NULL,
    userName VARCHAR(30) NOT NULL, 
    userEmail VARCHAR(100) NOT NULL,
    userHp VARCHAR(13) NULL, 
    userGender VARCHAR(4) NULL CHECK (userGender IN('남성','여성','선택안함')),  
    userAddr VARCHAR(250) NOT NULL,
    userGaib TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY(idx,userId)
    ) CHARSET = UTF8;

    -- 이미 만든 사람은 테이블 지우고 
    DROP TABLE member;
    -- 설정된 테이블 내용 확인
    DESC member;
    MariaDB [shop]> DESC member;
    +------------+--------------+------+-----+---------------------+----------------+
    | Field      | Type         | Null | Key | Default             | Extra          |
    +------------+--------------+------+-----+---------------------+----------------+
    | idx        | int(11)      | NO   | PRI | NULL                | auto_increment |
    | userId     | varchar(16)  | NO   | PRI | NULL                |                |
    | userPw     | varchar(16)  | NO   |     | NULL                |                |
    | userName   | varchar(30)  | NO   |     | NULL                |                |
    | userEmail  | varchar(100) | NO   |     | NULL                |                |
    | userHp     | varchar(13)  | YES  |     | NULL                |                |
    | userGender | varchar(4)   | YES  |     | NULL                |                |
    | userAddr   | varchar(250) | NO   |     | NULL                |                |
    | userGaib   | timestamp    | NO   |     | current_timestamp() |                |
    +------------+--------------+------+-----+---------------------+----------------+
    9 rows in set (0.012 sec)
    -- 구조적인 내용 확인
    SHOW CREATE TABLE member;
    MariaDB [shop]> SHOW CREATE TABLE member;

    | member | CREATE TABLE `member` (
    `idx` int(11) NOT NULL AUTO_INCREMENT,
    `userId` varchar(16) NOT NULL,
    `userPw` varchar(16) NOT NULL,
    `userName` varchar(30) NOT NULL,
    `userEmail` varchar(100) NOT NULL,
    `userHp` varchar(13) DEFAULT NULL,
    `userGender` varchar(4) DEFAULT NULL CHECK (`userGender` in ('남성','여성','선택안함')),
    `userAddr` varchar(250) NOT NULL,
    `userGaib` timestamp NOT NULL DEFAULT current_timestamp(),
    PRIMARY KEY (`idx`,`userId`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci         |

    1 row in set (0.000 sec)

    -- 테이블에 데이터 입력
    -- 필드 1 idx , 필드 9 userGaib => 자동 입력되므로 INSERT INTO 에서 필드를 생략한다.

    -- INSERT INTO member(필드2~필드8) VALUES();
    INSERT INTO member(userId,userPw,userName,userEmail,userHp,userGender,userAddr) VALUES
    ('moonjong1','mj1234','이소영','moonjong1@naver.com','010-1234-5678','여성','경기도 안산시 중앙동'), 
    ('moonjong2','mj1234','은관수','moonjong2@naver.com','010-1234-5678','남성','서울시 영등포구 신촌로'), 
    ('moonjong3','mj1234','김재광','moonjong3@naver.com','010-1234-5678','남성','서울시 서초구 논현동'), 
    ('moonjong4','mj1234','이수정','moonjong4@naver.com','010-1234-5678','여성','서울시 강남구 삼성동'), 
    ('moonjong5','mj1234','이은채','moonjong5@naver.com','010-1234-5678','남성','경기도 안산시 중앙동'), 
    ('moonjong6','mj1234','김재은','moonjong6@naver.com','010-1234-5678','여성','서울시 중구 종로2가'), 
    ('moonjong7','mj1234','박유라','moonjong7@naver.com','010-1234-5678','여성','서울시 중구 인사동'), 
    ('moonjong8','mj1234','임수빈','moonjong8@naver.com','010-1234-5678','여성','경기도 안산시 중앙동'), 
    ('moonjong9','mj1234','박송이','moonjong9@naver.com','010-1234-5678','남성','서울시 중구 중앙동'), 
    ('moonjong10','mj1234','민선영','moonjong10@naver.com','010-1234-5678','여성','서울시 강남구 논현동'),
    ('moonjong11','mj1234','유희라','moonjong11@naver.com','010-1234-5678','여성','서울시 강남구 삼성동'), 
    ('moonjong12','mj1234','김소연','moonjong12@naver.com','010-1234-5678','남성','서울시 강남구 대치동');

    SELECT * FROM member;

    INSERT INTO member(userId,userPw,userName,userEmail,userHp,userGender,userAddr) VALUES
    ('moonjong13','mj1234','차두리','moonjong13@naver.com','010-8757-7555','남자','경기도 용인시 처인구');
    ERROR 4025 (23000): CONSTRAINT `member.userGender` failed for `shop`.`member`
    INSERT INTO member(userId,userPw,userName,userEmail,userHp,userGender,userAddr) VALUES
    ('moonjong13','mj1234','차두리','moonjong13@naver.com','010-8757-7555','선택안함','경기도 용인시 처인구');
    -- 여성만 출력해라.
    SELECT * FROM member WHERE userGender='여성';
    MariaDB [shop]> SELECT * FROM member WHERE userGender='여성';
    +-----+------------+--------+-----------+----------------------+---------------+------------+-------------------------------+---------------------+
    | idx | userId     | userPw | userName  | userEmail            | userHp        | userGender | userAddr                      | userGaib            |
    +-----+------------+--------+-----------+----------------------+---------------+------------+-------------------------------+---------------------+
    |   1 | moonjong1  | mj1234 | 이소영    | moonjong1@naver.com  | 010-1234-5678 | 여성       | 경기도 안산시 중앙동          | 2024-04-18 11:04:51 |
    |   4 | moonjong4  | mj1234 | 이수정    | moonjong4@naver.com  | 010-1234-5678 | 여성       | 서울시 강남구 삼성동          | 2024-04-18 11:04:51 |
    |   6 | moonjong6  | mj1234 | 김재은    | moonjong6@naver.com  | 010-1234-5678 | 여성       | 서울시 중구 종로2가           | 2024-04-18 11:04:51 |
    |   7 | moonjong7  | mj1234 | 박유라    | moonjong7@naver.com  | 010-1234-5678 | 여성       | 서울시 중구 인사동            | 2024-04-18 11:04:51 |
    |   8 | moonjong8  | mj1234 | 임수빈    | moonjong8@naver.com  | 010-1234-5678 | 여성       | 경기도 안산시 중앙동          | 2024-04-18 11:04:51 |
    |  10 | moonjong10 | mj1234 | 민선영    | moonjong10@naver.com | 010-1234-5678 | 여성       | 서울시 강남구 논현동          | 2024-04-18 11:04:51 |
    |  11 | moonjong11 | mj1234 | 유희라    | moonjong11@naver.com | 010-1234-5678 | 여성       | 서울시 강남구 삼성동          | 2024-04-18 11:04:51 |
    +-----+------------+--------+-----------+----------------------+---------------+------------+-------------------------------+---------------------+
    7 rows in set (0.003 sec)

    INSERT INTO member(userId,userPw,userName,userEmail,userHp,userGender,userAddr) VALUES
    ('moonjong14','mj1234','김야헌','moonjong14@naver.com','010-4277-8425','남성','경기도 용인시 기흥구');
    INSERT INTO member(userId,userPw,userName,userEmail,userHp,userGender,userAddr) VALUES
    ('moonjong15','mj1234','권소현','moonjong15@naver.com','010-4277-8425','여성','경기도 용인시 기흥구');

    -- 가입날짜 기준 내림차순 ( 최근에 가입한 데이터 먼저 출력)
    -- Descending DESC 내림차순
    -- Ascending ASC 오름차순 (디폴트)생략가능
   

    SELECT * FROM member ORDER BY userGaib ; 오름차순
    MariaDB [shop]> SELECT * FROM member ORDER BY userGaib ; 오름차순
    +-----+------------+--------+-----------+----------------------+---------------+--------------+----------------------------------+---------------------+
    | idx | userId     | userPw | userName  | userEmail            | userHp        | userGender   | userAddr                         | userGaib            |
    +-----+------------+--------+-----------+----------------------+---------------+--------------+----------------------------------+---------------------+
    |   1 | moonjong1  | mj1234 | 이소영    | moonjong1@naver.com  | 010-1234-5678 | 여성         | 경기도 안산시 중앙동             | 2024-04-18 11:04:51 |
    |   2 | moonjong2  | mj1234 | 은관수    | moonjong2@naver.com  | 010-1234-5678 | 남성         | 서울시 영등포구 신촌로           | 2024-04-18 11:04:51 |
    |   3 | moonjong3  | mj1234 | 김재광    | moonjong3@naver.com  | 010-1234-5678 | 남성         | 서울시 서초구 논현동             | 2024-04-18 11:04:51 |
    |   4 | moonjong4  | mj1234 | 이수정    | moonjong4@naver.com  | 010-1234-5678 | 여성         | 서울시 강남구 삼성동             | 2024-04-18 11:04:51 |
    |   5 | moonjong5  | mj1234 | 이은채    | moonjong5@naver.com  | 010-1234-5678 | 남성         | 경기도 안산시 중앙동             | 2024-04-18 11:04:51 |
    |   6 | moonjong6  | mj1234 | 김재은    | moonjong6@naver.com  | 010-1234-5678 | 여성         | 서울시 중구 종로2가              | 2024-04-18 11:04:51 |
    |   7 | moonjong7  | mj1234 | 박유라    | moonjong7@naver.com  | 010-1234-5678 | 여성         | 서울시 중구 인사동               | 2024-04-18 11:04:51 |
    |   8 | moonjong8  | mj1234 | 임수빈    | moonjong8@naver.com  | 010-1234-5678 | 여성         | 경기도 안산시 중앙동             | 2024-04-18 11:04:51 |
    |   9 | moonjong9  | mj1234 | 박송이    | moonjong9@naver.com  | 010-1234-5678 | 남성         | 서울시 중구 중앙동               | 2024-04-18 11:04:51 |
    |  10 | moonjong10 | mj1234 | 민선영    | moonjong10@naver.com | 010-1234-5678 | 여성         | 서울시 강남구 논현동             | 2024-04-18 11:04:51 |
    |  11 | moonjong11 | mj1234 | 유희라    | moonjong11@naver.com | 010-1234-5678 | 여성         | 서울시 강남구 삼성동             | 2024-04-18 11:04:51 |
    |  12 | moonjong12 | mj1234 | 김소연    | moonjong12@naver.com | 010-1234-5678 | 남성         | 서울시 강남구 대치동             | 2024-04-18 11:04:51 |
    |  13 | moonjong13 | mj1234 | 차두리    | moonjong13@naver.com | 010-8757-7555 | 선택안함     | 경기도 용인시 처인구             | 2024-04-18 11:07:41 |
    |  14 | moonjong14 | mj1234 | 김야헌    | moonjong14@naver.com | 010-4277-8425 | 남성         | 경기도 용인시 기흥구             | 2024-04-18 11:15:48 |
    |  15 | moonjong15 | mj1234 | 권소현    | moonjong15@naver.com | 010-4277-8425 | 여성         | 경기도 용인시 기흥구             | 2024-04-18 11:16:16 |
    +-----+------------+--------+-----------+----------------------+---------------+--------------+----------------------------------+---------------------+
    15 rows in set (0.001 sec)
    -- 내림차순 
    SELECT * FROM member ORDER BY userGaib DESC; 내림차순
    MariaDB [shop]> SELECT * FROM member ORDER BY userGaib DESC;
    +-----+------------+--------+-----------+----------------------+---------------+--------------+----------------------------------+---------------------+
    | idx | userId     | userPw | userName  | userEmail            | userHp        | userGender   | userAddr                         | userGaib            |
    +-----+------------+--------+-----------+----------------------+---------------+--------------+----------------------------------+---------------------+
    |  15 | moonjong15 | mj1234 | 권소현    | moonjong15@naver.com | 010-4277-8425 | 여성         | 경기도 용인시 기흥구             | 2024-04-18 11:16:16 |
    |  14 | moonjong14 | mj1234 | 김야헌    | moonjong14@naver.com | 010-4277-8425 | 남성         | 경기도 용인시 기흥구             | 2024-04-18 11:15:48 |
    |  13 | moonjong13 | mj1234 | 차두리    | moonjong13@naver.com | 010-8757-7555 | 선택안함     | 경기도 용인시 처인구             | 2024-04-18 11:07:41 |
    |   1 | moonjong1  | mj1234 | 이소영    | moonjong1@naver.com  | 010-1234-5678 | 여성         | 경기도 안산시 중앙동             | 2024-04-18 11:04:51 |
    |   2 | moonjong2  | mj1234 | 은관수    | moonjong2@naver.com  | 010-1234-5678 | 남성         | 서울시 영등포구 신촌로           | 2024-04-18 11:04:51 |
    |   3 | moonjong3  | mj1234 | 김재광    | moonjong3@naver.com  | 010-1234-5678 | 남성         | 서울시 서초구 논현동             | 2024-04-18 11:04:51 |
    |   4 | moonjong4  | mj1234 | 이수정    | moonjong4@naver.com  | 010-1234-5678 | 여성         | 서울시 강남구 삼성동             | 2024-04-18 11:04:51 |
    |   5 | moonjong5  | mj1234 | 이은채    | moonjong5@naver.com  | 010-1234-5678 | 남성         | 경기도 안산시 중앙동             | 2024-04-18 11:04:51 |
    |   6 | moonjong6  | mj1234 | 김재은    | moonjong6@naver.com  | 010-1234-5678 | 여성         | 서울시 중구 종로2가              | 2024-04-18 11:04:51 |
    |   7 | moonjong7  | mj1234 | 박유라    | moonjong7@naver.com  | 010-1234-5678 | 여성         | 서울시 중구 인사동               | 2024-04-18 11:04:51 |
    |   8 | moonjong8  | mj1234 | 임수빈    | moonjong8@naver.com  | 010-1234-5678 | 여성         | 경기도 안산시 중앙동             | 2024-04-18 11:04:51 |
    |   9 | moonjong9  | mj1234 | 박송이    | moonjong9@naver.com  | 010-1234-5678 | 남성         | 서울시 중구 중앙동               | 2024-04-18 11:04:51 |
    |  10 | moonjong10 | mj1234 | 민선영    | moonjong10@naver.com | 010-1234-5678 | 여성         | 서울시 강남구 논현동             | 2024-04-18 11:04:51 |
    |  11 | moonjong11 | mj1234 | 유희라    | moonjong11@naver.com | 010-1234-5678 | 여성         | 서울시 강남구 삼성동             | 2024-04-18 11:04:51 |
    |  12 | moonjong12 | mj1234 | 김소연    | moonjong12@naver.com | 010-1234-5678 | 남성         | 서울시 강남구 대치동             | 2024-04-18 11:04:51 |
    +-----+------------+--------+-----------+----------------------+---------------+--------------+----------------------------------+---------------------+
    15 rows in set (0.000 sec)

    -- userName, userAddr, userGaib 쇼핑몰 회원으로 가입된 데이터 중 이름, 주소, 가입일을 출력 => 정렬방식: 최근 가입된 데이터 먼저 출력되도록 (내림차순)
    SELECT userName, userAddr, userGaib FROM member ORDER BY userGaib DESC;
    MariaDB [shop]> SELECT userName, userAddr, userGaib FROM member ORDER BY userGaib DESC;
    +-----------+----------------------------------+---------------------+
    | userName  | userAddr                         | userGaib            |
    +-----------+----------------------------------+---------------------+
    | 권소현    | 경기도 용인시 기흥구             | 2024-04-18 11:16:16 |
    | 김야헌    | 경기도 용인시 기흥구             | 2024-04-18 11:15:48 |
    | 차두리    | 경기도 용인시 처인구             | 2024-04-18 11:07:41 |
    | 김소연    | 서울시 강남구 대치동             | 2024-04-18 11:04:51 |
    | 유희라    | 서울시 강남구 삼성동             | 2024-04-18 11:04:51 |
    | 민선영    | 서울시 강남구 논현동             | 2024-04-18 11:04:51 |
    | 박송이    | 서울시 중구 중앙동               | 2024-04-18 11:04:51 |
    | 임수빈    | 경기도 안산시 중앙동             | 2024-04-18 11:04:51 |
    | 박유라    | 서울시 중구 인사동               | 2024-04-18 11:04:51 |
    | 김재은    | 서울시 중구 종로2가              | 2024-04-18 11:04:51 |
    | 이은채    | 경기도 안산시 중앙동             | 2024-04-18 11:04:51 |
    | 이수정    | 서울시 강남구 삼성동             | 2024-04-18 11:04:51 |
    | 김재광    | 서울시 서초구 논현동             | 2024-04-18 11:04:51 |
    | 은관수    | 서울시 영등포구 신촌로           | 2024-04-18 11:04:51 |
    | 이소영    | 경기도 안산시 중앙동             | 2024-04-18 11:04:51 |
    +-----------+----------------------------------+---------------------+
    15 rows in set (0.001 sec)

    -- 쇼핑몰 회원으로 가입된 데이터 중  주소, 가입일을 출력 => 정렬방식: 최근 가입된 데이터 먼저 출력되도록 (내림차순) 추가 조건: 5개만 보여주라.
    SELECT  userAddr, userGaib FROM member ORDER BY userGaib DESC LIMIT 5;
    MariaDB [shop]> SELECT  userAddr, userGaib FROM member ORDER BY userGaib DESC LIMIT 5;
    +-------------------------------+---------------------+
    | userAddr                      | userGaib            |
    +-------------------------------+---------------------+
    | 경기도 용인시 기흥구          | 2024-04-18 11:16:16 |
    | 경기도 용인시 기흥구          | 2024-04-18 11:15:48 |
    | 경기도 용인시 처인구          | 2024-04-18 11:07:41 |
    | 서울시 서초구 논현동          | 2024-04-18 11:04:51 |
    | 경기도 안산시 중앙동          | 2024-04-18 11:04:51 |
    +-------------------------------+---------------------+
    5 rows in set (0.000 sec)
    -- 쇼핑몰 회원으로 가입된 데이터 중  주소, 가입일을 출력 => 정렬방식: 먼저 가입된 데이터 먼저 출력되도록 (오름차순) 추가 조건: 4개만 보여주라.
    SELECT  userAddr, userGaib FROM member ORDER BY userGaib ASC LIMIT 4;
    MariaDB [shop]> SELECT  userAddr, userGaib FROM member ORDER BY userGaib ASC LIMIT 4;
    +----------------------------------+---------------------+
    | userAddr                         | userGaib            |
    +----------------------------------+---------------------+
    | 서울시 영등포구 신촌로           | 2024-04-18 11:04:51 |
    | 서울시 서초구 논현동             | 2024-04-18 11:04:51 |
    | 서울시 강남구 삼성동             | 2024-04-18 11:04:51 |
    | 경기도 안산시 중앙동             | 2024-04-18 11:04:51 |
    +----------------------------------+---------------------+
    4 rows in set (0.000 sec)

    -- 내림차순 
    -- 이름 , 성별, 가입일 필드 출력
    -- 성별이 '여성'인 데이터 조건
    -- 정렬기준 가장 오래된 가입회원 목록 출력
    SELECT userName, userGender, userGaib FROM member WHERE userGender='여성' ORDER BY userGaib DESC;
    MariaDB [shop]>  SELECT userName, userGender, userGaib FROM member WHERE userGender='여성' ORDER BY userGaib DESC;
    +-----------+------------+---------------------+
    | userName  | userGender | userGaib            |
    +-----------+------------+---------------------+
    | 권소현    | 여성       | 2024-04-18 11:16:16 |
    | 이소영    | 여성       | 2024-04-18 11:04:51 |
    | 이수정    | 여성       | 2024-04-18 11:04:51 |
    | 김재은    | 여성       | 2024-04-18 11:04:51 |
    | 박유라    | 여성       | 2024-04-18 11:04:51 |
    | 임수빈    | 여성       | 2024-04-18 11:04:51 |
    | 민선영    | 여성       | 2024-04-18 11:04:51 |
    | 유희라    | 여성       | 2024-04-18 11:04:51 |
    +-----------+------------+---------------------+
    8 rows in set (0.001 sec)

    -- 문제] 
    -- 조건 : 서울에 거주하는 데이터
    -- 정렬 : 이름을 기준 오름차순 ASC 생략 해도 된다.
    -- 필드 : idx, userId, userName, userGender,userAddr

    SELECT idx, userId, userName, userGender, userAddr FROM member WHERE userAddr Like '서울시%' ORDER BY userName ASC;

    MariaDB [shop]> SELECT idx, userId, userName, userGender, userAddr FROM member WHERE userAddr Like '서울시%' ORDER BY userName ASC;
    +-----+------------+-----------+------------+----------------------------------+
    | idx | userId     | userName  | userGender | userAddr                         |
    +-----+------------+-----------+------------+----------------------------------+
    |  12 | moonjong12 | 김소연    | 남성       | 서울시 강남구 대치동             |
    |   3 | moonjong3  | 김재광    | 남성       | 서울시 서초구 논현동             |
    |   6 | moonjong6  | 김재은    | 여성       | 서울시 중구 종로2가              |
    |  10 | moonjong10 | 민선영    | 여성       | 서울시 강남구 논현동             |
    |   9 | moonjong9  | 박송이    | 남성       | 서울시 중구 중앙동               |
    |   7 | moonjong7  | 박유라    | 여성       | 서울시 중구 인사동               |
    |  11 | moonjong11 | 유희라    | 여성       | 서울시 강남구 삼성동             |
    |   2 | moonjong2  | 은관수    | 남성       | 서울시 영등포구 신촌로           |
    |   4 | moonjong4  | 이수정    | 여성       | 서울시 강남구 삼성동             |
    +-----+------------+-----------+------------+----------------------------------+
    9 rows in set (0.001 sec)
    -- 문제] 
    -- 조건 : 서울에 거주하는 데이터
    -- 정렬 : 이름,성별을 기준 오름차순 ASC 생략 해도 된다. 
    -- 필드 : idx, userId, userName, userGender,userAddr
    SELECT idx, userId, userName, userGender, userAddr FROM member WHERE userAddr Like '서울시%' ORDER BY userName,userGender ASC;
    MariaDB [shop]> SELECT idx, userId, userName, userGender, userAddr FROM member WHERE userAddr Like '서울시%' ORDER BY userName,userGender ASC;
    +-----+------------+-----------+------------+----------------------------------+
    | idx | userId     | userName  | userGender | userAddr                         |
    +-----+------------+-----------+------------+----------------------------------+
    |  12 | moonjong12 | 김소연    | 남성       | 서울시 강남구 대치동             |
    |   3 | moonjong3  | 김재광    | 남성       | 서울시 서초구 논현동             |
    |   6 | moonjong6  | 김재은    | 여성       | 서울시 중구 종로2가              |
    |  10 | moonjong10 | 민선영    | 여성       | 서울시 강남구 논현동             |
    |   9 | moonjong9  | 박송이    | 남성       | 서울시 중구 중앙동               |
    |   7 | moonjong7  | 박유라    | 여성       | 서울시 중구 인사동               |
    |  11 | moonjong11 | 유희라    | 여성       | 서울시 강남구 삼성동             |
    |   2 | moonjong2  | 은관수    | 남성       | 서울시 영등포구 신촌로           |
    |   4 | moonjong4  | 이수정    | 여성       | 서울시 강남구 삼성동             |
    +-----+------------+-----------+------------+----------------------------------+
    9 rows in set (0.001 sec)
    -- 문제1] 
    -- 조건 : 서울에 거주하는 데이터
    -- 정렬 : 이름 오름차순, 성별 내림차순
    -- 필드 : idx, userId, userName, userGender,userAddr
    -- 정렬방식 없으면 무조건 오름차순
    SELECT idx, userId, userName, userGender, userAddr FROM member WHERE userAddr Like '서울시%' ORDER BY userName, userGender DESC;
    
    MariaDB [shop]> SELECT idx, userId, userName, userGender, userAddr FROM member WHERE userAddr Like '서울시%' ORDER BY userName, userGender DESC;
    +-----+------------+-----------+------------+----------------------------------+
    | idx | userId     | userName  | userGender | userAddr                         |
    +-----+------------+-----------+------------+----------------------------------+
    |  12 | moonjong12 | 김소연    | 남성       | 서울시 강남구 대치동             |
    |   3 | moonjong3  | 김재광    | 남성       | 서울시 서초구 논현동             |
    |   6 | moonjong6  | 김재은    | 여성       | 서울시 중구 종로2가              |
    |  10 | moonjong10 | 민선영    | 여성       | 서울시 강남구 논현동             |
    |   9 | moonjong9  | 박송이    | 남성       | 서울시 중구 중앙동               |
    |   7 | moonjong7  | 박유라    | 여성       | 서울시 중구 인사동               |
    |  11 | moonjong11 | 유희라    | 여성       | 서울시 강남구 삼성동             |
    |   2 | moonjong2  | 은관수    | 남성       | 서울시 영등포구 신촌로           |
    |   4 | moonjong4  | 이수정    | 여성       | 서울시 강남구 삼성동             |
    +-----+------------+-----------+------------+----------------------------------+
    9 rows in set (0.000 sec)

    -- 문제2]
    -- 조건 : 성이 '이'씨이고, 거주지가 서울인 데이터를 줄력
    -- 정렬 : idx 오름차순 정렬 출력
    -- 필드 : idx, userName , userGender, userAddr
    SELECT idx, userName , userGender, userAddr FROM member WHERE userName LIKE '이%' AND userAddr LIKE '서울시%' ORDER BY idx;
    MariaDB [shop]> SELECT idx, userName , userGender, userAddr FROM member WHERE userName LIKE '이%' AND userAddr LIKE '서울시%' ORDER BY idx;
    +-----+-----------+------------+-------------------------------+
    | idx | userName  | userGender | userAddr                      |
    +-----+-----------+------------+-------------------------------+
    |   4 | 이수정    | 여성       | 서울시 강남구 삼성동          |
    +-----+-----------+------------+-------------------------------+
    1 row in set (0.002 sec)

    -- 그룹1 묶음 GROUP  집계 피벗테이블 여성 몇 명 남성 몇 명 뽑아내기 
    -- 성별을 여성, 남성, 선택안함 각각 갯수 카운트 COUNT(1)
    -- SUM(), ABG(), COUNT(), MAX(), MIN()....
    -- 성별, 갯수
    -- 예시]
    -- 성별 
    -- 여성 3
    -- 남성 5
    -- 선택안함 1

    SELECT userGender , COUNT(1) FROM member GROUP BY userGender;

    MariaDB [shop]> SELECT userGender , COUNT(1) FROM member GROUP BY userGender;
    +--------------+----------+
    | userGender   | COUNT(1) |
    +--------------+----------+
    | 남성         |        6 |
    | 선택안함     |        1 |
    | 여성         |        8 |
    +--------------+----------+
    3 rows in set (0.003 sec)
    -- 그룹2 묶음 GROUP  집계 피벗테이블 여성 몇 명 남성 몇 명 뽑아내기 
    -- 성별을 여성, 남성, 선택안함 각각 갯수 카운트 COUNT(1)
    -- SUM(), ABG(), COUNT(), MAX(), MIN()....
    -- 성별, 갯수
    -- 예시]
    -- 성별 인원수
    -- 여성 3
    -- 남성 5
    -- 선택안함 1
    MariaDB [shop]> SELECT userGender , COUNT(1)AS '인원수'  FROM member GROUP BY userGender;
    +--------------+-----------+
    | userGender   | 인원수    |
    +--------------+-----------+
    | 남성         |         6 |
    | 선택안함     |         1 |
    | 여성         |         8 |
    +--------------+-----------+
    3 rows in set (0.002 sec)

    SELECT userGender , COUNT(1)AS '인원수'  FROM member GROUP BY userGender;

     -- 그룹3묶음 GROUP
     -- 성별을 여성 , 남성, 선택안함 각각 갯수 카운트 COUNT(1) => 필드 '인원수'
     -- 정렬 : 인원수의 내림차순

    SELECT userGender, COUNT(1) AS'인원수' FROM member GROUP BY userGender ORDER BY '인원수' DESC;
    MariaDB [shop]> SELECT userGender, COUNT(1) AS'인원수' FROM member GROUP BY userGender ORDER BY '인원수' DESC;
    +--------------+-----------+
    | userGender   | 인원수    |
    +--------------+-----------+
    | 여성         |         8 |
    | 남성         |         6 |
    | 선택안함     |         1 |
    +--------------+-----------+
    3 rows in set (0.001 sec)


    -- 성별 그룹 카운트
    -- 정렬 오름차순
    SELECT userGender, COUNT(1) AS'인원수' FROM member GROUP BY userGender ORDER BY userGender ;
    MariaDB [shop]> SELECT userGender, COUNT(1) AS'인원수' FROM member GROUP BY userGender ORDER BY userGender ;
+--------------+-----------+
| userGender   | 인원수    |
+--------------+-----------+
| 남성         |         6 |
| 선택안함     |         1 |
| 여성         |         8 |
+--------------+-----------+
3 rows in set (0.001 sec)

    -- 문제2
    -- userGaib 가입일자별 카운트 => '가입인원수'
    -- 정렬 : 가입일의 오름차순 정렬
    SELECT userGaib, COUNT(1) AS'가입인원수' FROM member GROUP BY userGaib ORDER BY userGaib ; 
    MariaDB [shop]> SELECT userGaib, COUNT(1) AS'가입인원수' FROM member GROUP BY userGaib ORDER BY userGaib ;
    +---------------------+-----------------+
    | userGaib            | 가입인원수      |
    +---------------------+-----------------+
    | 2024-04-18 11:04:51 |              12 |
    | 2024-04-18 11:07:41 |               1 |
    | 2024-04-18 11:15:48 |               1 |
    | 2024-04-18 11:16:16 |               1 |
    +---------------------+-----------------+
    4 rows in set (0.001 sec)


    SELECT userGaib AS'가입일자', COUNT(1) AS'가입인원수' FROM member GROUP BY userGaib ORDER BY userGaib ; 
        
    +---------------------+-----------------+
    | 가입일자            | 가입인원수      |
    +---------------------+-----------------+
    | 2024-04-18 11:04:51 |              12 |
    | 2024-04-18 11:07:41 |               1 |
    | 2024-04-18 11:15:48 |               1 |
    | 2024-04-18 11:16:16 |               1 |
    +---------------------+-----------------+
    4 rows in set (0.001 sec)
    

    -- 문제3
    -- GROUP BY
    -- userGaib 가입일자별 카운트 => 생성된 필드명 '가입인원수'
    -- 정렬 ORDER BY: 가입일의 내림차순 정렬
    -- 조건 WHERE : 성별이 여성인 데이터만 구현
    -- GROUP BY 이면 조건문이 달라진다. WHERE => HAVING
    -- HAVING 해빙절 사용 조건
    -- 오류 발생 => WHERE 절 사용
    SELECT userGaib AS'가입일자', COUNT(1) AS '가입인원수' FROM member GROUP BY userGaib WHERE userGender='여성' ORDER BY userGaib DESC;
    -- HAVING절에 있는게 필드에 없으면 오류가 난다. WHERE => HAVING  변경
    SELECT userGender AS'성별' ,userGaib AS'가입일자', COUNT(1) AS '가입인원수' FROM member GROUP BY userGaib HAVING userGender='여성' ORDER BY userGaib DESC ;
    MariaDB [shop]> SELECT userGender AS'성별' ,userGaib AS'가입일자', COUNT(1) AS '가입인원수' FROM member GROUP BY userGaib HAVING userGender='여성' ORDER BY userGaib DESC ;
    +--------+---------------------+-----------------+
    | 성별   | 가입일자            | 가입인원수      |
    +--------+---------------------+-----------------+
    | 여성   | 2024-04-18 11:16:16 |               1 |
    | 여성   | 2024-04-18 11:04:51 |              12 |
    +--------+---------------------+-----------------+
    2 rows in set (0.000 sec)
    SELECT userGender AS'성별' ,userGaib AS'가입일자', COUNT(1) AS '가입인원수' FROM member GROUP BY userGaib HAVING userGender='남성' ORDER BY userGaib DESC ;
    MariaDB [shop]> SELECT userGender AS'성별' ,userGaib AS'가입일자', COUNT(1) AS '가입인원수' FROM member GROUP BY userGaib HAVING userGender='남성' ORDER BY userGaib DESC ;
    +--------+---------------------+-----------------+
    | 성별   | 가입일자            | 가입인원수      |
    +--------+---------------------+-----------------+
    | 남성   | 2024-04-18 11:15:48 |               1 |
    +--------+---------------------+-----------------+
    1 row in set (0.001 sec)

    SELECT userGaib AS'가입일자', COUNT(1) AS '가입인원수' FROM member GROUP BY userGaib ORDER BY userGaib DESC ;

    MariaDB [shop]> SELECT userGaib AS'가입일자', COUNT(1) AS '가입인원수' FROM member GROUP BY userGaib ORDER BY userGaib DESC ;
    +---------------------+-----------------+
    | 가입일자            | 가입인원수      |
    +---------------------+-----------------+
    | 2024-04-18 11:16:16 |               1 |
    | 2024-04-18 11:15:48 |               1 |
    | 2024-04-18 11:07:41 |               1 |
    | 2024-04-18 11:04:51 |              12 |
    +---------------------+-----------------+
    4 rows in set (0.000 sec)

```