# Write your MySQL query statement below
SELECT distinct s.buyer_id
FROM Product p, Sales s
WHERE p.product_name="S8"
  AND p.product_id = s.product_id
  AND s.buyer_id not in (
    SELECT distinct s1.buyer_id
    FROM Product p1, Sales s1
    WHERE p1.product_id=s1.product_id
      AND p1.product_name="iphone"
    )