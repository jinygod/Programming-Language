# 자료형

# 논리형 : bool(True, False)
# 정수형 : int
# 실수형 : float
# 문자형 : str

# 타입 캐스팅
print("논리형: bool(1)=", bool(1))
print("논리형: bool(0)=", bool(0))

print("정수형: int(True)=", int(True))
print("정수형: int(False)=", int(False))

print("실수형: 'float('0.1234')='", float('0.1234'))
print("실수형: 'float('3.14e3')='", float('3.14e3'))
print("실수형: 'float('3.0e3')='", float('3.0e3'))

nx = 123456
sx = str(nx)
print("문자형: ", nx, '->', str(nx), type(sx))