-- 코드를 입력하세요
SELECT pt_name, pt_no, gend_cd, age, NVL(tlno, 'NONE') tlno
FROM PATIENT
WHERE age < 13
AND gend_cd = 'W'
ORDER BY age DESC, pt_name ASC