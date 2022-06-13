-- SCOTT/TITER
-- 테이블 별칭
CREATE SYNONYM employee FOR emp;
desc employee

SELECT * FROM tab;

SELECT * FROM emp;
SELECT * FROM employee;

SELECT * FROM dept;
SELECT * FROM bonus;
SELECT * FROM salgrade;

-- P103
-- lower(column)   : 소문자로 변환
-- initcap(column) : 첫번째 문자를 대문자로 변환, 나머지 글자는 소문자로 변환
SELECT ename, lower(ename), job, initcap(job) FROM employee;
