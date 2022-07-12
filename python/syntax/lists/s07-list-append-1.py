# 리스트 요소 추가(append)

lst = []
print('빈 리스트(lst)', lst)

lst.append(9)
lst.append(8)
lst.append(7)

print(lst)
lst.append([6,5,4])
print(lst)
lst.append('end')
print(lst)
print(len(lst))