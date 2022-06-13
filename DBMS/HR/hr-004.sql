-- 테이블 생성

-- TABLE: HELLO2
DROP TABLE HELLO2;

-- DDL
-- 인덱스: 검색속도 향상, 중복데이터 제한
-- CONSTRAINT   : 제약조건 지정, 중복허용 하지 않음, 널도 허용하지 않음, 
--              : 오름차순으로 키가 생성(물리적으로 키를 생성한 방식)
--              : 반드시 오름차순으로만 검색이 가능한 것은 아니다.
--              : 검색은 오름차순, 내림차순으로 검색 가능
-- PK_HELLO2_ID : 제약조건 이름, 메인키, 사용자 지정
CREATE TABLE HELLO2
(
    ID NUMBER(5),
    NAME VARCHAR2(30),
    TEL VARCHAR2(15),
    AGE NUMBER(3),
    CONSTRAINT PK_HELLO2_ID PRIMARY KEY(ID) -- 제약조건(메인키 지정)
);

DESC HELLO2;


INSERT INTO hello2 (id, name, tel, age) VALUES (1234, '홍길동', '010-0007-7777', 31);
INSERT INTO hello2 (id, name, tel, age) VALUES (2468, '김민석', '010-0007-7777', 33);
INSERT INTO hello2 (id, name, tel, age) VALUES (5432, '홍석동', '010-3432-7656', 41);
COMMIT;
SELECT * FROM hello2;

-- 인덱스(색인) 생성
-- UNIQUE: 인덱스 키(TEL)의 값은 유일해야 한다.
-- ORA-01452: cannot CREATE UNIQUE INDEX; duplicate keys found
-- 인덱스 만들고자 하는 컬럼에 중복되는 데이터가 있으면 색인을 만들 수 없다.
-- 중복을 허용하도록 옵션(UNIQUE ) 빼던지 데이터를 정리
CREATE UNIQUE INDEX PK_HELLO2_TEL ON HELLO2 (TEL);

-- 인덱스 생성: 중복키 허용
CREATE INDEX PK_HELLO2_TEL ON HELLO2 (TEL);

-- 인덱스 생성: 여러 컬럼을 조합
CREATE INDEX PK_HELLO2_NAME_AGE ON HELLO2(NAME, AGE);

SELECT * FROM hello2;

-- 인덱스를 생성할 때 지정된 컬럼이 WHERE의 컬럼에 명시되면
-- DBMS가 알아서 사용함
SELECT * FROM hello2 WHERE name = '홍길동';

-- 이름이 '홍'으로 시작하면서 나이가 30세가 이상인 사람
SELECT * FROM hello2 WHERE name LIKE '홍%' AND age >= 30;

-- DBA
SELECT * FROM USER_INDEXES WHERE index_name LIKE 'PK_HELLO2%';

-- 인덱스 삭제
DROP INDEX PK_HELLO2_TEL;

