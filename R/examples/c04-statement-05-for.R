# 반복문
# for(변수 in 변수) { 실행문 } 

# java: for(int n : i){}

# 벡터(i) 값이 1부터 10까지
# i에서 값을 하나씩 꺼내서 n에 대입
# 벡터(i)의 갯수만큼 반복
i <- c(1:10)
for(n in i){
  cat('n=',n, ", n * 10 =", n * 10, "\n")
}

# 홀수의 합
sn <- 0
for(n in seq(1,10,2)){
  sn = sn + n
  cat('n=',n, ", sum = ", sn,  "\n")
}

# 짝수의 합
sn <- 0
for(n in seq(2,10,2)){
  sn = sn + n
  cat('n=',n, ", sum = ", sn,  "\n")
}
