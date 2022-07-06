# writd_xlsx() 함수

install.packages("writexl")
library(writexl)

titanic

# Excel 파일로 출력
write_xlsx(titanic, path="titanic.xlsx", col_names=T)
