# 행렬 객체 자료 처리 함수

x <- matrix(c(1:9), nrow=3, ncol=3)
x

# 요소의 수
length(x) # 전체 요소의 수
ncol(x) # 열의 갯수
nrow(x) # 행의 갯수

# apply() 함수
# apply(X, MARGIN, FUN, ...)
#   X : 행렬객체
#   MARGIN: 1:행단위, 2:열단위
#   FUN : 함수

# 행 단위로 각 행의 최대값 구하기
apply(x, 1, max)

# 열 단위로 각 열의 최대값 구하기
apply(x, 2, max)

# 행 단위로 각 행의 합계 구하기
apply(x, 1, sum)

# 열 단위로 각 열의 합계 구하기
apply(x, 2, sum)

help(max)

# 평균값: mean()
x
apply(x, 1, mean) # 행단위 평균
apply(x, 2, mean) # 열단위 평균

# 사용자 정의 함수
fx <- function(x){
  x * c(1,2,3)
}
x

# 전치행렬:
# 열우선 계산을 수행 후
# 행우선으로 배치
result <- apply(x, 1, fx)
result

# 행우선 계산을 수행 후
# 열우선으로 배치
result2 <- apply(x, 2, fx)
result2
x
