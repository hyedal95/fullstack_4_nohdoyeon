# SQL
1. 데이터베이스 생성 => shop
    데이터베이스 생성 => shop2 => 혼자하기
2. 테이블생성 Create => CREATE
    : member_table => 테이블 이름
    : ENGINE = InnoDB => 기본값
    : CHARSET = UTF8 인코딩 => 문자(한글) 설정(셋팅)

   - 필드1(Column 컬럼(칸 or 열))=> 색인번호(INDAX ; IDX) 
    : 자동 증가 번호 AUTQ_INCREMENT 오토_인크리먼트
    : PRIMARY KEY
    : NOT NULL
   - 필드2(Column 컬럼(칸 or 열)) => 이름 userName 
    : VARCHAR(30) 
    : NOT NULL
   - 필드3(Column 컬럼(칸 or 열)) => 나이 userAge
    : INT 
    : NULL 빈값 허용
```SQL
    -- 데이터베이스 생성
    CREATE DATABASE shop;
    -- 현재 프롬프트 위치 변경     
    USE shop;

    -- 테이블 생성
    CREATE TABLE member_table(
        idx      INT  NOT NULL  AUTO_INCREMENT PRIMARY KEY,
        userName VARCHAR(30)  NOT NULL,
        userAge  INT  NULL
    ) CHARSET=UTF8;

    -- 테이블 생성 확인
    SHOW TABLES;

    -- 테이블 데이터 확인
    DESC member_table;

    -- 테이블 상세 정보 확인 (속성 구조)확인
    SHOW CREATE TABLE member_table;
    ---------------------------------------------------+
    | Table        | Create Table 
    | member_table | CREATE TABLE `member_table` (
    `idx` int(11) NOT NULL AUTO_INCREMENT,
    `userName` varchar(30) NOT NULL,
    `userAge` int(11) DEFAULT NULL,
    PRIMARY KEY (`idx`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci 
    ----------------------------------------------------+
```

3. 테이블 데이터 입력 INSERT
   : 5행 데이터 입력
   : INSERT INTO member_table (필드Field1, 필드Field2, 필드Field3 ...) VALUES(값Value1,값Value2,값Value3...);
:IDX는 번호 자동 생성이기때문에 빼고 작성한다. 
```SQL
    INSERT INTO member_table (userName, userAge) 
    VALUES
        ('이순신','46'),
        ('조지현','47'),
        ('정지연','49'),
        ('차두리','29'),
        ('홍수환','27'),
        ('김미숙','28'),
        ('김재동','29'),
        ('문혜인','56'),
        ('김수현','22'),
        ('노도연','27');
        
```
4. 테이블 목록 조회 SELECT
   : SELECT * FROM 테이블이름
   : member_table 전체  조회
   : ALL => *
```SQL
    SELECT * FROM member_table;

    MariaDB [shop]> SELECT * FROM member_table;
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |   1 | 이순신    |      46 |
    |   2 | 조지현    |      47 |
    |   3 | 정지연    |      49 |
    |   4 | 차두리    |      29 |
    |   5 | 홍수환    |      27 |
    |   6 | 김미숙    |      28 |
    |   7 | 김재동    |      29 |
    |   8 | 문혜인    |      56 |
    |   9 | 김수현    |      22 |
    |  10 | 노도연    |      27 |
    +-----+-----------+---------+
    10 rows in set (0.000 sec)
```

```SQL
    -- INSERT 추가 삽입 후 테이블 조회
    MariaDB [shop]> SELECT * FROM member_table;
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |   1 | 이순신    |      46 |
    |   2 | 조지현    |      47 |
    |   3 | 정지연    |      49 |
    |   4 | 차두리    |      29 |
    |   5 | 홍수환    |      27 |
    |   6 | 김미숙    |      28 |
    |   7 | 김재동    |      29 |
    |   8 | 문혜인    |      56 |
    |   9 | 김수현    |      22 |
    |  10 | 노도연    |      27 |
    |  11 | 정윤선    |      28 |
    |  12 | 김서윤    |      54 |
    |  13 | 노영수    |      54 |
    |  14 | 노예린    |      25 |
    |  15 | 노우준    |      15 |
    +-----+-----------+---------+
    15 rows in set (0.000 sec)
```

5. 테이블 목록 조회 SELECT 조건문 WHERE 웨어
   - % => 아무개문자 (어떤글자든 상관없다 => 와일드 카드 문자)
   - WHERE userName LIKE '노%'
   - WHERE userName LIKE '조지%'
   - WHERE userName LIKE '김%' => 성이 김씨인 모든 사람
   - WHERE userName LIKE '%현' => 뒤 글자가 현으로 끝나는 모든 사람
   - WHERE userName LIKE '%지%' => 앞 뒤 상관없이 가운데 '지'글자가 들어간 모든 사람
