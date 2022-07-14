# 함수
# 매개 변수를 지정하여 호출하기

# 파라미터: title, x, y
def printxy(title, x, y):
    print('[' + title + ']')
    print(f"[{x}] + [{y}] -> [{x+y}]")

# 함수를 호출할 때 함수의 인자의 자료형 맞춰 순서대로 전달
printxy("더하기", 10, 20)

# 매개변수를 지정하여 호출
# 함수의 인자의 순서를 무시할 수 있다.
printxy(x=11, y=22, title="더하기")
printxy(x=33, title="더하기", y=44)

printxy(x="안녕, ",y="반갑습니다.",title="문자열 더하기")