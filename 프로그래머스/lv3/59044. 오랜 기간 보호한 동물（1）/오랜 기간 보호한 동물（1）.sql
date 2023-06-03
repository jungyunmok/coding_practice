-- 코드를 입력하세요
SELECT io.*
FROM (SELECT i.name, i.datetime
FROM ANIMAL_INS i, ANIMAL_OUTS o
WHERE i.animal_id = o.animal_id(+)
AND o.datetime IS NULL
ORDER BY i.datetime ASC) io
WHERE ROWNUM BETWEEN 1 AND 3