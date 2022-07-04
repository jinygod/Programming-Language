-- 테이블 생성

-- TABLE: HELLO
-- 컬럼과 컬럼사이는 콤마(,)로 구분
-- 마지막 컬럼 다음에는 콤마(,)를 넣지 않음
-- 세미콜론은 명령어의 일부가 아니다.
-- 세미콜론(;) 명령어의 끝을 알리며, 명령어와 명령어를 구분하기 위한 용도

-- 테이블 삭제
-- 데이터와 테이블 객체가 모두 삭제
DROP TABLE HELLO;

-- 테이블의 정의와 함께 테이블 객체가 생성
CREATE TABLE HELLO
(
   ID NUMBER(5) NOT NULL,   -- NOT NULL : 널을 허용하지 않음(반드시 값을 넣어야 함)
   NAME VARCHAR2(30),
   TEL VARCHAR2(15),
   AGE NUMBER(3)
);

DESC HELLO;

-- 입력: INSERT
--INSERT INTO hello (name, tel, age) VALUES (1234, '홍길동', '010-5028-9311', 31);
-- ID는 NOT NULL로 제약조건을 줬기 때문에 값을 넣지 않으면 에러

INSERT INTO hello (id, name, tel, age) VALUES (1234, '홍길동', '010-5028-9311', 31);

--컬럼 목록에서 제외하면 값이 저장되지 않아 조회하면 null로 표시된다.
INSERT INTO hello (ID, name, tel) VALUES (2000, '전우치', '010-0008-7878');

--컬럼의 순서를 바꿀 수 있다.
INSERT INTO hello (name, tel, id) VALUES ('개나리', '031-0303-0303',3000); 

--입력할 때 컬럼을 생략하면 모든 컬럼을 명시한 것과 같다.
--VALUES 목록에 모든 컬럼에 대응하는 값을 지정해야 한다.
--칼럼에 대응하는 값을 지정하지 않으면 에러
--SQL 오류: ORA-00947: not enough values
INSERT INTO hello VALUES(4444, '사랑이', '010-4000-4444');


INSERT INTO hello VALUES(4000, '사오정', '010-4000-4444', 40);



-- 검색: SELECT
SELECT id, name, tel, age FROM hello;

--컬럼명을 명시하지 않고 아스터리스크(*)를 하면 테이블이 가지고 있는 모든 컬럼을 선택한다
SELECT * FROM hello;

-- 삭제: DELETE
-- 테이블에서 선택된 행을 삭제

-- 완료: COMMIT
-- DML(INSERT, DELETE, UPDATE) 처리에 대한 완료
-- DQL(SELECT)은 COMMIT, ROLLBACK과 관련이 없다.
-- 현재까지 작업한 내용을 반영(완료)
-- 마지막 커밋 이후로 처리된 모든 작업을 완료한다.
-- 커밋을 하면 이전 시점으로 취소(ROLLBACK)를 할 수 없다.
COMMIT;

--전체 데이터를 삭제
DELETE FROM hello;
ROLLBACK;

INSERT INTO hello VALUES(5000, '오징어', '010-5000-5555', 50);
DELETE FROM hello WHERE id = 5000;
COMMIT;

SELECT * FROM hello;

-- 수정: UPDATE
UPDATE hello            -- 테이블 이름
     SET id = 1000      -- 컬럼 값
     WHERE id = 1234;   -- 조건: 변경할 데이터
     
-- 여러 컬럼의 내용을 변경 할 때는 콤마로 분리
-- 맨 마지막 컬럼 다음에는 콤마를 생략해야 한다.


UPDATE hello SET            -- 테이블 이름
     name = '고길동',
     tel = '123-1234-1234',
     age = 39
     WHERE id = 1000;   -- 조건: 변경할 데이터
     
     -- 검색조건: 변경될 대상을 지정하지 않으면 모든 데이터가 변경 된다.
UPDATE hello SET            -- 테이블 이름
     name = '고길동',
     tel = '123-1234-1234',
     age = 39;
     -- 조건: 변경할 데이터
     
SELECT * FROM hello;

--DISTINCT : 검색할 때 중복을 제거
--id가 같은 데이터는 하나만 선택해서 출력
SELECT distinct id, name, tel, age FROM hello;

-- distinct는 SELECT의 맨 앞에 명시해야 한다.
--ORA-00936: missing expression
--00936. 00000 -  "missing expression"
-- SELECT name , distinct id,  tel, age FROM hello;

-- [중요]
-- DELETE, UPDATE를 할 때는 WHERE 조건을 넣지 않으면
-- 모든 데이터가 영향을 받는다.