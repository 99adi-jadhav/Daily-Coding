USE Company;

CREATE VIEW HighSalaryEmployees AS
SELECT *
FROM Employee
WHERE salary > 50000;

SELECT * FROM HighSalaryEmployees;

ALTER TABLE Employee
ADD COLUMN gender VARCHAR(10);

SET SQL_SAFE_UPDATES = 0;

UPDATE Employee
SET gender = 'Male'
WHERE name IN ('Aditya', 'adii', 'Aduu', 'adi');

UPDATE Employee
SET gender = 'Female'
WHERE name IN ('Vaishnavi', 'Vaishu', 'vaish');
SET SQL_SAFE_UPDATES = 1;

SELECT 
    dept,
    SUM(CASE WHEN gender = 'Male' THEN 1 ELSE 0 END) AS male_count,
    SUM(CASE WHEN gender = 'Female' THEN 1 ELSE 0 END) AS female_count
FROM Employee
GROUP BY dept;

