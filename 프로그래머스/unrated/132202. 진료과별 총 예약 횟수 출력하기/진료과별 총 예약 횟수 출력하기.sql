-- 코드를 입력하세요
SELECT mcdp_cd AS "진료과 코드", COUNT(apnt_no) AS "5월예약건수"
FROM APPOINTMENT
WHERE TO_CHAR(apnt_ymd, 'MM') = '05'
GROUP BY mcdp_cd
ORDER BY COUNT(apnt_no) ASC, mcdp_cd ASC