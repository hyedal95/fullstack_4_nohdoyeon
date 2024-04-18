Enter password: ****
Welcome to the MariaDB monitor.  Commands end with ; or \g.
Your MariaDB connection id is 3
Server version: 11.3.2-MariaDB mariadb.org binary distribution

Copyright (c) 2000, 2018, Oracle, MariaDB Corporation Ab and others.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

MariaDB [(none)]> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| computer           |
| gov                |
| information_schema |
| kurly              |
| kurly2             |
| kurly3             |
| kurly4             |
| kurly5             |
| mysql              |
| performance_schema |
| school             |
| shop               |
| shop2              |
| sys                |
+--------------------+
14 rows in set (0.020 sec)

MariaDB [(none)]> USE shop;
Database changed
MariaDB [shop]> SHOW TABLES;
+----------------+
| Tables_in_shop |
+----------------+
| member_table   |
+----------------+
1 row in set (0.000 sec)

MariaDB [shop]> CREATE TABLE member(
    ->     idx INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ->     userId VARCHAR(16) NOT NULL PRIMARY KEY,
    ->     userPw VARCHAR(16) NOT NULL ,
    ->     userName VARCHAR(30) NOT NULL,
    ->     userEmail VARCHAR(100) NOT NULL ,
    ->     userHp VARCHAR(13) NULL,
    ->     userGender VARCHAR(4) NULL CHECK (userGender IN('남성','여성','선택안함')),
    ->     userAddr VARCHAR(250) NOT NULL,
    ->     userGaib TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
    ->     )CHARSET=UTF8;
ERROR 1068 (42000): Multiple primary key defined
MariaDB [shop]> CREATE TABLE member(
    ->     idx INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ->     userId VARCHAR(16) NOT NULL PRIMARY KEY,
    ->     userPw VARCHAR(16) NOT NULL ,
    ->     userName VARCHAR(30) NOT NULL,
    ->     userEmail VARCHAR(100) NOT NULL ,
    ->     userHp VARCHAR(13) NULL,
    ->     userGender VARCHAR(4) NULL CHECK (userGender IN('남성','여성','선택안함')),
    ->     userAddr VARCHAR(250) NOT NULL,
    ->     userGaib TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
    ->     ) CHARSET = UTF8;
ERROR 1068 (42000): Multiple primary key defined
MariaDB [shop]> CREATE TABLE member(
    ->     idx INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ->     userId VARCHAR(16) NOT NULL PRIMARY KEY,
    ->     userPw VARCHAR(16) NOT NULL,
    ->     userName VARCHAR(30) NOT NULL,
    ->     userEmail VARCHAR(100) NOT NULL,
    ->     userHp VARCHAR(13) NULL,
    ->     userGender VARCHAR(4) NULL CHECK (userGender IN('남성','여성','선택안함')),
    ->     userAddr VARCHAR(250) NOT NULL,
    ->     userGaib TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
    ->     ) CHARSET = UTF8;
ERROR 1068 (42000): Multiple primary key defined
MariaDB [shop]> CREATE TABLE member(
    ->     idx INT NOT NULL AUTO_INCREMENT,
    ->     userId VARCHAR(16) NOT NULL,
    ->     userPw VARCHAR(16) NOT NULL,
    ->     userName VARCHAR(30) NOT NULL,
    ->     userEmail VARCHAR(100) NOT NULL,
    ->     userHp VARCHAR(13) NULL,
    ->     userGender VARCHAR(4) NULL CHECK (userGender IN('남성','여성','선택안함')),
    ->     userAddr VARCHAR(250) NOT NULL,
    ->     userGaib TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    ->     PRIMARY KEY(idx,userId)
    ->     ) CHARSET = UTF8;
Query OK, 0 rows affected (0.010 sec)

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

MariaDB [shop]> SHOW CREATE TABLE member;
+--------+-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| Table  | Create Table                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
+--------+-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
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
+--------+-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
1 row in set (0.000 sec)

MariaDB [shop]> INSERT INTO member(userId,userPw,userName,userEmail,userHp,userGender,userAddr) VALUES
    ->     ('moonjong1','mj1234','이소영','moonjong1@naver.com','010-1234-5678','여성','경기도 안산시 중앙동'),
    ->     ('moonjong2','mj1234','은관수','moonjong2@naver.com','010-1234-5678','남성','서울시 영등포구 신촌로'),
    ->     ('moonjong3','mj1234','김재광','moonjong3@naver.com','010-1234-5678','남성','서울시 서초구 논현동'),
    ->     ('moonjong4','mj1234','이수정','moonjong4@naver.com','010-1234-5678','여성','서울시 강남구 삼성동'),
    ->     ('moonjong5','mj1234','이은채','moonjong5@naver.com','010-1234-5678','남성','경기도 안산시 중앙동'),
    ->     ('moonjong6','mj1234','김재은','moonjong6@naver.com','010-1234-5678','여성','서울시 중구 종로2가'),
    ->     ('moonjong7','mj1234','박유라','moonjong7@naver.com','010-1234-5678','여성','서울시 중구 인사동'),
    ->     ('moonjong8','mj1234','임수빈','moonjong8@naver.com','010-1234-5678','여성','경기도 안산시 중앙동'),
    ->     ('moonjong9','mj1234','박송이','moonjong9@naver.com','010-1234-5678','남성','서울시 중구 중앙동'),
    ->     ('moonjong10','mj1234','민선영','moonjong10@naver.com','010-1234-5678','여성','서울시 강남구 논현동'),
    ->     ('moonjong11','mj1234','유희라','moonjong11@naver.com','010-1234-5678','여성','서울시 강남구 삼성동'),
    ->     ('moonjong12','mj1234','김소연','moonjong12@naver.com','010-1234-5678','남성','서울시 강남구 대치동');
