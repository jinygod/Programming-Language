# 행 또는 열 묶음으로 행렬 객체 생성

# 행으로 묶음
x1 <- c(5,40,50:52)
x2 <- c(30, 5, 6:8)
mr <- rbind(x1, x2)
mr

# 열로 묶음
mc <- cbind(x1, x2)
mc

m3 <- matrix(10:19, 2)
m3

# 경고: 모자란 값은 처음 값부터 시작
me = matrix(10:20, 2)
me

m3 = matrix(10:19, 2)
m3
m3[1,] # 1행의 전체 내용
m3[2,] # 2행의 전체 내용
m3[1,1] # 1행 1열의 내용
m3[2, c(1:5)]

# 3행 3열: 열우선
m33 <- matrix(c(1:9), nrow=3, ncol=3)
m33

# 3행 3열: 행우선
m33r <- matrix(c(1:9), nrow=3, ncol=3, byrow=T)
m33r
