# 셋: 차집합(difference)

s1 = set("1234567890")
s2 = set("12468")

# 차집합
# s1에서 s2에 있는 데이터를 제외하고 남은 데이터를 선택
s3 = s1 - s2
print(s1)
print(s2)
print(s3)

# 이 방법도 가능
# s3 = s1.difference(s2)