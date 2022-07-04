# R 패키지 개수 보기
# Ctrl + Enter

dim(available.packages())
available.packages()

# R Session 보기
sessionInfo()

# 패키지 설치
# stringr 패키지설치
install.packages("stringr")

# 패키지 로드
library(stringr)

# 현재 로드된 패키지 확인
search()

# 패키지 제거
remove.packages("stringr")

# 데이터 셋 보기
data()

# 데이터 겟 활용하기
# 단계1: 빈도수를 기준으로 히스토그램 그리기
hist(Nile)

# 단계2: 밀도를 기준으로 히스토그램 그리기
hist(Nile, freq=F) # frequency 속성을 FALSE

# 위 단계2의 결과에 분포곡선(line) 추가
lines(density(Nile))

# 히스토그램을 파일로 저장
par(mfrow=c(1,1)) # Plots 영역에 1개 그래프 표시
pdf("E:/Temp/R/c01-exam-01.pdf")  #지정된 경로의 파일에 결과를 출력력
hist(rnorm(20)) # 난수에 대한 히스토그램 그리기
dev.off()     # 출력 파일 닫기
