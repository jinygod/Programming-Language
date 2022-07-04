-- CHAPTER 07 서브쿼리(SUB QUERY)
-- 다른 쿼리문에 삽입된 SELECT 문(SELECT 안에 SELECT문이 있는 경우)
-- 메인쿼리: 서브쿼리의 결과를 가지고 있는 쿼리
-- 서브 쿼리:
--  1. 메인 쿼리의 대상
--  2. 메인 쿼리와 자료형과 칼럼의 갯수가 같아야 한다.
--  3. 단일행 서브 쿼리: 쿼리 결과가 하나의 행인 경우, =, !=, <, <=, >=
--  4. 다중행 서브 쿼리: 쿼리 결과가 여러개의 행인 경우, IN, SOME, ALL, ANY



-- 사원('JAMES')의 부서코드 = 30
SELECT deptno FROM emp WHERE ename = 'JAMES';

-- 사원('JAMES')의 부서코드와 동일한 부서에서 근무하는 사원은?
SELECT * FROM emp
    WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'JAMES');

-- 사원(JONES)의 급여
SELECT sal FROM emp WHERE empno = 7566;

-- 급여가 2975 미만인 사원
SELECT empno, sal FROM emp WHERE sal < 2975;

-- 사원(JONES)보다 급여를 적게 받는 사원
SELECT * FROM emp WHERE sal < 2975;  -- 2975를 모르기 때문에 서브쿼리 사용 ㅇㅂㅇ
SELECT * FROM emp WHERE sal < (SELECT sal FROM emp WHERE empno = 7566);

-- 서브쿼리의 결과가 다중행이 되면 안 된다.
-- ORA-01427: single-row subquery returns more than one row
SELECT * FROM emp WHERE sal < (SELECT sal FROM emp WHERE sal < 2975);

-- 서브쿼리의 결과는 하나가 나와야 한다.
-- min
SELECT min(sal) FROM emp WHERE sal > 2975;
SELECT * FROM emp WHERE sal < (SELECT min(sal) FROM emp WHERE sal > 2975);

-- max
SELECT max(sal) FROM emp WHERE sal < 2975;
SELECT * FROM emp WHERE sal < (SELECT max(sal) FROM emp WHERE sal < 2975);

-- 각 부서에서 가장 급여를 적게 받는 사원
SELECT deptno, min(sal)
    FROM emp
    GROUP BY deptno;
    

SELECT min(sal) FROM emp WHERE deptno = 30;

-- HAVING 절에서 서브 쿼리 사용
-- 부서가 30인 사원중에서 가장 급여를 적게 받는 사원보다
-- 급여를 많이 받는 사원들 중에서 가장 급여를 적게 받는 사원의 부서별 최소 급여액
SELECT deptno, min(sal)
    FROM emp
    GROUP BY deptno
    HAVING min(sal) > (SELECT min(sal) FROM emp WHERE deptno = 30);
    
SELECT * FROM emp;
-- [문제1]
-- 'TURNER'의 입사일자보다 빨리 입사한 사원
SELECT hiredate FROM emp WHERE ename = 'TURNER';

SELECT ename, hiredate
FROM emp WHERE hiredate < (SELECT hiredate FROM emp WHERE ename = 'TURNER');

-- [문제2]
-- 'TURNER'의 입사일자보다 늦게 입사한 사원
SELECT ename, hiredate
FROM emp WHERE hiredate > (SELECT hiredate FROM emp WHERE ename = 'TURNER');
-- [문제3]
-- 부서코드가 20에 속한 사원중에서 'TURNER' 보다 높은 급여를 받는
-- 사원 정보와 소속 부서 정보
SELECT sal FROM emp WHERE ename = 'TURNER';
SELECT empno, ename, sal, deptno
FROM emp
WHERE deptno = 20
AND sal > (SELECT sal FROM emp WHERE ename = 'TURNER');


-- [문제4]
-- 부서코드가 10, 20에 속한 사원중에서
-- 전체 사원의 평균 급여보다 높은 급여를 받는
-- 사원 정보와 소속 부서 정보
SELECT avg(sal) FROM emp;
SELECT empno, ename,  sal, deptno
FROM emp
WHERE deptno IN(10,20)
AND sal > (SELECT avg(sal) FROM emp);