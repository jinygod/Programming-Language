-- TO_CHAR
-- 숫자를 문자로 변환

-- TO_CHAR(숫자, 포맷)
-- 포맷 :( 0 9 L . ,) 
SELECT ename, sal FROM emp;

SELECT ename, sal, to_char(sal, '999,999') from emp;   -- 천 단위로 콤마 찍기
SELECT ename, sal, to_char(sal, '999,999.99') FROM emp; -- 소숫점 자릿수 지정
SELECT ename, sal, to_char(sal, '999,999.00') FROM emp; -- 소숫점 자릿수 지정

-- 남는 자릿수는 0으로 채움
SELECT ename, sal, to_char(sal, '000,000') FROM emp; -- 소숫점 자릿수 지정
SELECT ename, sal, to_char(sal, '000,000.00') FROM emp; -- 소숫점 자릿수 지정
SELECT ename, sal, to_char(sal, '9,000') FROM emp; -- 소숫점 자릿수 지정
SELECT ename, sal, to_char(sal, '9,990') FROM emp; -- 소숫점 자릿수 지정

-- 자릿수가 모자르면 전체를 샾(#)으로 채움
SELECT to_char(123456789, '9,990') FROM dual;  -- ######
SELECT to_char(123456789, '999999,999') FROM dual;  -- 123456,789

-- 소숫점
SELECT to_char(1234, '999,999.99') From dual; -- 1,234.00
SELECT to_char(1234, '999,999.00') From dual; -- 1,234.00

SELECT to_char(1234.98, '999,999') From dual; -- 반올림(1,235)
SELECT to_char(round(1234.98), '999,999') From dual; -- 반올림(1,235)

SELECT to_char(trunc(1234.98), '999,999') From dual; -- 반올림 하지않음(1,234)

-- 화폐단위
-- L:Locale
SELECT sal, to_char(sal * 10000, 'L999,999,999')  FROM emp;