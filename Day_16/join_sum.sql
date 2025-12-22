Use Company;

SELECT SUM(s.salary) AS total_salary
FROM Salary s;


SELECT name
FROM Employee
WHERE name NOT LIKE 'Manager%';
