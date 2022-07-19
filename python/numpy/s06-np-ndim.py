# numpy
# 다차원배열
# 모든 원소는 동일한 길이의 동일한 자료형으로 구성

import numpy as np

# 2차원 배열
l2 = [[1,3,5,7],[2,4,6,8]]  # list
nd = np.array(l2)           # ndarray
print('nd2:', nd)

# 참조
print("nd2[0]: ", nd[0])   # [1 3 5 7]
print("nd2[0]: ", nd[1])   # [2 4 6 8]

print("nd2[0][0]: ", nd[0][0]) # 1
print("nd2[1][0]: ", nd[1][0]) # 2

# 리스트는 색인 연산자를 사용할 수 없다.
# TypeError list indices must be integers or slices, not tuple
# print(l2[1,2])  # 1행 2열
try:
    print(l2[1,2])
except Exception as e:
    print('배열참조오류', e)

print('리스트:', l2[1][2]) # 1행 2열 -> 6

#---------------------------------------------------------------
# 색인연산자 : 튜플(행, 열)
# 넘파이는 튜플(행, 열)로 구성된 색인연산자를 사용해서 참조가능
print('색인연산자:', nd[1][2]) # 1행 2열 -> 6

tx = (1,2) # 튜플
print('색인연산자:', nd[tx]) # 1행 2열 -> 6

t2 = 1,2    # 튜플(괄호 생략)
print('t2', t2, type(t2))
print('색인연산자:', nd[t2]) # 1행 2열 -> 6

print('색인연산자:', nd[(1,2)]) # 1행 2열 -> 6
print('색인연산자:', nd[1,2]) # 1행 2열 -> 6

# 데이터의 자료형
print('데이터의 자료형:', type(nd[1,2])) # 넘파이 객체 자료형 <class 'numpy.int32'>

# 각 요소의 값을 조회 : item()
print('데이터의 값:', nd[1,2].item())   # 파이썬 자료형에 해당하는 값(int value)

# 파이썬 자료형
print('데이터의 값:', type(nd[1,2].item()))   # <class 'int'>

# 복소수
print("복소수: real=", nd[1,2].real)
print("허수: imag=", nd[1,2].imag)
