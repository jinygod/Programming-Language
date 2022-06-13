-- 제약조건 검색
-- 외래키(FOREIGN KEY)가 걸려 있으면 부모 테이블이 먼저 생성되어야 한다.
-- 테이블 생성 순서: DEPTX(부모) -> EMPX(자식)
-- 테이블 삭제 순서: EMPX(자식) -> DEPTX(부모)
-- 데이터 입력 순서: DEPTX(부모) -> EMPX(자식)
-- 데이터 삭제 순서: EMPX(자식) -> DEPTX(부모)

DESC USER_CONSTRAINTS;
SELECT * FROM user_constraints;
SELECT * FROM user_constraints WHERE owner = 'SCOTT';
SELECT * FROM user_constraints WHERE table_name = 'EMPX';
SELECT * FROM user_constraints WHERE table_name = 'DEPTX';

DESC DEPTX;
-- 부모 테이블을 먼저 삭제할 수 없다.
-- 참조하고 있는 자식 테이블을 먼제 삭제한 후 부모를 삭제해야 한다.
-- ORA-02449: unique/primary keys in table referenced by foreign keys
DROP TABLE DEPTX;

-- DEPT : 부서정보
CREATE TABLE DEPTX
(	
    DEPTNO NUMBER(2,0),     -- 부서코드
	DNAME VARCHAR2(14),     -- 부서이름
	LOC VARCHAR2(13),       -- 부서위치
    CONSTRAINT PK_DEPTX PRIMARY KEY (DEPTNO) -- 제약조건: 메인인덱스
);     
     
-- EMP : 사원정보     
DROP TABLE EMPX;

-- 외래키 : 부모키(DEPTX.DEPTNO)
-- 테이블 생성 조건: 부모 테이블(DEPTX)이 먼저 생성되어 있어야 한다.
CREATE TABLE EMPX
(	
    EMPNO NUMBER(4,0),          -- 사번
	ENAME VARCHAR2(10),         -- 이름
	JOB VARCHAR2(9),            -- 직무
	MGR NUMBER(4,0),            -- 매니저코드
	HIREDATE DATE,              -- 입사일자
	SAL NUMBER(7,2),            -- 급여
	COMM NUMBER(7,2),           -- 수당
	DEPTNO NUMBER(2,0),         -- 부서코드
    CONSTRAINT PK_EMPX PRIMARY KEY (EMPNO),   -- 제약조건: 메인인덱스
    CONSTRAINT FK_DEPTNOX FOREIGN KEY (DEPTNO) REFERENCES DEPTX (DEPTNO) -- 제약조건: 외래키
);    

INSERT INTO deptx VALUES (10, 'PLANNING', 'SEONGNAM');
INSERT INTO empx VALUES (1000, 'ABC', 'ANALYST', null, sysdate, 5000, 100, 10);

SELECT e.*, d.* 
    FROM empx e, deptx d
    WHERE e.deptno = d.deptno;
    
DELETE FROM empx WHERE deptno = 10;    
DELETE FROM deptx WHERE deptno = 10;    