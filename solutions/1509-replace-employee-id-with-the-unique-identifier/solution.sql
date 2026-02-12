# Write your MySQL query statement below
SELECT unique_id, name 
FROM employees as e 
LEFT JOIN employeeuni as u 
ON e.id = u.id; 
