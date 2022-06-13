----------------------------------------------------
-- OUTER JOIN(외부 조인)
-- 오른쪽 외부 조인: RIGHT OUTER JOIN

-- 나의 매너지는 누구인가?
-- LEFT OUTER JOIN
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
    FROM emp e, mgr m
    WHERE e.mgr = m.empno(+)
    ORDER BY 1;
    
-- 나의 매너지는 누구인가?    
-- RIGHT OUTER JOIN    
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
    FROM emp e, mgr m
    WHERE m.empno(+) = e.mgr
    ORDER BY 1;    
    
-- 나의 매니저는 누구인가?
-- 표준(SQL-99)    
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
    FROM mgr m RIGHT OUTER JOIN emp e ON(e.mgr = m.empno)
    ORDER BY 1;

--------------------------------------------------------------------------------
-- 나는 누구의 매니저인가?
-- 결과 필드가 NULL이면 나는 누구의 매니저도 아니다.
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
--    FROM emp e, mgr m
    FROM emp e, emp m
    WHERE e.mgr(+) = m.empno
    ORDER BY 1;    
    
-- 나는 누구의 매니저인가?
-- 표준(SQL-99)    
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
--    FROM emp e RIGHT OUTER JOIN emp m ON(e.mgr = m.empno)
    FROM emp e RIGHT OUTER JOIN emp m ON(m.empno = e.mgr)
    ORDER BY 1;