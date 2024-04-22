# 테이블 변경 ALTER

  * 필드(Field 필드 Attribute 어트리뷰트 속성 item 아이템; Column 컬럼(열):칸 ; 디그리?)
  1. 테이블 이름 변경   Rename
  2. 테이블 필드 이름과 속성 변경 Change
  3. 테이블 필드 속성만 변경 Modify
  4. 테이블 필드 추가 Add
     4-1. 테이블 필드 맨아래에 추가  Add => (default)기본 Last(맨 아래에 추가된다.)     
     4-2. 테이블 필드 맨위에 추가    Add => First(맨 위에 추가된다.)                  
     4-3. 테이블 필드 지정필드 다음에 추가  Add  => 지정필드 After(지정 필드 아래에 추가)     
  5. 테이블 필드 삭제 Drop

  
[실습] 
- 데이터 베이스 전체 확인
  SHOW DATABASES;
- 데이터베이스 : test
  - 테이블 : abcd
  - 테이블 : 회원테이블
- 데이터베이스 삭제
  DROP TABLE abcd;

CREATE TABLE `회원`(
    `아이디` VARCHAR(20) NOT NULL,
    `성별` VARCHAR(1) NOT NULL CHECK(`성별` IN ('남','여')),
    `메모` VARCHAR(128) DEFAULT NULL,
    PRIMARY KEY(`아이디`)
)CHARSET=UTF8;

1. 테이블 이름 변경
   회원테이블 => 회원    
   ALTER TABLE [OldName] RENAME [NewName];
   ALTER TABLE 회원테이블 RENAME 회원;
```SQL
-- 테이블 기존 이름 => 회원테이블
MariaDB [test]> SHOW TABLES;
+-----------------+
| Tables_in_test  |
+-----------------+
| 회원테이블      |
+-----------------+
1 row in set (0.001 sec)
-- 테이블 이름 변경 명령어 실행
MariaDB [test]> ALTER TABLE 회원테이블 RENAME 회원;
Query OK, 0 rows affected (0.008 sec)
-- 테이블 바뀐 이름 => 회원
MariaDB [test]> SHOW TABLES;
+----------------+
| Tables_in_test |
+----------------+
| 회원           |
+----------------+
1 row in set (0.000 sec)
```

2. 테이블 필드 이름 변경: CHANGE 체인지 Change => 이름도 속성도 변경가능하다.

-- 필드 이름 변경 그리고 문자열 길이 20 => 10 변경
   아이디 => userId
   varchar(20) => varchar(10)

    +-----------+--------------+------+-----+---------+-------+
    | Field     | Type         | Null | Key | Default | Extra |
    +-----------+--------------+------+-----+---------+-------+
    | 아이디    | varchar(20)  | NO   | PRI | NULL    |       |
    | 성별      | varchar(1)   | NO   |     | NULL    |       |
    | 메모      | varchar(128) | YES  |     | NULL    |       |
    +-----------+--------------+------+-----+---------+-------+

   ALTER TABLE [테이블이름] 
   CHANGE COLUMN [변경할필드이름] 
   [새로운필드이름] [새로운 속성(VARCHAR(10) NOT NULL)];

   ALTER TABLE `회원` 
   CHANGE COLUMN `아이디` 
   `userId` VARCHAR(10) NOT NULL;
```SQL
-- 아이디, 문자길이 변경 ALTER (DDL)
ALTER TABLE `회원`CHANGE COLUMN `아이디` `userId` VARCHAR(10) NOT NULL;

MariaDB [test]> ALTER TABLE `회원`CHANGE COLUMN `아이디` `userId` VARCHAR(10) NOT NULL;
Query OK, 0 rows affected (0.018 sec)
Records: 0  Duplicates: 0  Warnings: 0
-- 변경 내용 확인 
MariaDB [test]> DESC 회원;
+--------+--------------+------+-----+---------+-------+
| Field  | Type         | Null | Key | Default | Extra |
+--------+--------------+------+-----+---------+-------+
| userId | varchar(10)  | NO   | PRI | NULL    |       |
| 성별   | varchar(1)   | NO   |     | NULL    |       |
| 메모   | varchar(128) | YES  |     | NULL    |       |
+--------+--------------+------+-----+---------+-------+
3 rows in set (0.013 sec)
```
===================처음부터 다시하기 ======================================
[실습] 
- 데이터베이스 만들기
데이터베이스 :alter_test
CREATE DATABASE alter_test;

