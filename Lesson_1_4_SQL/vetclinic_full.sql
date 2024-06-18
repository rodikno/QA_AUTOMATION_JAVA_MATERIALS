-- Create the database
CREATE DATABASE IF NOT EXISTS VetClinic;
USE VetClinic;

-- Create the Owners table
CREATE TABLE IF NOT EXISTS Owners (
    OwnerID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100),
    Phone VARCHAR(15) UNIQUE,
    Email VARCHAR(100) NOT NULL
);

-- Create the Cats table
CREATE TABLE IF NOT EXISTS Cats (
    CatID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100),
    Breed VARCHAR(50),
    Age INT CHECK (Age >= 0),
    OwnerID INT,
    FOREIGN KEY (OwnerID) REFERENCES Owners(OwnerID)
);

-- Create the Visits table
CREATE TABLE IF NOT EXISTS Visits (
    VisitID INT AUTO_INCREMENT PRIMARY KEY,
    CatID INT,
    VisitDate DATE,
    Reason VARCHAR(255),
    FOREIGN KEY (CatID) REFERENCES Cats(CatID)
);

-- Create the MedicalRecords table
CREATE TABLE IF NOT EXISTS MedicalRecords (
    RecordID INT AUTO_INCREMENT PRIMARY KEY,
    VisitID INT,
    Diagnosis VARCHAR(255),
    Treatment VARCHAR(255),
    FOREIGN KEY (VisitID) REFERENCES Visits(VisitID)
);

-- Insert data into Owners table
INSERT INTO Owners (Name, Phone, Email) VALUES
('Alice Johnson', '555-1234', 'alice@example.com'),
('Bob Smith', '555-5678', 'bob@example.com'),
('Charlie Brown', '555-8765', 'charlie@example.com'),
('Diana Prince', NULL, 'diana@example.com'); -- Phone is NULL

-- Insert data into Cats table
INSERT INTO Cats (Name, Breed, Age, OwnerID) VALUES
('Whiskers', 'Siamese', 2, 1),
('Shadow', 'Maine Coon', 5, 2),
('Mittens', 'Tabby', 3, 3),
('Luna', 'Bengal', 1, 1),
('Tiger', 'Persian', 4, NULL); -- OwnerID is NULL (no owner)

-- Insert data into Visits table
INSERT INTO Visits (CatID, VisitDate, Reason) VALUES
(1, '2024-01-10', 'Regular Checkup'),
(2, '2024-02-15', 'Vaccination'),
(3, '2024-03-20', 'Dental Cleaning'),
(1, '2024-04-10', 'Skin Rash'),
(4, '2024-05-05', 'Spaying'),
(5, NULL, 'Pending Visit'); -- VisitDate is NULL

-- Insert data into MedicalRecords table
INSERT INTO MedicalRecords (VisitID, Diagnosis, Treatment) VALUES
(1, 'Healthy', 'None'),
(2, 'Healthy', 'Vaccination administered'),
(3, 'Dental Plaque', 'Teeth Cleaning'),
(4, 'Allergic Dermatitis', 'Antihistamines'),
(5, 'Healthy', 'Spaying performed'),
(6, 'Unknown', 'None'); -- Corresponds to a visit with NULL VisitDate