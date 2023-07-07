DROP TABLE EMPLOYEE
CREATE TABLE EMPLOYEE
( 
        EMPNO NUMBER(4) NOT NULL,
        ENAME VARCHAR2(10),
        JOB VARCHAR2(9),
        MGR NUMBER(4),
        HIREDATE DATE,
        SAL NUMBER(7, 2),
        COMM NUMBER(7, 2),
        DEPTNO NUMBER(2)
);

INSERT INTO EMPLOYEE VALUES (7369, 'SMITH', 'CLERK',      7902, TO_DATE('17-DEC-1980', 'DD-MON-YYYY'), 800, NULL, 20);
INSERT INTO EMPLOYEE VALUES (7499, 'ALLEN',  'SALESMAN',  7698, TO_DATE('20-FEB-1981', 'DD-MON-YYYY'), 1600,  300, 30);
INSERT INTO EMPLOYEE VALUES (7521, 'WARD', 'SALESMAN',    7698, TO_DATE('22-FEB-1981', 'DD-MON-YYYY'), 1250,  500, 30);
INSERT INTO EMPLOYEE VALUES (7566, 'JONES',  'MANAGER',   7839, TO_DATE('2-APR-1981', 'DD-MON-YYYY'),  2975, NULL, 20);
INSERT INTO EMPLOYEE VALUES (7654, 'MARTIN', 'SALESMAN',  7698, TO_DATE('28-SEP-1981', 'DD-MON-YYYY'), 1250, 1400, 30);
INSERT INTO EMPLOYEE VALUES (7698, 'BLAKE',  'MANAGER',   7839, TO_DATE('1-MAY-1981', 'DD-MON-YYYY'),  2850, NULL, 30);
INSERT INTO EMPLOYEE VALUES (7782, 'CLARK',  'MANAGER',   7839, TO_DATE('9-JUN-1981', 'DD-MON-YYYY'),  2450, NULL, 10);
INSERT INTO EMPLOYEE VALUES (7788, 'SCOTT',  'ANALYST',   7566, TO_DATE('09-DEC-1982', 'DD-MON-YYYY'), 3000, NULL, 20);
INSERT INTO EMPLOYEE VALUES (7839, 'KING',   'PRESIDENT', NULL, TO_DATE('17-NOV-1981', 'DD-MON-YYYY'), 5000, NULL, 10);
INSERT INTO EMPLOYEE VALUES (7844, 'TURNER', 'SALESMAN',  7698, TO_DATE('8-SEP-1981', 'DD-MON-YYYY'),  1500,    0, 30);
INSERT INTO EMPLOYEE VALUES (7876, 'ADAMS',  'CLERK',     7788, TO_DATE('12-JAN-1983', 'DD-MON-YYYY'), 1100, NULL, 20);
INSERT INTO EMPLOYEE VALUES (7900, 'JAMES',  'CLERK',     7698, TO_DATE('3-DEC-1981', 'DD-MON-YYYY'),   950, NULL, 30);
INSERT INTO EMPLOYEE VALUES (7902, 'FORD',   'ANALYST',   7566, TO_DATE('3-DEC-1981', 'DD-MON-YYYY'),  3000, NULL, 20);
INSERT INTO EMPLOYEE VALUES (7934, 'MILLER', 'CLERK',     7782, TO_DATE('23-JAN-1982', 'DD-MON-YYYY'), 1300, NULL, 10);




DROP TABLE TEST;
CREATE TABLE TEST
(
    SNO INT,
    NAME VARCHAR2(10)
);

INSERT INTO TEST VALUES (10, 'A');
INSERT INTO TEST VALUES (10, 'A');
INSERT INTO TEST VALUES (10, 'A');
INSERT INTO TEST VALUES (20, 'B');
INSERT INTO TEST VALUES (20, 'B');
INSERT INTO TEST VALUES (30, 'C');
INSERT INTO TEST VALUES (30, 'C');
INSERT INTO TEST VALUES (30, 'C');
INSERT INTO TEST VALUES (40, 'D');
INSERT INTO TEST VALUES (40, 'D');
INSERT INTO TEST VALUES (50, 'E');
INSERT INTO TEST VALUES (50, 'E');
INSERT INTO TEST VALUES (50, 'E');

