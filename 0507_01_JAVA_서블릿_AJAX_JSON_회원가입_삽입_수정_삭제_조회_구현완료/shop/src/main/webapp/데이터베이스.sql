USE shop;
CREATE TABLE signup(
	    userId VARCHAR(16) NOT NULL,
		userPw VARCHAR(16) NOT NULL,
		userName VARCHAR(30) NOT NULL,
		userEmail VARCHAR(250) NULL,
		userHp VARCHAR(13) NOT NULL,
		PRIMARY KEY(userId)
)ENGINE=MYISAM CHARSET=UTF8MB4;
DESC signup;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| userId    | varchar(16)  | NO   | PRI | NULL    |       |
| userPw    | varchar(16)  | NO   |     | NULL    |       |
| userName  | varchar(30)  | NO   |     | NULL    |       |
| userEmail | varchar(250) | YES  |     | NULL    |       |
| userHp    | varchar(13)  | NO   |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+