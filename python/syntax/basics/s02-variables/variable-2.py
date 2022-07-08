# 변수(variable)

# x와 y의 값을 교환하려면?
x = 10
y = 20

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

# 튜플(tuple)
xy = x, y
print('tuple=', xy)

# Unpacking: 튜플을 개별 변수로 할당
u1, u2 = xy
print('u1=', u1)
print('u2=', u2)

a, b, c = (100, 200, 300)
print(a, b, c)

e, f, g = 400, 500, 600
print(e, f, g)