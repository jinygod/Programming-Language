# 함수

# hello(문자열, 문자열)
def hello(title,msg):
    result = title
    result += ":"
    result += msg
    return result

# 함수를 호출할 때
# 함수에 전달되는 자료형을 일치 시켜야 한다.
# hello(정수, 정수)
result = hello(10, 20)
print("result", result)
