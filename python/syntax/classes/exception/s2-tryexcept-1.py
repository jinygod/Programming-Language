# 예외 처리

try:
    file = open('없는파일', 'r')
except: # 모든 예외를 처리
    print('파일이 없습니다.')

print("정상종료")