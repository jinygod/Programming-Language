# 예외 처리
# try ~ except 를 사용하여 오류 처리를 하라

a = [1,2,9,4,0]

try:
    for x in a:
        y = x / a[x]
        print(f"x({x}) / x({x}) = {y}")
except IndexError as e:
    print("리스트의 인덱스 범위가 아닙니다.")
    print("IndexError: ", e)
except:
    print("알 수 없는 오류 발생")