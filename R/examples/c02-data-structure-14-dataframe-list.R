# List 자료 구조
#  - 키와 값이 한 쌍으로 구성
#  - 키를 가지고 값을 구함
#  - 값(Value) : Vector, Matrix, Array, List, DataFrame, ...
#  - 생성 함수 : list()
#  - 처리 함수 : unlist(), lapply(), sapply()
#  - 기본키 참조: [[n]]

l1 <- list("lee", "이순신", 95)
l1

# 키참조
l1[[1]]
l1[[2]]
l1[[3]]

# 리스트를 벡터(Vector)로 변환
# 벡터는 동일한 자료형으로 구성되므로
# 벡터로 변환되면 하나의 자료형으로 변환
# 문자형이 포함되어 있으면 모두 문자형으로 변환
lv <- unlist(l1)
lv

# 인덱스 참조
lv[1] # "lee"
lv[2] # "이순신"
lv[3] # "95", 문자형으로 변환

ls2 <- list(10, 20, 30, 95)
lv2 <- unlist(ls2)
lv2

# 값으로 벡터값을 지정
num <- list(c(1:5), seq(1,10,2))
num
num[[1]]
num[[2]]

# 값으로 배열(Array)
la <- list(array(1:12, c(2,3,2)))
la
la[[1]]
la[[2]] # Error in la[[2]] : subscript out of bounds