```SQL
    -- 1. member_table 테이블의 데이터내용 중 
    -- 성이 김씨인 
    -- 모든 사람 조회하라
    SELECT * FROM member_table WHERE userName LIKE '김%'; 

    MariaDB [shop]> SELECT * FROM member_table WHERE userName LIKE '김%';
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |   6 | 김미숙    |      28 |
    |   7 | 김재동    |      29 |
    |   9 | 김수현    |      22 |
    |  12 | 김서윤    |      54 |
    +-----+-----------+---------+
    4 rows in set (0.003 sec)

    -- 2. member_table 테이블의 데이터내용 중 
    -- userName 중 '조지%' 
    -- 모든 사람 조회하라
    SELECT * FROM member_table WHERE  userName LIKE'조지%';
    MariaDB [shop]> SELECT * FROM member_table WHERE  userName LIKE'조지%';
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |   2 | 조지현    |      47 |
    +-----+-----------+---------+
    1 row in set (0.000 sec)

    -- 3. member_table 테이블의 데이터내용 중 
    -- userName 중 '%지현' 
    -- 모든 사람 조회하라
    SELECT * FROM member_table WHERE userName LIKE '%지현';
    MariaDB [shop]> SELECT * FROM member_table WHERE userName LIKE '%지현';
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |   2 | 조지현    |      47 |
    +-----+-----------+---------+
    1 row in set (0.000 sec)

    -- 4. member_table 테이블의 데이터내용 중 
    -- userName 중 '%현' 
    -- 모든 사람 조회하라
    SELECT * FROM member_table WHERE userName LIKE '%현';
    MariaDB [shop]> SELECT * FROM member_table WHERE userName LIKE '%현';
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |   2 | 조지현    |      47 |
    |   9 | 김수현    |      22 |
    +-----+-----------+---------+
    2 rows in set (0.000 sec)
    -- 5. member_table 테이블의 데이터내용 중 
    -- userName 중 '%지%' 
    -- 모든 사람 조회하라
    SELECT * FROM member_table WHERE userName LIKE '%지%';
    MariaDB [shop]> SELECT * FROM member_table WHERE userName LIKE '%지%';
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |   2 | 조지현    |      47 |
    |   3 | 정지연    |      49 |
    +-----+-----------+---------+
    2 rows in set (0.000 sec)
```

6. 테이블 목록 조회 SELECT 조건문 WHERE 웨어 나이
   : =  같다
   : => 이상 (크거나같다)
   : > 크다
   : < 작다
   : <= 이하 (작거나같다)
   
   : WHERE userAge >= 30 AND userAge <40  => 범위 지정
   
   : BETWEEN 비트윈 범위지정
   : WHERE userAge BETWEEN FROM 범위 시작 AND TO 범위끝;

   : WHERE userAge BETWEEN 30 AND 39;


```SQL
    -- 1.테이블 대상 => member_table
    -- 조건 => 나이 (userAge)가 30세 이하인 모든 데이터를 조회하라 
    SELECT * FROM member_table WHERE userAge <=30;

    MariaDB [shop]> SELECT * FROM member_table WHERE userAge <=30;
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |   4 | 차두리    |      29 |
    |   5 | 홍수환    |      27 |
    |   6 | 김미숙    |      28 |
    |   7 | 김재동    |      29 |
    |   9 | 김수현    |      22 |
    |  10 | 노도연    |      27 |
    |  11 | 정윤선    |      28 |
    |  14 | 노예린    |      25 |
    |  15 | 노우준    |      15 |
    +-----+-----------+---------+
    9 rows in set (0.001 sec)

    -- 2.테이블 대상 => member_table
    -- 조건 => 나이 (userAge)가 40대인(40~49) 모든 데이터를 조회하라 
    SELECT * FROM member_table WHERE userAge >= 40 AND userAge < 50;

    MariaDB [shop]> SELECT * FROM member_table WHERE userAge >= 40 AND userAge < 50;
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |   1 | 이순신    |      46 |
    |   2 | 조지현    |      47 |
    |   3 | 정지연    |      49 |
    +-----+-----------+---------+
    3 rows in set (0.000 sec)

    -- 3.테이블 대상 => member_table
    -- 조건 => 나이 (userAge)가 40대인(40~49) 모든 데이터를 조회하라 
    -- WHERE userAge BETWEEN 40 AND 49;

    SELECT * FROM member_table WHERE userAge BETWEEN 40 AND 49;
```


7. 테이블 목록 조회 SELECT  여러개의 필드 조건문
   : 테이블 목록 조회 SELECT  조건문 WHERE (필드1 조건) AND (필드2 조건) ; 
