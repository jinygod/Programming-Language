# 문자열 처리

install.packages("stringr")
library(stringr)

# 문자열의 길이
s1 <- "문자열 길이"
sl <- str_length(s1)  # 논리적인 문자의 길이
sl

# 문자열 내에서 특정 문자열의 위치
# 리턴: 찾은 문자열의 시작위치와 마지막위치
str_locate(s1, "문자열")
str_locate(s1, "길이")

# 이메일 주소
email = "abc@mbc.co.kr"
eloc <- str_locate(email,"@")
eloc
class(eloc) # "matrix"
eloc[1,1] # 시작위치
eloc[1,2] # 종료위치

# 부분 문자열 만들기
id <- str_sub(email, 1, eloc[1,1] -1)
id
url <- str_sub(email, eloc[1,2] +1, str_length(email))
url

# 대문자를 소문자로 변환
str_to_lower("ABC")

# 소문자를 대문자로 변환
str_to_upper("abc")

# 문자열 교체
tel <- "010-1234-5678"
str_replace(tel, "-", ".") # 처음 찾은 문자열을 교체

# 문자열 결합
str_c("Hello", "World")

# 문자열 분리
hw <- str_split("Hello World", " ")
hw
class(hw)
hw[[1]]
hwl <- unlist(hw)
hwl[1]
hwl[2]
class(hwl)

