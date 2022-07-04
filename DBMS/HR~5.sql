-- LIKE 연산자와 와일드 카드
-- 컬럼명 LIKE 'pattern'

-- 이름이 A로 시작하는 사원
-- 패턴: 'A%'
SELECT * FROM employees WHERE first_name LIKE 'A%';

-- 이름이 소문자('l')을 포함된 사원, 해당 문자를 포함
SELECT * FROM employees WHERE first_name LIKE '%l%';

-- 이름이 소문자('l')로 끝나는 사원
SELECT * FROM employees WHERE first_name LIKE '%l';

-- 와일드 카드
-- 이름이 s로 시작하고 두 번째 문자는 어떤 문자든 관계없으며 3번째는 e인 사원
SELECT * FROM employees WHERE first_name LIKE 'S_e%';
