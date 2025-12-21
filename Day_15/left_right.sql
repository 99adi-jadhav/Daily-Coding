Use Company;

CREATE TABLE Dept (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);


INSERT INTO Dept (dept_id, dept_name) VALUES
(1, 'Finance'),
(2, 'IT'),
(3, 'Account');


ALTER TABLE Employee
ADD dept_id INT;


UPDATE Employee SET dept_id = 1 WHERE dept = 'Finance';
UPDATE Employee SET dept_id = 2 WHERE dept = 'IT';
UPDATE Employee SET dept_id = 3 WHERE dept = 'Account';


CREATE TABLE Salary (
    salary_id INT PRIMARY KEY AUTO_INCREMENT,
    emp_id INT,
    salary INT,
    FOREIGN KEY (emp_id) REFERENCES Employee(id)
);


INSERT INTO Salary (emp_id, salary) VALUES
(101, 10000),
(102, 30000),
(103, 90000),
(104, 100000),
(105, 30000),
(106, 50000),
(107, 30000),
(201, 10000),
(202, 40000);


SELECT e.name, d.dept_name
FROM Employee e
INNER JOIN Dept d
ON e.dept_id = d.dept_id;


SELECT e.name, s.salary
FROM Employee e
LEFT JOIN Salary s
ON e.id = s.emp_id;


SELECT SUM(s.salary) AS total_salary
FROM Salary s;


SELECT name
FROM Employee
WHERE name NOT LIKE 'Manager%';
