-- SELF JOIN
-- 하나의 테이블에 있는 칼럼끼리 조인
-- 그 외에는 등가조인(EQUI JOIN)과 동일

-- mgr : 매니저
SELECT empno, ename, mgr FROM emp ORDER BY mgr;

-- 셀프조인: 같은 테이블을 다른 별칭으로 지정하여 등가조인 형태로 사용
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
    FROM emp e, emp m
    WHERE e.mgr = m.empno
    ORDER BY 1;
    
-- 매니저 테이블 생성 : 사원테이블과 같은 테이블을 복제
CREATE TABLE mgr AS SELECT * FROM emp;
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
    FROM emp e, mgr m
    WHERE e.mgr = m.empno
    ORDER BY 1;

SELECT * FROM emp;    
    
    