DROP TABLE Employees;
CREATE TABLE Employees
(
     ID INT PRIMARY KEY,
     Name VARCHAR2(20),
     Department VARCHAR(20),
     Salary int
);

INSERT INTO Employees Values (1001, 'Sambit', 'IT', 15000);
INSERT INTO Employees Values (1002, 'Santosh', 'IT', 35000);
INSERT INTO Employees Values (1003, 'Manoj', 'HR', 15000);
INSERT INTO Employees Values (1004, 'Rakesh', 'Payroll', 35000);
INSERT INTO Employees Values (1005, 'Hina', 'IT', 42000);
INSERT INTO Employees Values (1006, 'Bikash', 'HR', 15000);
INSERT INTO Employees Values (1007, 'Priya', 'HR', 67000);
INSERT INTO Employees Values (1008, 'Preety', 'Payroll', 67000);
INSERT INTO Employees Values (1009, 'Priyanka', 'Payroll', 55000);
INSERT INTO Employees Values (1010, 'Anurag', 'Payroll', 15000);
INSERT INTO Employees Values (1011, 'Rishav', 'HR', 55000);

DROP TABLE Employees2; 
CREATE TABLE Employee2
(
     ID INT PRIMARY KEY,
     Code VARCHAR(20),
     Name VARCHAR(20),
     Department VARCHAR2(10),
     Salary int
);

INSERT INTO Employee2 Values (1, 'EMP1001', 'Rakesh', 'IT', 15000);
INSERT INTO Employee2 Values (2, 'EMP1001', 'Rakesh', 'IT', 15000);
INSERT INTO Employee2 Values (3, 'EMP1002', 'Priya', 'HR', 25000);
INSERT INTO Employee2 Values (4, 'EMP1002', 'Priya', 'HR', 25000);
INSERT INTO Employee2 Values (5, 'EMP1002', 'Priya', 'HR', 25000);
INSERT INTO Employee2 Values (6, 'EMP1003', 'Anurag', 'HR', 35000);
INSERT INTO Employee2 Values (7, 'EMP1003', 'Anurag', 'HR', 35000);
INSERT INTO Employee2 Values (8, 'EMP1003', 'Anurag', 'HR', 35000);
INSERT INTO Employee2 Values (9, 'EMP1003', 'Anurag', 'HR', 35000);

DROP TABLE Employees3; 
CREATE TABLE Employees3
(
    Id INT PRIMARY KEY,
    Name VARCHAR2(20), 
    Department VARCHAR2(10),
    Salary INT
);

Insert Into Employees3 Values (1, 'James', 'IT', 80000);
Insert Into Employees3 Values (2, 'Taylor', 'IT', 80000);
Insert Into Employees3 Values (3, 'Pamela', 'HR', 50000);
Insert Into Employees3 Values (4, 'Sara', 'HR', 40000);
Insert Into Employees3 Values (5, 'David', 'IT', 35000);
Insert Into Employees3 Values (6, 'Smith', 'HR', 65000);
Insert Into Employees3 Values (7, 'Ben', 'HR', 65000);
Insert Into Employees3 Values (8, 'Stokes', 'IT', 45000);
Insert Into Employees3 Values (9, 'David', 'IT', 35000);
Insert Into Employees3 Values (10, 'Smith', 'HR', 65000);
Insert Into Employees3 Values (11, 'John', 'IT', 68000);






DROP TABLE PermanentEmployee; 
CREATE TABLE PermanentEmployee
(
  EmployeeId INT,
  Name VARCHAR(20),
  Gender VARCHAR(10),
  Department varchar(10),
  Age INT
);

INSERT INTO PermanentEmployee VALUES (1,'Pranaya','Male','IT',20);
INSERT INTO PermanentEmployee VALUES (2,'Priyanka','Female','IT',22);
INSERT INTO PermanentEmployee VALUES (3,'Sudhanshu','Male','HR',25);
INSERT INTO PermanentEmployee VALUES (4,'Subrat','Male','Sales',60);
INSERT INTO PermanentEmployee VALUES (5,'Tarun','Male','Sales',54);
INSERT INTO PermanentEmployee VALUES (6,'Lipika','Female','HR',27);
INSERT INTO PermanentEmployee VALUES (7,'Smita','Female','IT',40);
INSERT INTO PermanentEmployee VALUES (8,'Smith','Male','HR',29);

