----------------------------------------------------
-- OUTER JOIN(외부 조인)
----------------------------------------------------
-- 조인에서 한 쪽 칼럼이 NULL이면 등가조인(EQUI JOIN)에서는 검색이 되지 않음
-- 그러나 한 쪽이 NULL인 경우에도 검색 결과가 NULL로 나오도록 해야할 경우에
-- 외부조인(OUTER JOIN)을 사용한다.
----------------------------------------------------
-- 왼쪽 외부 조인: LEFT OUTER JOIN
-- 오른쪽 외부 조인: RIGHT OUTER JOIN
-- 전체 외부 조인: FULL OUTER JOIN
----------------------------------------------------
/*
SELECT table1.column, table2.column
FROM table1 [RIGHT | LEFT | FULL] OUTER JOIN table2
ON table1.column = table2.column;
*/
----------------------------------------------------


-- 매니저 테이블 생성 : 사원테이블과 같은 테이블을 복제
CREATE TABLE mgr AS SELECT * FROM emp;

-- emp.mgr이 NULL인 경우는 검색에서 제외
-- 사번(7839), 이름(KING)은 mgr이 NULL
SELECT * FROM emp WHERE mgr is null;

SELECT * FROM emp;

-- 나의 매니저는 누구인가?
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
    FROM emp e, mgr m
    WHERE e.mgr = m.empno
    ORDER BY 1;

-- 나의 매니저는 누구인가?
-- LEFT OUTER JOIN    
-- 조인된 테이블에 해당하는 키가 없는 경우에서 NULL로 처리 결과를 만듦
-- ORACLE: WHERE e.mgr = m.empno(+)
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
    FROM emp e, mgr m
    WHERE e.mgr = m.empno(+)
    ORDER BY 1;

-- 나의 매니저는 누구인가?
-- 표준(SQL-99)    
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
    FROM emp e LEFT OUTER JOIN mgr m ON(e.mgr = m.empno)
    ORDER BY 1;

-- 셀프 아웃터 왼쪽 조인    
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
    FROM emp e LEFT OUTER JOIN emp m ON(e.mgr = m.empno)
    ORDER BY 1;
    
    
    