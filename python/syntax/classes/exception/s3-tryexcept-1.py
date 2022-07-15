# 예외 처리
# try ~ except를 사용하여 오류 처리를 하라

x = 10
y = 0

try:
    a = x + y
    z = x / y
except ZeroDivisionError as e:
    print(f'x({x}의 값을 y({y})로 나누려고 했습니다.')
    print(e)

# NameError: name 'z' is not defined
# print(z)    # 예외가 발생하여 변수가 선언되지 않음
print(a)    # try에서 선언한 변수도 블럭 밖에서 참조 가능

try:
    print('z=', z)
except NameError as e:
    print('처리결과 변수(z)?')
    print('NameError:', e)