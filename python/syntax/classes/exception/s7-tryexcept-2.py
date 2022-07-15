# 예외 처리
# 여러 예외를 하나의 객체로 받기
# 예외가 발생되지 않은 경우 처리

try:
    a = [1,3,5]
    # a = [1,3,5,0]
    print("자료의 갯수는? ", len(a))
    print("마지막 요소는? ", a[len(a)])
    # list index out of range
    for x in a:
        print('10/{0}의 결과는:{1}'.format(x, 10 / x))

except (ZeroDivisionError, IndexError) as error:
    print('예외가 발생했습니다.')
    print(error)
else:   # 예외가 발생되지 않으면 처리되는 블럭
    print('어떤 예외도 발생되지 않았습니다.(OK)')
    print('처리를 성공적으로 완료했습니다.')