# 예외 처리
# 오류 회피

try:
    a = [1,3,5]
    print(a[3])
    print(a[3]/0)
except ZeroDivisionError:
    print('0으로 나눌 수 없습니다.')
except IndexError:
    pass

print('종료')