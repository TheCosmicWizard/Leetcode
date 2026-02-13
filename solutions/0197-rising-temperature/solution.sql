# Write your MySQL query statement below
SELECT a.id
FROM weather as a 
JOIN weather as b 
ON DATEDIFF(a.recordDate, b.recordDate) =1 
WHERE a.temperature > b.temperature;
