# class

# class를 사용하지 않고 함수만을 사용해서 계산 결과값을 유지하는 예제
result = 0

def add(num):
    global result
    result += num
    return result

print(add(4))
print(add(5))

# 빼기 함수 추가?
# print(sub(5))