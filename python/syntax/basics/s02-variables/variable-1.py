# 변수(variable)

# 변수의 선언은 초깃값을 반드시 지정해야 한다.
# 초깃값에 의해서 자료형이 결정
a = 10  # int
print(type(a))

# 기존에 선언된 변수에 새로운 타입의 값을 지정할 수 있다.
# 새로운 타입으로 변수의 형이 바뀐다.
a = '10'     # str
print(type(a))

# 값의 대입에서 여러개를 동시에 대입할 수 있다.
x = 10
y = 20
print('x=', x)
print('y=', y)

# x와 y의 값을 교환하려면?
z = x   # z는 x 값을 대비 시키기 위한 임시 변수
x = y
y = z
print('x와 y의 값을 교환')
print('x=', x)
print('y=', y)

# 값의 대입에서 여러개를 동시에 대입할 수 있다.
x, y = y, x
print('[교환]x, y = y, x')
print('x=', x)
print('y=', y)

a, b, c, d = 1,2,3,4
print(a,b,c,d)