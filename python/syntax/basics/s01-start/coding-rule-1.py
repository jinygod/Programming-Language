# 실행단위
#   - 파이썬 파일 단위
#   - 확장자가 *.py
#   - python filename.py

# 코딩 규칙
# 변수 명명규칙
# 소문자, 대문자, 숫자
# 대소문자 구분이 된다.
# 특수문자 : 언더스코어(_) -> Shift + -
# 제약조건 :
#  - 숫자로 시작할 수 없다.
#  - 영문자나 언더스코어로 시작
#  - 예약어 사용할 수 없다.

# 변수
xy = 10
Xy = 20 # 대소문자 구분
hello = "hello"
Hello = "Hello" # 대소문자 구분
print('xy=', xy)
print('Xy=', Xy)
print('hello=',hello)
print('Hello=',Hello)

# 변수: 언더스코어
_hello = "_hello"
print("_hello=", _hello)

# 변수에 달러($)를 사용할 수 없다.
# 변수에 숫자로 시작할 수 없다.
# SyntaxError: invalid syntax
# 9abc = "9abc"