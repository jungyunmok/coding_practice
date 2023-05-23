-- 코드를 입력하세요
SELECT name
FROM ANIMAL_INS a,
(SELECT MIN(datetime) time
FROM ANIMAL_INS) o
WHERE o.time = a.datetime