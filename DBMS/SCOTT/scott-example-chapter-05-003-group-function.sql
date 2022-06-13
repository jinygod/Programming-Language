-- HAVING
-- GROUP BY의 결과를 제한한다.
-- GROUP BY에서 나온 결과에서 다시 한 번 필터링
-- HAVING은 GROUP BY 다음에 기술
-- 그룹핑 된 결과를 제한

-- 동일한 연도에 입사한 사원의 수
SELECT to_char(hiredate, 'YYYY'),       -- 입사연도
    count(hiredate)                     -- 사원들의 수
    FROM emp
    GROUP BY to_char(hiredate, 'YYYY')
    ORDER BY 1;
    
-- 동일한 연도에 입사한 사원의 수
-- 사원의 수가 10 이상인 경우만 선택
SELECT to_char(hiredate, 'YYYY'),       -- 입사연도
    count(hiredate)                     -- 사원들의 수
    FROM emp
    GROUP BY to_char(hiredate, 'YYYY')
    HAVING count(hiredate) >= 10        -- 사원의 수가 10보다 크거나 같은 경우
    ORDER BY 1;    
    
-- 부서별 급여 총액이 3000 이상인 부서의 번호와 부서별 급여 총액 구하기
SELECT deptno,
    max(sal)
    FROM emp
    GROUP BY deptno
    HAVING max(sal) >= 3000
    ORDER BY deptno;
    
-- 부서코드가 30인 부서를 제외하고    
-- 부서별 평균급여액이 2500미만인 부서
-- 1단계: 30번 부서를 제외
-- 2단계: 부서별로 평균 급여액을 집계
-- 3단계: 평균 급여액이 2500미만인 부서만 선택
-- 4단계: 부서번호를 기준으로 오른차순 정렬(sort)
SELECT deptno,
    avg(sal)
    FROM emp
    WHERE deptno <> 30      -- 1단계: 30번 부서를 제외
    GROUP BY deptno         -- 2단계: 부서별로 평균 급여액을 집계
    HAVING avg(sal) < 2500  -- 3단계: 평균 급여액이 2500 미만인 부서만 선택
    ORDER BY deptno;        -- 4단계: 부서번호를 기준으로 오른차순 정렬(sort)
    
-- 집계된 데이터를 기준으로 정렬
-- 직급(job)이 MANAGER를 제외하고 
-- 총 급여액이 5000 이상인 직급별(JOB) 급여 총액
SELECT job, count(*), sum(sal)
    FROM emp
    WHERE job not like '%MANAGER%'
    GROUP BY job
    HAVING sum(sal) >= 5000
    ORDER BY sum(sal);
    
SELECT job, 
    count(*) as jobcnt, 
    sum(sal) as jobsum
    FROM emp
    WHERE job not like '%MANAGER%'
    GROUP BY job
    HAVING sum(sal) >= 5000
    ORDER BY jobsum;
    
SELECT job, 
    count(*),
    sum(sal)
    FROM emp
    WHERE job not like '%MANAGER%'
    GROUP BY job
    HAVING sum(sal) >= 5000
    ORDER BY 3;     -- 3번째 컬럼: sum(sal)
    