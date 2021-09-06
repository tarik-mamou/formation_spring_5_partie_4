CREATE TABLE IF NOT EXISTS  livre (
               id          INT PRIMARY KEY ,
               nom         VARCHAR(64) NOT NULL,
               langue      VARCHAR(64),
               prix         INT NOT NULL);
