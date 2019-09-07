# Write your MySQL query statement below
SELECT w1.ID
FROM Weather w1, Weather w2
WHERE DATEDIFF(w1.RecordDate,w2.RecordDate) = 1
  AND w1.Temperature > w2.Temperature
ORDER BY w1.RecordDate,w2.RecordDate
