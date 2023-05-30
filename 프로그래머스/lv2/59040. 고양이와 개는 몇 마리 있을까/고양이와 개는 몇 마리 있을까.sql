SELECT animal_type, COUNT(animal_id) count
FROM ANIMAL_INS
WHERE animal_type = 'Cat'
GROUP BY animal_type
UNION ALL
SELECT animal_type, COUNT(animal_id) count
FROM ANIMAL_INS
WHERE animal_type = 'Dog'
GROUP BY animal_type