
# 실습 혼자하기 
- 데이터베이스 만들기
데이터베이스 :alter_test2 
- 테이블 만들기
테이블 : member_table
- 필드 
  idx INT NOT NULL AUTO_INCREMENT,
  아이디 가변길이문자열(20) 빈값 허용안함 PK
  이름 가변길이문자열(30) 빈값허용안함
  이메일 가변길이문자열(30) 빈값허용함
  나이 숫자 빈값허용함


```SQL
-- 데이터베이스 alter_test2 생성
CREATE DATABASE alter_test2;
-- 데이터베이스 alter_test2 사용
USE alter_test2;
-- 테이블 member_table 생성
CREATE TABLE member_table(
  idx INT NOT NULL AUTO_INCREMENT,
  아이디 VARCHAR(20) NOT NULL,
  이름 VARCHAR(30) NOT NULL,
  이메일 VARCHAR(30) NULL,
  나이 INT NULL,
  PRIMARY KEY(idx, 아이디)
) CHARSET=UTF8;
-- 테이블 구조 확인
+-----------+-------------+------+-----+---------+----------------+
| Field     | Type        | Null | Key | Default | Extra          |
+-----------+-------------+------+-----+---------+----------------+
| idx       | int(11)     | NO   | PRI | NULL    | auto_increment |
| 아이디    | varchar(20) | NO   | PRI | NULL    |                |
| 이름      | varchar(30) | NO   |     | NULL    |                |
| 이메일    | varchar(30) | YES  |     | NULL    |                |
| 나이      | int(11)     | YES  |     | NULL    |                |
+-----------+-------------+------+-----+---------+----------------+
```

-- 1. 테이블 이름 변경   Rename
```SQL
ALTER TABLE member_table
RENAME member;
-- 테이블 상세구조확인
| member | CREATE TABLE `member` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `아이디` varchar(20) NOT NULL,
  `이름` varchar(30) NOT NULL,
  `이메일` varchar(30) DEFAULT NULL,
  `나이` int(11) DEFAULT NULL,
  PRIMARY KEY (`idx`,`아이디`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci
```

-- 2. 테이블 필드 이름과 속성 변경 Change
-- 아이디 => userId 
-- 이름=> userName 
-- 이메일=> userEmail 
-- 나이=> userAge
```SQL
ALTER TABLE member
CHANGE COLUMN `아이디` `userId` VARCHAR(20) NOT NULL;
ALTER TABLE member
CHANGE COLUMN `이름` `userName` VARCHAR(30) NOT NULL;
ALTER TABLE member
CHANGE COLUMN `이메일` `userEmail` VARCHAR(30) NULL;
ALTER TABLE member
CHANGE COLUMN `나이` `userAge` INT NULL;
-- 테이블 구조 확인
+-----------+-------------+------+-----+---------+----------------+
| Field     | Type        | Null | Key | Default | Extra          |
+-----------+-------------+------+-----+---------+----------------+
| idx       | int(11)     | NO   | PRI | NULL    | auto_increment |
| userId    | varchar(20) | NO   | PRI | NULL    |                |
| userName  | varchar(30) | NO   |     | NULL    |                |
| userEmail | varchar(30) | YES  |     | NULL    |                |
| userAge   | int(11)     | YES  |     | NULL    |                |
+-----------+-------------+------+-----+---------+----------------+
```
-- 3. 테이블 필드 속성만 변경 Modify
-- userId => varchar(16) NUT NULL
-- userName => varchar(10) NUT NULL
-- userEmail => varchar(100) NULL
-- userAge => int NOT NULL

