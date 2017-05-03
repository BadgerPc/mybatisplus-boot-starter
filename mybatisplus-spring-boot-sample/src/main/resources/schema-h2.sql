
DROP TABLE IF EXISTS account;

CREATE TABLE account
(
	id BIGINT(20) NOT NULL ,
	user_name VARCHAR(30) NULL DEFAULT NULL ,
	sex INT(5) NULL DEFAULT NULL ,
	create_time DATETIME NULL DEFAULT NULL,
	PRIMARY KEY (id)
);