- 테이블 만들기
테이블 : member_table
- 필드 
    idx INT NOT NULL AUTO_INCREMENT,
  아이디 가변길이문자열(20) 빈값 허용안함 PK
  이름 가변길이문자열(30) 빈값허용안함
  이메일 가변길이문자열(30) 빈값허용함
  나이 숫자 빈값허용함
```SQL
  CREATE TABLE member_table(
    idx INT NOT NULL AUTO_INCREMENT,
    아이디 VARCHAR(20) NOT NULL,
    이름 VARCHAR(30) NOT NULL,
    이메일 VARCHAR(30) NULL,
    나이 INT NULL,
    PRIMARY KEY(idx,아이디)
  ) CHARSET=UTF8;
```
```SQL
-- 데이터베이스 생성
CREATE DATABASE alter_test;
-- 데이터베이스 사용
USE alter_test;
-- 테이블 생성
MariaDB [alter_test]> CREATE TABLE member_table(
    ->   idx INT NOT NULL AUTO_INCREMENT,
    ->   아이디 VARCHAR(20) NOT NULL,
    ->   이름 VARCHAR(30) NOT NULL,
    ->   이메일 VARCHAR(30) NULL,
    ->   나이 INT NULL,
    ->   PRIMARY KEY(idx,아이디)
    ->   ) CHARSET=UTF8;
Query OK, 0 rows affected (0.008 sec)
-- 테이블 생성 확인
MariaDB [alter_test]> SHOW TABLES;
+----------------------+
| Tables_in_alter_test |
+----------------------+
| member_table         |
+----------------------+
1 row in set (0.000 sec)
-- 테이블 member_table 속성 확인
MariaDB [alter_test]> DESC member_table;
+-----------+-------------+------+-----+---------+----------------+
| Field     | Type        | Null | Key | Default | Extra          |
+-----------+-------------+------+-----+---------+----------------+
| idx       | int(11)     | NO   | PRI | NULL    | auto_increment |
| 아이디    | varchar(20) | NO   | PRI | NULL    |                |
| 이름      | varchar(30) | NO   |     | NULL    |                |
| 이메일    | varchar(30) | YES  |     | NULL    |                |
| 나이      | int(11)     | YES  |     | NULL    |                |
+-----------+-------------+------+-----+---------+----------------+
5 rows in set (0.012 sec)
```
1. 테이블 이름 변경
   member_table => member 
ALTER TABLE member_table RENAME member;
```SQL
-- 테이블 이름 변경 member_table => member
MariaDB [alter_test]> ALTER TABLE member_table RENAME member;
Query OK, 0 rows affected (0.008 sec)
-- 테이블 이름 변경 확인
MariaDB [alter_test]> SHOW TABLES;
+----------------------+
| Tables_in_alter_test |
+----------------------+
| member               |
+----------------------+
1 row in set (0.000 sec)
```
2. 테이블 필드 이름 변경 => Change => 컬럼이름변경 & 속성도 변경가능하다.
   ALTER TABLE member
   CHANGE COLUMN `아이디` 
   `userId` VARCHAR(20) NOT NULL; 
