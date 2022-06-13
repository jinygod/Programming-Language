-- 테이블 구조 변경: ALTER TABLE
-- ADD: 칼럼 추가
-- RENAME: 칼럼 이름 변경
-- MODIFY: 칼럼 자료형 변경
-- DROP: 칼럼 삭제
--------------------------------------------------------------------------------

-- 테이블 생성
DESC deptX;
DROP TABLE deptX;

-- 테이블 이름: DEPTX
-- 메임 인덱스: PK_DEPTX(DEPTNO)
CREATE TABLE DEPTX (
    DEPTNO  NUMBER(2) CONSTRAINT PK_DEPTX PRIMARY KEY,
    DNAME   VARCHAR2(15),
    LOC     VARCHAR2(13)
);

DROP TABLE DEPTX;
CREATE TABLE DEPTX AS SELECT * FROM dept;
DESC DEPTX;
SELECT * FROM deptx;

-- 칼럼 추가(ADD)
-- 기존의 테이블에 자료이 있어서 기존의 자료를 유지할 필요가 있을 때
-- 테이블의 구조 변경
ALTER TABLE deptx ADD loc2 VARCHAR2(50);

-- 칼럼 이름 변경(RENAME)
ALTER TABLE deptx RENAME COLUMN loc TO addr;
ALTER TABLE deptx RENAME COLUMN addr TO loc;    -- 원상복귀

-- 칼럼 자료형 변경(MODIFY)
UPDATE deptx SET loc2 = loc || ', KOREA';
SELECT * FROM deptx;

-- loc2 VARCHAR2(50) -> VARCHAR2(10)
-- ORA-01441: cannot decrease column length because some value is too big
-- 기존에 저장된 데이터보다 변경할 자료형의 길이 작으면 오류
SELECT max(lengthb(loc2)) FROM deptx;   -- 최대 15바이트
ALTER TABLE deptx MODIFY loc2 VARCHAR2(15);
DESC deptx;

-- 칼럼 삭제
ALTER TABLE deptx DROP COLUMN loc2;

-- 칼럼 감추기(UNUSED)
-- DROP COLUMN과 같으며 데이터도 사라진다.
-- 다시 사용하기 위해서는 ADD를 해야하면 데이터는 복구 되지 않다.
ALTER TABLE deptx ADD addr VARCHAR2(50);    -- 칼럼 추가
ALTER TABLE deptx SET UNUSED(addr);         -- 사용하지 않음
ALTER TABLE deptx DROP COLUMN addr;         -- ORA-00904: "ADDR": invalid identifier
ALTER TABLE deptx MODIFY addr VARCHAR2(30); -- ORA-00904: "ADDR": invalid identifier
ALTER TABLE deptx ADD addr VARCHAR2(50);    -- 다시 사용

DESC deptx;
SELECT * FROM deptx;

UPDATE deptx SET addr = loc || ', KOREA';
