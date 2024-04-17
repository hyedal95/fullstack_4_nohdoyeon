1. 데이터베이스 생성 => shop2

2. 테이블생성 Create => CREATE
    -- 데이터베이스 생성
    CREATE DATABASE shop2;
    -- 현재 프롬프트 위치 변경     
    USE shop2;
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

3. 테이블 데이터 입력 INSERT
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

4. 테이블 목록 조회 SELECT
    SELECT * FROM member_table;

5. 테이블 목록 조회 SELECT 조건문 WHERE 웨어
6. 테이블 목록 조회 SELECT 조건문 WHERE 웨어 나이
7. 테이블 목록 조회 SELECT  여러개의 필드 조건문
8. 테이블 목록 조회 SELECT ~WHERE ~ IN(조건1,조건2,조건3)