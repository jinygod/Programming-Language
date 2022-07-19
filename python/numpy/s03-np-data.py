# numpy

import numpy as np

l = [1,2,3,4]   # list
n = np.array(l) # ndarray
print("n:", n)
print("type(n)", type(n))

# tuple to ndarray
tp = (2,4,6,8)   # tuple
nt = np.array(tp) # ndarray
print("nt:", nt)
print("type(nt)", type(nt))

# ndarray의 실제 데이터가 있는 메모리
print('n.data:', n.data) # <memory at 0x000001A460803580>

# 메모리의 저장된 값을 확인
print('n.data.obj:', n.data.obj) # [1 2 3 4]
print(type(n.data.obj)) # ndarray
