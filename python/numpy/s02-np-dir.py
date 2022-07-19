import numpy as np

print(np.__version__)
print(np.ndarray)
print(np.ndarray.__name__) # ndarray

# dir() 함수 : 속성, 메소드를 확인
for i in dir(np.ndarray):
    if not i.startswith('_'):
        if type(np.ndarray.__dict__[i]) != type(np.ndarray.var):
            print(i)
            
# 결과
"""
T
base
ctypes
data
dtype
flags
flat
imag
itemsize
nbytes
ndim
real
shape
size
strides
    """