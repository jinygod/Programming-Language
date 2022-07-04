-- CHAPTER 07 서브쿼리(SUB QUERY)
--  다중행 서브 쿼리: 쿼리 결과가 여러개의 행인 경우
-- IN, SOME, ALL, ANY, EXIST

-- ALL
-- 서브 쿼리에서 반환하는 모든 값과 비교
-- > ALL : 최대값보다 크면 TRUE
-- < ALL : 최소값보다 작으면 TRUE

SELECT sal FROM emp WHERE job= 'SALESMAN'; -- 1600

-- 급여가 sal > 1600 보다 큰 경우
SELECT empno, ename, job, sal
    FROM emp
    WHERE sal > ALL (SELECT sal FROM emp WHERE job = 'SALESMAN')
    ORDER BY sal;
    
-- max(sal)
SELECT empno, ename, job, sal
    FROM emp
    WHERE sal >  (SELECT max(sal) FROM emp WHERE job = 'SALESMAN')
    ORDER BY sal;
    
---------------------------------------------------
-- 급여가 sal < 1250 보다 작은 경우

SELECT sal FROM emp WHERE job = 'SALESMAN';  -- 가장 작은 값 : 1250

SELECT empno, ename, job, sal
    FROM emp
    WHERE sal < ALL (SELECT sal FROM emp WHERE job = 'SALESMAN')
    ORDER BY sal;
    
-- min(sal)
SELECT empno, ename, job, sal
    FROM emp
    WHERE sal <  (SELECT min(sal) FROM emp WHERE job = 'SALESMAN')
    ORDER BY sal;
    
-- sal >= 1250 , sal <= 1600

SELECT sal FROM emp WHERE sal >= 5000;  -- 가장 작은 값 : 1250

SELECT empno, ename, job, sal
    FROM emp
    WHERE sal = ALL (SELECT sal FROM emp WHERE sal >= 5000)
    ORDER BY sal;