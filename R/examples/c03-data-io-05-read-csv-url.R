# 인터넷에서 파일 가져오기
# 깃허브에서 titanic 자료 가져오기

titanic <- read.csv("https://vincentarelbundock.github.io/Rdatasets/csv/COUNT/titanic.csv")
titanic
str(titanic)
dim(titanic) # 1316 * 5
table(titanic$age)
table(titanic$sex)
table(titanic$survived)

head(titanic)
tail(titanic)

# 교차분할표 작성
# 성별에 따른 생존 여부
tab <- table(titanic$survived, titanic$sex)
tab

# 막대 차트 그리기
barplot(tab, col=rainbow(2), main="성별에 따른 생존 여부")
