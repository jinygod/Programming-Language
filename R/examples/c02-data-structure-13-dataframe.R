# DataFrame
# 데이터프레임 병합

height <- data.frame(id=c(1,2), h=c(180, 170))
height
weight <- data.frame(id=c(1,2), w=c(80,75))
weight

# 데이터프레임 병합
user <- merge(height, weight, by.x="id", by.y="id")
user

help(merge)
