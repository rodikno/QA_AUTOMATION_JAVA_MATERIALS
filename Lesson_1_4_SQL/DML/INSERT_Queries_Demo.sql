# DATA CREATION
INSERT INTO Owners (Name, Phone, Email) VALUES
('Alice Johnson', '555-1234', 'alice@example.com'),
('Bob Smith', '555-5678', 'bob@example.com'),
('Charlie Brown', '555-8765', 'charlie@example.com');


INSERT INTO Cats (Name, Breed, Age, OwnerID) VALUES
('Whiskers', 'Siamese', 2, 1),
('Shadow', 'Maine Coon', 5, 2),
('Mittens', 'Tabby', 3, 3),
('Luna', 'Bengal', 1, 1);


INSERT INTO Visits (CatID, VisitDate, Reason) VALUES
(1, '2024-01-10', 'Regular Checkup'),
(2, '2024-02-15', 'Vaccination'),
(3, '2024-03-20', 'Dental Cleaning'),
(1, '2024-04-10', 'Skin Rash'),
(4, '2024-05-05', 'Spaying');


INSERT INTO MedicalRecords (VisitID, Diagnosis, Treatment) VALUES
(1, 'Healthy', 'None'),
(2, 'Healthy', 'Vaccination administered'),
(3, 'Dental Plaque', 'Teeth Cleaning'),
(4, 'Allergic Dermatitis', 'Antihistamines'),
(5, 'Healthy', 'Spaying performed');
