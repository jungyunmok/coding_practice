-- 코드를 입력하세요
SELECT b.book_id, a.author_name, TO_CHAR(b.published_date, 'YYYY-MM-DD') published_date
FROM AUTHOR a, BOOK b
WHERE a.author_id = b.author_id
AND b.category = '경제'
ORDER BY b.published_date ASC