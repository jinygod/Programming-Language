# 로컬 파일

# read.table()

# header = FALSE, sep= ""
student <- read.table(file="student.txt")
student

# 칼럼
student1 <- read.table(file="student.txt", header=TRUE)
student1
