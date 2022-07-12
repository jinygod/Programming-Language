# 리스트 인덱스(index)
# 리스트의 요소의 값을 찾아서 요소의 위치를 리턴
# 찾지 못하면 종료
# index = list.index(value)

a = [1,3,5,7]

print(a)

value = 7
index = a.index(value)
found = (value == a[index])

print('value : ', value)
print('index : ', index)
print('found : ', found)
print("못 찾으면 프로그램이 종료.")