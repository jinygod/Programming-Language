# 딕셔너리에서 키와 값을 목록으로 가져오기
# dict_items = dict.items()

cust = {
    'name' : '김수리',
    'tel' : '010-1234-5678'
}

print(cust)

# dict_items : 딕셔너리에서 튜플(키, 값)을 리스트 목록으로 리턴
items = cust.items()
print('items:', items)

lists = list(items)
print('lists:', lists)

print('len(lists)', len(lists))
item1 = lists[0]
item2 = lists[1]

print('item1:', item1, type(item1))
print('item2:', item2, type(item2))

# 튜플(키,값)
# 0번째 : 키
# 1번째 : 값
print(item1[0], ':', item1[1])
print(item2[0], ':', item2[1])
