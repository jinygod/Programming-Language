-- 데이터 그룹(GROUP BY)
-- 기준이 되는 컬럼을 지정하여 컬럼별로 집계

-- 그룹함수와 단순 칼럼을 함께 쓸 수 없다.
SELECT ename, max(sal) FROM emp;

--전체 급여 평균
SELECT avg(sal) FROM emp;

-- 같은 부서코드끼리 묶어서 평균 급여를 계산
SELECT deptno,                  -- 부서코드 
    trunc(avg(sal), 2)            --평균급여
    FROM emp                    -- 사원 테이블
    GROUP BY deptno         -- 부서별로 그룹핑
    ORDER BY deptno;        -- 부서별로 정렬
    
    
-- 같은 부서코드끼리 묶어서 평균 급여를 계산
-- 각 부서의 사원 수
SELECT deptno,                  -- 부서코드
    count(sal),                     -- 사원수
    trunc(avg(sal), 2)            --평균급여
    FROM emp                    -- 사원 테이블
    GROUP BY deptno         -- 부서별로 그룹핑
    ORDER BY deptno;        -- 부서별로 정렬
    
-- 각 부서별 급여 총액
SELECT deptno,                  -- 부서코드
    count(sal),                     -- 사원수
    min(sal),                          --최소급여
    max(sal),
    sum(sal)                        -- 급여총액
    FROM emp                    -- 사원 테이블
    GROUP BY deptno         -- 부서별로 그룹핑
    ORDER BY deptno;        -- 부서별로 정렬
    
-- 여러 컬럼을 그룹핑하여 집계를 할 수 있다.
-- 부서코드, 직업코드 별로 집계(사원수, 총 급여)
SELECT deptno, job,
    count(*), sum(sal)
    FROM emp
    GROUP BY deptno, job
    ORDER BY 1, 2;          -- SELECT에 나열된 컬럼의 순번으로 정렬: 첫 번째, 두 번째 컬럼
    
-- 입사일 기준 그룹
-- 입사일자가 같은 사원들의 수 
SELECT hiredate,        -- 입사연도
    count(hiredate)        -- 사원들의 수
    FROM emp
    GROUP BY hiredate
    ORDER BY 1;
    
-- 동일한 연도에 입사한 사원의 수
SELECT to_char(hiredate,'YYYY'),        -- 입사연도
    count(hiredate)        -- 사원들의 수
    FROM emp
    GROUP BY to_char(hiredate, 'YYYY')
    ORDER BY 1;
    