```SQL
ALTER TABLE member
MODIFY COLUMN `userId` 
VARCHAR(16) NOT NULL;

ALTER TABLE member
MODIFY COLUMN `userName` 
VARCHAR(10) NOT NULL;

ALTER TABLE member
MODIFY COLUMN `userEmail` 
VARCHAR(100) NULL;

ALTER TABLE member
MODIFY COLUMN `userAge` 
INT NOT NULL;
-- 테이블 구조 결과 확인
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| idx       | int(11)      | NO   | PRI | NULL    | auto_increment |
| userId    | varchar(16)  | NO   | PRI | NULL    |                |
| userName  | varchar(10)  | NO   |     | NULL    |                |
| userEmail | varchar(100) | YES  |     | NULL    |                |
| userAge   | int(11)      | NO   |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+
```
-- 4. 테이블 필드 추가 Add
     -- 4-1. 테이블 필드 맨아래에 추가  Add => (default)기본 Last(맨 아래에 추가된다.) 
    -- 주소 필드 추가 
    -- userAddr 가변문자열250자 빈값허용
    -- userAddr VARCHAR(250) NULL
```SQL
ALTER TABLE member
ADD COLUMN `userAddr`
VARCHAR(250) NULL;
-- 테이블 구조 결과 확인
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
```

     -- 4-2. 테이블 필드 맨위에 추가    Add => First(맨 위에 추가된다.) 
    -- 테이블 필드 맨위에 추가
    -- userBunho 숫자 빈값허용안함
    -- 맨 위에 추가하라 
    -- 변경
```SQL
ALTER TABLE member
ADD COLUMN `userBunho`
INT NOT NULL
FIRST;
-- 테이블 구조 결과 확인
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
```
                 
     -- 4-3. 테이블 필드 지정필드 다음에 추가  Add  => 지정필드 After(지정 필드 아래에 추가)    
    -- 지정필드 다음에 추가
    -- userPw 가변문자열(16) 빈값허용안함
    -- userId 와 userName 사이에 추가하라 ( userId 아래에) 
    -- 변경
```SQL
ALTER TABLE member
ADD COLUMN `userPw`
VARCHAR(16) NOT NULL
AFTER `userId`;
-- 테이블 구조 결과 확인
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
``` 
--5. 테이블 필드 삭제 Drop
-- 맨위에 `userBunho` 컬럼(칸)을 삭제하라.
```SQL
ALTER TABLE member
DROP COLUMN `userBunho`;
-- 테이블 구조 결과 확인
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
```


# 엔진 , 인코딩 변경
- 기존 상세 구조 확인
- ENGINE=InnoDB => ENGINE=MYISAM
- CHARSET=utf8mb3 => CHARSET=utf8mb4
```SQL
SHOW CREATE TABLE member;
-- 기존 상세 구조 확인  
| member | CREATE TABLE `member` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(16) NOT NULL,
  `userPw` varchar(16) NOT NULL,
  `userName` varchar(10) NOT NULL,
  `userEmail` varchar(100) DEFAULT NULL,
  `userAge` int(11) NOT NULL,
  `userAddr` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`idx`,`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci
```
```SQL
-- 엔진 변경
ALTER TABLE member
ENGINE `MYISAM`;
-- 테이블 상세 구조 결과 확인
| member | CREATE TABLE `member` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(16) NOT NULL,
  `userPw` varchar(16) NOT NULL,
  `userName` varchar(10) NOT NULL,
  `userEmail` varchar(100) DEFAULT NULL,
  `userAge` int(11) NOT NULL,
  `userAddr` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`idx`,`userId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci
-- 인코딩 변경
ALTER TABLE member
CHARSET `UTF8MB4`;
-- 테이블 상세 구조 결과 확인
| member | CREATE TABLE `member` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(16) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `userPw` varchar(16) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `userName` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `userEmail` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `userAge` int(11) NOT NULL,
  `userAddr` varchar(250) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`idx`,`userId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci

-- 엔진과 인코딩 동시 변경
ALTER TABLE member
ENGINE `INNODB`
CHARSET `UTF8MB3`;
-- 테이블 상세 구조 결과 확인
| member | CREATE TABLE `member` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(16) NOT NULL,
  `userPw` varchar(16) NOT NULL,
  `userName` varchar(10) NOT NULL,
  `userEmail` varchar(100) DEFAULT NULL,
  `userAge` int(11) NOT NULL,
  `userAddr` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`idx`,`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci
```