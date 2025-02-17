DROP TABLE IF EXISTS Passwords;

CREATE TABLE Passwords (
    ID BIGINT PRIMARY KEY,
    title VARCHAR(255),
    username VARCHAR(255),
    password VARCHAR(255),
    url VARCHAR(255),
    email VARCHAR(255),
    notes VARCHAR(255)
);