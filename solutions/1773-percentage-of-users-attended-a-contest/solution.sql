# Write your MySQL query statement below
SELECT a.contest_id, 
ROUND(COUNT(DISTINCT a.user_id) * 100.0 / (SELECT COUNT(*) FROM users),2) AS percentage
FROM register AS a
GROUP BY a.contest_id
ORDER BY percentage DESC, a.contest_id ASC;
