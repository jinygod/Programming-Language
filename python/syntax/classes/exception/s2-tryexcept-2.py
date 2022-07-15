# 예외 처리

try:
    file = open('없는파일', 'r')
except FileNotFoundError as e:
    print('파일이 없습니다.', e)

print("정상종료")