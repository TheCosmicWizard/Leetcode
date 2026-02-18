# Write your MySQL query statement below
SELECT a.student_id, a.student_name, c.subject_name, COUNT(b.subject_name) AS attended_exams  
FROM students as a 
CROSS JOIN subjects as c
LEFT JOIN examinations as b 
ON a.student_id = b.student_id AND b.subject_name = c.subject_name 
GROUP BY a.student_id, a.student_name, c.subject_name
ORDER BY student_id ASC;
