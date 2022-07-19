# numpy: reshape()

import numpy as np

# 1차원
nl = np.array([1,2,3,4,5,6,7,8])
print('nl: ', nl)
print('nl.shape: ', nl.shape)

# 2차원으로 변경
n2 = nl.reshape(2, 4)
print('nl: ', nl)       # 원본에 지장 없음
print('n2: ', n2)
print('n2.shape: ', n2.shape)

# 3차원으로 변경
print(">>> 3차원으로 변경 <<<")
print(type(range(12))) # range
nx = np.array(range(12))
n3 = nx.reshape(2,3,2)  # 2면, 3행, 2열
print('n3: ', n3)
print('n3.shape: ', n3.shape)