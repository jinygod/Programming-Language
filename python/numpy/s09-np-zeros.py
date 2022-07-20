# 넘파이 함수 : zeros()

import numpy as np

# 2차원(4*4)의 배열을 생성하고 Zero로 채움
nx = np.zeros((4,4), dtype=np.int_)
print('shape:', nx.shape)   # (4, 4)
print(nx)

# 연산: 배열의 요소를 0과 비교해서 0이면 True 0이 아니면 False
r1 = nx != 0
print(r1)

r2 = nx == 0
print(r2)

# any()
# 배열에서 하나라도 조건을 만족하면 True
# 만족하는 것이 하나도 없으면 False
a1 = (nx != 0).any()
print('any:', a1)

nx[0,0] = 1
a2 = np.any(nx != 0)
print('any:', a2)
