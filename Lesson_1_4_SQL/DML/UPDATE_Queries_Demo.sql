-- Update the age of a specific cat
UPDATE Cats
SET Age = 3
WHERE CatID = 1;

-- Update the age and breed of a specific cat
UPDATE Cats
SET Age = 4, Breed = 'Persian'
WHERE CatID = 2;

-- Update the age of all Siamese cats (UPDATE based on the condition)
UPDATE Cats
SET Age = Age + 1
WHERE Breed = 'Siamese';

-- Update the phone number for all owners with a specific email domain
UPDATE Owners
SET Phone = '555-0000'
WHERE Email LIKE '%example.com';

-- Update the reason for visits that happened before a specific date
UPDATE Visits
SET Reason = 'Follow-up Required'
WHERE VisitDate < '2024-03-01';
