--DB 설계
--DATABASE  이름 : todo
--TABLE : todo_list_table
--필드1 idx INT NOT NULL AUTO_INCREMENT PK
--필드2 GKFDLF todo VARCHAR(100) NOT NULL
--필드3 등록일자 todoDate TIMESTAMP DEFAULT NOW() NOT NULL
SHOW DATABASES;

CREATE DATABASE todo;

USE todo;

CREATE TABLE todo_list_table(
	idx INT NOT NULL AUTO_INCREMENT COMMENT '인덱스번호' ,
    todo VARCHAR(100) NOT NULL COMMENT '할일' ,
    todoDate TIMESTAMP DEFAULT NOW() NOT NULL COMMENT '등록일자' ,
    PRIMARY KEY(idx)
) ENGINE=MYISAM CHARSET=UTF8MB4;

DESC todo_list_table;
--+----------+--------------+------+-----+---------------------+----------------+
--| Field    | Type         | Null | Key | Default             | Extra          |
--+----------+--------------+------+-----+---------------------+----------------+
--| idx      | int(11)      | NO   | PRI | NULL                | auto_increment |
--| todo     | varchar(250) | NO   |     | NULL                |                |
--| todoDate | timestamp    | NO   |     | current_timestamp() |                |
--+----------+--------------+------+-----+---------------------+----------------+

SHOW CREATE TABLE todo_list_table;
--| todo_list_table | CREATE TABLE `todo_list_table` (
--  `idx` int(11) NOT NULL AUTO_INCREMENT COMMENT '번호',
--  `todo` varchar(250) NOT NULL COMMENT '할일',
--  `todoDate` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '등록일자',
--  PRIMARY KEY (`idx`)
--) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci         |


--+-----+-----------------------------------------------------------------------------------------------------------+---------------------+
--| idx | todo                                                                                                      | todoDate            |
--+-----+-----------------------------------------------------------------------------------------------------------+---------------------+
--|   1 | 정보처리기사 자격증 시험보러가기기                                                                        | 2024-04-26 14:47:24 |
--|   2 | java과제1- 회원가입 제작구현                                                                              | 2024-04-26 14:48:37 |
--|   3 | java과제2- ToDo List 제작구현                                                                             | 2024-04-26 14:48:49 |
--|   4 | 오늘은 즐거운 금요일 맛있는 저녁식사와  과제하기 TODOLIST &회원가입 구현하기                              | 2024-04-26 14:51:56 |
--|   5 | 닭갈비 먹는 날이다.                                                                                       | 2024-04-26 14:53:19 |
--|   6 | 내일은 행복한 토요일 날씨 좋으면 드라이브 가야지!                                                         | 2024-04-26 14:55:53 |
--+-----+-----------------------------------------------------------------------------------------------------------+---------------------+