-- 자연조인 : NAUTRAL JOIN
-- 표준 SQL : ISO/ANSI(SQL-99)
-- 등가조인(EQUAL JOIN)과 동일 
-- 대상이 되는 두 테이블에 이름과 자료형이 같은 칼럼을 기준으로 조인
-- (제약)
--      1. 테이블 별칭을 붙여서 칼럼명을 명시할 수 없다.
--      2. 조인되는 칼럼에 테이블명을 붙일 수 없다.
--      3. 같은 이름을 가진 칼럼에 대해서 동일한 값을 갖는 행끼리 결합하는 조인
--      4. 임의의 조건을 지정하거나 조인할 칼럼을 지정하려면 ON 절을 사용해야 한다.

SELECT e.*, d.*
    FROM emp e, dept d
    WHERE e.deptno = d.deptno
    ORDER BY e.empno DESC;
    
-- NATURAL JOIN
SELECT empno, deptno, dname, loc
    FROM emp NATURAL JOIN dept
    ORDER BY empno DESC;
    
-- 조인되는 칼럼명이 서로 다를 때
-- 조인되는 칼럼에 별칭을 쓸 수 있다.
-- JOIN ON
SELECT e.empno, e.ename, e.deptno, d.deptno, d.dname, d.loc
    FROM emp e JOIN dept d ON(e.deptno = d.deptno)
    ORDER BY e.empno DESC;
    
-- 부서의 위치가 특정한 지역
SELECT e.empno, e.ename, e.deptno, d.deptno, d.dname, d.loc
    FROM emp e JOIN dept d ON(e.deptno = d.deptno)
    WHERE e.deptno IN ('SEONGNAM', 'DALLAS')
    ORDER BY e.empno DESC;