DROP TABLE IF EXISTS test.attendance_log;
DROP TABLE IF EXISTS test.emp_access_map;
DROP TABLE IF EXISTS test.emp;

/* Create emp details table*/

CREATE TABLE test.emp
(emp_id VARCHAR(5) PRIMARY KEY,
emp_name VARCHAR(20) NOT NULL,
emp_address VARCHAR(30) NOT NULL);

/* Create a mapping table for card id to emp id*/
CREATE TABLE test.emp_access_map 
(card_id VARCHAR(12) PRIMARY KEY,
emp_id VARCHAR(5),
FOREIGN KEY (emp_id) REFERENCES test.emp(emp_id) ON DELETE CASCADE /* Foreign key constraint */
);

/* Create attendance log table */
CREATE TABLE test.attendance_log 
(card_id VARCHAR(12), 
time TIMESTAMP NOT NULL,
code ENUM ('N', 'X') NOT NULL, /* Can only take 'N' or 'C' */
FOREIGN KEY (card_id) REFERENCES test.emp_access_map(card_id) ON DELETE CASCADE /* Foreign key constraint */
);

/* Procedure for card id validation */
DROP PROCEDURE IF EXISTS chk_card_id;
CREATE  PROCEDURE chk_card_id(IN card_id VARCHAR(12))
BEGIN
    IF LENGTH(card_id) != 12 THEN
      SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'An error occurred, card_id should be of length 12.';  
    END IF;
END;

/* Trigger to validate the card_id length. Using constraints was an option also. */
DROP TRIGGER IF EXISTS test.ins_card_id;
CREATE TRIGGER test.ins_card_id BEFORE INSERT ON test.emp_access_map 
FOR EACH ROW 
BEGIN 
  CALL chk_card_id(NEW.card_id);
END;

/* Trigger to validate the card_id length. Using constraints was an option also. */
DROP TRIGGER IF EXISTS test.up_card_id;
CREATE TRIGGER test.up_card_id BEFORE UPDATE ON test.emp_access_map 
FOR EACH ROW 
BEGIN 
  CALL chk_card_id(NEW.card_id);
END;

