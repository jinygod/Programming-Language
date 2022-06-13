
-- HR 계정의 테이블 목록 확인
SELECT * FROM tab;

-- 테이블(jobs) 정보
DESC jobs;

-- 전체 사원 정보
SELECT * FROM employees;

-- 상원 테이블에서 컬럼(사원번호, 사원이름)을 선택하여 
-- 사원번호 오름차순으로 출력
SELECT employee_id, first_name, last_name   -- 컬럼명
    FROM employees                          -- 테이블명
    ORDER BY employee_id;                   -- 정렬방법(오름차순)

-- 사원번호 내림차순으로 출력
SELECT employee_id, first_name, last_name   -- 컬럼명
    FROM employees                          -- 테이블명
    ORDER BY employee_id DESC;              -- 정렬방법(내림차순)

-- 연봉 구하기
SELECT first_name || ' ' || last_name as "이름",
    salary as "급여",
    (salary * 12 * commission_pct) as "수당",
    salary * 12 as "연봉",
    salary * 12 + (salary * 12 * commission_pct) as "충연봉"
    FROM employees;

-- 연봉 구하기: 널(null) 처리
-- nvl(column, value) : 컬럼이 널이면 지정된 값을 적용
SELECT first_name || ' ' || last_name as "이름",
    salary as "급여",
    (salary * 12 * commission_pct) as "수당",
    salary * 12 as "연봉",
    salary * 12 + (salary * 12 * nvl(commission_pct, 0)) as "총연봉"
    FROM employees          -- 테이블명
    WHERE salary < 10000;   -- 조건식

