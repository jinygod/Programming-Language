# 리스트(list)
# 여러 자료들의 연속된 모음
# 변경 가능(mutable)


mt = [1,3,'홍길동',3.14,True,False,'END']

# 참조: 1개의 자료를 참조한 경우는 원본 데이터의 자료형 변수를 생성
name = mt[2] # '홍길동'
pi = mt[3] # 3.14

print('name=', name)
print('pi=', pi)

# 참조를 통해서 특정 위치의 값을 변경
mt[2] = '전우치'
print(mt)

print('name=', name) # 값을 가져오는 시점에는 '홍길동'
print('mt[2]', mt[2]) # '전우치'

# 슬라이싱한 name을 바꾸어도 원본은 변경되지 않음
name = '강감찬'
print('name=', name, ', mt[2]', mt[2])