SELECT * FROM Company.Employee;

SELECT dept, AVG(salary) AS avg_salary
FROM Company.Employee
GROUP BY dept;


ALTER TABLE Company.Employee
ADD manager_id INT;

SELECT *
FROM Company.Employee
WHERE manager_id IS NULL;


SELECT * 
FROM Company.Employee
WHERE manager_id IS NULL;


UPDATE Company.Employee SET manager_id = 201 WHERE id = 101;
UPDATE Company.Employee SET manager_id = 201 WHERE id = 102;
UPDATE Company.Employee SET manager_id = 202 WHERE id = 103;
UPDATE Company.Employee SET manager_id = 202 WHERE id = 104;
UPDATE Company.Employee SET manager_id = 203 WHERE id = 105;
UPDATE Company.Employee SET manager_id = NULL WHERE id = 106;  
UPDATE Company.Employee SET manager_id = 203 WHERE id = 107;

SELECT id, name, dept, manager_id FROM Company.Employee;
