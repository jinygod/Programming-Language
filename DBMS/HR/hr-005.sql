
INSERT INTO hello2 (id, name, tel, age) VALUES (1000, '홍사덕', '010-1000-1111', 10);
INSERT INTO hello2 (id, name, tel, age) VALUES (2000, '이사랑', '010-2000-2222', 23);

-- 입력된 순서로 출력
SELECT * FROM hello2;

-- 정렬: ORDER BY
-- 인덱스 키가 있으면 인덱스 키를 사용: 속도가 빠르다
-- 인덱스 키가 없으면 내부적으로 정렬해서 처리: 속도가 떨어짐

-- 정렬 : 키(id) 오름차순
SELECT * FROM hello2 ORDER BY id;       -- 디폴트 오름차순
SELECT * FROM hello2 ORDER BY id ASC;

-- 정렬: 키(tel) 내림차순
SELECT * FROM hello2 ORDER BY tel DESC;

-- 검색: WHERE 조건
SELECT * FROM hello2 WHERE id = 1234;

