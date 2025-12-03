USE Company;

SELECT * FROM Employee
WHERE salary > 50000;

SELECT * FROM Employee
ORDER BY salary DESC;

SELECT COUNT(*) AS total_employees
FROM Employee;
