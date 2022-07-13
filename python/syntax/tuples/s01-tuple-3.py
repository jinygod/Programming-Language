# 튜플
# 튜플 인덱싱

# 튜플 생성
t1 = ('첫번째', '하나', 'two', 3.14, (1,3,5),[2,4,6])
print(t1)

# 처음부터 참조
print('[처음부터 참조]')
print(t1[0])
print(t1[1])
print(t1[2])
print(t1[3])
print(t1[4])    # tuple
print(t1[5])    # list

# 뒤에서부터 참조
print('[뒤에서부터 참조]')
print(t1[-1])   # list
print(t1[-2])   # tuple
print(t1[-3])
print(t1[-4])
print(t1[-5])
print(t1[-6])   # 첫 번째 요소

# 첫 번째 요소를 음수로 참조
print('> 첫 번째 요소를 음수로 참조', t1[-len(t1)])
print('> 첫 번째 요소를 음수로 참조', t1[len(t1) * -1])
