-- 전체 외부 조인: FULL OUTER JOIN
-- 표준(SQL-99)    

-- 나의 매너지는? : 매너지를 가지고 있지 않은 사원
-- 나는 누구의 매너지인가? : 사원을 가지고 있지 않은 매니저
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
    FROM emp e FULL OUTER JOIN emp m ON(e.mgr = m.empno) 
    ORDER BY 1;

-- 위의 SQL과 결과가 동일
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
    FROM emp m FULL OUTER JOIN emp e ON(e.mgr = m.empno) 
    ORDER BY 1;

-- ORACLE
-- ORA-01468: a predicate may reference only one outer-joined table
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
    -- FROM emp e, emp m
    FROM emp e, mgr m
    WHERE e.mgr(+) = m.empno(+) -- Oracle에서 지원하지 않음
    ORDER BY 1;

--------------------------------------------------------------------------------
-- 오라클 방식으로 FULL OUTER JOIN?
-- 13개 행
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
    FROM emp e, mgr m
    WHERE e.mgr = m.empno(+) -- LEFT OUTER JOIN
    ORDER BY 1;

-- 20개 행
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
    FROM emp e, mgr m
    WHERE e.mgr(+) = m.empno -- RIGHT OUTER JOIN
    ORDER BY 1;

--------------------------------------------------------------------------------
-- UNION ALL : 집합연산자
-- 서로 다른 두 개의 쿼리를 하나로 결합
-- 컬럼의 갯수와 자료형이 일치
-- 데이터의 중복을 허용
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
    FROM emp e, mgr m
    WHERE e.mgr = m.empno(+) -- LEFT OUTER JOIN
-- UNION ALL    
UNION   -- 중복을 제거
SELECT e.empno  "사원", 
    e.ename     "사원이름", 
    e.mgr       "매니저코드",  
    m.empno     "매니저코드", 
    m.ename     "매니저이름"
    FROM emp e, mgr m
    WHERE e.mgr(+) = m.empno -- RIGHT OUTER JOIN
    ORDER BY 1;
