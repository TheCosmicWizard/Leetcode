# Write your MySQL query statement below
SELECT name, bonus
FROM employee as a
LEFT JOIN bonus as b 
ON a.empID = b.empID
WHERE b.bonus IS NULL OR b.bonus < 1000;