```SQL
MariaDB [alter_test]> ALTER TABLE member
    ->    CHANGE COLUMN `아이디`
    ->    `userId` VARCHAR(20) NOT NULL;
Query OK, 0 rows affected (0.014 sec)
Records: 0  Duplicates: 0  Warnings: 0

MariaDB [alter_test]> DESC member;
+-----------+-------------+------+-----+---------+----------------+
| Field     | Type        | Null | Key | Default | Extra          |
+-----------+-------------+------+-----+---------+----------------+
| idx       | int(11)     | NO   | PRI | NULL    | auto_increment |
| userId    | varchar(20) | NO   | PRI | NULL    |                |
| 이름      | varchar(30) | NO   |     | NULL    |                |
| 이메일    | varchar(30) | YES  |     | NULL    |                |
| 나이      | int(11)     | YES  |     | NULL    |                |
+-----------+-------------+------+-----+---------+----------------+
5 rows in set (0.013 sec)
-- 문제] * 속성은 기존꺼 그대로 적어줘야한다.
-- 1. 컬럼 이름 (필드이름) 변경  => 이름 -> userName   
-- 변경해라
-- 테이블은 멤버이다.
-- 필드 중 이름 필드를 변경하라.
-- userId로 변경하라.
ALTER TABLE member
CHANGE COLUMN `이름` 
`userName` VARCHAR(30) NOT NULL;
-- 2. 컬럼 이름 (필드이름) 변경 이메일 -> userEmail
-- 변경해라
-- 테이블은 멤버이다.
-- 필드 중 이메일 필드를 변경하라.
-- userEmail 변경하라.

ALTER TABLE member
CHANGE COLUMN `이메일` 
`userEmail` VARCHAR(30)  NULL;
-- 3. 컬럼 이름 (필드이름) 변경 나이 -> userAge
-- 변경해라
-- 테이블은 멤버이다.
-- 필드 중 나이 필드를 변경하라.
-- userAge 변경하라.
ALTER TABLE member
CHANGE COLUMN `나이`  -- 칸 이름과 
`userAge` INT  NULL;  -- 속성을 변경해라.

-- 컬럼 바뀐 내용 확인하기 [결과확인]
MariaDB [alter_test]> DESC member;
+-----------+-------------+------+-----+---------+----------------+
| Field     | Type        | Null | Key | Default | Extra          |
+-----------+-------------+------+-----+---------+----------------+
| idx       | int(11)     | NO   | PRI | NULL    | auto_increment |
| userId    | varchar(20) | NO   | PRI | NULL    |                |
| userName  | varchar(30) | NO   |     | NULL    |                |
| userEmail | varchar(30) | YES  |     | NULL    |                |
| userAge   | int(11)     | YES  |     | NULL    |                |
+-----------+-------------+------+-----+---------+----------------+
5 rows in set (0.013 sec)
```
3. 테이블 필드 속성(타입 TYPE) 변경 Modify 모디파이
    ALTER TABLE [테이블이름] 
    MODIFY COLUMN [컬럼명]  
    [변경하고자하는속성내용];  
   : userId 속성 => varchar(16) 변경
    


```SQL
    ALTER TABLE member
    MODIFY COLUMN `userId`  -- 속성만 변경 (Modify)
    VARCHAR(16) NOT NULL;
-- userId 컬럼의 속성 varchar(16)으로 변경
MariaDB [alter_test]>ALTER TABLE member
    ->MODIFY COLUMN `userId`
    ->VARCHAR(16) NOT NULL;
Query OK, 0 rows affected (0.017 sec)
Records: 0  Duplicates: 0  Warnings: 0
-- 결과 확인
MariaDB [alter_test]> DESC member;
+-----------+-------------+------+-----+---------+----------------+
| Field     | Type        | Null | Key | Default | Extra          |
+-----------+-------------+------+-----+---------+----------------+
| idx       | int(11)     | NO   | PRI | NULL    | auto_increment |
| userId    | varchar(16) | NO   | PRI | NULL    |                |
| userName  | varchar(30) | NO   |     | NULL    |                |
| userEmail | varchar(30) | YES  |     | NULL    |                |
| userAge   | int(11)     | YES  |     | NULL    |                |
+-----------+-------------+------+-----+---------+----------------+
5 rows in set (0.012 sec)

-- 문제]
-- 1. userName : varchar(30) => varchar(10)
ALTER TABLE member
MODIFY COLUMN `userName`
VARCHAR(10) NOT NULL;
-- 2. userEmail : varchar(30) => varchar(100)
ALTER TABLE member
MODIFY COLUMN `userEmail`
VARCHAR(100) NULL;
-- 3. userAge : 빈값 허용 => 빈값 허용 안함
ALTER TABLE member
MODIFY COLUMN `userAge`
INT NOT NULL;
-- 결과 확인
MariaDB [alter_test]> DESC member;
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| idx       | int(11)      | NO   | PRI | NULL    | auto_increment |
| userId    | varchar(16)  | NO   | PRI | NULL    |                |
| userName  | varchar(10)  | NO   |     | NULL    |                |
| userEmail | varchar(100) | YES  |     | NULL    |                |
| userAge   | int(11)      | NO   |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+
5 rows in set (0.010 sec)

```
4. 테이블 필드 추가 Add
    4-1. 테이블 필드 맨아래에 추가  Add => (default)기본 Last(맨 아래에 추가된다.)   
    
