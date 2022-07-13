# 셋: 합집합(union)

s1 = set("13579")
s2 = set("12468")

# 합집합(union)
# 양쪽에 모두 합쳐서 하나로 묶으며 중복된 데이터는 하나만 선택

s3 = s1.union(s2)
print('s1=',s1)
print('s2=',s2)
print('s3=',s3)

lst = list(s3)
lst.sort()
print(lst)