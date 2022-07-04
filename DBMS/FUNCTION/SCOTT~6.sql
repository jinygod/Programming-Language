-- TO_DATE 함수
-- 날짜형으로 변환

CREATE TABLE emp2 AS SELECT * FROM emp;

SELECT to_date('2022-05-07', 'YYYY-MM-DD') FROM dual;
SELECT to_date('05-07-2022', 'MM-DD-YYYY') FROM dual;

SELECT * FROM dept;
DESC emp2;
INSERT INTO emp2 VALUES (9999, '홍길동', 'CEO', null,
to_date('05-07-2022','MM-DD-YYYY'), 30000,  null, 10);

SELECT * FROM dept;
DESC emp2;
INSERT INTO emp2 VALUES (8888, 'Sangsu Lee', 'CTO', null,
'20220101', 20000,  null, 10);

SELECT * FROM dept;
DESC emp2;
INSERT INTO emp2 VALUES (7777, 'Dongju Yun', 'POET', null,
'2022.01.01', 20000,  null, 10);

SELECT * FROM dept;
DESC emp2;
INSERT INTO emp2 VALUES (5555, 'Rin', '100Watr', null,
to_date('04/05/2022', 'MM/DD/YYYY'), 20000,  null, 10);
COMMIT;

DESC emp2;
SELECT * FROM emp2;