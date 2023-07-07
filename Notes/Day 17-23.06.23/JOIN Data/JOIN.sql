DROP TABLE Course;
CREATE TABLE Course (
  CourseId INT PRIMARY KEY,
  CourseName VARCHAR(15),
  CourseFee INT
);

INSERT INTO Course (CourseId, CourseName, CourseFee) VALUES (10, 'Oracle', 3500);
INSERT INTO Course (CourseId, CourseName, CourseFee) VALUES (20, 'MySQL', 3000);
INSERT INTO Course (CourseId, CourseName, CourseFee) VALUES (30, 'SQL Server', 4500);


DROP TABLE Student;
CREATE TABLE Student (
  StudentId INT PRIMARY KEY,
  StudentName VARCHAR(15),
  CourseId INT
);

INSERT INTO Student (StudentId, StudentName, CourseId) VALUES (1001, 'James', 10);
INSERT INTO Student (StudentId, StudentName, CourseId) VALUES (1002, 'Smith', 20);
INSERT INTO Student (StudentId, StudentName, CourseId) VALUES (1003, 'Warner', 30);
INSERT INTO Student (StudentId, StudentName, CourseId) VALUES (1004, 'Sara', 10);
INSERT INTO Student (StudentId, StudentName, CourseId) VALUES (1005, 'Pam', 20);