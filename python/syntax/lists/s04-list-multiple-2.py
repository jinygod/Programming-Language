# 리스트 곱하기(*)
# 리스트 곱하기는 리스트를 주어진 숫자만큼
# 반복해서 항목을 더해서 붙인다.

a = [1,3,5]
b = a + a
print('a=', a, type(a))
print('b=', b, type(b))

# slice로 꺼내면 새로운 리스트가 생성
a0 = a[0:1]
a1 = a[1:2]
a2 = a[2:3]
print(f'a0: type={type(a0)}, value={a0}')
print(f'a0: type={type(a1)}, value={a1}')
print(f'a0: type={type(a2)}, value={a2}')

# 개별적으로 연산을 수행하면
# 각 요소들을 꺼내서 그 자료형(type)에 맞는 연산을 수행
x = a0 + a1 + a2
print(f'x:type={type(x)}, value={x}')

x3 = x * 3
print('x * 3 = ', x3)
