# 조건문
# switch(비교문, 실행문1[,실행문2, 실행문3, ...])
# 비교문의 조건에 만족하는 실행문 중 하나를 선택
# 비교문이 가리키는 값에 해당하는 변수의 이름과 일치하는 값을 리턴

pwd <- "5678"
name <- "홍길동"
switch("name", id="Jeong", pwd="1234", age=44, name="정보석")
switch("pwd", id="Jeong", pwd="1234", age=44, name="정보석")

who <- "age"
who <- "name"
who <- "id"
switch(who, id="Jeong", pwd="1234", age=44, name="정보석")
