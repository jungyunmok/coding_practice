-- 코드를 입력하세요
SELECT SUBSTR(product_code, 1, 2) CATEGORY, COUNT(product_code) PRODUCTS
FROM PRODUCT
GROUP BY SUBSTR(product_code, 1, 2)
ORDER BY SUBSTR(product_code, 1, 2) ASC