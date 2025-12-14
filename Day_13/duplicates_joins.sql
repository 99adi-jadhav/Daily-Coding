SELECT * FROM Company.Employee;

SELECT 
    e.id,
    e.name,
    e.salary,
    e.manager_id
FROM Company.Employee e
JOIN Company.Employee m
ON e.manager_id = m.id
WHERE e.salary > m.salary;



ALTER TABLE Company.Employee
ADD email VARCHAR(100);


UPDATE Company.Employee SET email = 'aditya@gmail.com' WHERE id = 101;
UPDATE Company.Employee SET email = 'vaishnavi@gmail.com' WHERE id = 102;
UPDATE Company.Employee SET email = 'abhi@gmail.com' WHERE id = 103;
UPDATE Company.Employee SET email = 'abhi@gmail.com' WHERE id = 104; 
UPDATE Company.Employee SET email = 'vaishu@gmail.com' WHERE id = 105;
UPDATE Company.Employee SET email = 'redmi@gmail.com' WHERE id = 106;
UPDATE Company.Employee SET email = 'vaishu@gmail.com' WHERE id = 107; 


SELECT email, COUNT(*) AS count
FROM Company.Employee
GROUP BY email
HAVING COUNT(email) > 1;


