
# Retrieve all cats with their owners
SELECT Cats.Name AS CatName, Cats.Breed, Owners.Name AS OwnerName, Owners.Phone
FROM Cats
JOIN Owners ON Cats.OwnerID = Owners.OwnerID;

# Retrieve all visits for a specific cat
SELECT Cats.Name AS CatName, Visits.VisitDate, Visits.Reason
FROM Visits
JOIN Cats ON Visits.CatID = Cats.CatID
WHERE Cats.Name = 'Whiskers';

# Retrieve medical records for a specific visit
SELECT Cats.Name AS CatName, Visits.VisitDate, MedicalRecords.Diagnosis, MedicalRecords.Treatment
FROM MedicalRecords
JOIN Visits ON MedicalRecords.VisitID = Visits.VisitID
JOIN Cats ON Visits.CatID = Cats.CatID
WHERE Visits.VisitID = 4;

#Retrieve all medical records for a specific cat
SELECT Cats.Name AS CatName, Visits.VisitDate, MedicalRecords.Diagnosis, MedicalRecords.Treatment
FROM MedicalRecords
JOIN Visits ON MedicalRecords.VisitID = Visits.VisitID
JOIN Cats ON Visits.CatID = Cats.CatID
WHERE Cats.Name = 'Whiskers';
