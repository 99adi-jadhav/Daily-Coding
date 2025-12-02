CREATE DATABASE College;

Use College;

CREATE TABLE Student(
id INT PRIMARY KEY,
name VARCHAR(50) NOT NULL,
email VARCHAR(50),
total_marks INT,
special_subject	VARCHAR(50),
contact_number VARCHAR(15)
);

INSERT INTO Student (id, name, email, total_marks, special_subject, contact_number)
VALUES
(101, 'Aditya Jadhav', 'aditya@gmail.com', 94, 'Science', '7744952758'),
(102, 'Manoj Karle', 'manoj@gmail.com', 95, 'Maths', '9823012345'),
(103, 'Rohit Shinde', 'rohit@gmail.com', 45, 'Physics', '9922123456'),
(104, 'Pratik Karle', 'pratik@gmail.com', 41, 'Biology', '9765124789'),
(105, 'Soham Kale', 'soham@gmail.com', 38, 'Chemistry', '8087123490'),
(106, 'Abhay Jadhav', 'abhay@gmail.com', 65, 'English', '9175234098'),
(107, 'Pranav Ghodke', 'pranav@gmail.com', 67, 'Maths', '9867451280'),
(108, 'Mayur Ghodke', 'mayur@gmail.com', 40, 'History', '9356721098'),
(109, 'Omkar Shinde', 'omkar@gmail.com', 55, 'Geography', '9922893456'),
(110, 'Karan Kedare', 'karan@gmail.com', 65, 'Science', '8879456120');

SELECT * FROM Student;

SELECT * FROM Student WHERE total_marks >= 60;

SELECT id,name FROM Student;

SELECT * FROM Student WHERE special_subject = "Science";
