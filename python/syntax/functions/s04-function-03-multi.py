# 함수
# 가변인자: 함수의 입력값이 몇개일지 모를 때, 0개 이상
# 함수인자 앞에 아스터리스크(*)를 넣음
# 인자는 튜플(Tuple)로 전달

def multiadd(choice, *args):
    result = 0

    if choice == 'add':
        for x in args:
            result += x
    elif choice == 'mul':
        result = 1
        for x in args:
            result *= x
        
    return result

print('더하기:', multiadd('add', 1,2,3,4,5,6,7,8,9,10))
print('곱하기:', multiadd('mul', 1,2,3,4,5,6,7,8,9,10))
