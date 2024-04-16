[1] MYSQL
1. MYSQL 커뮤니티 버전 다운로드 설치 시작
2. 포트번호 3306
3. 비밀번호 1234

[2] mariaDB => MariaDB.org
1. mariaDB 커뮤니티 버전 다운로드 설치 시작
2. 포트번호 3307
3. 비밀번호 1234
4. MySQL Client (MariaDB 11.3 (x64)) 클릭 실행

[3] MySQL 사용법 
=> SQL(Structure 스트럭쳐 Query 쿼리 Language 랭귀지) 
=> 구조적인(Structure) 질의(Query) 언어 (Language)
=> 종결어미 ; 세미콜론을 반드시 입력한다. 마무리
=> 대소문자 구분 안함.
=> 명령어는 대문자 식별자는 소문자로 쓰자! 

# 데이터베이스 확인

1. 보여줘 데이터베이스들(-s복수사용)
- show databases; 
- SHOW DATABASES;

```SQL
MariaDB [(none)]> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
4 rows in set (0.001 sec)
```
2. 데이터베이스 생성(만들기)

회사명(프로젝트명) => 데이터베이스 이름  kurly
- 고객 회원가입테이블 user_signup_table => 테이블생성
- 관리자 회원가입테이블 admin_signup_table => 테이블생성
- 장바구니 테이블 cart_table
- 최근본상품 테이블 view_product_table
- 공지사항 테이블 notice_table
- 새소식 테이블 news_table
- 배송지 테이블 delivery_table

데이터베이스이름 => kurly 

- 생성하다 데이터베이스를 데이터베이스이름
- CREATE DATABASE kurly;  
```SQL
MariaDB [(none)]> CREATE DATABASE kurly;
Query OK, 1 row affected (0.003 sec)
```
- 추가 내용 확인하기 SHOW DATABASES;
```SQL
MariaDB [(none)]> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| kurly              |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.001 sec)
```

데이터베이스 생성 coopang 

```SQL
MariaDB [(none)]> CREATE DATABASE coopang;
Query OK, 1 row affected (0.001 sec)
```
- 데이터베이스 보여줘
```SQL
MariaDB [(none)]> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| coopang            |
| information_schema |
| kurly              |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
6 rows in set (0.001 sec)

```

3. 데이터베이스 삭제(없애기)  삭제 DROP

- 삭제 DROP
  데이터베이스 kurly  삭제
  데이터베이스 coopang  삭제

삭제하라 데이터베이스 데이터베이스명;
DROP DATABASE kurly;

- 데이터베이스 kurly  삭제
```SQL
MariaDB [(none)]> DROP DATABASE kurly;
Query OK, 0 rows affected (0.018 sec)
```
- 데이터베이스 kurly  삭제 확인
```SQL
MariaDB [(none)]> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| coopang            |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.000 sec)
```
- 데이터베이스 coopang  삭제
```SQL
MariaDB [(none)]> DROP DATABASE coopang;
Query OK, 0 rows affected (0.004 sec)
```
- 데이터베이스 coopang  삭제 확인
```SQL
MariaDB [(none)]> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
4 rows in set (0.000 sec)
```

배운 명령어 정리
CREATE DATABASE 데이터베이스이름; => 데이터베이스 생성
SHOW DATABASES; => 데이터베이스 목록보기
DROP DATABASE 데이터베이스이름; => 데이터베이스 삭제

4. 테이블 만들기 
    데이터베이스 이름 school
    school - 테이블 이름 학생 테이블 student_table
    - 테이블설계
        - 학번 hakbun 
          * 문자열 : 가변길이 VARCHAR(8) 20241C29 & 고정 
          * 중복불가 프라이머리 키 primary key (pk)
          * null 값 허용안함 => 필수 입력 =>NOT NULL
        - 이름 name
          * 문자열 : 가변길이 VARCHAR(30) 이순신
          * null 값 허용안함 => 필수 입력 =>NOT NULL
        - 휴대폰 hp
          * 문자열 : 가변길이 VARCHAR(13) 010--1234-5678
          * null 값 허용안함 => 필수 입력 =>NOT NULL
        - 성별 gender
          * 문자열 : 가변길이 VARCHAR(4) 남성,여성,선택안함
          * null 값 허용 => 선택 입력 =>NULL => Default값이므로 안써도 무방
        - 주소 address
          * 문자열 : 가변길이 VARCHAR(250)
          * null 값 허용 => 선택 입력 =>NULL => Default값이므로 안써도 무방

- 만들어라 테이블을 학생테이블(
    hakbun VARCHAR(8) NOT NULL,
    name VARCHAR(30) NOT NULL,
    hp VARCHAR(13) NOT NULL,
    gender VARCHAR(4) NULL,
    address VARCHAR(250) NULL,
    PRIMARY KEY(hakbun)
    );
학생 테이블 만들기 
- CREATE TABLE student_table(
    hakbun VARCHAR(8) NOT NULL,
    name VARCHAR(30) NOT NULL,
    hp VARCHAR(13) NOT NULL,
    gender VARCHAR(4) NULL,
    address VARCHAR(250) NULL,
    PRIMARY KEY(hakbun)
);

ERROR 1046 (3D000): No database selected 
테이블만들기 에러 발생? 데이터베이스 선택을 안해서

1. 데이터베이스 만들기 => CREATE DATABASE school;

2. 만들어진 데이터베이스 사용하기(선택하기) => USE school;
```SQL
MariaDB [(none)]> USE school;
Database changed
```
3. 테이블 만들기 =>CREATE TABLE student_table(...);
```SQL
MariaDB [school]> CREATE TABLE student_table(
    ->     hakbun VARCHAR(8) NOT NULL,
    ->     name VARCHAR(30) NOT NULL,
    ->     hp VARCHAR(13) NOT NULL,
    ->     gender VARCHAR(4) NULL,
    ->     address VARCHAR(250) NULL,
    ->     PRIMARY KEY(hakbun)
    -> );
Query OK, 0 rows affected (0.008 sec)
```
4. 테이블 목록 확인하기 => SHOW TABLES;
```SQL
MariaDB [school]> SHOW TABLES;
+------------------+
| Tables_in_school |
+------------------+
| student_table    |
+------------------+
1 row in set (0.001 sec)
```

5. 테이블 구조 확인하기 => DESC student_table;
```SQL
MariaDB [school]> DESC student_table;
+---------+--------------+------+-----+---------+-------+
| Field   | Type         | Null | Key | Default | Extra |
+---------+--------------+------+-----+---------+-------+
| hakbun  | varchar(8)   | NO   | PRI | NULL    |       |
| name    | varchar(30)  | NO   |     | NULL    |       |
| hp      | varchar(13)  | NO   |     | NULL    |       |
| gender  | varchar(4)   | YES  |     | NULL    |       |
| address | varchar(250) | YES  |     | NULL    |       |
+---------+--------------+------+-----+---------+-------+
5 rows in set (0.011 sec)
```

=======================================
CREATE DATABASE school;
SHOW DATABASES;
USE school;
CREATE TABLE student_table(...);
SHOW TABLES;
DESC student_table;