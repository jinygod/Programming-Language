# Matrix(행렬)
# 행과 열이 구성

# 5행 1열
m <- matrix(c(1:5))
m

# 열 우선 행렬 객체 생성
# 2행 5열
m1 <- matrix(c(1:10), nrow=2)
m1

# 발행된 수와 행렬이 일치하지 않으면
# 경고가 나오고 처음 숫자부터 반복
m2 <- matrix(c(1:9), nrow=2)
m2

# [문제] 열의 수를 구하라
m3 <- matrix(c(1:15), nrow=2)
m3

m4 <- matrix(c(1:17), nrow=3)
m4

m5 <- matrix(c(1:18), nrow=4)
m5

m6 <- matrix(c(1:18, 1,2), nrow=4)
m6

# 행우선으로 행렬 객체 생성
# 행의 값이 채워지고 다음 행으로 이동하여 채움
m7 <- matrix(c(1:10), nrow=2, byrow=T)
m7
