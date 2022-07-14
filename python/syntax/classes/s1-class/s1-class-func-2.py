# class

# class를 사용하지 않고 함수만을 사용해서 계산 결과값을 유지하는 예제
result = 0
result2 = 0

def add(num):
    print('add(%d)' % num)
    global result
    result += num
    return result

def add2(num):
    print('add(%d)' % num)
    global result2
    result2 += num
    return result2


print(add(4))
print(add(5))
print(add2(11))
print(add2(12))

# 빼기 함수 추가?
# print(sub(5))