```SQL
-- 주소 필드 추가 
-- userAddr 가변문자열250자 빈값허용
-- userAddr VARCHAR(250) NULL
ALTER TABLE member
ADD COLUMN `userAddr` 
VARCHAR(250) NULL;

MariaDB [alter_test]> ALTER TABLE member
    -> ADD COLUMN `userAddr`
    -> VARCHAR(250) NULL;
Query OK, 0 rows affected (0.009 sec)
Records: 0  Duplicates: 0  Warnings: 0
-- 테이블 구조 확인
MariaDB [alter_test]> DESC member;
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| idx       | int(11)      | NO   | PRI | NULL    | auto_increment |
| userId    | varchar(16)  | NO   | PRI | NULL    |                |
| userName  | varchar(10)  | NO   |     | NULL    |                |
| userEmail | varchar(100) | YES  |     | NULL    |                |
| userAge   | int(11)      | NO   |     | NULL    |                |
| userAddr  | varchar(250) | YES  |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+
6 rows in set (0.011 sec)

--

```

    4-2. 테이블 필드 맨위에 추가    Add => First(맨 위에 추가된다.)
```SQL
-- 테이블 필드 맨위에 추가
-- userBunho 숫자 빈값허용안함
-- 맨 위에 추가하라 
-- 변경
ALTER                       -- 변경해라.
TABLE member                -- member 테이블을
ADD COLUMN                  -- 칸(컬럼)을 추가(ADD)해라.
`userBunho` INT NOT NULL    -- 필드이름 userBunho 숫자 빈값허용안함 
FIRST;                      -- 위치는 맨위에(FIRST)

MariaDB [alter_test]> ALTER TABLE member ADD COLUMN `userBunho` INT NOT NULL FIRST;
Query OK, 0 rows affected (0.011 sec)
Records: 0  Duplicates: 0  Warnings: 0
-- 테이블 구조 확인
MariaDB [alter_test]> DESC member;
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| userBunho | int(11)      | NO   |     | NULL    |                |
| idx       | int(11)      | NO   | PRI | NULL    | auto_increment |
| userId    | varchar(16)  | NO   | PRI | NULL    |                |
| userName  | varchar(10)  | NO   |     | NULL    |                |
| userEmail | varchar(100) | YES  |     | NULL    |                |
| userAge   | int(11)      | NO   |     | NULL    |                |
| userAddr  | varchar(250) | YES  |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+
7 rows in set (0.011 sec)
```                
    4-3. 테이블 필드 지정필드 다음에 추가  Add  => 지정필드 After(지정 필드 아래에 추가)
```SQL
-- 지정필드 다음에 추가
-- userPw 가변문자열(16) 빈값허용안함
-- userId 와 userName 사이에 추가하라 ( userId 아래에) 
-- 변경
ALTER                           -- 변경해라.
TABLE member                    -- member 테이블을
ADD COLUMN                      -- 칸(컬럼)을 추가(ADD)해라.
`userPw` VARCHAR(16) NOT NULL   -- 필드이름 userPw 가변문자열(16) 빈값허용안함 
AFTER `userId`;                 -- 위치는 userId 아래에 추가

ALTER TABLE member ADD COLUMN `userPw` VARCHAR(16) NOT NULL AFTER `userId`;
MariaDB [alter_test]> ALTER TABLE member ADD COLUMN `userPw` VARCHAR(16) NOT NULL AFTER `userId`;
Query OK, 0 rows affected (0.012 sec)
Records: 0  Duplicates: 0  Warnings: 0
-- 테이블 구조 결과 확인
MariaDB [alter_test]> DESC member;
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| userBunho | int(11)      | NO   |     | NULL    |                |
| idx       | int(11)      | NO   | PRI | NULL    | auto_increment |
| userId    | varchar(16)  | NO   | PRI | NULL    |                |
| userPw    | varchar(16)  | NO   |     | NULL    |                |
| userName  | varchar(10)  | NO   |     | NULL    |                |
| userEmail | varchar(100) | YES  |     | NULL    |                |
| userAge   | int(11)      | NO   |     | NULL    |                |
| userAddr  | varchar(250) | YES  |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+
8 rows in set (0.012 sec)
```
5. 테이블 필드 삭제 Drop
-- 맨위에 `userBunho` 컬럼(칸)을 삭제하라.
```SQL
-- 맨위에 `userBunho` 컬럼(칸)을 삭제하라.
ALTER                   -- 변경해라.
TABLE member            -- member 테이블을 
DROP COLUMN             -- 컬럼(칸)을 삭제해라.
`userBunho`;            -- userBunho 을 삭제

ALTER TABLE member DROP COLUMN `userBunho`;

MariaDB [alter_test]> ALTER TABLE member DROP COLUMN `userBunho`;
Query OK, 0 rows affected (0.012 sec)
Records: 0  Duplicates: 0  Warnings: 0
-- 테이블 구조 결과 확인
MariaDB [alter_test]> DESC member;
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| idx       | int(11)      | NO   | PRI | NULL    | auto_increment |
| userId    | varchar(16)  | NO   | PRI | NULL    |                |
| userPw    | varchar(16)  | NO   |     | NULL    |                |
| userName  | varchar(10)  | NO   |     | NULL    |                |
| userEmail | varchar(100) | YES  |     | NULL    |                |
| userAge   | int(11)      | NO   |     | NULL    |                |
| userAddr  | varchar(250) | YES  |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+
7 rows in set (0.010 sec)


```

