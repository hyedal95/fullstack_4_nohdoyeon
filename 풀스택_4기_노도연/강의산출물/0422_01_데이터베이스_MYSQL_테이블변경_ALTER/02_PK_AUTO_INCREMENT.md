# PRIMARY KEY & AUTO_INCREMENT
```SQL

--1. member 테이블 (AUTO_INCREMENT , PRIMARY KEY 가 설정된 경우)
-- PRIMARY KEY 삭제 할 수 없다. 
-- WHY??  AUTO_INCREMENT 속성은 기본키가 기본으로 설정되어야 하기 때문에 삭제 불가능
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
--2. member2 테이블 생성(AUTO_INCREMENT , PRIMARY KEY가 없는 경우)
CREATE TABLE member2 (
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

--3. member3 테이블 생성(PRIMARY KEY만 있고, AUTO_INCREMENT 없는 경우)
CREATE TABLE member3 (
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


```


1. member2 테이블 (AUTO_INCREMENT , PRIMARY KEY가 없는 경우) 

```SQL
--테이블 member2에 PRIMARY KEY => userId 추가 ADD
ALTER 
TABLE member2
ADD
PRIMARY KEY(`userId`);
-- 결과 확인 => DESC member2;
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

-- 테이블 member2에 PRIMARY KEY => 수정
-- (1) userId PRIMARY KEY => 기존 PRIMARY KEY 삭제
-- (2) userId, userEmail PRIMARY KEY => 추가

-- 1. 기존 PRIMARY KEY 삭제
ALTER 
TABLE member2
DROP
PRIMARY KEY;
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
-- 2.PRIMARY KEY 추가
ALTER 
TABLE member2
ADD
PRIMARY KEY(`userId`, `userEmail`);
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
-- 3.기존 PRIMARY KEY 삭제(DROP) 그리고(,) PRIMARY KEY 추가(ADD)

ALTER 
TABLE member2
DROP
PRIMARY KEY,
ADD
PRIMARY KEY(`userId`, `userEmail`);
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

2. member3 테이블 생성(PRIMARY KEY만 있고, AUTO_INCREMENT 없는 경우) => AUTO_INCREMENT 추가
```SQL
-- PRIMARY KEY => userId
-- PRIMARY KEY => idx, AUTO_INCREMENT 속성까지 => 맨 위에 추가 (ADD - FIRST;)

ALTER 
TABLE member3
ADD 
`idx` INT NOT NULL PRIMARY KEY AUTO_INCREMENT 
FIRST;
-- 에러 뜸 => ERROR 1068 (42000): Multiple primary key defined
-- 1. PRIMARY KEY 삭제
ALTER 
TABLE member3
DROP
PRIMARY KEY;
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
-- 2. idx AUTO_INCREMENT 없이 필드 추가 
        : idx  INT NOT NULL  
ALTER 
TABLE member3
ADD 
`idx` INT NOT NULL
FIRST;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| idx       | int(11)      | NO   |     | NULL    |       |
| userId    | varchar(16)  | NO   |     | NULL    |       |
| userPw    | varchar(16)  | NO   |     | NULL    |       |
| userName  | varchar(10)  | NO   |     | NULL    |       |
| userEmail | varchar(100) | YES  |     | NULL    |       |
| userAge   | int(11)      | NO   |     | NULL    |       |
| userAddr  | varchar(250) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
-- * 맨위에 추가했어야하는데 맨 아래에 추가된 경우 수정 MODIFY 위치만 바꾸기 아래와 같은 명령어 입력하면된다.
ALTER 
TABLE member3
MODIFY
idx INT NOT NULL
FIRST;
---------------------------------------------------------------------------------
-- 3. PRIMARY KEY 추가(idx, userId)

ALTER 
TABLE member3
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
-- 4. idx =>  auto_increment 속성 변경 => MODIFY
ALTER 
TABLE member3
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

3. member 테이블 (AUTO_INCREMENT , PRIMARY KEY 가 설정된 경우)

