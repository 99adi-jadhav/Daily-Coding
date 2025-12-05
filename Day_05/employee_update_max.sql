SELECT * FROM Company.Employee;

ALTER TABLE Employee
ADD COLUMN year INT;

UPDATE Employee SET year = 2019 WHERE id = 101;
UPDATE Employee SET year = 2021 WHERE id = 102;
UPDATE Employee SET year = 2020 WHERE id = 103;
UPDATE Employee SET year = 2022 WHERE id = 104;
UPDATE Employee SET year = 2023 WHERE id = 105;
UPDATE Employee SET year = 2021 WHERE id = 106;
UPDATE Employee SET year = 2018 WHERE id = 107;


SELECT *
FROM Employee
WHERE year > 2020;


SELECT *
FROM Employee
WHERE salary BETWEEN 30000 AND 60000;

SELECT MAX(salary) AS Highest_Salary
FROM Employee;

