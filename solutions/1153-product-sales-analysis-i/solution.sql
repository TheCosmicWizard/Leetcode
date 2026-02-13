# Write your MySQL query statement below
SELECT product_name, year, price 
FROM sales as a
LEFT JOIN product as b
ON a.product_id = b.product_id;
