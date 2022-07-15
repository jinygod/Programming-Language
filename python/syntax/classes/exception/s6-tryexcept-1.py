# 예외 처리
# 여러 개의 오류 처리하기
# 예외를 처리하지만 예외 메시지를 받을 필요가 없을 때 객체로 받지 않을 수 있다.

try:
    a = [1,3,5]
    print(a[3])
    print(a[2]/0)
except ZeroDivisionError:   
    print('0으로 나눌 수 없습니다.')
except IndexError:
    print('인덱스가 범위를 넘었습니다.')