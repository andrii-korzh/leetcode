# Write your MySQL query statement below

SELECT E.NAME AS Employee
FROM EMPLOYEE E, EMPLOYEE M
WHERE E.MANAGERID=M.ID
  AND E.SALARY > M.SALARY
# WHERE ID IN (
#     SELECT Id
#     FROM EMPLOYEE e1
#     JOIN EMPLOYEE e2 ON e1.Id = e2.ManagerId
# )
