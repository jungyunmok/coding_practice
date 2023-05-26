-- 코드를 입력하세요
SELECT animal_id, name
FROM ANIMAL_INS
WHERE LOWER(name) LIKE '%el%'
AND animal_type = 'Dog'
ORDER BY name