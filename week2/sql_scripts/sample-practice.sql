SELECT * FROM Album;
-- The * in the above statement is a placeholder for querying ALL columns
-- If we only want a few columns, then we list them out directly
SELECT Title, Column1 FROM Album;
-- Syntax: SELECT <columns> FROM <tableName>;

-- We can filter our data with the WHERE clause
SELECT * FROM Album WHERE AlbumId = 15;
-- This only gives us a single record where the AlbumId is 15

SELECT * FROM Album WHERE AlbumId <= 15;
-- Query the first 15 records

SELECT * FROM Album WHERE Column1 IS NOT NULL;
-- Query all data from records where there exists information in Column1

SELECT * FROM Invoice;

SELECT * FROM Invoice WHERE total > 100 OR BillingPostalCode = "0171";

-- The || operator will concatenate strings
SELECT
	BillingAddress || ' ' || BillingCity || ', ' || BillingCountry
		AS full_address
	FROM Invoice WHERE LENGTH(full_address) < 30;
-- The above query is a little complex, so we split it over multiple lines
-- for readability

SELECT * FROM Invoice ORDER BY Total DESC;
-- We can use the ORDER BY clause in order to order our results
-- We can order by ASCending or DESCending

SELECT
	BillingCountry, COUNT(CustomerId), SUM(Total)
	FROM Invoice
	GROUP BY BillingCountry
	ORDER BY SUM(Total) DESC;
-- The above query groups the records by BillingCountry
-- For each group, it will count the number of Customers
-- And sum the total cost of all invoices within that group

SELECT
	BillingCountry, COUNT(CustomerId), SUM(Total)
	FROM Invoice
 	WHERE Total > 2 -- Filter data BEFORE we group
	GROUP BY BillingCountry
	HAVING SUM(Total) > 50 -- Filter data AFTER we group
	ORDER BY SUM(Total) DESC;

/*
Below is the complete syntax, as well as order for the miscellaneous
clauses for the SELECT statement:
	SELECT DISTINCT column, AGG_FUNC(column_or_expression), …
	FROM mytable
	    JOIN another_table
	      ON mytable.column = another_table.column
	    WHERE constraint_expression
	    GROUP BY column
	    HAVING constraint_expression
	    ORDER BY column ASC/DESC
	    LIMIT count OFFSET COUNT;
*/
