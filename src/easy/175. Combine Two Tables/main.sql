# Write your MySQL query statement below
SELECT p.FirstName, p.LastName, a.City, a.State 
FROM PERSON p
LEFT JOIN Address a ON p.PersonId = a.PersonId