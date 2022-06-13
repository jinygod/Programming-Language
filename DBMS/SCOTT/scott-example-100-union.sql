-- 집합연산자
-- UNION(합집합)
-- 칼럼의 갯수와 자료형 일치
-- 충복되는 데이터는 하나만 선택
--------------------------------------------------------------------------------
-- UNION ALL(합집합)
-- UNION과 동일하지만 중복을 포함 모든 결과를 리턴

-- 부서(10)에 속한 사원
SELECT * FROM emp WHERE deptno = 10;

-- 부서(20)에 속한 사원
SELECT * FROM emp WHERE deptno = 20;

SELECT * FROM emp WHERE deptno IN(10,20) ORDER BY deptno;

-- UNION
SELECT * FROM emp WHERE deptno = 10 -- 부서(10)에 속한 사원
UNION
SELECT * FROM emp WHERE deptno = 20; -- 부서(20)에 속한 사원

SELECT * FROM emp WHERE deptno = 10 -- 부서(10)에 속한 사원
UNION
SELECT * FROM emp2 WHERE deptno = 20; -- 부서(20)에 속한 사원

-- UNION
SELECT deptno, dname, loc FROM dept;
SELECT decode(deptno, 10, 10 + 1, 
    20, 20 + 2, 
    30, 30 + 3, 
    40, 40 + 4, deptno) dno, dname, loc FROM dept;

SELECT deptno, dname, loc FROM dept
UNION
SELECT decode(deptno, 10, 10 + 1, 
    20, 20 + 2, 
    30, 30 + 3, 
    40, 40 + 4, deptno) dno, dname, loc FROM dept;

SELECT decode(deptno, 10, to_char(10 + 1, '99'),
    20, to_char(20 + 2, '99'),
    30, to_char(30 + 3, '99'),
    40, to_char(40 + 4, '99'), to_char(deptno, '99')) dno, dname, loc FROM dept;

-- 첫 번째 테이블의 deptno와 두 번째 테이블의 dno의 자료형이 일치해야 한다.
SELECT deptno, dname, loc FROM dept
UNION
SELECT to_number(decode(deptno, 10, to_char(10 + 1, '99'),
    20, to_char(20 + 2, '99'),
    30, to_char(30 + 3, '99'),
    40, to_char(40 + 4, '99'), to_char(deptno, '99')), '99') dno, dname, loc FROM dept;

--------------------------------------------------------------------------------
-- UNION ALL
SELECT * FROM emp WHERE deptno = 10 -- 부서(10)에 속한 사원
UNION ALL
SELECT * FROM emp WHERE deptno = 20 -- 부서(20)에 속한 사원
UNION ALL
SELECT * FROM emp WHERE deptno IN(10,20,30); -- 부서(10,20,30)에 속한 사원

-- A UNION B UNION ALL C
SELECT * FROM emp WHERE deptno = 10 -- 부서(10)에 속한 사원
UNION
SELECT * FROM emp WHERE deptno = 20 -- 부서(20)에 속한 사원
UNION ALL
SELECT * FROM emp WHERE deptno IN(10,20,30); -- 부서(10,20,30)에 속한 사원

-- 칼럼의 갯수가 일치 하지 않으면 에러
-- ORA-01789: query block has incorrect number of result columns
SELECT * FROM dept UNION ALL SELECT * FROM emp;

