DROP TABLE IF EXISTS Passwords;

CREATE TABLE Passwords (
    ID BIGINT PRIMARY KEY,
    Title VARCHAR(255),
    Username VARCHAR(255),
    Password VARCHAR(255),
    Url VARCHAR(255),
    Email VARCHAR(255),
    Notes VARCHAR(255)
);