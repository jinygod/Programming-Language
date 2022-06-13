-- 형 변환 함수
-- TO_CHAR   : 문자형으로 변환
-- TO_DATE   : 날짜형으로 변환
-- TO_NUMBER : 숫자형으로 변환

-- TO_CHAR(컬럼, 포맷)
-- 날짜를 문자로 변환
SELECT ename, hiredate,
    to_char(hiredate, 'YYYY'),  -- 입사연도
    to_char(hiredate, 'MM'),    -- 입사월
    to_char(hiredate, 'DD'),    -- 입사일
    to_char(hiredate, 'DAY')    -- 입사요일
    FROM emp;
    
SELECT ename, hiredate,
    to_char(hiredate, 'MM'),    -- 월(숫자로만)
    to_char(hiredate, 'MON'),   -- 월(?월)
    to_char(hiredate, 'DAY'),   -- 요일(?요일)
    to_char(hiredate, 'DY')     -- 요일(수)
    FROM emp;
    
    
-- 시, 분, 초
-- AM, PM, A.M, P.M : 오전/오후 표시
SELECT to_char(sysdate, 'HH:MI:SS AM') FROM dual;
SELECT to_char(sysdate, 'HH:MI:SS PM') FROM dual;   -- 12시 단위로 표시
SELECT to_char(sysdate, 'HH24:MI:SS') FROM dual;    -- 24시 단위로 표시

