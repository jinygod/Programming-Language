# 함수정의
# 함수명 <- function(매개변수) { 실행문 }

f1 <- function(){
  cat("f1() : 매개변수와 리턴값이 없는 함수")
}

# 함수호출
f1()

# 함수정의: 인자와 리턴이 있는 함수
funcadd <- function(x, y) {
  z <- x + y
  return(z)
}

ax <- funcadd(10,20)
ax
