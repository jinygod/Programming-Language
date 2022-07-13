# 딕셔너리

d = {}

# 키에 튜플 지정
sk = {1,3,5} # 셋
lv = [1,3,5,7,9] #리스트

# TypeError: unhashable type: 'set'
# d[sk] = lv

d[{'a', 'b', 'c'}] = 'abc'

print(d)