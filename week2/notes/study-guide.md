# Study Guide (Overall Concepts)

For each topic, I suggest you be able to answer these overall questions:
  Tell me about your experience with X.
  What is X?
  How does X work?

Additionally, be able to follow up with more detail as needed.
As well as examples for them.

I also suggest reviewing the "How to do well in QC" document that was shared and pinned in the slack workspace (general channel).

## Topics (SQL)
- Structured Query Language
- RDBMS: "Relational" DataBase Management System
  - The "Relational" part is very important
  - Not only do we have tables, but the relationships between them is a significant component to the context of the data
- SQL Dialects
  - DataBase vendors: Oracle, Postgres, MySQL, etc
- SQL Sublanguages
  - DDL: Data Defintion Language
    - CREATE, ALTER, DROP, TRUNCATE
  - DML: Data Manipulation Language
    - INSERT, SELECT, UPDATE, DELETE
  - DQL: Data Query Language
    - SELECT
  - DCL: Data Control Language
    - GRANT, REVOKE
  - TCL: Transaction Control Language
    - COMMIT, ROLLBACK, SAVEPOINT, SET_TRANSACTION
- Constraints
  - Miscellaneous rules applied to 1 or more columns at a time
  - PRIMARY KEY
    - UNIQUE, NOT NULL, and supposed to uniquely identify each record
      - The last part is less so a rule that is enforced, and moreso the context in which it should be used
  - FOREIGN KEY
    - Constraint that will reference the primary key of another table (or the same table)
    - This constraint is what creates relationships between tables
    - The other constraints that are placed on this Foriegn Key determine the multiplicity
  - UNIQUE
    - Data in this column(s) cannot be repeated
    - Multiple Nulls are allowed
  - NOT NULL
    - Data in this column cannot be null
  - CHECK
    - Can apply any logical condition
    - example: CHECK (age > 18)
  - DEFAULT
    - If a value is not provided for this column, then use the default
- Basic SQL Queries
  - Syntax
    - INSERT INTO table (columns) VALUES (values);
    - SELECT (columns) FROM table;
      - clauses
        - WHERE, GROUP BY, HAVING, ORDER BY
        - and more
    - UPDATE table SET column1 = value1, column2 = value2, ... WHERE column = value;
      - example: UPDATE USERS SET username = 'different_username' WHERE id = 5;
      - If you forget the WHERE clause, then you will accidentally update ALL records (which is bad)
    - DELETE FROM table WHERE column = value;
      - example: DELETE FROM users WHERE username = 'my_username';
      - example: DELETE FROM users WHERE id = 5;
- Aggregate and Scalar Functions
  - Scalar functions provide 1 output for each input
    - LENGTH(), LOWER(), UPPER(), ROUND(), TRUNC(), CEIL(), ABS(), etc
    - There are TONS
  - Aggregate functions provide 1 output for many inputs
    - Used in conjunction with GROUP BY in order to compute a result PER GROUP
      - Otherwise will apply to all records to get a single result overall
    - SUM(), AVG(), MIN(), MAX(), FIRST(), LAST(), COUNT()
    - There are also many more
    - Some aggregate functions accept a DISTINCT or ALL clause
      - Such as COUNT(DISTINCT)
- Schema
  - Organizational unit
  - Tables are created inside a schema
  - Different tables cannot have the same name if they are in the same schema
    - In order to prevent ambiguity
  - Reference via SCHEMA_NAME.TABLE_NAME
    - BEAVER.USERS is separate from ROOT.USERS
    - But there cannot be two different tables named USERS inside the same ROOT schema
- Aliases
  - Can specify custom columns and provide aliases for them
    - example: SELECT first_name || ' ' || last_name AS full_name;
      - The AS keyword specifies the alias
  - Useful if you need to reference that column later with other clauses
    - Or if you have nested queries or join operations
- Multiplicity/Cardinality
  - The numerical category of the relationship between tables
  - 1 to 1
    - example: USERS to ADDRESSES
  - 1 to many (or many to 1)
    - example: BEEHIVE to BEES
  - many to many
    - example: STUDENTS to COURSES
  - These relationships are defined through FOREIGN KEY constraints
    - UNIQUE Foreign Keys create a 1 to 1 relationship
    - Not unique Foreign Keys create a many to 1 relationship
    - Join Tables are needed to support many to many relationships
- SQL Data Types
  - There are many different types for Table columns
  - Some common ones are
    - NUMBER: specifies whole or decimal values numbers
    - INTEGER: special case of NUMBER that is only whole numbers
      - Gets converted to NUMBER
    - VARCHAR2: String type
      - Must specify the maximum size
      - example: first_name VARCHAR2(50)
    - TIMESTAMP
    - BLOB: Binary Large Object
      - Generic data, such as images
      - Can technically hold anything
  - There are many more
- JOIN operations
  - Allows you to combine tables in different manners
  - The result will include columns from both tables
  - You must perform the JOIN operation on a specific pair of columns
  - Records will be combined on matching values of that column
  - INNER JOIN only contains records that had a match
  - (FULL) OUTER JOIN contains all records, match or no match
    - The extra columns will have null values where there was no match
  - LEFT (RIGHT) JOIN contains all records from the LEFT (RIGHT) table, even if there was no match
    - The extra columns will have null values where there was no match
- JDBC: Java DataBase Connectivity
  - Java API for connecting to a SQL database
  - Connection: The physical connection to the DB
  - Statement: A SQL statement to be executed on a DB
  - ResultSet: A iterator-like result that contains the data queried from a DB
  - Connection String: All information needed to identify how to connect to a DB
    - Driver (such as jdbc:oracle:thin)
    - Host/Endpoint
    - Port
    - SID or Service Name (such as ORCL)
  - DAO: Data Access Object
    - Design Pattern where we isolate all logic that will interact with a DB to a single object
    - Generally, we like to make one class per table that we interact with
      - Such as UserDAO, AccountDAO, etc
- Topics that will be covered later (Recommend self studying for now):
  - Set Operations
    - UNION, UNION ALL, INTERSECT
  - Referential Integrity
    - The idea that our DataBase will enforce the integrity of relationships/constraints
    - If a statement would violate one of these constraints, the statement will fail
  - Isolation Levels
    - In regards to the I portion of the acronym ACID
      - Atomicity
      - Consistency
      - Isolation <---
      - Durability
    - There are miscellaneous issues that can arise while following the Isolation property
      - These are often referred to as "Read Phenomena"
    - The different "Isolation Levels" provide different levels of efficiency
      - As well as different read phenomena that might happen
    - Default Isolation Level for OracleSQL is "Read Committed"
      - Generally, a pretty high degree of efficiency
      - This prevents the Read Phenonema called "Dirty Reads"
      - However, "Phantom Reads" and "Non-Repeatable Reads" are still possible at this level