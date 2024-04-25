-- DB 이름 : kurly
-- TABLE 이름 : signup

CREATE TABLE signup(
  userId VARCHAR(16) NOT NULL COMMENT '아이디',
  userName VARCHAR(30) NOT NULL COMMENT '이름',
  userHp VARCHAR(13) NOT NULL COMMENT '휴대폰',
  PRIMARY KEY(userId)
) ENGINE=MYISAM CHARSET=UTF8MB4;

DESC signup;

--MariaDB [kurly]> DESC signup;
--+----------+-------------+------+-----+---------+-------+
--| Field    | Type        | Null | Key | Default | Extra |
--+----------+-------------+------+-----+---------+-------+
--| userId   | varchar(16) | NO   | PRI | NULL    |       |
--| userName | varchar(30) | NO   |     | NULL    |       |
--| userHp   | varchar(13) | NO   |     | NULL    |       |
--+----------+-------------+------+-----+---------+-------+
--3 rows in set (0.012 sec)
