-- 서브쿼리
-- 스칼라 서브쿼리(scalar sub-query)
-- SELECT 절에서 칼럼의 결과를 SELECT로 기술
-- 칼럼의 하나의 열 영역의 결과를 SELECT로 기술
-- 조건:
--   -> SELECT절에 명시하는 서브 쿼리의 결과는 하나의 칼럼에 해당하는 값만 나와야 한다.
--   -> 다중행 결과가 나오면 안 된다.

-- 급여 등급(호봉)
SELECT * FROM salgrade;

-- 사원별 급여 등급(join)
SELECT e.empno, e.ename, e.sal, s.grade
    FROM emp e, salgrade s
    WHERE e.sal BETWEEN s.losal AND s.hisal
    ORDER BY 4;

-- 스칼라 서브쿼리(scalar sub-query)
SELECT e.empno, e.ename, e.sal, 
        (SELECT grade 
            FROM salgrade  
            WHERE e.sal BETWEEN losal AND hisal) as salgrade
    FROM emp e
    ORDER BY 4;
    
-- 스칼라 서브쿼리(scalar sub-query)
-- 리턴 행의 갯수가 1개 나와야 한다.
-- ORA-01427: single-row subquery returns more than one row
SELECT e.empno, e.ename, e.sal, 
        (SELECT grade FROM salgrade) as salgrade
    FROM emp e
    ORDER BY 4;
    
-- ORA-00913: too many values
-- 칼럼의 값이 1개만 나와야 한다.
SELECT e.empno, e.ename, e.sal, 
        (SELECT grade, losal, hisal
            FROM salgrade
            WHERE e.sal BETWEEN losal AND hisal) as salgrade
    FROM emp e
    ORDER BY 4;    
        
-- [문제]
-- 스칼라 서브쿼리(scalar sub-query)를 이용해서
-- 사원별 급여등급과 부서이름 출력하라.
SELECT e.empno, e.ename, d.deptno, d.dname
    FROM emp e, dept d
    WHERE e.deptno = d.deptno;

SELECT e.empno, e.ename, e.sal, 
        (SELECT grade FROM salgrade WHERE e.sal BETWEEN losal AND hisal) as salgrade,
        (SELECT dname FROM dept WHERE e.deptno = deptno) as dname
    FROM emp e
    ORDER BY 5;    
    
SELECT e.empno, e.ename, e.sal, s.grade, d.deptno, d.dname
    FROM emp e, dept d, salgrade s
    WHERE e.deptno = d.deptno
    AND e.sal BETWEEN s.losal AND s.hisal;
    