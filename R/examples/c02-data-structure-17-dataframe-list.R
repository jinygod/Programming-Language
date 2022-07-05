# List 자료 구조
# 다차원 리스트 객체 생성
#  - 중첩 리스트
#  - 리스트의 값(value)가 리스트로 구성

ml <- list(
  c1=list(1,2,3),
  c2=list(10,20,30),
  c3=list(100,200,300)
)
ml

ml$c1
ml$c2
ml$c3

# 다차원 리스트를 열 단위로 바인딩
# 키가 칼럼, 키의 값의 요소가 행
mx <- do.call(cbind, ml)
class(mx) # matrix
