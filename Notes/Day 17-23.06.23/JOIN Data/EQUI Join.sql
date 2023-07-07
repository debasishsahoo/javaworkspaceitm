DROP Table Department;
CREATE TABLE Department (
  DepartmentId INT,
  DepartmentName VARCHAR(15)
);

INSERT INTO Department (DepartmentId, DepartmentName) VALUES (10, 'IT');
INSERT INTO Department (DepartmentId, DepartmentName) VALUES (20, 'HR');
INSERT INTO Department (DepartmentId, DepartmentName) VALUES (30, 'Finance');

DROP Table Employee;
CREATE TABLE Employee (
  Id INT PRIMARY KEY,
  Name VARCHAR(15),
  DepartmentId INT,
  Salary NUMBER(8, 2),
  Gender VARCHAR(10),
  Age INT,
  City VARCHAR(10)
);

INSERT INTO Employee (Id, Name, DepartmentId, Salary, Gender, Age, City) VALUES (1001, 'John', 10, 35000, 'Male', 25, 'London');
INSERT INTO Employee (Id, Name, DepartmentId, Salary, Gender, Age, City) VALUES (1002, 'Smith', 20, 45000, 'Female', 27, 'Mumbai');
INSERT INTO Employee (Id, Name, DepartmentId, Salary, Gender, Age, City) VALUES (1003, 'James', 30, 50000, 'Male', 28, 'Delhi');
INSERT INTO Employee (Id, Name, DepartmentId, Salary, Gender, Age, City) VALUES (1004, 'Mike', 30, 50000, 'Male', 28, 'London');
INSERT INTO Employee (Id, Name, DepartmentId, Salary, Gender, Age, City) VALUES (1005, 'Linda', 20, 75000, 'Female', 26, 'Mumbai');
INSERT INTO Employee (Id, Name, DepartmentId, Salary, Gender, Age, City) VALUES (1006, 'Anurag', 10, 35000, 'Male', 25, 'London');
INSERT INTO Employee (Id, Name, DepartmentId, Salary, Gender, Age, City) VALUES (1007, 'Priyanla', 20, 45000, 'Female', 27, 'Mumbai');
INSERT INTO Employee (Id, Name, DepartmentId, Salary, Gender, Age, City) VALUES (1008, 'Sambit', 10, 50000, 'Male', 28, 'London');
INSERT INTO Employee (Id, Name, DepartmentId, Salary, Gender, Age, City) VALUES (1009, 'Pranaya', 10, 50000, 'Male', 28, 'London');
INSERT INTO Employee (Id, Name, DepartmentId, Salary, Gender, Age, City) VALUES (1010, 'Hina', 20, 75000, 'Female', 26, 'Mumbai');