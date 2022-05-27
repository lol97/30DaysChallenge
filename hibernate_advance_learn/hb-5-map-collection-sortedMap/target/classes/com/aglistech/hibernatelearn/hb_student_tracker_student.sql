CREATE TABLE student (
	id int(11) NOT NULL AUTO_INCREMENT,
	first_name varchar(45) DEFAULT NULL,
	last_name varchar(45) DEFAULT NULL,
	email varchar(45) DEFAULT NULL,

	PRIMARY KEY(id)
);

CREATE TABLE image (
	student_id int(11) NOT NULL,
	file_name varchar(45) DEFAULT NULL
);