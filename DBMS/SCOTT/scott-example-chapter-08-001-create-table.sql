-- CHAPTER 10 테이블 생성, 수정, 삭제
-- 테이블, 칼럼 이름 생성 규칙
--      1. 최대자릿수 : 30자
--      2. 영문자 : a-z, A-Z
--      3. 특수문자: _, $, #
--      4. 대소문자 구별 없음
--      5. 키워드, 동일한 객체는 사용할 수 없다.


-- 테이블 생성
DESC dept2;

-- 테이블 이름: DEPT2
-- 메임 인덱스: PK_DEPT2(DEPTNO)
CREATE TABLE DEPT2 (
    DEPTNO  NUMBER(2) CONSTRAINT PK_DEPT2 PRIMARY KEY,
    DNAME   VARCHAR2(15),
    LOC     VARCHAR2(13)
);

-- 기존 테이블을 이용해서 새로운 테이블 생성: 인덱스는 생성되지 않음
-- 기본의 부서 테이블의 부서코드(10, 20, 30) 자료만 검색하여
-- 새로운 테이블 DEPT3로 생성
CREATE TABLE DEPT3
    AS SELECT * FROM DEPT WHERE DEPTNO IN (10, 20, 30);
    
DESC DEPT3;    
SELECT * FROM DEPT3;
-- 인덱스는 생성되지 않아 중복 데이터가 등록 됨
INSERT INTO DEPT3 VALUES(10, '기획부', '대한민국');

-- 기존 테이블을 이용해서 새로운 테이블 생성할 때 구조만 복제
CREATE TABLE DEPT4
    AS SELECT * FROM DEPT WHERE 0=1;    
DESC DEPT4;    
SELECT * FROM DEPT4;
DROP TABLE DEPT4;   -- 테이블 삭제

-- 조건이 만족하지 않음으로 빈 데이터가 검색되어 구조만 만들어 지는 효과
CREATE TABLE DEPT5
    AS SELECT * FROM DEPT WHERE 1 != 1;
DESC DEPT5;
SELECT * FROM DEPT5;
DROP TABLE DEPT5;

-- TRUNCATE : 테이블의 테이터만 삭제
-- 롤백이 되지 않음
-- 롤백을 위한 백업을 하지 않기 때문에 처리 속도가 빠르다.
-- 테이블에 생성된 제약 조건과 인덱스, 뷰, 동의어는 유지
SELECT * FROM DEPT3;
TRUNCATE TABLE DEPT3;   -- 복구가 되지 않음
DESC DEPT3;
ROLLBACK;   -- 이전 작업을 복구

-- DELETE : 테이블의 데이터만 삭제
-- 롤백이 되는 것이 TRUNCATE TABLE과 차이
CREATE TABLE DEPT6
    AS SELECT * FROM DEPT;
    
SELECT * FROM DEPT6;    
DELETE FROM DEPT6;
ROLLBACK;

-- RENAME : 테이블 이름을 변경
-- RENAME 기존테이블 TO 새로운테이블;
RENAME DEPT6 TO DEPTX;
DESC DEPT6; -- ORA-04043: DEPT6 객체가 존재하지 않습니다.
DESC DEPTX;


-- 빈 테이블 생성: empx
CREATE TABLE empx
    AS SELECT * FROM emp WHERE 1 <> 1;

SELECT count(*) FROM empx;  -- 결과 : 0

-- 서브 쿼리를 하여 입력
-- 전체 사원 중에서 급여등급이 4등급인 사원 데이터를 새로운 테이블에 입력
-- 서브 쿼리의 결과는 칼럼의 갯수와 자료형이 
-- INSERT되는 테이블과 일치해야 한다.
INSERT INTO empx
    SELECT e.*
        -- SQL 오류: ORA-00913: too many values
        -- , s.*
        FROM emp e, salgrade s
        WHERE e.sal BETWEEN s.losal AND s.hisal
        AND s.grade = 4;
    
SELECT * FROM empx;    

-- 서브 쿼리를 하여 자료를 입력할 때
-- 칼럼을 명시해서 칼럼의 갯수와 자료형을 맞출 수도 있다.
INSERT INTO empx (empno, ename, sal, deptno)
    SELECT e.empno, e.ename, e.sal, e.deptno
        FROM emp e, salgrade s
        WHERE e.sal BETWEEN s.losal AND s.hisal
        AND s.grade = 3;

-- 서브쿼리의 칼럼 갯수가 입력 되는 테이블의 갯수 보다 작으면 null로 처리할 수 있다.
INSERT INTO empx 
    SELECT e.empno, e.ename, null, null, null, e.sal, null, e.deptno
        FROM emp e, salgrade s
        WHERE e.sal BETWEEN s.losal AND s.hisal
        AND s.grade = 4;



