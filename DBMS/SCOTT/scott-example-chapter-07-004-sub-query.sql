-- CHAPTER 07 서브쿼리(SUB QUERY)
-- 다중행 서브 쿼리: 쿼리 결과가 여러개의 행인 경우
-- IN, SOME, ANY, ALL, EXIST

-- ALL
-- 서브 쿼리에서 반환하는 모든 값과 비교
-- > ALL : 최대값보다 크면 TRUE
-- < ALL : 최소값보 작으면 TRUE

SELECT sal FROM emp WHERE job='SALESMAN';   -- 1600

-- 급여가 sal > 1600보다 큰 경우
SELECT empno, ename, job, sal
    FROM emp
    WHERE sal > ALL (SELECT sal FROM emp WHERE job='SALESMAN')
    ORDER BY sal;

-- max(sal)    
SELECT empno, ename, job, sal
    FROM emp
    WHERE sal > (SELECT max(sal) FROM emp WHERE job='SALESMAN')
    ORDER BY sal;
    
--------------------------------------------------------------------------------

SELECT sal FROM emp WHERE job='SALESMAN';   -- 가장 작은 값: 1260


-- 급여가 sal < 1250보다 작은 경우
SELECT empno, ename, job, sal
    FROM emp
    WHERE sal < ALL (SELECT sal FROM emp WHERE job='SALESMAN')
    ORDER BY sal;

-- 급여가 sal <= 1250보다 작은 경우
SELECT empno, ename, job, sal
    FROM emp
    WHERE sal <= ALL (SELECT sal FROM emp WHERE job='SALESMAN')
    ORDER BY sal;

-- min(sal)
SELECT empno, ename, job, sal
    FROM emp
    WHERE sal < (SELECT min(sal) FROM emp WHERE job='SALESMAN')
    ORDER BY sal;

-- 의미가 없음: 권장하지 않음
-- 비효율적
SELECT sal FROM emp WHERE sal >= 5000;
SELECT empno, ename, job, sal
    FROM emp
    WHERE sal = ALL (SELECT sal FROM emp WHERE sal >= 5000)
    ORDER BY sal;
