# 딕셔너리에서 값을 목록으로 가져오기
# dict_values = dict.values()

cust = {
    'name' : '김수리',
    'tel' : '010-1234-5678'
}

print(cust)

values = cust.values()
print('values:', values)

values = list(values)
print('-'* 80)
print('values:', values)
print(values[0])
print(values[1])

values = list(cust.values())
print('-' * 80)
print(values[0])
print(values[1])
