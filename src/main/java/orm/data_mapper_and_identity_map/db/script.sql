-- sqlite3 example.db

DROP TABLE IF EXISTS users;
CREATE TABLE IF NOT EXISTS users
(
    id   INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    name VARCHAR(10),
    age  SMALLINT
);
INSERT INTO users (name, age)
VALUES ('First', 51),
       ('Second', 52),
       ('Third', 53),
       ('Forth', 54),
       ('Fifth', 55)
;
SELECT *
FROM users;