# Write your MySQL query statement below
SELECT a.machine_id, ROUND(AVG(b.timestamp - a.timestamp), 3) as processing_time
FROM activity as a
JOIN activity as b
ON a.process_id = b.process_id AND a.machine_id =b.machine_id
WHERE a.activity_type = "start" AND b.activity_type = "end"
GROUP BY a.machine_id ;
