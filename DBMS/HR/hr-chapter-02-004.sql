-- NULL

-- null은 같다(=)로 비교를 할 수 없다.
-- null은 값이 없기 때문에 같다(=) 검색하면 결과가 나오지 않는다.
SELECT * FROM employees WHERE commission_pct = null;
SELECT * FROM employees WHERE commission_pct = NULL;
SELECT * FROM employees WHERE commission_pct != NULL;
SELECT * FROM employees WHERE commission_pct <> NULL;
SELECT * FROM employees WHERE commission_pct ^= NULL;

-- IS NULL
-- 값이 없는 경우
SELECT * FROM employees WHERE commission_pct IS NULL;

-- IS NOT NULL
-- 값이 없는 경우를 제외한 목록 검색
SELECT * FROM employees WHERE commission_pct IS NOT NULL;

-- 월수당 : salary * commission_pct
-- 연수당 : salary * commission_pct * 12
-- 총연봉 : salary * 12 + (salary * commission_pct * 12)

-- 수당이 NULL이면 연수당, 총연봉을 계산하지 않음
SELECT salary, commission_pct, 
    salary * commission_pct * 12 as "연수당",
    salary * 12 + (salary * commission_pct * 12) as "총연봉"
FROM employees;

-- 수당이 NULL이 아닌 사원 목록
-- 수당이 있는 사원만 계산
SELECT salary, commission_pct, 
    salary * commission_pct * 12 as "연수당",
    salary * 12 + (salary * commission_pct * 12) as "총연봉"
FROM employees
WHERE commission_pct IS NOT NULL;   -- 전체 검색 조건에서 제외

-- 모든 사원의 연봉과 수당을 포함한 총연봉을 계산
-- 수당(commission_pct) 컬럼이 널인 경우 ZERO으로 처리
-- NVL(컬럼, 값) : 대상 컬럼이 널인 경우 지정된 값으로 대체 처리
SELECT salary, commission_pct, 
    salary * nvl(commission_pct, 0) * 12 as "연수당",
    salary * 12 + (salary * nvl(commission_pct, 0) * 12) as "총연봉"
FROM employees;

-- 기존의 검색 결과로 새로운 테이블 생성
CREATE TABLE employee 
AS
SELECT employee_id as eno, 
    first_name || ', ' || last_name as ename,
    salary, nvl(commission_pct, 0) as commission,
    salary * nvl(commission_pct, 0) * 12 as commission_year,
    salary * 12 + (salary * nvl(commission_pct, 0) * 12) as totsalary
FROM employees;

DROP TABLE employee;

DESC employee;
SELECT * FROM employee;

-- employees와 동일한 형태의 임시 테이블 생성
CREATE TABLE emp AS SELECT * FROM employees;
