-- CHAPTER 04 : 다양한 함수

-- 문자 함수 : 단일행 함수(Single-Row Function)
-- 데이터가 한 행씩 입력되고 입력된 한 행당 결과가 하나씩 나오는 함수
SELECT upper('oracle dbms'), lower('Oracle DBMS'), initcap('oracle database') FROM dual;


-- p103
-- lower(column) : 소문자로 변환
-- initcap(column) : 첫번째 문자를 대문자로 변환, 나머지 글자는 소문자로 변환
SELECT ename, lower(ename), job, initcap(job) FROM employee;

-- 함수를 검색 조건
SELECT ename, lower(ename), job, initcap(job) FROM employee
WHERE lower(ename) IN ('ford', 'james','smith');


-- 문자 길이: 표현된 길이, 저장된 길이(바이트)
-- length    : 표현된 길이
-- lengthb  : 물리적인 길이
SELECT length('한글'), lengthb('한글') FROM dual;
SELECT ename, length(ename) FROM emp WHERE length(ename) >4;

-- CONCAT : 문자열 결합
-- CONCAT(문자열1, 문자열2)
SELECT concat('Oracle', 'Database') FROM dual;
SELECT 'Oracle' || 'Database' as dbms FROM dual;
SELECT concat(empno, ename) as empnoname FROM emp;
SELECT (empno || ', ' || ename) as empnoname FROM emp;


-- SUBSTR(문자열, 시작위치, 갯수)
-- 시작위치 : 문자열의 처음(1부터 시작), 문자열의 끝(-1부터 시작)
DESC emp;
SELECT * FROM emp;

SELECT ename, substr(ename, 1, 4) FROM emp; -- 이름을 4자리 단위로 자름
SELECT ename, substr(ename, -2, 2) FROM emp; -- 이름을 끝에서부터 2자리 단위로 자름

-- 입사년도(hiredate) : DATE
-- 자료형이 문자열이 아닌 경우는 문자열로 변환해서 처리
-- DATE 자료형은 'YY/MM/DD' 형으로 변환해서 처리
SELECT * FROM emp WHERE substr(hiredate, 1, 2) = '81';
SELECT hiredate, substr(hiredate, 1, 2),substr(hiredate, 1, 4) FROM emp;

SELECT hiredate,
     to_char(hiredate, 'YYYYMMDD'), -- 날짜를 문자열('YYYYMMDD') 형태로 변환
    substr(to_char(hiredate, 'YYYYMMDD'), 1, 4) AS "연도",
    substr(to_char(hiredate, 'YYYYMMDD'), 5, 2) AS "월",
    substr(to_char(hiredate, 'YYYYMMDD'), -2, 2) AS "일"
    FROM emp;
    
-- INSTR(컬럼,찾을문자,시작위치,몇 번째)
SELECT * FROM emp;

--시작위치와 몇 번째를 지정하지 않으면 (컬럼, 찾을문자, 1, 1)
SELECT job, instr(job, 'A') , instr(job, 'A', 1, 1) FROM emp;    
SELECT job, instr(job, 'A', 1, 1) , instr(job, 'A', 1, 2) FROM emp;

-- 전화번호(성남)
SELECT instr('031-123-5678', '-', 1, 2) "성남" From dual;

-- [문제1]
-- 전화번호에서 마지막 뒷 자리를 추출하라
-- 마지막 뒷자리의 위치를 특정할 수 없다.
-- '031-123-1234', '010-1234-5678'
SELECT substr('031-1234-1234',1,  instr('031-1234-1234', '-', 1, 1) -1), 
              substr('031-1234-1234',  instr('031-1234-1234', '-', 1, 1) +1 ,
             instr('031-1234-1234', '-',1,2)- instr('031-1234-1234', '-', 1, 1) -1),
             substr('031-1234-1234', instr('031-1234-1234', '-', 1, 2) + 1 ) "성남" From dual;


-- LPAD(컬럼, 자릿수, 문자) : 오른쪽 배치
-- 전체 자릿수에서 남은 공간을 지정된 문자로 왼쪽을 채운다.
SELECT lpad(1234, 10, ' ') FROM dual;
SELECT lpad(12345, 10, '*') FROM dual;
SELECT lpad(123467, 10, '#') FROM dual;

-- RPAD(컬럼, 자릿수, 문자) : 왼쪽 배치
-- 전체 자릿수에서 남은 공간을 지정된 문자로 오른쪽을 채운다.
SELECT rpad(1234, 10, ' ') FROM dual;
SELECT rpad(12345, 10, '^') FROM dual;
SELECT rpad(123467, 10, '#') FROM dual;

-- LTRIM(컬럼) : 왼쪽의 공백을 제거
-- RTRIM(컬럼) : 오른쪽의 공백을 제거
-- TRIM(컬럼) : 양쪽의 공백을 제거
SELECT ltrim('     Hello!!!') FROM dual;
SELECT rtrim('Hello!!!    ') FROM dual;
SELECT trim('          Hello       ') as hello , length(trim('        Hello        ')) FROM dual;

-- REPLACE : 문자열 대체 함수
-- REPLACE(원본, 찾을 문자열, 대체할 문자열)
-- 하이픈(-)을 마침표(.)로 대체
SELECT '010-1234-5678' as tel,
       replace('010-1234-5678', '-','.')
       From dual;
       
       -- 하이픈을 제거
SELECT '010-1234-5678' as tel,
       replace('010-1234-5678', '-','')
       From dual;
       
SELECT '010-1234-5678' as tel,
       replace('010-1234-5678', '-')   -- 대체할 문자열을 생략하면 제거 효과
       From dual;