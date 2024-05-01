SHOW DATABASES;
  
SHOW TABLES;
  
MariaDB [todo]> show tables;
+-----------------+
| Tables_in_todo  |
+-----------------+
| todo_list_table |
+-----------------+
1 row in set (0.000 sec)

CREATE DATABASE mytodo;

USE mytodo;
// 0 기본값 1이면 완료값
CREATE TABLE todo_table(
	idx INT NOT NULL AUTO_INCREMENT,
    todo VARCHAR(250) NOT NULL,
    done TINYINT(1) NOT NULL DEFAULT 0,
    todoDate TIMESTAMP NOT NULL DEFAULT NOW(),
    PRIMARY KEY(idx)
)ENGINE=MYISAM CHARSET=UTF8MB4;

DESC todo_table;

+----------+--------------+------+-----+---------------------+----------------+
| Field    | Type         | Null | Key | Default             | Extra          |
+----------+--------------+------+-----+---------------------+----------------+
| idx      | int(11)      | NO   | PRI | NULL                | auto_increment |
| todo     | varchar(250) | NO   |     | NULL                |                |
| done     | tinyint(1)   | NO   |     | 0                   |                |
| todoDate | timestamp    | NO   |     | current_timestamp() |                |
+----------+--------------+------+-----+---------------------+----------------+


SELECT * FROM todo_table;

+-----+--------------------------------------------+------+---------------------+
| idx | todo                                       | done | todoDate            |
+-----+--------------------------------------------+------+---------------------+
|   1 | 오늘의 할일 저장                           |    0 | 2024-04-30 17:55:05 |
|   2 | 오늘 또 새로운 할일입니다.                 |    0 | 2024-04-30 17:56:29 |
|   3 | 오늘은 4월30일입니다.                      |    0 | 2024-04-30 17:56:37 |
|   4 | 현재 시간이 표시되고                       |    0 | 2024-04-30 17:56:44 |
|   5 | done 에 있는 0은 기본값입니다!^^           |    0 | 2024-04-30 17:56:55 |
+-----+--------------------------------------------+------+---------------------+
done=> 1 수정하면 완료된 할일
todoDate => 업데이트된 날짜 
조건은 선택한 부분만 
UPDATE todo_table SET done="1", todoDate = now() WHERE idx=2;

SELECT * FROM todo_table ORDER BY todoDate DESC;