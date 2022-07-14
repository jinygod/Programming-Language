# 함수

def hello(title,msg):
    result = title
    result += ":"
    result += msg
    return result

# hello() 함수의 처리결과를 message변수로 받음
message = hello("환영", "이젠아카데미")
message = hello(message, "어서오세요")
print(message)

# hello() 함수의 처리 결과를 곧바로 print()함수의 입력값으로 전달
print(hello(hello("환영","이젠아카데미"), "어서오세요"))