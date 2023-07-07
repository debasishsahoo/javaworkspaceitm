SET linesize 300;
DROP Table EmployeeUK;
DROP Table EmployeeUSA;

CREATE TABLE EmployeeUK
(
  EmployeeId INT,
  FirstName VARCHAR(20),
  LastName VARCHAR(20),
  Gender VARCHAR(10),
  Department VARCHAR(20)
);

INSERT INTO EmployeeUK VALUES(1, 'Pranaya', 'Rout', 'Male','IT');
INSERT INTO EmployeeUK VALUES(2, 'Priyanka', 'Dewangan', 'Female','IT');
INSERT INTO EmployeeUK VALUES(3, 'Preety', 'Tiwary', 'Female','HR');
INSERT INTO EmployeeUK VALUES(4, 'Subrat', 'Sahoo', 'Male','HR');
INSERT INTO EmployeeUK VALUES(5, 'Anurag', 'Mohanty', 'Male','IT');
INSERT INTO EmployeeUK VALUES(6, 'Rajesh', 'Pradhan', 'Male','HR');
INSERT INTO EmployeeUK VALUES(7, 'Hina', 'Sharma', 'Female','IT');

CREATE TABLE EmployeeUSA
(
  EmployeeId INT,
  FirstName VARCHAR(20),
  LastName VARCHAR(20),
  Gender VARCHAR(10),
  Department VARCHAR(20)
);

INSERT INTO EmployeeUSA VALUES(1, 'James', 'Pattrick', 'Male','IT');
INSERT INTO EmployeeUSA VALUES(2, 'Priyanka', 'Dewangan', 'Female','IT');
INSERT INTO EmployeeUSA VALUES(3, 'Sara', 'Taylor', 'Female','HR');
INSERT INTO EmployeeUSA VALUES(4, 'Subrat', 'Sahoo', 'Male','HR');
INSERT INTO EmployeeUSA VALUES(5, 'Sushanta', 'Jena', 'Male','HR');
INSERT INTO EmployeeUSA VALUES(6, 'Mahesh', 'Sindhey', 'Female','HR');
INSERT INTO EmployeeUSA VALUES(7, 'Hina', 'Sharma', 'Female','IT');