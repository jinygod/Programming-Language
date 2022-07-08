# 논리형(bool)
#  참 : True
# 거짓 : False

# 비교연산의 결과는 논리형(bool)
x = 10
y = 20

# 같다
a = (x == y)
b = (x is y)
print(a)    # False
print(b)    # False

# 같지 않다
c = (x != y)
d = (not x is y)
print(c)   # True
print(d)   # True
