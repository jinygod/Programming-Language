# which() 함수
# 특정 데이터를 검색
# 조건식에 만족하는 결과가 참인 벡터의 위치를 리턴

odd <- c(1,3,5,7,9)
x <- which(odd == 7)
cat("벡터값:", odd)
cat("인덱스:", x) # 벡터 odd에서 값 7이 위치한 인덱스는? 4

# 데이터프레임
no <- c(1:5)
name <- c("홍","이","강","유","김")
score <- c(60,70,80,90,100)
exam <- data.frame(학번=no,이름=name,성적=score)
exam

ryu <- which(exam$이름 == "유")
ryu
exam[ryu,]

# 변수의 칼럼명 출력
exam.name <- c(names(exam))
exam.name
 for(n in exam){
   print(n)
 }

# while() 함수
# while(조건문){}
# 조건문이 참이면 블록을 계속 수행
i <- 0
while(i < 10){
  i <- i + 1
  print(i)
}
