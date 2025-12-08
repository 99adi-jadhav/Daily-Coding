CREATE DATABASE theater;

USE theater;

CREATE TABLE cinema(
movie_id INT PRIMARY KEY,
movie_name VARCHAR(50),
moive_descriptiion VARCHAR(50),
movie_rating FLOAT
);


INSERT INTO cinema (movie_id, movie_name, moive_descriptiion, movie_rating)
VALUES
(101, 'Kantara','Devoting Movie', 9),
(102, 'Master','Action Thriller', 5),
(103, 'Salaar','Action Film', 9),
(104, 'Devara','Action Film', 7),
(105, 'Jailer','Action Drama', 10),
(106, 'LEO','Crime Thriller', 6),
(107, 'KGF','Action Thriller', NULL),
(108, 'Pushpa','Drama Film', 5);


SELECT * FROM cinema;

SELECT movie_id, movie_name, moive_descriptiion
FROM cinema
WHERE movie_rating IS NULL;

SELECT movie_name
FROM cinema
WHERE movie_rating BETWEEN 7 AND 9;

