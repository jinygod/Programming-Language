# 리스트의 특정 요소를 꺼내기(pop)
# 꺼낸 요소는 삭제된다.
# pop()을 활용하여 스택의 LIFO를 구현할 수 있다.
# LIFO : Last In First Out, 후입선출
# 스택(Stack) : 나중에 들어간 것이 먼저 나옴

lst = ['삼성', 'LG', 'SK', 'Apple', '현대차']
print(lst)

# 특정한 위치의 요소에서 꺼냄
# 3번째 요소를 꺼냄
index = 3 # 'Apple'
value = lst.pop(index)
print(lst, value)

# "현대차"를 지우려면?
index = lst.index("현대차")
value = lst.pop(index)
print(lst, value)