```SQL
    -- 테이블 대상 => member_table
    -- 조건(AND) => 1. userName 성이 '김%' 인 사람
    --      => 2. userAge 나이가 30세 이상인 경우   userAge>=30
    -- 두가지가 모두 만족시 구현 AND

    SELECT * FROM member_table WHERE userName LIKE '김%' AND userAge >= 30; 

    MariaDB [shop]> SELECT * FROM member_table WHERE userName LIKE '김%' AND userAge >=30;
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |  12 | 김서윤    |      54 |
    +-----+-----------+---------+
    1 row in set (0.000 sec)

    -- 테이블 대상 => member_table
    -- 조건(OR) =>  userName 성이 '김%' 인 사람이거나, userAge 나이가 30세 이상인 경우   userAge>=30
    -- 두 가지 필드 조건 중 어느 하나라도 만족시 구현 OR
    -- 김씨인 모든 사람 출력
    -- 나이가 30세 이상인 모든 사람 출력

    SELECT * FROM member_table WHERE userName LIKE '김%' OR userAge >=30;

    MariaDB [shop]> SELECT * FROM member_table WHERE userName LIKE '김%' OR userAge >=30;
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |   1 | 이순신    |      46 |
    |   2 | 조지현    |      47 |
    |   3 | 정지연    |      49 |
    |   6 | 김미숙    |      28 |
    |   7 | 김재동    |      29 |
    |   8 | 문혜인    |      56 |
    |   9 | 김수현    |      22 |
    |  12 | 김서윤    |      54 |
    |  13 | 노영수    |      54 |
    +-----+-----------+---------+
    9 rows in set (0.001 sec)
```

8. 테이블 목록 조회 SELECT ~WHERE ~ IN(조건1,조건2,조건3)
   IN 포함의 의미


```SQL
    -- 테이블 member_table
    -- 조건 : 이름이 김서윤,
    -- 조건 : 이름이 김수현,
    -- 조건 : 이름이 노영수,
    -- 두 사람의 모든 데이터를 조회하라.

    SELECT * FROM member_table WHERE userName='김서윤' OR userName='김수현' OR userName='노영수';
    MariaDB [shop]> SELECT * FROM member_table WHERE userName='김서윤' OR userName='김수현' OR userName=' 노영수';
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |   9 | 김수현    |      22 |
    |  12 | 김서윤    |      54 |
    |  13 | 노영수    |      54 |
    +-----+-----------+---------+
    3 rows in set (0.000 sec)
    -- 테이블 member_table
    -- 조건 : 이름이 (김서윤,김수현,노영수)
    -- 세 사람의 모든 데이터를 조회하라.
    SELECT * FROM member_table WHERE userName IN('김서윤','김수현','노영수');
    MariaDB [shop]> SELECT * FROM member_table WHERE userName In('김서윤','김수현','노영수');
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |   9 | 김수현    |      22 |
    |  12 | 김서윤    |      54 |
    |  13 | 노영수    |      54 |
    +-----+-----------+---------+
    3 rows in set (0.001 sec)

    -- 테이블 member_table
    -- 조건 : 이름이 (김서윤,김수현,노영수)이 아닌 
    -- 모든 데이터를 조회하라.
    SELECT * FROM member_table WHERE userName NOT IN('김서윤','김수현','노영수');
    MariaDB [shop]> SELECT * FROM member_table WHERE userName NOT IN('김서윤','김수현','노영수');
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |   1 | 이순신    |      46 |
    |   2 | 조지현    |      47 |
    |   3 | 정지연    |      49 |
    |   4 | 차두리    |      29 |
    |   5 | 홍수환    |      27 |
    |   6 | 김미숙    |      28 |
    |   7 | 김재동    |      29 |
    |   8 | 문혜인    |      56 |
    |  10 | 노도연    |      27 |
    |  11 | 정윤선    |      28 |
    |  14 | 노예린    |      25 |
    |  15 | 노우준    |      15 |
    +-----+-----------+---------+
    12 rows in set (0.000 sec)
```
DML의 4가지
입력 INSERT => C => Create
조회 SELECT => R => Read
수정 UPDATE => U => Update
삭제 DELETE => D => Delete

9. 테이블 내용 수정하기 UPDATE
   : 수정 UPDATE => U Update
   UPDATE 테이블이름 SET 필드명 = "수정할 값" WHERE 조건;

