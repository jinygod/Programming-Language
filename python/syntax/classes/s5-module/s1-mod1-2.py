# s1-mod1-1.py
# import는 현재 디렉터리에 있는 파일이나
# 파이썬 라이브러리가 저장된 디렉터리에 있는 모듈만 불러온다.
# 파이썬 라이브러리는 파이썬을 설치할 때 자동으로 설치되는 파이썬 모듈


# from 모듈이름 import 모듈함수 [,모듈함수, ...]
from mod1 import add, sub

# 모듈이름을 생략
print(add(1,3))
print(sub(10,7))