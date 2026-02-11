# Write your MySQL query statement below
-- SELECT * FROM views GROUP BY article_id;

SELECT author_id as id FROM views WHERE author_id = viewer_id GROUP BY id ORDER BY id ASC;
