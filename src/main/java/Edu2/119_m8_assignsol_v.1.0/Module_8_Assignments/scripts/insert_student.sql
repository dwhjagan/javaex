DELIMITER $$
CREATE PROCEDURE `test`.`insert_student`(IN id INT, IN name VARCHAR(20))
BEGIN
	INSERT INTO `test`.`student`(`id`,`name`) VALUES(id, name);
END $$
DELIMITER ;