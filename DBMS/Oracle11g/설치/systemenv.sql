-- 모든 테이블 정보 표시
SELECT * FROM TAB;

-- 오늘날짜
SELECT sysdate FROM dual;
SELECT SYSDATE FROM DUAL;

-- CHARACTER SET
-- RESULT : AL32UTF8
SELECT * FROM nls_database_parameters WHERE parameter = 'NLS_CHARACTERSET';

-- 문자 '한글'의 크기 
SELECT '한글' as hangeul, length('한글') hanlen, lengthb('한글') as hanlenb FROM dual;
    
