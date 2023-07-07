

DROP TABLE Company
CREATE TABLE Company
(
    CompanyId INT,
    CompanyName VARCHAR(20)
);

INSERT INTO Company VALUES(1, 'DELL');
INSERT INTO Company VALUES(2, 'HP');
INSERT INTO Company VALUES(3, 'IBM');
INSERT INTO Company VALUES(4, 'Microsoft');


DROP TABLE Candidate
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



CREATE TABLE Address
(
    AddressId INT,
    CandidateId INT,
    Country VARCHAR(10),
    State VARCHAR(20),
    City VARCHAR(10)
);

INSERT INTO Address Values (1, 1, 'India', 'Odisha', 'BBSR');
INSERT INTO Address Values (2, 2, 'India', 'Maharashtra', 'Mumbai');
INSERT INTO Address Values (3, 3, 'India', 'Maharashtra', 'Pune');
INSERT INTO Address Values (4, 4, 'India', 'Odisha', 'Cuttack');