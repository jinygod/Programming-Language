# 다차원배열(3차원)

import numpy as np

# 3차원 배열
nd = np.array([ 
        [[1,2,3],[4,5,6]],  # 0면
        [[1,3,5],[7,9,11]], # 1면
        [[2,4,6],[8,10,12]] # 2면
        ])
print(nd)

print('몇차원: ndim=', nd.ndim) # 차원: 3
print('shape=', nd.shape)       # 모양: (3,2,3), (3차원, 행, 열)

print('nd[0]=', nd[0])  # 0면
print('nd[1]=', nd[1])  # 1면
print('nd[2]=', nd[2])  # 2면

print('nd[0].shape =', nd[0].shape) # 0면의 모양: (2, 3)
print('nd[1].shape =', nd[1].shape) # 1면의 모양: (2, 3)
print('nd[2].shape =', nd[2].shape) # 2면의 모양: (2, 3)

# strides(2차원, 1차원, 각요소) 바이트 
# 1차원(12바이트) : 3개요소 * 4바이트
# 2차원(24바이트) : 6개요소 * 4바이트
print('strides: ', nd.strides)  # (24,12,4)

ndlen = len(nd.data)    
ndlenbyte = len(nd.data.tobytes())
print('면의 갯수:', ndlen)    # 3개의 면
print('총 갯수: ', ndlenbyte) # 72개

# ndarray to list
nl = nd.data.tolist()
print("리스트로 변환: ", nl)

# 넘파이 속성: size
print('size: ', nd.size) # 18개 요소
