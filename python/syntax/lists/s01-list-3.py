# 리스트(list)
# 여러 자료들의 연속된 모음
# 변경 가능(mutable)

# 하나의 리스트에 여러 자료형을 넣을 수 있다.
# 정수, 문자열, 논리형(Boolean)
# type(list) : 자료형, class list
# len(list) : 크기, 자료들의 갯수
# 참조 : 0 ~ (len - 1)

multitype = [1,3,'문자열',3.14,True,'END']
print('자료형(type)=', type(multitype))
print('크기(len)=', len(multitype))
print('multitype=', multitype)

# 참조 : 값을 읽는 것(보는 것)
print(multitype[0])
print(multitype[1])
print(multitype[2])
print(multitype[3])
print(multitype[4])
print(multitype[5])

# 범위를 넘어서면 종료
# IndexError: list index out of range
# print(multitype[6])

# 음수값을 통한 참조
# 자료의 마지막부터 역으로 참조
print('multitype[-1]:', multitype[-1])
print('multitype[-1]:', multitype[-2])

# [문제] 음수값으로 첫번째 요소를 참조?
print('multitype[0]:', multitype[-len(multitype)])