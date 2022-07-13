# 셋(set) :
# 합집합(union) : |
# OR

s1 = set("13579")
s2 = set("12468")
print(type(s1))
# 합집합(|)
# 양쪽에 모두 합쳐서 하나로 묶으며 중복된 데이터는 하나만 선택
s3 = s1 | s2
print(s1)
print(s2)
print(s3)

lst = list(s3)
lst.sort()
print(lst)