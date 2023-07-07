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


DROP TABLE Employees
CREATE TABLE Employees
(
    Id int,
    Name VARCHAR(20),
    Gender VARCHAR(10),
    Salary int
);

Insert into Employees values (1, 'Mark', 'Male', 52000);
Insert into Employees values (2, 'Mary', 'Female', 55000);
Insert into Employees values (3, 'Steve', 'Male', 45000);
Insert into Employees values (4, 'John', 'Male', 40000);
Insert into Employees values (5, 'Sara', 'Female', 48000);
Insert into Employees values (6, 'Pam', 'Female', 60000);
Insert into Employees values (7, 'Tom', 'Male', 58000);
Insert into Employees values (8, 'George', 'Male', 65000);
Insert into Employees values (9, 'Tina', 'Female', 67000);
Insert into Employees values (10, 'Ben', 'Male', 80000);

DROP TABLE TableA
CREATE TABLE TableA
(
  ID INT,
  Name VARCHAR(20),
  Gender VARCHAR(10),
  Department VARCHAR(10)
);

INSERT INTO TableA VALUES(1, 'Pranaya', 'Male','IT');
INSERT INTO TableA VALUES(2, 'Priyanka', 'Female','IT');
INSERT INTO TableA VALUES(3, 'Preety', 'Female','HR');


DROP TABLE TableB
CREATE TABLE TableB
(
  ID INT,
  Name VARCHAR(20),
  Gender VARCHAR(10),
  Department VARCHAR(10)
);

INSERT INTO TableB VALUES(2, 'Priyanka', 'Female','IT');
INSERT INTO TableB VALUES(3, 'Preety', 'Female','HR');