-- 코드를 입력하세요
SELECT p.product_code, SUM(s.sales_amount*p.price) sales
FROM PRODUCT p, OFFLINE_SALE s
WHERE p.product_id = s.product_id
GROUP BY p.product_code
ORDER BY SUM(s.sales_amount*p.price) DESC, p.product_code ASC