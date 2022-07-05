# List 자료 구조
# key, value

member <- list(
  name=c('홍길동','전우치'),
  age=c(35,25),
  gender=c('남자','여자')
)

member

# 키를 통한 값 참조
member$name # 키
member$name[1]  # 키의 첫 번째 값
member$name[2]  # 키의 두 번째 값

member$age
member$age[1]
member$age[2]

member$gender
member$gender[1]
member$gender[2]

# 키에 해당하는 값 변경
member$age
member$age[1] <- 45
member$age[2] <- 55

# 키를 추가
member$id <- c("hong", "jeon")
member
member$id
member$id[1]
member$id[2]

# 키 제거 : 해당하는 키에 NULL을 지정
member$id <- NULL
member

