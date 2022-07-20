# 넘파이 함수 : add(), accumulate()

import numpy as np

nx = np.array([1,2,3,4])

# 동일한 인덱스의 원소들을 더해서 배열을 리턴
a1 = np.add(nx, nx)
a2 = nx + nx
print('nx: ', nx)
print('a1: ', a1)
print('a2: ', a2)

# accumulate()
# 배열의 원소를 누적해서 원 배열과 동일한 크기를 리턴
# 각 인덱스의 위치에 누적한 값이 들어감
a3 = np.add.accumulate(nx)
print('a3: ', a3)   # [ 1  3  6 10]