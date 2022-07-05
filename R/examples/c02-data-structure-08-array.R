# Array 자료 구조
# 다차원 배열
# 행,열,면

# 12개 요소 = 3 * 2 * 2
# 3행 2열 2면
c1 <- c(1:12)
a1 <- array(c1, c(3,2,2))
a1

# 면 참조
a1[,,1] # 1면
a1[,,2] # 2면

# 열 단위
a1[,1,1] # 1열 1면
a1[,2,1] # 2열 1면

# 행 단위
a1[1,,1] # 1행 1면
a1[1,,2] # 1행 2면

a1[1,1,1]
a1[2,1,1]

# 배열의 자료 구조
mode(a1) # 자료형: numeric
class(a1) # 자료구조: array

# 데이터 셋 가져오기
install.packages("RSADBE")
data()
library(RSADBE)
data("Bug_Metrics_Software")
str(Bug_Metrics_Software)
Bug_Metrics_Software