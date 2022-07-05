# DataFrame
# data.frame(...)

df <- data.frame(x=c(1:5), y=seq(2,10,2), z=c('a','b','c','d','e'))
df
df$x
df$y
df$z

# 데이터 프레임의 자료 구조 보기
str(df)

# 칼럼 갯수
ncol(df)

# 행의 갯수
nrow(df)

# 칼럼명
names(df)

# 데이터 값
df # 전체
df[1,] # 1행의 값
df[,1] # 1열의 값

# 2~4행의 3열의 값
df[c(2:4), 3]

# 요약통계량 보기
summary(df)

# apply(dataframe, 단위, 함수)
df
apply(df[, c(1,2)], 2, sum) # 열단위
apply(df[, c(1,2)], 1, sum) # 행단위
