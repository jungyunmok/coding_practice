-- 코드를 입력하세요
SELECT f.product_id, f.product_name, f.product_cd, f.category, f.price
FROM FOOD_PRODUCT f, (SELECT MAX(price) price FROM FOOD_PRODUCT) p
WHERE f.price = p.price