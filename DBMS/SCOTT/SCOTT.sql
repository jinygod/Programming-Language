-- SCOTT/TIGER
-- 테이블 별칭
CREATE SYNONYM employee FOR emp;

DESC employee

SELECT * FROM Tab;

SELECT * FROM emp;
SELECT * FROM employee;

SELECT * FROM dept;
SELECT * FROM bonus;
SELECT * FROM salgrade;

SELECT ename, lower(ename), job, initcap(job) FROM employee;