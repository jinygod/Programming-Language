-- SELF JOIN
-- 하나의 테이블에 있는 칼럼끼리 조인
-- 그 외에는 등가조인과 동일

-- 셀프조인: 같은 테이블을 별칭으로 지정하여 등가조인 형태로 사용
CREATE TABLE mgr AS SELECT * FROM emp;
SELECT e.empno
    e.ename 
    e.mgr
    m.empno
    m.ename
    FROM emp e
    WHERE e.mgr = e.empno
    ORDER BY 1;