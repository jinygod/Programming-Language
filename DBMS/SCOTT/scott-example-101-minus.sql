-- 집합연산자
-- 차집합(MINUS)
-- A MINUS B
-- A의 검색 결과에서 B의 검색 결과를 뺀(제외한) 결과를 선택

-- 사원 정보에서 부서가 10이 아닌 사원 정보
SELECT * FROM emp WHERE deptno <> 10 ORDER BY deptno;

-- MINUS
SELECT * FROM emp 
MINUS
SELECT * FROM emp WHERE deptno = 10;

-- A MINUS B MINUS C
SELECT * FROM emp 
MINUS
SELECT * FROM emp WHERE deptno = 10
MINUS
SELECT * FROM emp WHERE deptno = 20;

-- UNION처럼 칼럼의 갯수가 일치해야 한다.
SELECT * FROM emp 
MINUS
SELECT job FROM emp WHERE job = 'SALESMAN';

SELECT job FROM emp 
MINUS
SELECT job FROM emp WHERE job = 'SALESMAN';

-- UNION, MINUS
SELECT job, sal, deptno FROM emp
MINUS
SELECT job, sal, deptno FROM emp WHERE deptno IN(30,50)
UNION
SELECT job, sal, deptno FROM emp WHERE deptno IN(30,50);


