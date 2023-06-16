-- 코드를 입력하세요
SELECT b.category, SUM(s.sales) total_sales
FROM BOOK b, BOOK_SALES s
WHERE b.book_id = s.book_id
AND TO_CHAR(s.sales_date, 'YYYY-MM') LIKE '2022-01'
GROUP BY b.category
ORDER BY b.category ASC