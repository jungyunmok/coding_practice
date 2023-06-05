-- 코드를 입력하세요
SELECT i.animal_id, i.name
FROM ANIMAL_INS i, ANIMAL_OUTS o
WHERE i.animal_id = o.animal_id
AND i.datetime > o.datetime
ORDER BY i.datetime ASC