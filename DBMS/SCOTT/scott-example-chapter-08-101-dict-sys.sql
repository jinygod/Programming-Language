-- OWNER : SOLUSER
SELECT * FROM all_tables WHERE owner = 'SOLUSER';

-- OWNER : DBA
SELECT * FROM dba_tables;
DESC dba_tables;

-- 사용자 정보
SELECT * FROM dict WHERE table_name = 'DBA_USERS';
DESC DBA_USERS;
SELECT * FROM DBA_USERS;
SELECT * FROM DBA_USERS WHERE username = 'SCOTT';

-- 제약조건 검색
DESC USER_CONSTRAINTS;
SELECT * FROM user_constraints;
SELECT * FROM user_constraints WHERE owner = 'SCOTT';
SELECT * FROM user_constraints WHERE table_name = 'EMP';
