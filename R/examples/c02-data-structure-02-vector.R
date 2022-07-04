# Vector 자료 구조
# - 1차원 배열
# - 같은 자료형의 데이터만 저장
# - 첨자(index)는 1부터 시작

# combine value
# c1과 c2는 같은 결과
c1 <- c(1,2,3,4,5)
c1
# 범위
c2 <- c(1:5)
c2

# sequence value
# seq(시작값,종료값,증가값)
s1 <- seq(1,10)
s1

# 1부터 10까지 홀수
s2 <- seq(1,10,2)
s2

# 1부터 10까지 짝수
s3 <- seq(2,10,2)
s3

# replicate value
# rep(값, 복제제횟수)

# 3을 다섯 번 복제
r1 <- rep(3,5)
r1

# 1,2,3 을 세 번 복제
r2 <- rep(1:3, 3) 
r2

# rep(값, each=반복횟수)
# 각 자료가 반복
rep(c(2,4), each=3) # 2 2 2 4 4 4
rep(1:3, each=3) # 1 1 1 2 2 2 3 3 3
rep(c(1,2,3), each=3) # 1 1 1 2 2 2 3 3 3
