SELECT product_id, product_name
FROM product p
WHERE product_id not in(
  SELECT distinct product_id
  FROM sales
  WHERE sale_date NOT BETWEEN '2019-01-01'
    AND '2019-03-31'
)