```SQL
   -- 1.테이블 : member_table
   -- 수정조건 : 이름(userName)이 이순신 => 이순자 수정하라

   UPDATE member_table SET userName ='이순자' WHERE idx ='1' AND userName='이순신';
    MariaDB [shop]> UPDATE member_table SET userName ='이순자' WHERE idx ='1' AND userName='이순신';
    Query OK, 1 row affected (0.003 sec)
    Rows matched: 1  Changed: 1  Warnings: 0
    MariaDB [shop]> SELECT userName FROM member_table;
    +-----------+
    | userName  |
    +-----------+
    | 이순자    |
    | 조지현    |
    | 정지연    |
    | 차두리    |
    | 홍수환    |
    | 김미숙    |
    | 김재동    |
    | 문혜인    |
    | 김수현    |
    | 노도연    |
    | 정윤선    |
    | 김서윤    |
    | 노영수    |
    | 노예린    |
    | 노우준    |
    +-----------+
    15 rows in set (0.000 sec)
    -- 인덱스 조회
    MariaDB [shop]> SELECT userName FROM member_table WHERE idx='1';
    +-----------+
    | userName  |
    +-----------+
    | 이순자    |
    +-----------+
    1 row in set (0.000 sec)

    -- 2.테이블 : member_table
    -- 수정조건 : 이름(userName)이 차두리 
    --          => 나이 (userAge) 27세로  수정하라

    UPDATE member_table SET userAge = '27' WHERE userName = '차두리';

    SELECT userName,userAge FROM member_table;
    SELECT userName,userAge FROM member_table WHERE userName ='차두리';
    MariaDB [shop]> SELECT userName,userAge FROM member_table WHERE userName ='차두리';
    +-----------+---------+
    | userName  | userAge |
    +-----------+---------+
    | 차두리    |      27 |
    +-----------+---------+
    1 row in set (0.000 sec)

    -- 3.테이블 : member_table
    -- 수정조건 : 이름(userName)이 '김%'
    --          => 나이 (userAge) 20세로  수정하라

    UPDATE member_table SET userAge ='20' WHERE userName LIKE '김%';
    MariaDB [shop]> UPDATE member_table SET userAge ='20' WHERE userName LIKE '김%';
    Query OK, 4 rows affected (0.003 sec)
    Rows matched: 4  Changed: 4  Warnings: 0
    MariaDB [shop]> SELECT * FROM member_table WHERE userName LIKE '김%' AND userAge='20';
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |   6 | 김미숙    |      20 |
    |   7 | 김재동    |      20 |
    |   9 | 김수현    |      20 |
    |  12 | 김서윤    |      20 |
    +-----+-----------+---------+
    4 rows in set (0.000 sec)

```

10. 테이블 내용(RECORD 레코드 행단위 & TUPLE 튜플 ) (줄)행삭제하기 UPDATE
    : 삭제 DELETE => D => Delete

    DELETE FROM 테이블이름 WHERE 조건;
     
```SQL
    -- 1. 테이블 : member_table
    -- 삭제조건 : IDX 6인 데이터 삭제하라. => 김미숙
    DELETE FROM member_table WHERE idx ='6';
    MariaDB [shop]> DELETE FROM member_table WHERE idx ='6';
    Query OK, 1 row affected (0.003 sec)
    MariaDB [shop]> SELECT * FROM member_table;
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |   1 | 이순자    |      46 |
    |   2 | 조지현    |      47 |
    |   3 | 정지연    |      49 |
    |   4 | 차두리    |      27 |
    |   5 | 홍수환    |      27 |
    |   7 | 김재동    |      20 |
    |   8 | 문혜인    |      56 |
    |   9 | 김수현    |      20 |
    |  10 | 노도연    |      27 |
    |  11 | 정윤선    |      28 |
    |  12 | 김서윤    |      20 |
    |  13 | 노영수    |      54 |
    |  14 | 노예린    |      25 |
    |  15 | 노우준    |      15 |
    +-----+-----------+---------+
    14 rows in set (0.000 sec)

    -- 2. 테이블 : member_table
    -- 삭제조건 : 회원 중 이름이 (차두리, 정지연,김재동) 3명 삭제

    DELETE FROM member_table WHERE userName IN('차두리','정지연','김재동');
    MariaDB [shop]> DELETE FROM member_table WHERE userName IN('차두리','정지연','김재동');
    Query OK, 3 rows affected (0.003 sec)
    MariaDB [shop]> SELECT * FROM member_table;
    +-----+-----------+---------+
    | idx | userName  | userAge |
    +-----+-----------+---------+
    |   1 | 이순자    |      46 |
    |   2 | 조지현    |      47 |
    |   5 | 홍수환    |      27 |
    |   8 | 문혜인    |      56 |
    |   9 | 김수현    |      20 |
    |  10 | 노도연    |      27 |
    |  11 | 정윤선    |      28 |
    |  12 | 김서윤    |      20 |
    |  13 | 노영수    |      54 |
    |  14 | 노예린    |      25 |
    |  15 | 노우준    |      15 |
    +-----+-----------+---------+
    11 rows in set (0.000 sec)

```