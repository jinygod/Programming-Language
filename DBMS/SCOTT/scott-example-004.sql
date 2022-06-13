-- 날짜함수

-- 오늘날짜
SELECT sysdate FROM dual;

-- 어제날짜
SELECT sysdate - 1 FROM dual;

-- 내일날짜
SELECT sysdate + 1 FROM dual;

-- ROUND(date, format)
-- 날짜 반올림

-- 근무일수 : 오늘날짜 - 입사일자
SELECT sysdate-hiredate, round(sysdate-hiredate), trunc(sysdate - hiredate) FROM emp;

-- MONTHS_BETWEEN(date1, date2)
-- date1 > date2 : 양수, 나중일자 > 과거일자
-- date2 > date1 : 음수, 과거일자 > 나중일자
-- 날짜와 날짜 사이의 개월 수를 구함
-- 근무 일수, 근무 개월수
SELECT trunc(sysdate - hiredate) "근무일수", 
    trunc((sysdate - hiredate) / 30.5) "근무개월수(약)",
    trunc(months_between(sysdate, hiredate)) 근무개월수
FROM emp;

-- ADD_MONTHS(date, n)
-- date + n(달수)
-- 현재날짜에서 6개월 후의 날짜
SELECT sysdate, add_months(sysdate, 6) FROM dual;
SELECT sysdate, add_months(sysdate, 1) FROM dual; -- 한 달 뒤
SELECT sysdate, add_months(sysdate, -1) FROM dual; -- 한 달 전

-- 입사 몇 년차 사원
-- 입사 40년 이상인 사원 목록
SELECT * FROM emp;
SELECT empno, ename, hiredate, add_months(hiredate, 40 * 12) 
    FROM emp
    WHERE add_months(hiredate, 40 * 12) <= sysdate;

-- NEXT_DAY(date, '요일')
-- 해당 날짜를 기준으로 최초로 도래하는 요일에 해당하는 날짜
-- 돌아오는 '월요일'의 날짜는?
-- 요일(숫자): 일요일(1) ~ 토요일(7)
SELECT next_day(sysdate, '월요일') FROM dual;
SELECT next_day(sysdate, 2) FROM dual;      
SELECT next_day(sysdate, 2), next_day(sysdate, '월요일') FROM dual;


-- LAST_DAY(date)
-- 해당 날짜가 속하는 달의 마지막 날짜
SELECT last_day(sysdate) "금월의 마지막 날짜" FROM dual;
SELECT last_day('2022/02/01') FROM dual;

--------------------------------------------------------------------------------
-- [문제]
--------------------------------------------------------------------------------
-- 이 달의 남은 일수


-- 올해의 남은 일수


-- 올해의 남은 개월 수

