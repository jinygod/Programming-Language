# numpy
# 다차원배열
# 모든 원소는 동일한 길이의 동일한 자료형으로 구성

import numpy as np

# 2차원 배열
nd2 = np.array([[1,3,5,7],[2,4,6,8]])
print('nd2:', nd2)

# 모양
print("shpae:", nd2.shape) # (2, 4)

# 차원
print("ndim:", nd2.ndim) # 2

# 데이터 타입
print('dtype: ', nd2.dtype) # int32

# 각 데이터 타입의 크기(byte)
print('itemsize: ' , nd2.itemsize, 'bytes')

# 원소의 갯수
print('size: ', nd2.size) # 8 = 2 * 4

# 전체의 크기(bytes) : 튜플(x, y)
# x : 하나의 행의 원소를 관리하는 총 바이트(4 * 4)
# y : 하나의 원소를 관리하는 바이트(4)
print('strides: ', nd2.strides) # (16, 4)

# 배열도 메모리를 처리할 때는 1차원으로 구성
# 다차원 배열을 1차원으로 변환 : flatten()
ft = nd2.flatten()
print('flatten:', ft, type(ft)) # [1 3 5 7 2 4 6 8] <class 'numpy.ndarray'>

# 다차원 배열을 1차원으로 변환 : ravel()
rv = nd2.ravel()
print('ravel:', rv, type(rv)) # [1 3 5 7 2 4 6 8] <class 'numpy.ndarray'>

# 참조
print("nd2[0]: ", nd2[0])   # [1 3 5 7]
print("nd2[0]: ", nd2[1])   # [2 4 6 8]

print("nd2[0][0]: ", nd2[0][0]) # 1
print("nd2[1][0]: ", nd2[1][0]) # 2
