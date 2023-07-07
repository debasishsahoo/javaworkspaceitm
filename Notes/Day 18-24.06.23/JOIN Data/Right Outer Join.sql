set linesize 500;
DROP TABLE Employee;
CREATE TABLE Employee (
  EmployeeId INT PRIMARY KEY,
  FullName VARCHAR(20),
  Department VARCHAR(10),
  Salary INT,
  Gender VARCHAR(10),
  Age INT
);

INSERT INTO Employee (EmployeeId, FullName, Department, Salary, Gender, Age) VALUES (1001, 'John Doe', 'IT', 35000, 'Male', 25);
INSERT INTO Employee (EmployeeId, FullName, Department, Salary, Gender, Age) VALUES (1002, 'Mary Smith', 'HR', 45000, 'Female', 27);
INSERT INTO Employee (EmployeeId, FullName, Department, Salary, Gender, Age) VALUES (1003, 'James Brown', 'Finance', 50000, 'Male', 28);
INSERT INTO Employee (EmployeeId, FullName, Department, Salary, Gender, Age) VALUES (1004, 'Mike Walker', 'Finance', 50000, 'Male', 28);
INSERT INTO Employee (EmployeeId, FullName, Department, Salary, Gender, Age) VALUES (1005, 'Linda Jones', 'HR', 75000, 'Female', 26);
INSERT INTO Employee (EmployeeId, FullName, Department, Salary, Gender, Age) VALUES (1006, 'Anurag Mohanty', 'IT', 35000, 'Male', 25);
INSERT INTO Employee (EmployeeId, FullName, Department, Salary, Gender, Age) VALUES (1007, 'Priyanka Dewangan', 'HR', 45000, 'Female', 27);
INSERT INTO Employee (EmployeeId, FullName, Department, Salary, Gender, Age) VALUES (1008, 'Sambit Mohanty', 'IT', 50000, 'Male', 28);
INSERT INTO Employee (EmployeeId, FullName, Department, Salary, Gender, Age) VALUES (1009, 'Pranaya Kumar', 'IT', 50000, 'Male', 28);
INSERT INTO Employee (EmployeeId, FullName, Department, Salary, Gender, Age) VALUES (1010, 'Hina Sharma', 'HR', 75000, 'Female', 26);

DROP TABLE Projects;
CREATE TABLE Projects (
    ProjectId INT PRIMARY KEY,
    ProjectName VARCHAR(50),
    EmployeeId INT
);

INSERT INTO Projects (ProjectId, ProjectName, EmployeeId) VALUES (1, 'Develop Ecommerse Website from Scratch', 1003);
INSERT INTO Projects (ProjectId, ProjectName, EmployeeId) VALUES (2, 'WordPress Website for our company', 1002);
INSERT INTO Projects (ProjectId, ProjectName, EmployeeId) VALUES (3, 'Manage our Company Servers', 1007);
INSERT INTO Projects (ProjectId, ProjectName, EmployeeId) VALUES (4, 'Hosting account is not working', 1009);
INSERT INTO Projects (ProjectId, ProjectName, EmployeeId) VALUES (5, 'MySQL database from my desktop application', 1010);
INSERT INTO Projects (ProjectId, ProjectName, EmployeeId) VALUES (6, 'Develop WordPress plugin for my business website', NULL);
INSERT INTO Projects (ProjectId, ProjectName, EmployeeId) VALUES (7, 'Migrate web application and database to new server', NULL);
INSERT INTO Projects (ProjectId, ProjectName, EmployeeId) VALUES (8, 'Android Application development', 1004);
INSERT INTO Projects (ProjectId, ProjectName, EmployeeId) VALUES (9, 'Hosting account is not working', 1001);
INSERT INTO Projects (ProjectId, ProjectName, EmployeeId) VALUES (10, 'MySQL database from my desktop application', 1008);
INSERT INTO Projects (ProjectId, ProjectName, EmployeeId) VALUES (11, 'Develop WordPress plugin for my business website', NULL);

DROP TABLE Address;
CREATE TABLE Address
(
    AddressId INT PRIMARY KEY,
    EmployeeId INT,
    Country VARCHAR(10),
    State VARCHAR(20),
    City VARCHAR(10)
);

INSERT INTO Address (AddressId, EmployeeId, Country, State, City) Values (1, 1001, 'India', 'Odisha', 'BBSR');
INSERT INTO Address (AddressId, EmployeeId, Country, State, City) Values (2, 1002, 'India', 'Maharashtra', 'Mumbai');
INSERT INTO Address (AddressId, EmployeeId, Country, State, City) Values (3, 1003, 'India', 'Maharashtra', 'Pune');
INSERT INTO Address (AddressId, EmployeeId, Country, State, City) Values (4, 1004, 'India', 'Odisha', 'Cuttack');
INSERT INTO Address (AddressId, EmployeeId, Country, State, City) Values (5, 1005, 'India', 'Maharashtra', 'Nagpur');
INSERT INTO Address (AddressId, EmployeeId, Country, State, City) Values (6, 1006, 'India', 'Odisha', 'Cuttack');