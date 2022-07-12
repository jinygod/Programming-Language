# 리스트 삭제(delete)
# del 내장 함수(Built-in Function)
# del 객체
# del list[index]

a = [1,3,5,7,9]

print(a, len(a))

# 리스트삭제(del)
# 리스트(a)의 인덱스 1번째 요소를 삭제
# 리스트의 갯수가 삭제된 수만큼 줄어 든다.
# 리스트의 원본이 변경됨
del a[1]
print(a, len(a))

#del a[2:4]
del a[2:]
print(a,len(a))

# 슬라이싱을 사용해서 삭제할 수 있다.
# 범위를 지정해서 삭제 가능
del a[:]
print(a,len(a))