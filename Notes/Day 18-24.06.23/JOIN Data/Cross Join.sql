CREATE TABLE Company
(
    CompanyId INT,
    CompanyName VARCHAR(20)
);

INSERT INTO Company VALUES(1, 'DELL');
INSERT INTO Company VALUES(2, 'HP');
INSERT INTO Company VALUES(3, 'IBM');
INSERT INTO Company VALUES(4, 'Microsoft');

CREATE TABLE Candidate
(
    CandidateId INT,
    FullName VARCHAR(20),
    CompanyId INT
);

INSERT INTO Candidate VALUES(1, 'Ron',1);
INSERT INTO Candidate VALUES(2, 'Pete',2);
INSERT INTO Candidate VALUES(3, 'Steve',3);
INSERT INTO Candidate VALUES(4, 'Smith',NULL);
INSERT INTO Candidate VALUES(5, 'Ravi',1);
INSERT INTO Candidate VALUES(6, 'Raj',3);
INSERT INTO Candidate VALUES(7, 'Kiran',NULL);