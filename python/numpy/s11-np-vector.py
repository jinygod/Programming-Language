# 넘파이 : 백터화 연산

import numpy as np

# arange() : array-range
a = np.arange(1, 6) # 1부터 5까지 값을 갖는 배열 생성
print('a.shpae= ', a.shape) # (5,)
print(a)

b = np.arange(10,15)    # 10부터 14까지 값을 갖는 배열 생성
print(b)

c = a * b
print("a * b = ", c)

# 축: newaxis
# 1차원 배열을 2차원 배열
d = a[:, np.newaxis]    # 축:열기준
print('[d] shape=', d.shape)    # (5,1)
print(d)

e = b[np.newaxis, :]    # 축:행기준
print(e)    

# 2차원 배열의 행렬곱(matmul) : @
# 서로 곱해지는 행렬의 원소의 갯수가 같아야 한다.
f = d @ e
print('[f] shape=', f.shape)
print(f)

# dot() 함수
g = d.dot(e)
print('[g] shape=', g.shape)
print(g)