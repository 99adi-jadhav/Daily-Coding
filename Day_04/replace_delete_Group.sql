SELECT * FROM College.Student;

SELECT REPLACE(name, 'a', 'A') AS name
FROM Student;

SELECT *
FROM Student
WHERE name LIKE '%a';


SELECT *
FROM (
    SELECT *, ROW_NUMBER() OVER (ORDER BY id) AS row_num
    FROM Student
) AS temp
WHERE row_num % 2 = 1;


SELECT *
FROM (
    SELECT *, ROW_NUMBER() OVER (ORDER BY id) AS row_num
    FROM Student
) AS temp
WHERE row_num % 2 = 0;


DELETE FROM Student
WHERE id = 108;
