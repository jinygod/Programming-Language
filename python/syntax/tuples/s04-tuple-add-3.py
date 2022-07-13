# 튜플 더하기 

t1 = (1,3,5)
t2 = (2,4,6)
t3 = (7,)      # 튜플 데이터가 1개인 경우
t4 = t1 + t2 + t3

print(t1)
print(t2)
print(t3)
print(t4)

t4 = t4 + (9,10)
print(t4)

t4 += (11,12)
print(t4)