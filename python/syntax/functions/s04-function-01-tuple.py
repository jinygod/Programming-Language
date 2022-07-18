# 함수
# 가변인자: 함수의 입력값이 몇개일지 모를 때, 0개 이상
# 함수인자 앞에 아스터리스크(*)를 넣음
# 인자는 튜플(Tuple)로 전달

# 입력받은 인자의 모든 값을 더하는 함수
def sum(*args):
    result = 0
    
    for x in args:
        result += x

    return result

# 함수 호출
# print('sum=', sum()) # 인자를 전달하지 않음
# print('sum=', sum(1)) # 인자를 1개 전달
print('sum=', sum(1,3,5,7)) # 인자를 4개 전달