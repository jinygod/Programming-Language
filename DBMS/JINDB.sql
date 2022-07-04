SELECT * FROM customer;

-- 고객정보
CREATE TABLE customer
(
    id           NUMBER(5) PRIMARY KEY, -- 아이디
    name     VARCHAR2(30) NOT NULL, -- 이름
    tel          VARCHAR2(15),                   -- 전화번호
    birth       DATE ,                                -- 생년월일
    maked    DATE                                   -- 생성일자
);

-- 오늘 날짜 : 시스템 일자
SELECT SYSDATE FROM dual;

DROP TABLE customer;
DESC customer;


-- 입력 : 날짜(YYYY-MM-DD)
INSERT INTO customer (id, name, tel, birth, maked) VALUES ( 1000, '홍길동', '010-1111-1111', '1991-11-15', '2022-05-26');
INSERT INTO customer (id, name, tel, birth, maked) VALUES ( 2000, '김삿갓', '010-2222-2222', '1992-11-15', '2022-05-27');
INSERT INTO customer (id, name, tel, birth, maked) VALUES ( 3000, '유비', '010-3333-3333', '1993-11-15', '2022-05-28');
INSERT INTO customer (id, name, tel, birth, maked) VALUES ( 4000, '장비', '010-4444-4444', '1994-11-15', '2022-05-29');


-- 수정
UPDATE customer SET
    name = '관우'
    WHERE id = 1000;

-- 삭제
DELETE FROM customer WHERE id = 2000;
COMMIT;