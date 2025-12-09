USE Company;


SELECT UPPER(name) AS upper_name
FROM Company.Employee;


SELECT name, LENGTH(name) AS name_length
FROM Company.Employee;


SELECT *
FROM Company.Employee
ORDER BY name ASC;
