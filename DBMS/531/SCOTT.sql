-- CHAPTER 07 서브쿼리(SUB QUERY)
-- 다중행 서브 쿼리: 쿼리 결과가 여러개의 행인 경우
-- IN, SOME, ALL, ANY, EXIST

-- IN 
-- 서브커리가 반환한 여러 행을 결과에서
-- 메인쿼리의 조건식과 하나라도 같으면
-- 메인쿼리는 TRUE를 반환한다.

-- 각 부서별 최저 급여액
SELECT deptno, min(sal) as sal FROM emp GROUP BY deptno ORDER BY sal;

SELECT min(sal) as sal FROM emp GROUP BY deptno ORDER BY sal; -- 800, 950, 1300, 4000

-- 각 부서별 최저 급여액을 받는 사원
SELECT empno, ename, sal
    FROM emp
    WHERE sal IN (SELECT min(sal) FROM emp GROUP BY deptno)
   -- WHERE sal IN (800, 950, 1300, 4000)
    ORDER BY sal;
    
-- 부서별 최고 급여액을 받는 사원
SELECT empno, ename, sal
    FROM emp
    WHERE sal IN (SELECT max(sal) FROM emp GROUP BY deptno)
    ORDER BY sal;

-- 사원들이 소속된 부서
SELECT distinct deptno FROM emp;

-- 사원들이 소속된 부서 정보
SELECT * FROM dept WHERE deptno IN(SELECT distinct deptno FROM emp);

-- 사원을 가지고 있지 않은 부서 정보
SELECT * FROM dept WHERE deptno NOT IN(SELECT distinct deptno FROM emp);