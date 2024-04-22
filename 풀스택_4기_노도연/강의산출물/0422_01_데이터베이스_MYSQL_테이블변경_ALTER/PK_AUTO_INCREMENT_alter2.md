#  alter_test2데이터베이스 확인


1. member 테이블 (AUTO_INCREMENT , PRIMARY KEY 가 설정된 경우)
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
-- PRIMARY KEY(idx, userId, userEmail) 수정 해야 하는 경우
-- 문제 1. AUTO_INCREMENT 존재하면 
-- primary key는 반드시 설정 되어야 합니다. => 무결성(변경되서는 안되는 값)
-- (1)그래서 idx의 AUTO_INCREMENT 속성을 제거 수정 해야한다. MODIFY
-- (2)그런 뒤에 PRIMARY KEY 를 삭제한다. DROP
-- (3)그리고 PRIMARY KEY(idx, userId, userEmail) 3개의 속성을 추가한다. ADD
-- (4)마지막으로 idx만 AUTO_INCREMENT 속성을 추가한다. MODIFY

```SQL
-- (1)그래서 idx의 AUTO_INCREMENT 속성을 제거 수정 해야한다. MODIFY
ALTER TABLE member
MODIFY 
`idx` INT NOT NULL;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| idx       | int(11)      | NO   | PRI | NULL    |       |
| userId    | varchar(16)  | NO   | PRI | NULL    |       |
| userPw    | varchar(16)  | NO   |     | NULL    |       |
| userName  | varchar(10)  | NO   |     | NULL    |       |
| userEmail | varchar(100) | YES  |     | NULL    |       |
| userAge   | int(11)      | NO   |     | NULL    |       |
| userAddr  | varchar(250) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
-- (2)그런 뒤에 PRIMARY KEY 를 삭제한다. DROP
-- (3)그리고 PRIMARY KEY(idx, userId, userEmail) 3개의 속성을 추가한다. ADD
ALTER TABLE member
DROP
PRIMARY KEY,
ADD 
PRIMARY KEY(idx, userId, userEmail);
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| idx       | int(11)      | NO   | PRI | NULL    |       |
| userId    | varchar(16)  | NO   | PRI | NULL    |       |
| userPw    | varchar(16)  | NO   |     | NULL    |       |
| userName  | varchar(10)  | NO   |     | NULL    |       |
| userEmail | varchar(100) | NO   | PRI | NULL    |       |
| userAge   | int(11)      | NO   |     | NULL    |       |
| userAddr  | varchar(250) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+

-- (4)마지막으로 idx만 AUTO_INCREMENT 속성을 추가한다. MODIFY
ALTER TABLE member
MODIFY
`idx` INT NOT NULL AUTO_INCREMENT;
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| idx       | int(11)      | NO   | PRI | NULL    | auto_increment |
| userId    | varchar(16)  | NO   | PRI | NULL    |                |
| userPw    | varchar(16)  | NO   |     | NULL    |                |
| userName  | varchar(10)  | NO   |     | NULL    |                |
| userEmail | varchar(100) | NO   | PRI | NULL    |                |
| userAge   | int(11)      | NO   |     | NULL    |                |
| userAddr  | varchar(250) | YES  |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+
```

