CREATE DATABASE Company;
USE Company;

CREATE TABLE Employee(
id INT PRIMARY KEY,
name VARCHAR(50),
salary INT,
dept VARCHAR(25)
);

INSERT INTO Employee (id ,name,salary,dept)
VALUES
(101,'Aditya', 10000, 'Finance'),
(102,'Diksha', 30000, 'IT'),
(103,'Jadhav', 39000, 'Account'),
(104,'Aduu', 90000, 'Finance'),
(105,'Diksha' , 43000, 'IT'),
(106,'Redmi' , 93000, 'Finance'),
(107,'One plus' , 33000, 'Account');

SELECT * FROM Employee;
SELECT * FROM Employee WHERE dept = "IT";