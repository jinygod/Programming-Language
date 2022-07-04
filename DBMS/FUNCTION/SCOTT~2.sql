-- 숫자함수

-- ROUND(숫자, 반올림위치)
SELECT 98.7654,
round(98.7654),           -- 소숫점 이하 반올림
round(98.7654,0),         -- 소숫점 이하 반올림
round(98.7654, 2),         -- 소숫점 셋째자리에서 반올림하여 둘째자리 까지 표기
round(98.7654,-1)        -- 정수 자릿수에서 반올림, 98 + 5 -> 103-> 100
FROM dual;

SELECT round(123456, -1) FROM dual;   -- 123460 -> 첫째 자리에서 반올림
SELECT round(123456, -2) FROM dual;   -- 123500 -> 첫째 자리에서 반올림

-- TRUNC(숫자, 버림위치)
-- 버림
SELECT 98.7654,
trunc(98.7654),           -- 소숫점 이하 버림
trunc(98.7654,0),         -- 소숫점 이하 버림
trunc(98.7654, 2),         -- 소숫점 둘째자리 까지 표기, 나머지 버림
trunc(98.7654,-1)        -- 90, 첫째자리 버림
FROM dual;

SELECT trunc(12345,-1) FROM dual;   -- 결과(12340) : 12345 / 10 = 1234.5 -> 정수(1234) * 10 -> 12340
SELECT trunc(12345,-2) FROM dual;  -- 결과(12300) : 12345 / 100 = 123.45 ->정수(123) * 100 -> 12300 
