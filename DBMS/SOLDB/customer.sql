

SELECT * FROM tab;

-- 고객정보
DROP TABLE customer;
CREATE TABLE customer
(
    id      NUMBER(5) PRIMARY KEY,  -- 아이디
    name    VARCHAR2(30) NOT NULL,  -- 이름
    tel     VARCHAR2(15),           -- 전화번호
    birthd  DATE,                   -- 생년월일
    maked   DATE DEFAULT SYSDATE    -- 생성일자(시스템 날짜 등록)
);

-- 오늘 날짜: 시스템 일자
SELECT SYSDATE FROM dual;

-- 입력 : 날짜(YYYY-MM-DD)
INSERT INTO customer (id, name, tel, birthd)
    VALUES(12345, '이젠아카데미', '031-719-3688', '2000-10-01');

-- 날짜(YYYY.MM.DD)
INSERT INTO customer (id, name, tel, birthd)
    VALUES(20000, '이젠소프트웨어', '02-978-1234', '2010.05.06');

-- 날짜(YYYY/MM/DD)
INSERT INTO customer (id, name, tel, birthd)
    VALUES(21000, '이젠셀코아', '041-879-4321', '2005/11/19');

-- 날짜(YY/MM/DD)
INSERT INTO customer (id, name, tel, birthd)
    VALUES(22000, '이젠바이오', '041-119-1119', '21/04/26');

SELECT * FROM customer;

-- 수정

-- 삭제