
-- HR 계정: 처음 오라클을 사용하는 사용자의 실습을 위해 만들어 놓은 교육용 계정
-- HR 계정 활성화
ALTER USER HR ACCOUNT UNLOCK;

-- 패스워드 변경
ALTER USER HR IDENTIFIED BY 1234;

