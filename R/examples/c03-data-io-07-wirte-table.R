# write.table()
# 처리 결과를 테이블 형식으로 파일에 저장

titanic

getwd()

# 행의 이름을 제거: row.names=FALSE
# write.table(titanic, "titanic-1.txt", row.names=FALSE)
write.table(titanic, "titanic-1.txt")

t1 <- read.table(file="titanic-1.txt", sep="", header=T)
t1

head(t1)
tail(t1)

# write.csv()
write.csv(t1, "titanic-1.csv", row.names = F, quote=F)
c1 <- read.csv(file="titanic-1.csv", header=T)
c1
