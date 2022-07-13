# set셋 초기값을 지정하여 생성
# 딕셔너리와 같이 중괄호로 감싸서 선언하지만 단일값으로 지정

# 순서가 보장되지 않는다.
# 동일한 값은 하나만 선택 : 5
nums = { 3, 5, 6, 7, 0, 5 } 
print(type(nums)) # 중복(3,5)는 하나만 선택해서 5개 자료 생성
print(nums) # {0, 3, 5, 6, 7}

# 여러 타입의 자료형
print({ 3, 4, True, False, 'Hi', '안녕', 3.14 } )

# True는 1과 같은 값으로 처리
# True와 1중에 True가 먼저 선택
print( { 3, 4, True, 1, False, 'Hi', '안녕', 3.14 } )

# False는 0과 같은 값으로 처리
print({ 3, 4, True, 0, False, 'Hi', '안녕', 3.14 } )
print({ 3, 4, True, False, 0, 'Hi', '안녕', 3.14 } )
