# 문자열 처리

install.packages("stringr")
library(stringr)

# 정규표현식
s1 <- "abc1234ABCDEFG홍길동high010-1234-4567#end"

# 영문 소문자가 3자 연속하는 경우 추출
str_extract_all(s1, "[a-z]{3}")

# 3자 이상인 경우
str_extract_all(s1, "[a-z]{3,}")

# 3~5자 이상인 경우
str_extract_all(s1, "[a-z]{3,5}")
str_extract_all(s1, "[0-9]{4}")

# 특정한 값을 추출
s2 <- "abc1234ABCDEFG홍길동high010-1234-4567#end우리we"
str_extract_all(s2,"홍길동")
str_extract_all(s2,"전우치")

# 모든 한글을 추출: 3자 이상
str_extract_all(s2, "[가-힣]{3}")

# 특정 문자열을 제외: 한글 제외
str_extract_all(s2, "[^가-힣]")

# 특정 문자열을 제외: 한글 제외
# 나머지 연속된 5글자 추출
str_extract_all(s2, "[^가-힣]{5}")

# 지정된 길이의 단어 추출
# 다섯글자씩 추출
str_extract_all(s2, "\\w{5}")

# 지정된길이의 숫자 추출: # 네 글자씩 추출
str_extract_all(s2, "\\d{4}")

# 주민등록번호 추출
jumin <- "871015-1234567"
str_extract_all(jumin, "[0-9]{6}-[1234][0-9]{6}")
str_extract_all(jumin, "\\d{6}-[1234]\\d{6}")

# 잘못된 주민등록번호
jumin2 <- "871015-5234567"
str_extract_all(jumin2, "[0-9]{6}-[1234][0-9]{6}") # character(0)
str_extract_all(jumin2, "\\d{6}-[1234]\\d{6}")

# 부동소숫점
jumin3 <- "3.14159"
# 소숫점 앞에 숫자가 반드시 있어야 한다.
str_extract_all(jumin3, "[0-9]+[.][0-9]+") 

# 소숫점 앞에 숫자가 없어도 된다.
j4 <- ".1234"
str_extract_all(j4, "[0-9]*[.][0-9]{1,}")

j5 <- "1234."
str_extract_all(j5, "[0-9]*[.][0-9]*")

j6 <- "1234"
str_extract_all(j6, "[0-9]*[.][0-9]*")
