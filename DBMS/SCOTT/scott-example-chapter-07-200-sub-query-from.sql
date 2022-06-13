-- 서브쿼리
-- FROM 절에 사용하는 서브쿼리
-- 인라인 뷰(INLINE VIEW)
-- 테이블 전체가 아니라 SELECT 문을 통해서 일부 데이터를 추출해서 사용

-- 부서가 10인 사원의 정보
SELECT e.empno, e.ename, d.deptno, d.dname
    FROM emp e, dept d
    WHERE e.deptno = d.deptno
    AND e.deptno = 10;
    
-- FROM절에 쿼리의 결과를 테이블처럼 사용    
-- 검색하고자 하는 조건을 필터링하고 칼럼도 사용하는 칼럼만 선택
SELECT e.empno, e.ename, d.deptno, d.dname
    FROM (SELECT empno, ename, deptno FROM emp WHERE deptno = 10) e, dept d
    WHERE e.deptno = d.deptno;

-- 카티시안 프로덕션, 크로스 조인, 교차조인
-- 메인 쿼리의 WHERE 조건이 필요없다.
-- e(3개의 행) * d(1개의 행) -> 3개의 행
-- FROM절의 한 쪽 쿼리 결과가 1개의 행일 때는 문제가 없다.
SELECT e.empno, e.ename, e.deptno, d.dname
    FROM (SELECT empno, ename, deptno FROM emp WHERE deptno = 10) e,
        (SELECT dname FROM dept WHERE deptno = 10) d;
    
-- 주의: 교차조인으로 인해서 FROM 절의 행의 결과가 2개 이상이면
-- 데이터가 중복해서 추출되므로 메인쿼리에서 한 번더 조인을 해야한다.
SELECT e.empno, e.ename, e.deptno, d.deptno, d.dname
    FROM (SELECT empno, ename, deptno FROM emp WHERE deptno IN(10,50)) e,
        (SELECT deptno, dname FROM dept WHERE deptno IN(10,50)) d
    WHERE e.deptno = d.deptno;          
    