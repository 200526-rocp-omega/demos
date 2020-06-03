CREATE USER beaver IDENTIFIED BY chew;
-- This is a SQL comment, using two dashes
-- It will be ignored by SQL

GRANT CREATE SESSION TO beaver;
-- This allow the user to connect to the DB

GRANT UNLIMITED TABLESPACE TO beaver;
-- This allows beaver user to create as many tables as it wants

GRANT CREATE TABLE TO beaver;
-- This actually allows beaver to create tables

GRANT CREATE VIEW TO beaver;
GRANT CREATE SEQUENCE TO beaver;
GRANT CREATE TRIGGER TO beaver;
GRANT CREATE PROCEDURE TO beaver;
-- Miscellaneous permissions