-- 코드를 입력하세요
SELECT warehouse_id, warehouse_name, address, NVL(freezer_yn, 'N')
FROM FOOD_WAREHOUSE
WHERE address LIKE '경기도%'
ORDER BY warehouse_id