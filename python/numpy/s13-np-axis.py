# 넘파이 : 축(axis) 계산
# 수직: axis=0
# 수평: axis=1

import numpy as np

a = np.arange(1,9)  # [1,2,3,4,5,6,7,8]
b = a.reshape(2,2,2)
print(b.shape)
print(b)

# 3차원의 각면 참조
print('1면:', b[0])
print('2면:', b[1])

# sum
print('sum(b)=', np.sum(b)) # 36

# axis=0
# 각 면의 동일한 인덱스의 원소를 합산
# [0,0,0] + [1,0,0], [0,0,1]+[1,0,1], ...
s0 = np.sum(b, axis=0)
print('축의 합(axis=0)')
print(s0) #[[6 8] [10 12]]

# axis=1
s1 = np.sum(b, axis=1)
print('축의 합(axis=1)')
print(s1) #[[4 6] [12 14]]

# axis=2
s2 = np.sum(b, axis=2)
print('축의 합(axis=2)')
print(s2) #[[4 6] [12 14]]
