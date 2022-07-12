# list의 슬라이싱
# 리스트의 지정된 위치의 자료를 꺼내서 새로운 리스트를 생성
# 기존의 리스트는 변경되지 않는다.

a = [1,2,3,4,5]
b = a[:] # 전체
c = a[1:3] # 1번째부터 3-1까지(1,2)
d = a[1:] # 1번째부터 끝까지
f = a[:-1] # 처음부터 끝에서 -1까지
g = a[:len(a)] # 전체, 끝까지(len(a) -1)

print(a)
print(b)
print(c)
print(d)
print('f=',f)
print(g)
