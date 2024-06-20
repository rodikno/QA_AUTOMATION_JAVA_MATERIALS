-- The INNER JOIN returns rows when there is a match in both tables.
-- Retrieve all cats with their owners' details
SELECT Cats.Name AS CatName, Cats.Breed, Owners.Name AS OwnerName, Owners.Phone
FROM Cats
INNER JOIN Owners ON Cats.OwnerID = Owners.OwnerID;

-- The LEFT JOIN (LEFT OUTER JOIN) returns all rows from the left table and the matched rows from the right table. 
-- If no match is found, NULLs are returned for columns from the right table.
-- Retrieve all cats with their owners' details, including cats without owners
SELECT Cats.Name AS CatName, Cats.Breed, Owners.Name AS OwnerName, Owners.Phone
FROM Cats
LEFT JOIN Owners ON Cats.OwnerID = Owners.OwnerID;


---RIGHT JOIN (RIGHT OUTER JOIN)
-- The RIGHT JOIN returns all rows from the right table and the matched rows from the left table. 
-- If no match is found, NULLs are returned for columns from the left table.
-- Retrieve all owners and their cats, including owners without cats
SELECT Owners.Name AS OwnerName, Owners.Phone, Cats.Name AS CatName, Cats.Breed
FROM Owners
RIGHT JOIN Cats ON Owners.OwnerID = Cats.OwnerID;

-- The FULL JOIN returns all rows when there is a match in one of the tables. 
--  If no match is found, NULLs are returned for columns from the table without a match. 
-- Note that MySQL does not support FULL JOIN directly, so you can use a combination of LEFT JOIN and RIGHT JOIN with UNION.
-- Retrieve all cats with their owners, and all owners with their cats, including unmatched rows
SELECT Cats.Name AS CatName, Cats.Breed, Owners.Name AS OwnerName, Owners.Phone
FROM Cats
LEFT JOIN Owners ON Cats.OwnerID = Owners.OwnerID
UNION
SELECT Cats.Name AS CatName, Cats.Breed, Owners.Name AS OwnerName, Owners.Phone
FROM Owners
RIGHT JOIN Cats ON Owners.OwnerID = Cats.OwnerID;

-- The CROSS JOIN returns the Cartesian product of the two tables, i.e., all possible combinations of rows.
-- Retrieve all possible combinations of cats and owners
SELECT Cats.Name AS CatName, Owners.Name AS OwnerName
FROM Cats
CROSS JOIN Owners;

-- A Self JOIN is a regular join but the table is joined with itself.
-- Example: Find pairs of cats owned by the same owner
SELECT c1.Name AS Cat1, c2.Name AS Cat2, c1.OwnerID
FROM Cats c1
INNER JOIN Cats c2 ON c1.OwnerID = c2.OwnerID AND c1.CatID <> c2.CatID;


SELECT v1.`VisitDate`, v1.`Reason`, mr1.`Diagnosis`, mr1.`Treatment`, c1.`Name` as CatName, c1.`Breed` as CatBreed, 
ow1.`Name` as OwnersName, ow1.`Phone` as OwnersPhone
FROM Visits v1
JOIN `MedicalRecords` mr1 ON mr1.`VisitID` = v1.`VisitID`
JOIN Cats c1 ON c1.`CatID` = v1.`CatID`
JOIN `Owners` ow1 ON c1.`OwnerID` = ow1.`OwnerID`
WHERE v1.`VisitDate` > '2024-03-01';