DROP TABLE ContractEmployee; 
CREATE TABLE ContractEmployee
(
  EmployeeId INT,
  Name VARCHAR(20),
  Gender VARCHAR(10),
  Department varchar(10),
  Age INT
);

INSERT INTO ContractEmployee VALUES (9,'Anurag','Male','IT',33);
INSERT INTO ContractEmployee VALUES (11,'Sambit','Male','HR',29);
INSERT INTO ContractEmployee VALUES (12,'James','Male','Sales',37);
INSERT INTO ContractEmployee VALUES (13,'Pam','Female','Sales',25);



DROP TABLE Emp;
CREATE TABLE Emp (
  Id INT PRIMARY KEY,
  Name VARCHAR2(10),
  Department VARCHAR2(10),
  Salary INT,
  Gender VARCHAR2(10),
  Age INT,
  City VARCHAR(10)
);

INSERT INTO Emp (Id, Name, Department, Salary, Gender, Age, City) VALUES (1001, 'John', 'IT', 35000, 'Male', 25, 'London');
INSERT INTO Emp (Id, Name, Department, Salary, Gender, Age, City) VALUES (1002, 'Mary', 'HR', 45000, 'Female', 27, 'London');
INSERT INTO Emp (Id, Name, Department, Salary, Gender, Age, City) VALUES (1003, 'James', 'Finance', 50000, 'Male', 28, 'London');
INSERT INTO Emp (Id, Name, Department, Salary, Gender, Age, City) VALUES (1004, 'Mike', 'Finance', 50000, 'Male', 28, 'London');
INSERT INTO Emp (Id, Name, Department, Salary, Gender, Age, City) VALUES (1005, 'Linda', 'HR', 75000, 'Female', 26, 'London');
INSERT INTO Emp (Id, Name, Department, Salary, Gender, Age, City) VALUES (1006, 'Anurag', 'IT', 35000, 'Male', 25, 'Mumbai');
INSERT INTO Emp (Id, Name, Department, Salary, Gender, Age, City) VALUES (1007, 'Priyanka', 'HR', 45000, 'Female', 27, 'Mumbai');
INSERT INTO Emp (Id, Name, Department, Salary, Gender, Age, City) VALUES (1008, 'Sambit', 'IT', 50000, 'Male', 28, 'Mumbai');
INSERT INTO Emp (Id, Name, Department, Salary, Gender, Age, City) VALUES (1009, 'Pranaya', 'IT', 50000, 'Male', 28, 'Mumbai');
INSERT INTO Emp (Id, Name, Department, Salary, Gender, Age, City) VALUES (1010, 'Hina', 'HR', 75000, 'Female', 26, 'Mumbai');


DROP TABLE Proj;
CREATE TABLE Proj (
     ProjectId INT PRIMARY KEY,
     Title VARCHAR2(10),
     ClientId INT,
     EmployeeId INT
);

INSERT INTO Proj (ProjectId, Title, ClientId, EmployeeId) VALUES (1, 'Project-1', 1, 1003);
INSERT INTO Proj (ProjectId, Title, ClientId, EmployeeId) VALUES (2, 'Project-2', 1, 1002);
INSERT INTO Proj (ProjectId, Title, ClientId, EmployeeId) VALUES (3, 'Project-3', 2, 1007);
INSERT INTO Proj (ProjectId, Title, ClientId, EmployeeId) VALUES (4, 'Project-4', 3, 1009);
INSERT INTO Proj (ProjectId, Title, ClientId, EmployeeId) VALUES (5, 'Project-5', 4, 1010);
INSERT INTO Proj (ProjectId, Title, ClientId, EmployeeId) VALUES (6, 'Project-6', 2, NULL);
INSERT INTO Proj (ProjectId, Title, ClientId, EmployeeId) VALUES (7, 'Project-7', 2, NULL);
INSERT INTO Proj (ProjectId, Title, ClientId, EmployeeId) VALUES (8, 'Project-8', 4, 1004);