2.  member2 테이블 (AUTO_INCREMENT , PRIMARY KEY가 없는 경우) 
CREATE TABLE member2(
    userId varchar(16) NOT NULL,
    userPw varchar(16) NOT NULL,
    userName varchar(10) NOT NULL,
    userEmail varchar(100) NULL,
    userAge int NOT NULL,
    userAddr varchar(250) NULL
)ENGINE=`MYISAM` CHARSET=`UTF8MB4`;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| userId    | varchar(16)  | NO   |     | NULL    |       |
| userPw    | varchar(16)  | NO   |     | NULL    |       |
| userName  | varchar(10)  | NO   |     | NULL    |       |
| userEmail | varchar(100) | YES  |     | NULL    |       |
| userAge   | int(11)      | NO   |     | NULL    |       |
| userAddr  | varchar(250) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
-- 테이블 member2에 PRIMARY KEY => userId 추가 ADD
-- 테이블 member2에 PRIMARY KEY => 수정
-- (1) userId PRIMARY KEY => 기존 PRIMARY KEY 삭제
-- (2) userId, userEmail PRIMARY KEY => 추가
```SQL
--테이블 member2에 PRIMARY KEY => userId 추가 ADD
ALTER TABLE member2
ADD 
PRIMARY KEY(userId);
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| userId    | varchar(16)  | NO   | PRI | NULL    |       |
| userPw    | varchar(16)  | NO   |     | NULL    |       |
| userName  | varchar(10)  | NO   |     | NULL    |       |
| userEmail | varchar(100) | YES  |     | NULL    |       |
| userAge   | int(11)      | NO   |     | NULL    |       |
| userAddr  | varchar(250) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
-- (1) userId PRIMARY KEY => 기존 PRIMARY KEY 삭제
-- (2) userId, userEmail PRIMARY KEY => 추가
ALTER TABLE member2
DROP 
PRIMARY KEY,
ADD
PRIMARY KEY(userId, userEmail);
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| userId    | varchar(16)  | NO   | PRI | NULL    |       |
| userPw    | varchar(16)  | NO   |     | NULL    |       |
| userName  | varchar(10)  | NO   |     | NULL    |       |
| userEmail | varchar(100) | NO   | PRI | NULL    |       |
| userAge   | int(11)      | NO   |     | NULL    |       |
| userAddr  | varchar(250) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
```

3.  member3 테이블 생성(PRIMARY KEY만 있고, AUTO_INCREMENT 없는 경우) => AUTO_INCREMENT 추가
CREATE TABLE member3(
    userId varchar(16) NOT NULL,
    userPw varchar(16) NOT NULL,
    userName varchar(10) NOT NULL,
    userEmail varchar(100) NULL,
    userAge int NOT NULL,
    userAddr varchar(250) NULL,
    PRIMARY KEY(userId)
)ENGINE=`MYISAM` CHARSET=`UTF8MB4`;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| userId    | varchar(16)  | NO   | PRI | NULL    |       |
| userPw    | varchar(16)  | NO   |     | NULL    |       |
| userName  | varchar(10)  | NO   |     | NULL    |       |
| userEmail | varchar(100) | YES  |     | NULL    |       |
| userAge   | int(11)      | NO   |     | NULL    |       |
| userAddr  | varchar(250) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
-- PRIMARY KEY => userId
-- PRIMARY KEY => idx, AUTO_INCREMENT 속성까지 => 맨 위에 추가 (ADD - FIRST;)
```SQL
-- PRIMARY KEY => userId
-- PRIMARY KEY => idx, AUTO_INCREMENT 속성까지 => 맨 위에 추가 (ADD - FIRST;)

-- 1. idx AUTO_INCREMENT 속성 없이 맨위에 추가
ALTER TABLE member3
ADD
`idx` INT NOT NULL
FIRST; 
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| idx       | int(11)      | NO   |     | NULL    |       |
| userId    | varchar(16)  | NO   | PRI | NULL    |       |
| userPw    | varchar(16)  | NO   |     | NULL    |       |
| userName  | varchar(10)  | NO   |     | NULL    |       |
| userEmail | varchar(100) | YES  |     | NULL    |       |
| userAge   | int(11)      | NO   |     | NULL    |       |
| userAddr  | varchar(250) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
-- 2. primary 키 삭제
-- 3. primary key (idx, userId ) 추가
ALTER TABLE member3
DROP
PRIMARY KEY,
ADD
PRIMARY KEY(idx, userId);
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| idx       | int(11)      | NO   | PRI | NULL    |       |
| userId    | varchar(16)  | NO   | PRI | NULL    |       |
| userPw    | varchar(16)  | NO   |     | NULL    |       |
| userName  | varchar(10)  | NO   |     | NULL    |       |
| userEmail | varchar(100) | YES  |     | NULL    |       |
| userAge   | int(11)      | NO   |     | NULL    |       |
| userAddr  | varchar(250) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
-- 4. idx 속성 추가 
ALTER TABLE member3
MODIFY
`idx` INT NOT NULL AUTO_INCREMENT;
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