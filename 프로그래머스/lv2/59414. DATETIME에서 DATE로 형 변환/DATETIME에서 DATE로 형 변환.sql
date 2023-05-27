-- 코드를 입력하세요
SELECT animal_id, name, TO_CHAR(datetime, 'YYYY-MM-DD') datetime
FROM ANIMAL_INS
ORDER BY animal_id