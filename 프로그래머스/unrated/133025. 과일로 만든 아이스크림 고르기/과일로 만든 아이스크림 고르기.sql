-- 코드를 입력하세요
SELECT i.FLAVOR
FROM FIRST_HALF f, ICECREAM_INFO i
WHERE f.FLAVOR = i.FLAVOR
AND i.INGREDIENT_TYPE = 'fruit_based'
AND f.TOTAL_ORDER > 3000
ORDER BY f.TOTAL_ORDER DESC