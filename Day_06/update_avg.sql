Use Company;

SELECT * FROM Company.Employee;

SELECT AVG(salary) AS Average_Salary FROM Company.Employee;


SELECT dept FROM Company.Employee;

UPDATE Company.Employee 
SET name = 'Abhi' 
WHERE id = 103;

