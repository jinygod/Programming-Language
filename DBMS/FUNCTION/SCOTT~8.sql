-- 일반함수
-- NVL
-- NVL2
-- NULLIF
-- COALESCE
-- DECODE
-- CASE

-- NVL(컬럼, 값)
-- 컬럼 값이 널이면 지정된 값으로 처리
-- 널처리를 하지 않으면 총급여가 null로 나옴
SELECT ename, sal, comm,
        sal * 12 + comm "총급여"
        FROM emp
        ORDER BY job;
        
-- 인센티브가(comm) 널인 경우 0으로 계산
SELECT ename, sal, comm,
        sal * 12 + nvl(comm, 0) "총급여"
        FROM emp
        ORDER BY job;
        
-- NVL2(컬럼, 값1, 값2)
-- NVL2(컬럼, null 아닌 경우 값1, null인 경우 값2)
-- 컬럼의 값이 널이 아니면 값1 반환
-- 컬럼의 값이 널면 값2 반환
SELECT ename, sal, comm,
        nvl2(comm,
        sal*12 + comm,     -- 널이 아니면
        sal*12)       -- 널이면
        FROM emp
        ORDER BY job;
        
-- NULLIF(expr1, expr2)
-- 조건이 만족하면 null을 리턴해라
-- 조건 : 주어진 두 개의 표현식의 결과 같으면?
-- XOR : A xor B, 같지 않으면 true
SELECT nullif('A','A'),   -- 같으면 null을 리턴
    nullif('A', 'B')                 -- 같지 않으면 첫 번째 표현식 리턴
    FROM dual;

-- comm이 null이면 null 리턴
SELECT sal, comm,
    nvl(nullif(sal, nvl2(comm,sal * comm, sal)), 0)
    FROM emp;

-- COALESCE(expr1, expr2, ....)
-- null이 아닌 표현식의 결과를 리턴
-- 여러 칼럼중에서 널이 아닌 값을 순서대로 찾을 때 유용
SELECT ename, sal, comm,
    coalesce(comm, sal, 0)
    FROM emp;


-- DECODE
-- IF, SWITCH~CASE 문과 유사
SELECT ename, deptno,
    decode(deptno,
    10, '회계부', 
    20, '연구부',
    30, '영업부',
    40, '운영부',
    '기타부서')
    FROM emp
    ORDER BY deptno;
    
SELECT ename, sal, job,
    decode(job, 
        'MANAGER', sal * 0.9,
        'SALESMAN', sal * 0.5,
        'ANALYST', sal* 0.3,
        sal * 0.2) "수당"
    FROM emp;
    
-- CASE
SELECT ename, sal, job,
    case job 
        WHEN 'MANAGER' THEN sal * 0.9
        WHEN 'SALESMAN' THEN sal * 0.5
        WHEN 'ANALYST' THEN sal* 0.3
        ELSE sal * 0.2
     END as "특별수당"
    FROM emp;
    
SELECT ename, sal, job, comm,
    case
        WHEN comm is null THEN sal * 1.9
        WHEN comm = 0 THEN sal * 1.8
        WHEN comm > 0 THEN sal + comm
        ELSE sal
     END as "특별수당"
    FROM emp;
    