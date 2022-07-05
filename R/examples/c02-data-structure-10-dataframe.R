# DataFrame 자료구조

# 텍스트 파일을 이용한 데이터프레임 생성

# 읽어 올 파일 위치 확인
getwd()
# 텍스트 파일 형태:
#  - 헤더, 칼럼은 공백 구분
#  - 마지막 칼럼 다음에 라인피드드
txtemp <- read.table('emp.txt', header=1, sep="")
txtemp

# CSV 파일 형태: 콤마로 구분
csvemp <- read.csv('emp.csv', header=T)
csvemp