6. 지시 문제 => member 테이블 변경 문제
    가. 이름 바로 아래에 휴대폰 필드를 추가하라.
        => userHp 가변문자열(13) 빈값허용안함
        `userHp` VARCHAR(13) NOT NULL

        ALTER TABLE member
        ADD COLUMN `userHp`
        VARCHAR(13) NOT NULL
        AFTER `userName`;
```SQL
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| idx       | int(11)      | NO   | PRI | NULL    | auto_increment |
| userId    | varchar(16)  | NO   | PRI | NULL    |                |
| userPw    | varchar(16)  | NO   |     | NULL    |                |
| userName  | varchar(10)  | NO   |     | NULL    |                |
| userHp    | varchar(13)  | NO   |     | NULL    |                |
| userEmail | varchar(100) | YES  |     | NULL    |                |
| userAge   | int(11)      | NO   |     | NULL    |                |
| userAddr  | varchar(250) | YES  |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+
```

    나. 맨 아래에 취미 필드를 추가하라
        => userHobby 가변문자열(100) 빈값허용
        `userHobby` VARCHAR(100) NULL

        ALTER TABLE member
        ADD COLUMN `userHobby`
        VARCHAR(100) NULL;
```SQL
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| idx       | int(11)      | NO   | PRI | NULL    | auto_increment |
| userId    | varchar(16)  | NO   | PRI | NULL    |                |
| userPw    | varchar(16)  | NO   |     | NULL    |                |
| userName  | varchar(10)  | NO   |     | NULL    |                |
| userHp    | varchar(13)  | NO   |     | NULL    |                |
| userEmail | varchar(100) | YES  |     | NULL    |                |
| userAge   | int(11)      | NO   |     | NULL    |                |
| userAddr  | varchar(250) | YES  |     | NULL    |                |
| userHobby | varchar(100) | YES  |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+
```

    다. 이메일 바로 아래에 성별 필드를 추가하라
        => userGender 가변문자열(4) 빈값허용
        `userGender` VARCHAR(4) NULL

        ALTER TABLE member
        ADD COLUMN `userGender`
        VARCHAR(4) NULL
        AFTER `userEmail`;
```SQL
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| idx        | int(11)      | NO   | PRI | NULL    | auto_increment |
| userId     | varchar(16)  | NO   | PRI | NULL    |                |
| userPw     | varchar(16)  | NO   |     | NULL    |                |
| userName   | varchar(10)  | NO   |     | NULL    |                |
| userHp     | varchar(13)  | NO   |     | NULL    |                |
| userEmail  | varchar(100) | YES  |     | NULL    |                |
| userGender | varchar(4)   | YES  |     | NULL    |                |
| userAge    | int(11)      | NO   |     | NULL    |                |
| userAddr   | varchar(250) | YES  |     | NULL    |                |
| userHobby  | varchar(100) | YES  |     | NULL    |                |
+------------+--------------+------+-----+---------+----------------+
```
    라. 맨위에 이용약관 필드를 추가하라
        => userService 가변문자열(250) 빈값허용안함
        `userService` VARCHAR(250) NOT NULL

        ALTER TABLE member
        ADD COLUMN `userService`
        VARCHAR(250) NOT NULL
        FIRST;
