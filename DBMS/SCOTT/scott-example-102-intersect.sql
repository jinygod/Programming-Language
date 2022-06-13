-- 집합 연산자
-- 교집합(INTERSECT)
-- 동일한 데이터만 선택
-- 같은 데이터는 하나만 선택
-- 중복을 제거하는 효과
-- 한 쪽 테이블에만 있으면 선택되지 않음

SELECT * FROM emp;
SELECT job, sal FROM emp ORDER BY 1,2;

-- 사원의 직업군
SELECT job FROM emp
INTERSECT
SELECT job FROM emp;

-- 사원의 급여 목록
SELECT sal FROM emp
INTERSECT 
SELECT sal FROM emp;

-- 사원의 급여 목록에서 관련된 사원 수
SELECT sal, count(sal) FROM emp GROUP BY sal ORDER BY 1;


-- 사원의 급여 목록
-- 양 쪽 테이블에 급여가 같은 데이터가 없으므로 선택된 데이터가 없다.
SELECT sal FROM emp WHERE deptno = 10   -- 1300, 2450, 5000
INTERSECT 
SELECT sal FROM emp WHERE deptno = 20;   -- 800, 2975, 3000

