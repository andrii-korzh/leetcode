SELECT product_id, SUM(quantity) as total_quantity
FROM sales s
GROUP BY product_id