
-- FILEPATH
-- C:\Oracle\11g\app\oracle\product\11.2.0\server\rdbms\admin\scott.sql

-- 계정생성 확인

-------------------------------------------------------------------------
-- SYSTEM 계정에서 
-------------------------------------------------------------------------
-- SCOTT에 SYNONYM 권한을 부여
GRANT CREATE SYNONYM TO SCOTT;

-- SYSTEM 계정에서 
-- 권한제거
REVOKE CREATE SYNONYM FROM SCOTT;

-------------------------------------------------------------------------
-- SCOTT 계정에서
-------------------------------------------------------------------------
-- EMP 테이블에 해당하는 새로운 별칭으로 EMPLOYEE를 생성
CREATE OR REPLACE 
    SYNONYM EMPLOYEE FOR EMP;
    
-- 제거    
DROP SYNONYM EMPLOYEE;

-- 언락
ALTER USER SCOTT ACCOUNT UNLOCK;