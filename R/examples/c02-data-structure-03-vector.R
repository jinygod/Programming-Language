# Vector 자료 구조
# - 백터 자료를 대상으로 하는 함수

# union() 함수 : 합집합
# 양쪽 모두 있으면 같은 값은 하나만 선택
x <- c(1,3,5,7)
y <- c(3,5,9)
union(x,y)

# setdiff() 함수: 차집합
# x - y
# x에는 있고 y에는 없는 값
setdiff(x, y)

# intersect() : 교집합
# 양쪽에 같은 값 선택
intersect(x, y)
