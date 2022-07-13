# 딕셔너리

d = {}

# 키에 리스트를 지정하면 오류:
# 리스트는 변하는 성질을 가진 자료형
# TypeError: unhashable type: 'list'
lk = [1,3,5]
lv = [1,3,5,7,9]
d[lk] = lv
print(d)