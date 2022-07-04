-- [CHAPTER 05] 그룹함수
-- 다중행 함수
-- 여러 데이터가 그룹핑 되어 하나의 행으로 결과가 나오는 함수
-- SUM, AVG, COUNT, MAX, MIN

-- 사원의 급여
SELECT sal FROM emp;

-- 사원의 급여 총액
SELECT sum(sal) FROM emp;

-- 단일과 함수 그룹함수는 함께 사용할 수 없다.
SELECT sal, sum(sal) FROM emp;
SELECT  sum(sal),sal FROM emp;

-- 전체 사원수
SELECT count(*) FROM emp;

-- 평균 급여액
SELECT avg(sal) FROM emp;
SELECT avg(*) FROM emp;


-- 최대 급여액
SELECT max(sal) FROM emp;

-- 최소 급여액
SELECT min(sal) FROM emp;

-- 그룹함수 여러개를 쓸 수 있다.
SELECT count(*), sum(sal), min(sal), max(sal), avg(sal) FROM emp;

-- 입사일자, 최근입사일, 가장 오래된 입사일
SELECT max(hiredate),   -- 가장 최근 입사자의 입사일
    min(hiredate)               -- 가장 오래된 입사자 입사일
    FROM emp;
    
-- NULL은 그룹함수 대상에서 제외
SELECT count(*),   --전체 행의 갯수
    count(comm)        -- 칼럼(comm)에서 값이 있는 행의 갯수
    FROM emp;
    
SELECT sal FROM emp ORDER BY sal;

-- 중복제거 : DISTINCT 
-- count(DISTINCT 컬럼) : 동일한 데이터는 1개만 갯수에 포함
SELECT count(sal),          -- 급여를 받는 사원의 총 수 
    count(DISTINCT sal)     -- 급여를 받는 사원의 총 수(동일 급여를 받는 사원의 중복을 제거)
    FROM emp;
    
-- 직업의 종류의 갯수
SELECT empno, job FROM emp;
SELECT count(job), count(distinct job) FROM emp;