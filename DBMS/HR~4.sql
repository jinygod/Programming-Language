-- 테이블 생성

-- TABLE: HELLO
-- 컬럼과 컬럼사이는 콤마(,)로 구분
-- 마지막 컬럼 다음에는 콤마(,)를 넣지 않음
-- 세미콜론은 명령어의 일부가 아니다.
-- 세미콜론(;) 명령어의 끝을 알리며, 명령어와 명령어를 구분하기 위한 용도

-- 테이블 삭제
-- 데이터와 테이블 객체가 모두 삭제
DROP TABLE HELLO2;

-- DDL
-- 인덱스: 검색속도 향상, 중복데이터 제한
-- CONSTRAINT : 제약조건 지정, 중복허용 하지 않음, 널도 허용하지 않음,
--                        오름차순으로 키가 생성(물리적으로 키를 생성한 방식)
--                        반드시 오름차순으로만 검색이 가능한 것은 아니다.
--                        검색은 오름차순, 내림차순으로 검색 가능
-- PK_HELLO2_ID : 제약조건 이름, 메인키, 사용자 지정



DESC HELLO;

CREATE TABLE HELLO2
(
   ID NUMBER(5),  -- 메인키
   NAME VARCHAR2(30),
   TEL VARCHAR2(15),
   AGE NUMBER(3),
   CONSTRAINT PK_HELLO2_ID PRIMARY KEY(ID)  -- 제약조건(메인키 지정)
);

DESC HELLO2;

-- 인덱스 생성
-- UNIQUE: 인덱스 키(TEL)의 값은 유일해야 한다.
CREATE UNIQUE INDEX PK_HELLO2_TEL ON HELLO2 (TEL); 

--인덱스 생성: 여러 컬럼을 조합
CREATE INDEX PK_HELLO2_NAME_AGE ON HELLO2(NAME, AGE);

--인덱스 삭제
DROP INDEX PK_HELLO2_TEL;


-- 입력: INSERT
--INSERT INTO hello (name, tel, age) VALUES (1234, '홍길동', '010-5028-9311', 31);
-- ID는 NOT NULL로 제약조건을 줬기 때문에 값을 넣지 않으면 에러
-- 동일한 id로 중복해서 입력하면 에러
INSERT INTO hello2 (id, name, tel, age) VALUES (1234, '홍길동', '010-0007-7777', 31);
INSERT INTO hello2 (id, name, tel, age) VALUES (2468, '김민석', '010-0007-7777', 33);

-- 중복을 허용하도록 옵션(UNIQUE) 빼던지 데이터를 정리
-- 인덱스 만들고자 하는 컬럼에 중복되는 데이터가 있으면 색인을 만들 수 없다.
-- ORA-01452: cannot CREATE UNIQUE INDEX; duplicate keys found
COMMIT;
SELECT * FROM hello2;
DELETE FROM HELLO2;
--PRIMARY KEY : 메인키를 지정해도 NOT NULL을 명시한 것과 같다.
INSERT INTO hello2 (name, tel, age) VALUES ( '홍길동', '010-1111-2222', 33);


-- [정리]
-- 인덱스 역할(색인)
-- 1. 검색 속도 향상
-- 2. 정렬(SORT)
-- 3. 메인키는 중복을 허용하지 않는다.
-- 4. 별도의 인덱스를 관리하므로 입력처리 속도 느려짐
-- 5. 저장소의 공간을 더 사용
-- 6. 메인키 외의 인덱스는 중복 유무를 지정할 수 있다.
-- 7. 인덱스로 지정된 컬럼은 NULL(널)을 허용하지 않는다.
-- 8. ISAM(Indexed Sequential Access Method)
