-- NON-EQUI JOIN
-- 비등가 조인, 세타조인
-- 조인 조건에 특정 범위 내에 있는지를 조사하기 위해서 사용

-- 급여 등급 테이블
SELECT * FROM salgrade;

-- 사원별 급여 등급
SELECT ename, sal, grade, losal, hisal
    FROM emp, salgrade
    WHERE sal BETWEEN losal AND hisal;
    
SELECT e.ename, e.sal, s.grade, s.losal, s.hisal
    FROM emp e, salgrade s
    WHERE sal BETWEEN losal AND hisal;
    
SELECT e.ename, e.sal, s.grade, s.losal, s.hisal
    FROM emp e, salgrade s
    WHERE e.sal >= s.losal AND e.sal <= s.hisal;
    
-- 세 개의 테이블 조인:
-- 부서 : 등가조인
-- 등급 : 비등가 조인
SELECT ename, sal, grade, losal, hisal, e.deptno, dname, loc
    FROM emp e, salgrade s, dept d
    WHERE e.deptno = d.deptno
    AND sal BETWEEN losal AND hisal;
    
-- JOIN ON
SELECT ename, sal, grade, losal, hisal,  dname, loc, e.deptno
    FROM emp e JOIN dept d ON(e.deptno = d.deptno),
    
    WHERE e.deptno = d.deptno
    AND sal BETWEEN losal AND hisal;