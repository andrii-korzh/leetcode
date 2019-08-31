# Write your MySQL query statement below
SELECT Name as Customers FROM CUSTOMERS
WHERE id not in
(
  SELECT CustomerId from orders
)