-- 현재 계정으로 접근 가능한 테이블 목록
SELECT * FROM TAB WHERE TABTYPE = 'TABLE';

-- 현재 계정으로 접근 가능한 뷰 목록
SELECT * FROM TAB WHERE TABTYPE = 'VIEW';