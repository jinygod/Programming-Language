# DataFrame 자료구조
# subset(...)
# 데이터 프레임의 부분 객체

df <- data.frame(x=c(1:5), y=seq(2,10,2), z=c('a','b','c','d','e'))
df

# 대상 데이터프레임에서 새로운 독립된 데이터 프레임을 생성
# 칼럼(x)의 값이 3보다 큰 데이터를 선택
s1 <- subset(df, x >=3)
str(s1)
class(s1) # data.frame

# AND(&) 연산
s2 <- subset(df, x >=3 & y <=8)
s2

# OR(|) 연산
df
s3 <- subset(df, x >= 3 | y <= 2)
s3
