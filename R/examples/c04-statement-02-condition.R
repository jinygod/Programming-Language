# 조건문
# if, false, switch, which

x <- 10
y <- 20
if(x > y){
  cat("x는 y보다 값이 크다")
} else {
  cat("x는 y보다 작거나 같다")
}

# if
score = 90
if(score >= 90){
  grade= "A"
} else if(score >= 80){
  grade = "B"
} else if(score >= 70){
  grade = "C"
} else if(score >= 60){
  grade = "D"
} else{
  grade = "F"
}

cat("당신의 점수는? ", score)
cat("당신의 학점은? ", grade)
