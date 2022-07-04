-- CHAPTER 06 테이블 조인(JOIN)

-- 부서 : 5개 (10, 20, 30, 40, 50)
SELECT * FROM dept;

-- 사원 : 13명
SELECT * FROM emp;



-- 1. 부서코드(50)을 먼저 등록
-- 2. 부서코드(50)을 가진 사원정보를 등록
DESC dept;
INSERT INTO dept VALUES(50, 'PLANNING','SEOUL KOREA');
INSERT INTO emp VALUES (8100, 'DAVID', 'ANALYST', 7839, '1991/10/01', 4000, 400, 50);
COMMIT;

-- 카다시안 곱(Cartesian Product)
-- 조건없이 조인을 하면 조인되는 테이블의 행의 갯수의 곱
-- 부서와 사원 조인 : 5 * 13 = 65
SELECT count(*) FROM dept, emp;
SELECT * FROM dept, emp;

UPDATE dept
    SET loc = 'SEONGNAM'
    WHERE deptno = 50;
COMMIT;
    
-- [EQUI JOIN]
-- EQUAL JOIN : 등가조인, 동등조인, 내부조인, 단순조인
SELECT * 
    FROM emp, dept
    WHERE emp.deptno = dept.deptno;
    
-- 조인되는 테이블에 별칭을 부여
SELECT e.empno, e.ename, e.job, e.deptno, d.deptno, d.dname, d.loc
    FROM emp e, dept d
    WHERE e.deptno = d.deptno;
    
-- [문제]
-- 급여(sal)가 3000미만이면서 수당(comm)이 없는 사원
-- 사원정보(emp), 부서정보(dept)
-- 정렬(사번)

SELECT e.empno, e.ename, e.job, e.sal, e.comm, d.deptno, d.dname, d.loc
    FROM emp e,dept d
    WHERE e.sal < 3000          -- 급여(sal)가 3000미만
    AND (e.comm is null OR e.comm = 0)      -- 수당이 없음
    AND e.deptno = d.deptno         -- 부서정보(조인)
    ORDER BY e.empno;               -- 정렬(사번)