```SQL
-- PRIMARY KEY(idx, userId, userEmail) 수정 해야 하는 경우
-- 문제 1. AUTO_INCREMENT 존재하면 
-- primary key는 반드시 설정 되어야 합니다. => 무결성(변경되서는 안되는 값)
-- (1)그래서 idx의 AUTO_INCREMENT 속성을 제거 수정 해야한다. MODIFY
-- (2)그런 뒤에 PRIMARY KEY 를 삭제한다. DROP
-- (3)그리고 PRIMARY KEY(idx, userId, userEmail) 3개의 속성을 추가한다. ADD
-- (4)마지막으로 idx만 AUTO_INCREMENT 속성을 추가한다. MODIFY

--1. idx =>  AUTO_INCREMENT 속성 삭제 
ALTER 
TABLE member
MODIFY
`idx` INT NOT NULL;
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| idx        | int(11)      | NO   | PRI | NULL    |       |
| userId     | varchar(16)  | NO   | PRI | NULL    |       |
| userPw     | varchar(16)  | NO   |     | NULL    |       |
| userName   | varchar(10)  | NO   |     | NULL    |       |
| userHp     | varchar(13)  | NO   |     | NULL    |       |
| userEmail  | varchar(100) | YES  |     | NULL    |       |
| userGender | varchar(4)   | YES  |     | NULL    |       |
| userAge    | int(11)      | NO   |     | NULL    |       |
| userAddr   | varchar(250) | YES  |     | NULL    |       |
| userHobby  | varchar(100) | YES  |     | NULL    |       |
+------------+--------------+------+-----+---------+-------+ 

--2. idx,userId => PK 삭제
--3. PRIMARY KEY(idx, userId, userEmail) 추가해준다.
ALTER
TABLE member
DROP 
PRIMARY KEY,
ADD
PRIMARY KEY(idx, userId, userEmail);
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| idx        | int(11)      | NO   | PRI | NULL    |       |
| userId     | varchar(16)  | NO   | PRI | NULL    |       |
| userPw     | varchar(16)  | NO   |     | NULL    |       |
| userName   | varchar(10)  | NO   |     | NULL    |       |
| userHp     | varchar(13)  | NO   |     | NULL    |       |
| userEmail  | varchar(100) | NO   | PRI | NULL    |       |
| userGender | varchar(4)   | YES  |     | NULL    |       |
| userAge    | int(11)      | NO   |     | NULL    |       |
| userAddr   | varchar(250) | YES  |     | NULL    |       |
| userHobby  | varchar(100) | YES  |     | NULL    |       |
+------------+--------------+------+-----+---------+-------+

--4. idx => AUTO_INCREMENT 속성 추가
ALTER 
TABLE member
MODIFY 
`idx` INT NOT NULL AUTO_INCREMENT;
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| idx        | int(11)      | NO   | PRI | NULL    | auto_increment |
| userId     | varchar(16)  | NO   | PRI | NULL    |                |
| userPw     | varchar(16)  | NO   |     | NULL    |                |
| userName   | varchar(10)  | NO   |     | NULL    |                |
| userHp     | varchar(13)  | NO   |     | NULL    |                |
| userEmail  | varchar(100) | NO   | PRI | NULL    |                |
| userGender | varchar(4)   | YES  |     | NULL    |                |
| userAge    | int(11)      | NO   |     | NULL    |                |
| userAddr   | varchar(250) | YES  |     | NULL    |                |
| userHobby  | varchar(100) | YES  |     | NULL    |                |
+------------+--------------+------+-----+---------+----------------+
```


AUTO_INCREMENT 속성의 데이터의 무결성 제약조건에 전부 해당되기때문에, 
PK만 삭제하고자하는 것은 무결성조건에 벗어나기 때문에
오류가 벗어난다고 생각하면된다.

데이터베이스의 무결성 제약조건의 종류에는 
대표적으로 7가지가 있다.
1. 개체 무결성(Entity integrity)
2. 참조 무결성(Referential integrity)
3. 도메인 무결성(Domain integrity)
4. Null무결성(Null integrity)
5. 고유 무결성 (Unique integrity)
6. 키 무결성 (Key integrity)
7. 관계 무결성 (Relationship integrity)
⭐️ 무결성 제약조건의 장단점
* 장점
스키마를 정의할 때 일관성 조건을 오직 한 번만 명시하고, 데이터베이스가 갱신될 때 DBMS가 자동적으로 일관성 조건을 검사하므로 응용 프로그램들은 일관성 조건을 검사할 필요가 없음.

* 단점
프로그래밍 작업이 훨씬 복잡해지고, 무결성 제약조건을 반복해서 구현해야 하고, 무결성 제약조건들 간에 서로 충돌이 발생할 수 있음.