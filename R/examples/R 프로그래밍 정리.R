# 홀수의 합
oddsum <- function(n) sum(seq(1, n, 2))
oddsum(5)
oddsum(9)

# 짝수의 합
evensum <- function(n) sum(seq(2, n, 2))
evensum(6)
evensum(10)

# matrix생성
m <- matrix(c(1:16), nrow=4)
m
# 행 단위로 각 행의 최대값
apply(m,1,max)
# 열 단위로 각 열의 최대값
apply(m,2,max)
# 행 단위 합계
apply(m,1,sum)
# 열 단위 합계
apply(m,2,sum)
# 행 단위 평균
apply(m,1,mean)
# 열 단위 평균
apply(m,2,mean)

# array 생성
vec <- (1:12)
arr <- array(vec,c(3,2,2))
arr

# 각 면의 행의 합계
apply(arr[,,1],1,sum)
apply(arr[,,2],1,sum)
# 각 면의 열의 합계
apply(arr[,,1],2,sum)
apply(arr[,,2],2,sum)

# 주민등록번호 추출
install.packages(stringr)
library(stringr)

jumin <- c("871015-1234567",
           "871015-2234567",
           "871015-3234567",
           "871015-4234567")

str_extract(jumin, "[0-9]{6}-[1234][0-9]{6}")

# 전화번호 추출
tel <- c("010-1234-5678",
         "031-123-4567",
         "031-1234-5678")

str_extract(tel, "[0-9]{3}-[0-9]{3,4}-[0-9]{4}")


# CSV 파일 읽기
cr <- read.csv(file="test.csv")
cr

# 가장 작은 키
min(cr$키)
# 가장 큰 키
max(cr$키)
# 평균 키
mean(cr$키)

# 가장 적은 몸무게
min(cr$몸무게)
# 가장 무거운 몸무게
max(cr$몸무게)
# 평균 몸무게
mean(cr$몸무게)