# List 객체
# 리스트 객체의 자료 처리 함수

a <- list(c(1:5))
b <- list(c(6:10))
a; b

# 각각 리스트 요소의 결과가 리스트로 리턴
la <- lapply(c(a,b), max) # 결과가 리스트
la
class(la)

lax <- list(c(max(unlist(a))), c(max(unlist(b))))
lax

ls <- sapply(c(a,b), max) # 결과가 벡터
class(ls)
mode(ls)
ls

# 벡터로 변환 후 벡터로 결과 도출
vx <- c(max(unlist(a)), max(unlist(b)))
vx

max(unlist(b))
