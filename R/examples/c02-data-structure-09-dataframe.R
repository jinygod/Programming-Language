# DataFrame 자료구조
#   - 데이터베이스의 테이블 구조
#   - 칼럼 단위로 서로 다른 데이터의 저장이 가능
#   - 리스트와 백터의 혼합으로 칼럼은 리스트, 칼럼내의 데이터는 백터 자료구조

# 백터를 이용한 데이터프레임 생성
no <- c(1,2,3)
name <- c('kim', 'lee', 'jang')
pay <- c(150, 250, 300)
vemp <- data.frame(No = no, Name=name,  Pay=pay)
vemp

# matrix를 이용한 데이터프레임 생성
# 행우선: byrow=TRUE
m <- matrix(
  c(1, 'hong', 150,
    2, 'lee', 250,
    3, 'kim', 300), 3, by=T)
m
memp <- data.frame(m)
memp
