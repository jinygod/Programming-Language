# Excel File

install.packages("readxl")
library(readxl)

xl <- read_excel(path="student.xlsx", sheet="student")
xl
str(xl)
class(xl)
xl$학번
xl$이름
xl$성적
xl$평가
