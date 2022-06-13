-- [CHAPTER 02] 데이터 조회하기

-- 급여(SALARY)가 1500 이상인 사원 출력하기
SELECT * FROM employees WHERE salary >= 1500;

-- 급여가 큰 순서에서 작은 순서로 정렬(내림차순)
SELECT * FROM employees WHERE salary >= 1500 ORDER BY salary DESC;

-- 부서(department_id)가 10인 소속 사원 정보
-- 같다 : =
SELECT * FROM employees WHERE department_id = 10;

-- 부서(department_id)가 10이 아닌 소속 사원 정보
-- 같지않다 : !=, <>, ^=
SELECT employee_id, department_id, last_name FROM employees WHERE department_id != 10;
SELECT employee_id, department_id, last_name FROM employees WHERE department_id <> 10;
SELECT employee_id, department_id, last_name FROM employees WHERE department_id ^= 10;

-- 사원이 성이 'Lee'인 사람
-- 컬럼의 타입(자료형)에 맞춰서 비교되는 값도 지정을 해야 한다.
-- 문자열은 싱글 따옴표(')로 감싼다.
SELECT * FROM employees WHERE last_name = 'Lee';

-- 입사일(hire_date)이  '2007/02/01' 이전인 사원
SELECT * FROM employees ORDER BY hire_date;
SELECT * FROM employees WHERE hire_date < '2007/02/01' ORDER BY hire_date DESC;



