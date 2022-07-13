# 튜플을 리스트로 변환
# 리스트 튜플로 변환
# 원래의 자료형이 변환된 것이 아니라 새로운 자료에 기존의 이름을 붙인 것이다.

t = (1,3,5,7)
print('t:', id(t), type(t), t)

# 튜플을 리스트로 변환
t = list(t)
print('t:', id(t), type(t), t)

# 리스트를 튜플로 변환
t = tuple(t)
print('t:',id(t), type(t), t)