```SQL
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| userService | varchar(250) | NO   |     | NULL    |                |
| idx         | int(11)      | NO   | PRI | NULL    | auto_increment |
| userId      | varchar(16)  | NO   | PRI | NULL    |                |
| userPw      | varchar(16)  | NO   |     | NULL    |                |
| userName    | varchar(10)  | NO   |     | NULL    |                |
| userHp      | varchar(13)  | NO   |     | NULL    |                |
| userEmail   | varchar(100) | YES  |     | NULL    |                |
| userGender  | varchar(4)   | YES  |     | NULL    |                |
| userAge     | int(11)      | NO   |     | NULL    |                |
| userAddr    | varchar(250) | YES  |     | NULL    |                |
| userHobby   | varchar(100) | YES  |     | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+
```
    마. 맨위에 이용약관 필드를 삭제하라
        => userService

        ALTER TABLE member
        DROP COLUMN `userService`;
```SQL
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| idx        | int(11)      | NO   | PRI | NULL    | auto_increment |
| userId     | varchar(16)  | NO   | PRI | NULL    |                |
| userPw     | varchar(16)  | NO   |     | NULL    |                |
| userName   | varchar(10)  | NO   |     | NULL    |                |
| userHp     | varchar(13)  | NO   |     | NULL    |                |
| userEmail  | varchar(100) | YES  |     | NULL    |                |
| userGender | varchar(4)   | YES  |     | NULL    |                |
| userAge    | int(11)      | NO   |     | NULL    |                |
| userAddr   | varchar(250) | YES  |     | NULL    |                |
| userHobby  | varchar(100) | YES  |     | NULL    |                |
+------------+--------------+------+-----+---------+----------------+
```

# 테이블 데이터베이스 엔진 지정
CREATE TABLE `member` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(16) NOT NULL,
  `userPw` varchar(16) NOT NULL,
  `userName` varchar(10) NOT NULL,
  `userHp` varchar(13) NOT NULL,
  `userEmail` varchar(100) DEFAULT NULL,
  `userGender` varchar(4) DEFAULT NULL,
  `userAge` int(11) NOT NULL,
  `userAddr` varchar(250) DEFAULT NULL,
  `userHobby` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idx`,`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci

```SQL

-- ENGINE `MYISAM`
ALTER
TABLE member
ENGINE `MYISAM`;

-- 테이블 속성 확인 
| member |CREATE TABLE `member` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(16) NOT NULL,
  `userPw` varchar(16) NOT NULL,
  `userName` varchar(10) NOT NULL,
  `userHp` varchar(13) NOT NULL,
  `userEmail` varchar(100) DEFAULT NULL,
  `userGender` varchar(4) DEFAULT NULL,
  `userAge` int(11) NOT NULL,
  `userAddr` varchar(250) DEFAULT NULL,
  `userHobby` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idx`,`userId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci
```
# 테이블 인코딩 지정
```SQL
--
ALTER
TABLE member
CHARSET `UTF8MB4`;

| member |CREATE TABLE `member` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(16) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `userPw` varchar(16) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `userName` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `userHp` varchar(13) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `userEmail` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `userGender` varchar(4) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `userAge` int(11) NOT NULL,
  `userAddr` varchar(250) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `userHobby` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`idx`,`userId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci
```

# 엔진 , 인코딩 변경


```SQL
-- 엔진 , 인코딩 변경
ALTER
TABLE member
ENGINE `INNODB`
CHARSET `UTF8MB3`;
-- 테이블 속성 변경 확인
| member | CREATE TABLE `member` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(16) NOT NULL,
  `userPw` varchar(16) NOT NULL,
  `userName` varchar(10) NOT NULL,
  `userHp` varchar(13) NOT NULL,
  `userEmail` varchar(100) DEFAULT NULL,
  `userGender` varchar(4) DEFAULT NULL,
  `userAge` int(11) NOT NULL,
  `userAddr` varchar(250) DEFAULT NULL,
  `userHobby` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idx`,`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci
-- 엔진, 인코딩 다시 변경
ALTER
TABLE member
ENGINE `myisam` --마이 아이 삼
CHARSET `UTF8MB4`;
-- 테이블 속성 변경 확인
| member | CREATE TABLE `member` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(16) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `userPw` varchar(16) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `userName` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `userHp` varchar(13) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `userEmail` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `userGender` varchar(4) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `userAge` int(11) NOT NULL,
  `userAddr` varchar(250) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `userHobby` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`idx`,`userId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci
```