-- 코드를 입력하세요
SELECT i.ingredient_type, SUM(f.total_order) total_order
FROM FIRST_HALF f, ICECREAM_INFO i
WHERE f.flavor = i.flavor
GROUP BY i.ingredient_type
ORDER BY SUM(f.total_order) ASC