Query OK, 12 rows affected (0.032 sec)
Records: 12  Duplicates: 0  Warnings: 0

MariaDB [shop]> SELECT*FROM member;
+-----+------------+--------+-----------+----------------------+---------------+------------+----------------------------------+---------------------+
| idx | userId     | userPw | userName  | userEmail            | userHp        | userGender | userAddr                         | userGaib            |
+-----+------------+--------+-----------+----------------------+---------------+------------+----------------------------------+---------------------+
|   1 | moonjong1  | mj1234 | 이소영    | moonjong1@naver.com  | 010-1234-5678 | 여성       | 경기도 안산시 중앙동             | 2024-04-18 11:04:51 |
|   2 | moonjong2  | mj1234 | 은관수    | moonjong2@naver.com  | 010-1234-5678 | 남성       | 서울시 영등포구 신촌로           | 2024-04-18 11:04:51 |
|   3 | moonjong3  | mj1234 | 김재광    | moonjong3@naver.com  | 010-1234-5678 | 남성       | 서울시 서초구 논현동             | 2024-04-18 11:04:51 |
|   4 | moonjong4  | mj1234 | 이수정    | moonjong4@naver.com  | 010-1234-5678 | 여성       | 서울시 강남구 삼성동             | 2024-04-18 11:04:51 |
|   5 | moonjong5  | mj1234 | 이은채    | moonjong5@naver.com  | 010-1234-5678 | 남성       | 경기도 안산시 중앙동             | 2024-04-18 11:04:51 |
|   6 | moonjong6  | mj1234 | 김재은    | moonjong6@naver.com  | 010-1234-5678 | 여성       | 서울시 중구 종로2가              | 2024-04-18 11:04:51 |
|   7 | moonjong7  | mj1234 | 박유라    | moonjong7@naver.com  | 010-1234-5678 | 여성       | 서울시 중구 인사동               | 2024-04-18 11:04:51 |
|   8 | moonjong8  | mj1234 | 임수빈    | moonjong8@naver.com  | 010-1234-5678 | 여성       | 경기도 안산시 중앙동             | 2024-04-18 11:04:51 |
|   9 | moonjong9  | mj1234 | 박송이    | moonjong9@naver.com  | 010-1234-5678 | 남성       | 서울시 중구 중앙동               | 2024-04-18 11:04:51 |
|  10 | moonjong10 | mj1234 | 민선영    | moonjong10@naver.com | 010-1234-5678 | 여성       | 서울시 강남구 논현동             | 2024-04-18 11:04:51 |
|  11 | moonjong11 | mj1234 | 유희라    | moonjong11@naver.com | 010-1234-5678 | 여성       | 서울시 강남구 삼성동             | 2024-04-18 11:04:51 |
|  12 | moonjong12 | mj1234 | 김소연    | moonjong12@naver.com | 010-1234-5678 | 남성       | 서울시 강남구 대치동             | 2024-04-18 11:04:51 |
+-----+------------+--------+-----------+----------------------+---------------+------------+----------------------------------+---------------------+
12 rows in set (0.000 sec)

MariaDB [shop]> INSERT INTO member(userId,userPw,userName,userEmail,userHp,userGender,userAddr) VALUES
    ->     ('moonjong13','mj1234','차두리','moonjong13@naver.com','010-8757-7555','남자','경기도 용인시 처인구');
ERROR 4025 (23000): CONSTRAINT `member.userGender` failed for `shop`.`member`
MariaDB [shop]> INSERT INTO member(userId,userPw,userName,userEmail,userHp,userGender,userAddr) VALUES
    ->     ('moonjong13','mj1234','차두리','moonjong13@naver.com','010-8757-7555','선택안함','경기도 용인시 처인구');
Query OK, 1 row affected (0.001 sec)

MariaDB [shop]> SELECT * FROM member;
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
+-----+------------+--------+-----------+----------------------+---------------+--------------+----------------------------------+---------------------+
13 rows in set (0.000 sec)




Enter password: ****
Welcome to the MariaDB monitor.  Commands end with ; or \g.
Your MariaDB connection id is 4
Server version: 11.3.2-MariaDB mariadb.org binary distribution

Copyright (c) 2000, 2018, Oracle, MariaDB Corporation Ab and others.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

MariaDB [(none)]> USE shop;
Database changed
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

MariaDB [shop]> SELECT userName, userAddr, userGaib FROM member ORDER BY userGaib DESC LIMIT 5;
+-----------+-------------------------------+---------------------+
| userName  | userAddr                      | userGaib            |
+-----------+-------------------------------+---------------------+
| 권소현    | 경기도 용인시 기흥구          | 2024-04-18 11:16:16 |
| 김야헌    | 경기도 용인시 기흥구          | 2024-04-18 11:15:48 |
| 차두리    | 경기도 용인시 처인구          | 2024-04-18 11:07:41 |
| 김재광    | 서울시 서초구 논현동          | 2024-04-18 11:04:51 |
| 이은채    | 경기도 안산시 중앙동          | 2024-04-18 11:04:51 |
+-----------+-------------------------------+---------------------+
5 rows in set (0.001 sec)

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

MariaDB [shop]> SELECT idx, userName , userGender, userAddr FROM member WHERE userName LIKE '이%' AND userAddr LIKE '서울시%' ORDER BY idx;
+-----+-----------+------------+-------------------------------+
| idx | userName  | userGender | userAddr                      |
+-----+-----------+------------+-------------------------------+
|   4 | 이수정    | 여성       | 서울시 강남구 삼성동          |
+-----+-----------+------------+-------------------------------+
1 row in set (0.002 sec)

MariaDB [shop]>