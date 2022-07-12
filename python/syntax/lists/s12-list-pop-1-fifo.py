# 리스트의 특정 요소를 꺼내기(pop)
# 꺼낸 요소는 삭제된다.
# FIFO(First In First Out) : 선입선출
# 큐(Queue)

lst = ['삼성', 'LG', 'SK', 'Apple', '현대차']
print(lst)

# 먼저 들어온 것을 먼저 꺼냄
val = lst.pop(0)
print(lst,val)

val = lst.pop(0)
print(lst,val)

val = lst.pop(0)
print(lst,val)

val = lst.pop(0)
print(lst,val)

val = lst.pop(0)
print(lst,val)
