-- 데이터 사전(Data Dictionary)

DESC dict;
-- TABLE_NAME    VARCHAR2(30)   테이블 명
-- COMMENTS      VARCHAR2(4000) 설명

SELECT * FROM dict WHERE table_name LIKE 'USER_T%' ORDER BY 1;

-- 접속한 사용자가 소유한 객체 정보
SELECT * FROM user_tables;
SELECT * FROM tab;

-- 모든 테이블 정보
SELECT * FROM ALL_TABLES;

-- OWNER : SCOTT
SELECT * FROM all_tables WHERE owner = 'SCOTT';

-- OWNER : DBA
SELECT * FROM dba_tables;
DESC dba_tables;

