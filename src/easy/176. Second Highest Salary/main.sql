# Write your MySQL query statement below
select max(SALARY) as SecondHighestSalary from Employee
where SALARY != (
select max(SALARY)
from Employee
)