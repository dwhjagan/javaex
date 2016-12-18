/* emp data */
INSERT INTO emp VALUES ('12354', 'S D', 'Bangalore');
INSERT INTO emp VALUES ('34252', 'F G', 'Hyderabad');
INSERT INTO emp VALUES ('23477', 'I N', 'Chennai');
INSERT INTO emp VALUES ('87423', 'T R', 'New Delhi');

/* emp to access card mapping data */
INSERT INTO emp_access_map VALUES ('ahhhhd123497', '12354');
INSERT INTO emp_access_map VALUES ('adfehd123497', '34252');
INSERT INTO emp_access_map VALUES ('fdrbhd123437', '23477');
INSERT INTO emp_access_map VALUES ('ah345fgo8449', '87423');

/* attendance log data */
INSERT INTO test.attendance_log VALUES ('ahhhhd123497', NOW(), 'N' );
INSERT INTO test.attendance_log VALUES ('adfehd123497', NOW(), 'N' );
INSERT INTO test.attendance_log VALUES ('fdrbhd123437', NOW(), 'N' );
INSERT INTO test.attendance_log VALUES ('ah345fgo8449', NOW(), 'N' );

INSERT INTO test.attendance_log VALUES ('ahhhhd123497', NOW(), 'X' );
INSERT INTO test.attendance_log VALUES ('adfehd123497', NOW(), 'X' );
INSERT INTO test.attendance_log VALUES ('fdrbhd123437', NOW(), 'X' );
INSERT INTO test.attendance_log VALUES ('ah345fgo8449', NOW(), 'X' );
