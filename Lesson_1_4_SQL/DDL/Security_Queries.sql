-- Create a new user
CREATE USER 'vetuser'@'localhost' IDENTIFIED BY 'password123';

-- Grant the user permissions on the VetClinic database
GRANT SELECT, INSERT, UPDATE, DELETE ON VetClinic.* TO 'vetuser'@'localhost';

-- Show current user permissions
SHOW GRANTS FOR 'vetuser'@'localhost';
