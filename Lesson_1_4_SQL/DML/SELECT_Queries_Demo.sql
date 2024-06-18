-- Select all columns from the Cats table
SELECT * FROM Cats;

-- Select specific columns from the Cats table
SELECT Name, Breed, Age FROM Cats;

-- Use aliases for column names
SELECT Name AS CatName, Breed AS CatBreed, Age AS CatAge FROM Cats;


-- Select cats of a specific breed
SELECT Name, Age FROM Cats WHERE Breed = 'Siamese';

-- Select cats older than 2 years
SELECT Name, Breed FROM Cats WHERE Age > 2;


-- Select all cats ordered by their age
SELECT Name, Breed, Age FROM Cats ORDER BY Age;

-- Select all cats ordered by their name in descending order
SELECT Name, Breed, Age FROM Cats ORDER BY Name DESC;

-- Select the first 2 cats
SELECT Name, Breed, Age FROM Cats LIMIT 2;

-- Select distinct breeds of cats
SELECT DISTINCT Breed FROM Cats;

-- Count the number of cats
SELECT COUNT(*) AS TotalCats FROM Cats;

-- Find the minimum and maximum age of cats
SELECT MIN(Age) AS YoungestAge, MAX(Age) AS OldestAge FROM Cats;

-- Select cats that are either Siamese or Bengal
SELECT Name, Breed, Age FROM Cats WHERE Breed IN ('Siamese', 'Bengal');

-- Select cats that are Siamese and older than 1 year
SELECT Name, Breed, Age FROM Cats WHERE Breed = 'Siamese' AND Age > 1;

-- Select cats that are either Siamese or younger than 3 years
SELECT Name, Breed, Age FROM Cats WHERE Breed = 'Siamese' OR Age < 3;
