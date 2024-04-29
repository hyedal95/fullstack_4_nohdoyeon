CREATE DATABASE todo_list;

USE todo_list;

CREATE TABLE todo_list_table(
	idx INT NOT NULL AUTO_INCREMENT COMMENT '인덱스번호',
    todo VARCHAR(250) NOT NULL COMMENT '할일',
    todoDate TIMESTAMP DEFAULT NOW() NOT NULL COMMENT '업데이트 날짜',
    PRIMARY KEY(idx)
) ENGINE=MYISAM CHARSET=UTF8MB4;

DESC todo_list_table;
+----------+--------------+------+-----+---------------------+----------------+
| Field    | Type         | Null | Key | Default             | Extra          |
+----------+--------------+------+-----+---------------------+----------------+
| idx      | int(11)      | NO   | PRI | NULL                | auto_increment |
| todo     | varchar(250) | NO   |     | NULL                |                |
| todoDate | timestamp    | NO   |     | current_timestamp() |                |
+----------+--------------+------+-----+---------------------+----------------+

SELECT * FROM todo_list_table;

| todo_list_table | CREATE TABLE `todo_list_table` (
  `idx` int(11) NOT NULL AUTO_INCREMENT COMMENT '인덱스번호',
  `todo` varchar(250) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '할일',
  `todoDate` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '업데이트 날짜',
  PRIMARY KEY (`idx`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci              |