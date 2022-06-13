-- TO_NUMBER 함수
-- 숫자형을 변환: 연산이 필요한 경우

-- ORA-01722: invalid number
SELECT '100,000' - '50,000' FROM dual; 

SELECT (to_number('100,000', '999,999') - to_number('50,000', '99,999')) / 2 FROM dual; 

SELECT (to_number('$100,000', '$999,999') - to_number('$50,000', '$99,999')) / 2 FROM dual; 

SELECT to_number('123,345.12', '999,999.99') * 2 FROM dual; 

SELECT ('100000' - '40000') * 2 FROM dual; 
SELECT to_number('100000') / 2 FROM dual; 
