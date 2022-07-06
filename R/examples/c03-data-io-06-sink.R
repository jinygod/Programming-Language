# 파일저장

data()

# sink()
# sink(filename)으로 시작을 해서 sink()로 끝나는 사이의 작업내용을 파일로 저장
library(RSADBE)
data(Severity_Counts)
sink("severity.txt")
severity <- Severity_Counts
severity
sink()

severity <- Severity_Counts
severity
