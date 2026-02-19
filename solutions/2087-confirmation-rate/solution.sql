# Write your MySQL query statement below
SELECT a.user_id, ROUND(AVG(CASE
            WHEN b.action = 'confirmed' THEN 1
            WHEN b.action = 'timeout' THEN 0
            ELSE 0 END),2) AS confirmation_rate
FROM  signups as a
LEFT JOIN confirmations as b
ON a.user_id = b.user_id
GROUP BY user_id
ORDER BY confirmation_rate ASC;
