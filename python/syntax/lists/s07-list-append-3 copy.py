# 리스트 요소 추가(append)

lst = []
print(lst)

lst.append([9,8,7])
lst.append([6,5,4])
print(lst)
print(len(lst))

print(lst[0])
print(lst[1])

# 첫 번째 요소(1행)
print(lst[0][0])
print(lst[0][1])
print(lst[0][2])

# 두 번째 요소(2행)
print(lst[1][0])
print(lst[1][1])
print(lst[1][2])

# for
print('[')
for x in lst:
    for y in x:
        print(y, end=" ")
    print(']')
print(']')