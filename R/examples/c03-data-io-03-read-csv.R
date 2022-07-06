
# file.choose() function
s2 <- read.table(file.choose(), sep=",", header=TRUE)
s2

# comma
s2 <- read.table("student-2.txt", sep=",", header=T)
s2

# Tab: sep="\t"
# Ä®·³»çÀÌ Table
s3 <- read.table("student-3.txt", sep="\t", header=T)
s3

# csv: defaultsep=","
s4 <- read.csv("student-4.csv", header=T)
s4

# na.string = "-"
t4 <- read.csv("student-4.txt", header=T, na.string='-')
t4

# na.string = ""
t5 <- read.csv("student-5.txt", header=T, na.string='')
t5

t6 <- read.csv("student-5.txt", header=T)
t6
