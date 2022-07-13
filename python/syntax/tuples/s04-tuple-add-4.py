# 튜플 더하기 
# id(객체) : 객체 식별자

tp = (1,3,5)
print(tp, id(tp))

tp += (7,)     
print(tp,id(tp))

tp += (9,)
print(tp, id(tp))

# 정수
n1 = 10
print('n1:', id(n1), n1)

n1 += 10
print('n1:', id(n1), n1)

n1 += 10
print('n1:', id(n1), n1)
