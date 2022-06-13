-- 논리연산자
-- AND : 두 가지 조건이 모두 만족
-- OR  : 두 가지 조건 중 하나만 만족
-- NOT : 조건에 만족하지 않는 것

-- NOT : 부정
SELECT employee_id, department_id, last_name FROM employees WHERE department_id != 20;
SELECT employee_id, department_id, last_name FROM employees WHERE NOT department_id = 20;

-- AND
-- 급여(salary)가 5000보다 크고 10000보다 작은 사원 목록
SELECT * FROM employees WHERE salary > 5000 AND salary < 10000;

-- BETWEEN : 사이, 범위
-- 컬럼 BETWEEN 시작값 AND 마지막값
-- 급여(salary)가 5000보다 크거나 같고 10000보다 작거나 같은 사원 목록
SELECT * FROM employees WHERE salary >= 5000 AND salary <= 10000 ORDER BY salary DESC;
SELECT * FROM employees WHERE salary BETWEEN 5000 AND 10000 ORDER BY salary DESC;

-- OR
-- 급여(salary)가 5000보다 작거나 같고 10000보다 크거나 같은 사원 목록
SELECT * FROM employees WHERE salary <= 5000 OR salary >= 10000;

-- AND, NOT
-- 급여(salary)가 5000보다 작거나 같고 10000보다 크거나 같은 사원 목록
SELECT * FROM employees WHERE NOT (salary > 5000 AND salary < 10000);

-- 급여(salary)가 5000보다 작고 10000보다 큰 사원 목록
-- 컬럼 NOT BETWEEN a AND b
SELECT * FROM employees WHERE NOT (salary >= 5000 AND salary <= 10000) ORDER BY salary DESC;
SELECT * FROM employees WHERE salary NOT BETWEEN 5000 AND 10000 ORDER BY salary DESC;

-- IN : 특정한 값을 포함
-- 컬럼 IN (값1, 값2, 값3)
-- 급여(salary)를 6000, 7000, 8000, 9000, 10000 사원 목록
SELECT * FROM employees 
    WHERE salary = 6000 
    OR salary = 7000
    OR salary = 8000
    OR salary = 9000
    OR salary = 10000;

SELECT * FROM employees WHERE salary IN (6000, 7000, 8000, 9000, 10000);

-- 컬럼 NOT IN(값1, 값2, ...)
-- 해당 컬럼에서 IN에 나열된 값을 포함하지 않은 행(목록)을 선택
SELECT * FROM employees WHERE salary NOT IN (6000, 7000, 8000, 9000, 10000) ORDER BY salary;
